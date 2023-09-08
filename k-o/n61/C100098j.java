package n61;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.autogen.mmdata.rpt.DesignerEmojiEntranceStruct;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import q61.C101037a;
import q61.C101047d;
import rx3.C13598b0;

/* renamed from: n61.j */
public final class C100098j extends C87413o implements C32226l<C101047d, C13598b0> {

    /* renamed from: d */
    public static final C100098j f293248d = new C100098j();

    public C100098j() {
        super(1);
    }

    public Object invoke(Object obj) {
        C101047d dVar = (C101047d) obj;
        C87412m.m108594g(dVar, LocaleUtil.ITALIAN);
        DesignerEmojiEntranceStruct designerEmojiEntranceStruct = new DesignerEmojiEntranceStruct();
        designerEmojiEntranceStruct.f265383d = 3;
        designerEmojiEntranceStruct.f265384e = dVar.f295837a;
        designerEmojiEntranceStruct.f265385f = designerEmojiEntranceStruct.mo86045b("SetName", dVar.f295838b, true);
        designerEmojiEntranceStruct.f265386g = 10007;
        designerEmojiEntranceStruct.f265387h = designerEmojiEntranceStruct.mo86045b("sessionid", String.valueOf(C101037a.f295825a), true);
        designerEmojiEntranceStruct.f265388i = designerEmojiEntranceStruct.mo86045b("md5", dVar.f295839c.toString(), true);
        designerEmojiEntranceStruct.f265389j = designerEmojiEntranceStruct.mo86045b(FirebaseAnalytics.C113379b.INDEX, dVar.f295840d.toString(), true);
        designerEmojiEntranceStruct.f265390k = 2;
        designerEmojiEntranceStruct.mo86054n();
        return C13598b0.f38549a;
    }
}
