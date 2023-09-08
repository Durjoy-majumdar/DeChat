package q41;

import com.tencent.p014mm.sdk.storage.MStorageEx;
import f40.C86709a0;

/* renamed from: q41.b */
public final class C101030b implements MStorageEx.IOnStorageChange {

    /* renamed from: d */
    public static final C101030b f295818d = new C101030b();

    public final void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        if (C86709a0.m107522a() && i == 5) {
            String str = obj instanceof String ? (String) obj : null;
            boolean z = false;
            if (str != null) {
                if (!(str.length() == 0)) {
                    z = true;
                }
            }
            C101028a.m132398a(true ^ z);
        }
    }
}
