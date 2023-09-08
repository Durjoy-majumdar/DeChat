package x73;

import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.autogen.mmdata.rpt.WCTopicSearchShareActionReportStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.view.manager.SmileyPanelManager$$d;
import com.tencent.p014mm.view.manager.SmileyPanelManager$$d$$a;
import eb0.C31543z5;
import gy3.C87412m;
import qo3.C89779i0;
import te3.C101810m82;
import te3.C101818my3;
import u73.C22613h1;
import wc3.C78541w;
import zt3.C119157j;

/* renamed from: x73.f */
public final class C102573f implements C78541w.C78542a {

    /* renamed from: a */
    public final /* synthetic */ C102570e f302028a;

    /* renamed from: b */
    public final /* synthetic */ String f302029b;

    /* renamed from: c */
    public final /* synthetic */ C101810m82 f302030c;

    public C102573f(C102570e eVar, String str, C101810m82 m822) {
        this.f302028a = eVar;
        this.f302029b = str;
        this.f302030c = m822;
    }

    /* renamed from: a */
    public final void mo108499a(String str, IEmojiInfo iEmojiInfo, boolean z, long j) {
        String str2 = this.f302028a.f302016h;
        Log.m105924i(str2, "share: " + iEmojiInfo.getMd5() + ", " + z + ", shareId:" + j + ", currentShareId:" + this.f302028a.f302022q);
        if (j == this.f302028a.f302022q) {
            String str3 = "";
            if (z) {
                String md5 = iEmojiInfo.getMd5();
                String str4 = this.f302029b;
                if (str4 == null) {
                    str4 = str3;
                }
                iEmojiInfo.mo62679k0(md5, str4);
                SmileyPanelManager$$d smileyPanelManager$$d = (SmileyPanelManager$$d) this.f302028a.f302015g;
                if (Util.isNullOrNil(smileyPanelManager$$d.f285743a.f285728s) || Util.isEqual(str, smileyPanelManager$$d.f285743a.f285728s)) {
                    ((C119157j) C119157j.f356862d).mo183895z(new SmileyPanelManager$$d$$a(smileyPanelManager$$d, iEmojiInfo));
                } else {
                    Log.m105929w("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "user not match toUser:%s, talkName:$s", str, smileyPanelManager$$d.f285743a.f285728s);
                }
            }
            C102570e eVar = this.f302028a;
            C101810m82 m822 = this.f302030c;
            String str5 = this.f302029b;
            eVar.getClass();
            C87412m.m108594g(m822, "shareContent");
            C89779i0 i0Var = eVar.f302023r;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            eVar.dismiss();
            WCTopicSearchShareActionReportStruct wCTopicSearchShareActionReportStruct = new WCTopicSearchShareActionReportStruct();
            wCTopicSearchShareActionReportStruct.f266536e = (long) C31543z5.m39455e();
            long j2 = 2;
            wCTopicSearchShareActionReportStruct.f266535d = 2;
            wCTopicSearchShareActionReportStruct.f266537f = 2;
            if (str5 == null) {
                str5 = str3;
            }
            wCTopicSearchShareActionReportStruct.f266538g = wCTopicSearchShareActionReportStruct.mo86045b("ResultQuery", str5, true);
            if (!C72996z1.m85820U5(eVar.f302014f.f298984o)) {
                j2 = 1;
            }
            wCTopicSearchShareActionReportStruct.f266539h = j2;
            wCTopicSearchShareActionReportStruct.f266540i = wCTopicSearchShareActionReportStruct.mo86045b("ShareSceneId", eVar.f302014f.f298984o, true);
            String str6 = m822.f298791d.f298878d;
            if (str6 == null) {
                str6 = str3;
            }
            wCTopicSearchShareActionReportStruct.f266541j = wCTopicSearchShareActionReportStruct.mo86045b("ShareSessionId", str6, true);
            String str7 = m822.f298791d.f298879e;
            if (str7 == null) {
                str7 = str3;
            }
            wCTopicSearchShareActionReportStruct.f266542k = wCTopicSearchShareActionReportStruct.mo86045b("ShareSearchId", str7, true);
            String str8 = m822.f298791d.f298880f;
            if (str8 == null) {
                str8 = str3;
            }
            wCTopicSearchShareActionReportStruct.f266543l = wCTopicSearchShareActionReportStruct.mo86045b("ShareRequestId", str8, true);
            String str9 = m822.f298791d.f298883i;
            if (str9 != null) {
                str3 = str9;
            }
            wCTopicSearchShareActionReportStruct.f266544m = wCTopicSearchShareActionReportStruct.mo86045b("ShareDocId", str3, true);
            C101818my3 my32 = m822.f298791d;
            wCTopicSearchShareActionReportStruct.f266546o = (long) my32.f298882h;
            wCTopicSearchShareActionReportStruct.f266545n = (long) my32.f298881g;
            wCTopicSearchShareActionReportStruct.mo86054n();
            C22613h1.m26490p(wCTopicSearchShareActionReportStruct);
        }
    }
}
