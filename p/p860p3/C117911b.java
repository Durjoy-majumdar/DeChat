package p860p3;

import android.content.Context;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p1202o3.C117645b;
import p329d3.C86166b;

/* renamed from: p3.b */
public class C117911b<D> {
    public boolean mAbandoned = false;
    public boolean mContentChanged = false;
    public Context mContext;
    public int mId;
    public C117913b<D> mListener;
    public C117912a<D> mOnLoadCanceledListener;
    public boolean mProcessingChange = false;
    public boolean mReset = true;
    public boolean mStarted = false;

    /* renamed from: p3.b$a */
    public interface C117912a<D> {
        /* renamed from: a */
        void mo182698a(C117911b<D> bVar);
    }

    /* renamed from: p3.b$b */
    public interface C117913b<D> {
    }

    public C117911b(Context context) {
        this.mContext = context.getApplicationContext();
    }

    public void abandon() {
        this.mAbandoned = true;
        onAbandon();
    }

    public boolean cancelLoad() {
        return onCancelLoad();
    }

    public void commitContentChanged() {
        this.mProcessingChange = false;
    }

    public String dataToString(D d) {
        StringBuilder sb = new StringBuilder(64);
        C86166b.m106678a(d, sb);
        sb.append("}");
        return sb.toString();
    }

    public void deliverCancellation() {
        C117912a<D> aVar = this.mOnLoadCanceledListener;
        if (aVar != null) {
            aVar.mo182698a(this);
        }
    }

    public void deliverResult(D d) {
        C117913b<D> bVar = this.mListener;
        if (bVar != null) {
            C117645b.C117646a aVar = (C117645b.C117646a) bVar;
            aVar.getClass();
            if (Looper.myLooper() == Looper.getMainLooper()) {
                aVar.setValue(d);
            } else {
                aVar.postValue(d);
            }
        }
    }

    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.mId);
        printWriter.print(" mListener=");
        printWriter.println(this.mListener);
        if (this.mStarted || this.mContentChanged || this.mProcessingChange) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.mStarted);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.mContentChanged);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.mProcessingChange);
        }
        if (this.mAbandoned || this.mReset) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.mAbandoned);
            printWriter.print(" mReset=");
            printWriter.println(this.mReset);
        }
    }

    public void forceLoad() {
        onForceLoad();
    }

    public Context getContext() {
        return this.mContext;
    }

    public int getId() {
        return this.mId;
    }

    public boolean isAbandoned() {
        return this.mAbandoned;
    }

    public boolean isReset() {
        return this.mReset;
    }

    public boolean isStarted() {
        return this.mStarted;
    }

    public void onAbandon() {
    }

    public boolean onCancelLoad() {
        return false;
    }

    public void onContentChanged() {
        if (this.mStarted) {
            forceLoad();
        } else {
            this.mContentChanged = true;
        }
    }

    public void onForceLoad() {
    }

    public void onReset() {
    }

    public void onStartLoading() {
    }

    public void onStopLoading() {
    }

    public void registerListener(int i, C117913b<D> bVar) {
        if (this.mListener == null) {
            this.mListener = bVar;
            this.mId = i;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    public void registerOnLoadCanceledListener(C117912a<D> aVar) {
        if (this.mOnLoadCanceledListener == null) {
            this.mOnLoadCanceledListener = aVar;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    public void reset() {
        onReset();
        this.mReset = true;
        this.mStarted = false;
        this.mAbandoned = false;
        this.mContentChanged = false;
        this.mProcessingChange = false;
    }

    public void rollbackContentChanged() {
        if (this.mProcessingChange) {
            onContentChanged();
        }
    }

    public final void startLoading() {
        this.mStarted = true;
        this.mReset = false;
        this.mAbandoned = false;
        onStartLoading();
    }

    public void stopLoading() {
        this.mStarted = false;
        onStopLoading();
    }

    public boolean takeContentChanged() {
        boolean z = this.mContentChanged;
        this.mContentChanged = false;
        this.mProcessingChange |= z;
        return z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        C86166b.m106678a(this, sb);
        sb.append(" id=");
        sb.append(this.mId);
        sb.append("}");
        return sb.toString();
    }

    public void unregisterListener(C117913b<D> bVar) {
        C117913b<D> bVar2 = this.mListener;
        if (bVar2 == null) {
            throw new IllegalStateException("No listener register");
        } else if (bVar2 == bVar) {
            this.mListener = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }

    public void unregisterOnLoadCanceledListener(C117912a<D> aVar) {
        C117912a<D> aVar2 = this.mOnLoadCanceledListener;
        if (aVar2 == null) {
            throw new IllegalStateException("No listener register");
        } else if (aVar2 == aVar) {
            this.mOnLoadCanceledListener = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }
}
