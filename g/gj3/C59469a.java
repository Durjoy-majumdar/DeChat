package gj3;

import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.List;
import java.util.Map;

/* renamed from: gj3.a */
public class C59469a extends SharedElementCallback {

    /* renamed from: a */
    public String f169941a = "";

    /* renamed from: a */
    public void mo75852a(List<String> list, Map<String, View> map) {
    }

    public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
        Parcelable parcelable;
        try {
            parcelable = super.onCaptureSharedElementSnapshot(view, matrix, rectF);
        } catch (Throwable th) {
            Log.printErrStackTrace(this.f169941a, th, "onCaptureSharedElementSnapshot err", new Object[0]);
            parcelable = super.onCaptureSharedElementSnapshot((View) null, matrix, rectF);
        }
        String str = this.f169941a;
        Log.m105918d(str, "onCaptureSharedElementSnapshot() called with: sharedElement = " + view + ", viewToGlobalMatrix = " + matrix + ", screenBounds = " + rectF + " res = " + parcelable);
        C87412m.m108593f(parcelable, "res");
        return parcelable;
    }

    public View onCreateSnapshotView(Context context, Parcelable parcelable) {
        View onCreateSnapshotView = super.onCreateSnapshotView(context, parcelable);
        String str = this.f169941a;
        Log.m105918d(str, "onCreateSnapshotView() called with: context = " + context + ", snapshot = " + parcelable + " res=" + onCreateSnapshotView);
        return onCreateSnapshotView;
    }

    public void onMapSharedElements(List<String> list, Map<String, View> map) {
        String str = this.f169941a;
        Log.m105918d(str, "onMapSharedElements() called with: names = " + list + ", sharedElements = " + map);
        super.onMapSharedElements(list, map);
    }

    public void onRejectSharedElements(List<View> list) {
        String str = this.f169941a;
        Log.m105918d(str, "onRejectSharedElements() called with: rejectedSharedElements = " + list);
        super.onRejectSharedElements(list);
    }

    public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
        String str = this.f169941a;
        Log.m105918d(str, "onSharedElementEnd() called with: sharedElementNames = " + list + ", sharedElements = " + list2 + ", sharedElementSnapshots = " + list3);
        super.onSharedElementEnd(list, list2, list3);
    }

    public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
        String str = this.f169941a;
        Log.m105918d(str, "onSharedElementStart() called with: sharedElementNames = " + list + ", sharedElements = " + list2 + ", sharedElementSnapshots = " + list3);
        super.onSharedElementStart(list, list2, list3);
    }

    public void onSharedElementsArrived(List<String> list, List<View> list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
        String str = this.f169941a;
        Log.m105918d(str, "onSharedElementsArrived() called with: sharedElementNames = " + list + ", sharedElements = " + list2 + ", listener = " + onSharedElementsReadyListener);
        super.onSharedElementsArrived(list, list2, onSharedElementsReadyListener);
    }
}
