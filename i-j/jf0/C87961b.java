package jf0;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.xweb.WCWebUpdater;
import com.tenpay.android.wechat.PayuSecureEncrypt;
import junit.framework.Assert;
import kf0.C21331a;

/* renamed from: jf0.b */
public class C87961b implements C21331a {

    /* renamed from: a */
    public Context f254547a;

    /* renamed from: b */
    public final String[] f254548b = {"1", "2", "3", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN, "7", "8", "9", PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT, "11", "12"};

    /* renamed from: c */
    public final int[] f254549c = {C0966R.string.hjd, C0966R.string.hjc, C0966R.string.hjg, C0966R.string.hj_, C0966R.string.hjh, C0966R.string.hjf, C0966R.string.hje, C0966R.string.hja, C0966R.string.hjk, C0966R.string.hjj, C0966R.string.hji, C0966R.string.hjb};

    public C87961b(Context context) {
        this.f254547a = context;
    }

    /* renamed from: a */
    public String mo33229a(String str) {
        Assert.assertEquals(12, this.f254548b.length);
        Assert.assertEquals(12, this.f254549c.length);
        int i = 0;
        while (true) {
            String[] strArr = this.f254548b;
            if (i >= strArr.length) {
                return str;
            }
            if (str.equals(strArr[i])) {
                return this.f254547a.getResources().getString(this.f254549c[i]);
            }
            i++;
        }
    }
}
