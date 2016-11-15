
package sagalab;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>n次のBezier曲線を表す.
 * このクラスのインスタンスは不変オブジェクトである.</p>
 */
public final class BezierCurve {
    
    private final List<Point> controlPoints;

    /**
     * <p>制御点列を指定してBezier曲線オブジェクトを生成する.</p>
     * @param controlPoints 制御点列
     */
    public BezierCurve(List<Point> controlPoints) {
        this.controlPoints = new ArrayList<>(controlPoints);
    }
    
    /**
     * <p>パラメータtに対応する評価点をDe Casteljauのアルゴリズムで評価する.</P>
     * <p>パラメータtは閉区間[0, 1]の値をとる.</p>
     * @param t 閉区間[0, 1]内のパラメータ
     * @return パラメータtに対応する評価点
     */
    public Point evaluate(Double t){
        List<Point> cp = getControlPoints();
        for(int i = 0; i < cp.size(); ++i){
            for(int j = 0; j < getDegree() - i; ++j){
                cp.set(j, Point.internalDivide(cp.get(j), cp.get(j+1), t, 1-t));
            }
        }
        return cp.get(0);
    }
    
    /**
     * <p>制御点列を取得する</p>
     * @return 制御点列
     */
    public List<Point> getControlPoints() {
        return new ArrayList<>(controlPoints);
    }
    
    /**
     * <p>次数を取得する</p>
     * @return 次数
     */
    public Integer getDegree(){
        return getControlPoints().size() - 1;
    }
}
