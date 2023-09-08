package n91;

/* renamed from: n91.d */
public enum C21614d {
    TOUCH(0),
    SINGLE_CLICK(1),
    LONG_CLICK(2),
    DOUBLE_CLICK(3),
    ITEM_CLICK(4),
    ITEM_LONG_CLICK(5),
    ITEM_SELECTED(6),
    DRAG(7),
    KEY(8),
    HOVER(9),
    GLIDE(10);
    

    /* renamed from: d */
    public final int f61206d;

    /* access modifiers changed from: public */
    C21614d(int i) {
        this.f61206d = i;
    }

    public String toString() {
        return name() + '=' + this.f61206d;
    }
}
