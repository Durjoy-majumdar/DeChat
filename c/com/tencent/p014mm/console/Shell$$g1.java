package com.tencent.p014mm.console;

import android.content.Intent;
import android.view.View;
import com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.List;
import p723vf.C52866p;
import sx3.C36907w;

/* renamed from: com.tencent.mm.console.Shell$$g1 */
public class Shell$$g1 implements Shell$$s1 {
    /* renamed from: a */
    public void mo56303a(Intent intent) {
        List<View> allViews$matrix_android_lib_release = OverlayWindowLifecycleOwner.INSTANCE.getAllViews$matrix_android_lib_release();
        ArrayList arrayList = new ArrayList(C36907w.m41090l(allViews$matrix_android_lib_release, 10));
        for (View a : allViews$matrix_android_lib_release) {
            arrayList.add(C52866p.f147663a.mo73632a(a, 0));
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            Log.m105919d("MicroMsg.ViewDumper", "view tree size = %s", Integer.valueOf(strArr.length));
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                Log.m105919d("MicroMsg.ViewDumper", "%s\n", strArr[i]);
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
