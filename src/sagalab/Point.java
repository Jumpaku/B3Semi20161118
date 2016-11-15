
package sagalab;

/**
 * <p>平面上の点を表す.
 * 平面上の点のx座標とy座標を保持する.
 * このクラスのインスタンスは不変オブジェクトである.</p>
 */
public final class Point {
    
    private final Double x;
    
    private final Double y;

    /**
     * <p>指定した座標にある点を生成する.</p>
     * @param x x座標
     * @param y y座標
     */
    public Point(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * <p>点のx座標を取得する.</p>
     * @return 
     */
    public Double getX() {
        return x;
    }

    /**
     * <p>点のy座標を取得する</p>
     * @return 
     */
    public Double getY() {
        return y;
    }

    /**
     * <p>点p1と点p2をr1:r2で内分する点を計算する.</p>
     * @param p1 1つ目の点
     * @param p2 2つ目の点
     * @param r1 内分比
     * @param r2 内分比
     * @return 点p1と点p2をr1:r2で内分する点
     */
    public static Point internalDivide(Point p1, Point p2, Double r1, Double r2){
        double a = r2/(r1+r2);
        double b = r1/(r1+r2);
        return new Point(a*p1.getX()+b*p2.getX(), a*p1.getY()+b*p2.getY());
    }
}
