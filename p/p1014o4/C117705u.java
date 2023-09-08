package p1014o4;

/* renamed from: o4.u */
public enum C117705u {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    /* renamed from: a */
    public boolean mo182396a() {
        return this == SUCCEEDED || this == FAILED || this == CANCELLED;
    }
}
