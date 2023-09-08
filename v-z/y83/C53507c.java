package y83;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.MMActivity;
import ke3.C88144b;

/* renamed from: y83.c */
public class C53507c {
    /* renamed from: a */
    public static <T extends C53508d> void m60047a(MMActivity mMActivity, Bundle bundle, Class<T> cls, C53505a aVar) {
        Intent intent = new Intent();
        intent.putExtra("task_class_name", cls.getName());
        intent.putExtra("input_data", bundle);
        intent.putExtra("orientation", -1);
        mMActivity.mmSetOnActivityResultCallback(new C53506b(aVar));
        C88144b.m109795m(mMActivity, "webview", ".luggage.ipc.IpcProxyUI", intent, 3456);
    }
}
