package y50;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;

/* renamed from: y50.m */
public final class C66524m {

    /* renamed from: a */
    public static final String f191363a = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmo) + "/security/readtemplate?t=weixin_report/w_type&scene=%d&liveid=%s&liveidentityid=%s&liveroomid=%s");

    /* renamed from: b */
    public static final String f191364b = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmi) + "/cgi-bin/mmsupport-bin/newreadtemplate?t=live_forensic/index");

    /* renamed from: c */
    public static final int f191365c = 5;

    /* renamed from: y50.m$a */
    public static final class C66525a {

        /* renamed from: a */
        public static final int f191366a = C74942w4.m89784a(MMApplicationContext.getContext(), 48);

        /* renamed from: b */
        public static final int f191367b = C74942w4.m89784a(MMApplicationContext.getContext(), 40);
    }
}
