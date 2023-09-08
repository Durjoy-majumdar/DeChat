package p279yl;

import android.text.TextUtils;
import ap3.C27996a;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.xweb.file.XVFSFile;
import f40.C86709a0;

/* renamed from: yl.g */
public class C39036g extends C27996a {
    public C39036g(C39030c cVar) {
    }

    /* renamed from: a */
    public boolean mo55746a() {
        String i = C86709a0.m107523b().mo121111i();
        if (TextUtils.isEmpty(i)) {
            return false;
        }
        MultiProcessMMKV multiProcessMMKV = MultiProcessMMKV.getDefault();
        String string = multiProcessMMKV.getString("heavy_user_game_" + i, "");
        return !TextUtils.isEmpty(string) && Integer.valueOf(string.split(XVFSFile.PATH_SEPARATOR)[0]).intValue() >= 3;
    }
}
