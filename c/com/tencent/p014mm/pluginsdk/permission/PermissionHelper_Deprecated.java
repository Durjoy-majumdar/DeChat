package com.tencent.p014mm.pluginsdk.permission;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.tencent.p014mm.hellhoundlib.fragments.HellAndroidXFragment;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.mm.pluginsdk.permission.PermissionHelper_Deprecated */
public final class PermissionHelper_Deprecated {

    /* renamed from: a */
    public static final byte[] f347641a = new byte[0];

    /* renamed from: b */
    public static final Map<Integer, C115866a> f347642b = new HashMap();

    /* renamed from: c */
    public static final byte[] f347643c = new byte[0];

    /* renamed from: d */
    public static final Map<Integer, C115867b> f347644d = new HashMap();

    /* renamed from: com.tencent.mm.pluginsdk.permission.PermissionHelper_Deprecated$AuxSupportFragment */
    public static final class AuxSupportFragment extends HellAndroidXFragment {
        public void onActivityResult(int i, int i2, Intent intent) {
            super.onActivityResult(i, i2, intent);
            if (!isDetached()) {
                synchronized (PermissionHelper_Deprecated.f347643c) {
                    C115867b bVar = (C115867b) ((HashMap) PermissionHelper_Deprecated.f347644d).remove(Integer.valueOf(i));
                }
            }
        }

        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setRetainInstance(true);
        }

        public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
            super.onRequestPermissionsResult(i, strArr, iArr);
            if (!isDetached()) {
                byte[] bArr = PermissionHelper_Deprecated.f347641a;
                if (strArr.length != 0 && iArr.length != 0) {
                    synchronized (PermissionHelper_Deprecated.f347641a) {
                        C115866a aVar = (C115866a) ((HashMap) PermissionHelper_Deprecated.f347642b).remove(Integer.valueOf(i));
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.permission.PermissionHelper_Deprecated$a */
    public static final class C115866a {
    }

    /* renamed from: com.tencent.mm.pluginsdk.permission.PermissionHelper_Deprecated$b */
    public static final class C115867b {
    }

    static {
        new Handler(Looper.getMainLooper());
    }
}
