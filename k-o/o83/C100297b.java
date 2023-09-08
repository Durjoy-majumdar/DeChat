package o83;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.autogen.mmdata.rpt.SimilarEmoticonSearchLongpressStruct;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.search.data.SimilarEmojiQueryModel;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C75592q0;
import gy3.C87412m;
import nj3.C11184p0;
import p008bq.C0363p0;
import p008bq.C0364r0;
import p008bq.C0365s0;
import p008bq.C67305d1;
import p813fl.C97904g;
import u73.C22613h1;

/* renamed from: o83.b */
public final class C100297b implements C11184p0 {

    /* renamed from: d */
    public final Context f293811d;

    /* renamed from: e */
    public final C97904g f293812e;

    /* renamed from: f */
    public final C100299d f293813f;

    /* renamed from: g */
    public final int f293814g;

    public C100297b(Context context, C97904g gVar, C100299d dVar, int i) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(dVar, "data");
        this.f293811d = context;
        this.f293812e = gVar;
        this.f293813f = dVar;
        this.f293814g = i;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C97904g gVar;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        IEmojiInfo iEmojiInfo;
        IEmojiInfo iEmojiInfo2;
        if (menuItem != null && menuItem.getItemId() == 0 && (gVar = this.f293812e) != null) {
            String md5 = gVar.f287200b.getMd5();
            String str6 = "";
            if (md5 == null) {
                md5 = str6;
            }
            String o0 = gVar.f287200b.mo62685o0();
            if (o0 == null) {
                o0 = str6;
            }
            String thumbUrl = gVar.f287200b.getThumbUrl();
            if (thumbUrl == null) {
                thumbUrl = str6;
            }
            String n = gVar.f287200b.mo62684n();
            if (n == null) {
                n = str6;
            }
            Class cls = C0363p0.class;
            SimilarEmoticonSearchLongpressStruct similarEmoticonSearchLongpressStruct = new SimilarEmoticonSearchLongpressStruct();
            similarEmoticonSearchLongpressStruct.f265915f = this.f293813f.mo139555c() ? 59 : 78;
            similarEmoticonSearchLongpressStruct.f265913d = similarEmoticonSearchLongpressStruct.mo86045b("SessionId", this.f293813f.f293820h, true);
            similarEmoticonSearchLongpressStruct.f265914e = similarEmoticonSearchLongpressStruct.mo86045b("SearchId", this.f293813f.f293821i, true);
            C97904g gVar2 = this.f293812e;
            if (gVar2 == null || (iEmojiInfo2 = gVar2.f287200b) == null || (str = iEmojiInfo2.getMd5()) == null) {
                str = str6;
            }
            similarEmoticonSearchLongpressStruct.f265916g = similarEmoticonSearchLongpressStruct.mo86045b("ClickMD5", str, true);
            SimilarEmojiQueryModel similarEmojiQueryModel = this.f293813f.f293817e;
            if (similarEmojiQueryModel == null || (str2 = similarEmojiQueryModel.f283911e) == null) {
                str2 = str6;
            }
            similarEmoticonSearchLongpressStruct.f265917h = similarEmoticonSearchLongpressStruct.mo86045b("QueryMD5", str2, true);
            similarEmoticonSearchLongpressStruct.f265918i = (long) this.f293813f.f293818f;
            similarEmoticonSearchLongpressStruct.f265919j = (long) this.f293814g;
            similarEmoticonSearchLongpressStruct.f265920k = System.currentTimeMillis();
            similarEmoticonSearchLongpressStruct.f265921l = similarEmoticonSearchLongpressStruct.mo86045b("RequestId", this.f293813f.f293821i, true);
            String str7 = "SearchId";
            similarEmoticonSearchLongpressStruct.f265922m = 2;
            similarEmoticonSearchLongpressStruct.mo86054n();
            C22613h1.m26490p(similarEmoticonSearchLongpressStruct);
            IEmojiInfo r2 = ((C0363p0) C86312j.m106911c(cls)).mo403r2(md5);
            String BX = ((C0364r0) C86312j.m106911c(C0364r0.class)).mo405BX(((C67305d1) C86312j.m106911c(C67305d1.class)).rx0(), str6, md5);
            if (r2 == null) {
                int i2 = ImgUtil.isGif(BX) ? 2 : 1;
                IEmojiInfo zE = ((C0363p0) C86312j.m106911c(cls)).mo404zE();
                zE.setMd5(md5);
                zE.mo62656c2(65);
                zE.setType(i2);
                str3 = "ClickMD5";
                zE.mo62682l1((int) C86013q1.m106451l(BX));
                zE.mo62692s0(1);
                zE.mo62691s(o0);
                zE.mo62636I(thumbUrl);
                zE.mo62649V0(n);
                ((C0363p0) C86312j.m106911c(cls)).lu0(zE);
                r2 = zE;
            } else {
                str3 = "ClickMD5";
            }
            Log.m105925i("MicroMsg.WebSearch.SosSimilarUI", "doAddAction %b", Boolean.valueOf(((C0365s0) C86312j.m106911c(C0365s0.class)).mo407RI(this.f293811d, r2, 18, C75592q0.m90789s())));
            SimilarEmoticonSearchLongpressStruct similarEmoticonSearchLongpressStruct2 = new SimilarEmoticonSearchLongpressStruct();
            similarEmoticonSearchLongpressStruct2.f265915f = this.f293813f.mo139555c() ? 59 : 78;
            similarEmoticonSearchLongpressStruct2.f265913d = similarEmoticonSearchLongpressStruct2.mo86045b("SessionId", this.f293813f.f293821i, true);
            similarEmoticonSearchLongpressStruct2.f265914e = similarEmoticonSearchLongpressStruct2.mo86045b(str7, this.f293813f.f293821i, true);
            C97904g gVar3 = this.f293812e;
            if (gVar3 == null || (iEmojiInfo = gVar3.f287200b) == null || (str4 = iEmojiInfo.getMd5()) == null) {
                str4 = str6;
            }
            similarEmoticonSearchLongpressStruct2.f265916g = similarEmoticonSearchLongpressStruct2.mo86045b(str3, str4, true);
            SimilarEmojiQueryModel similarEmojiQueryModel2 = this.f293813f.f293817e;
            if (!(similarEmojiQueryModel2 == null || (str5 = similarEmojiQueryModel2.f283911e) == null)) {
                str6 = str5;
            }
            similarEmoticonSearchLongpressStruct2.f265917h = similarEmoticonSearchLongpressStruct2.mo86045b("QueryMD5", str6, true);
            similarEmoticonSearchLongpressStruct2.f265918i = (long) this.f293813f.f293818f;
            similarEmoticonSearchLongpressStruct2.f265919j = (long) this.f293814g;
            similarEmoticonSearchLongpressStruct2.f265920k = System.currentTimeMillis();
            similarEmoticonSearchLongpressStruct2.f265921l = similarEmoticonSearchLongpressStruct2.mo86045b("RequestId", this.f293813f.f293821i, true);
            similarEmoticonSearchLongpressStruct2.f265922m = 3;
            similarEmoticonSearchLongpressStruct2.mo86054n();
            C22613h1.m26490p(similarEmoticonSearchLongpressStruct2);
        }
    }
}
