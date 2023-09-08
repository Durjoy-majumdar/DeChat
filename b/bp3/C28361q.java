package bp3;

/* renamed from: bp3.q */
public abstract class C28361q<TInstance> {
    private volatile TInstance mInstance = null;

    public abstract TInstance create();

    public final TInstance get() {
        if (this.mInstance == null) {
            synchronized (this) {
                if (this.mInstance == null) {
                    this.mInstance = create();
                }
            }
        }
        return this.mInstance;
    }

    public final boolean hasInstance() {
        boolean z;
        synchronized (this) {
            z = this.mInstance != null;
        }
        return z;
    }
}
