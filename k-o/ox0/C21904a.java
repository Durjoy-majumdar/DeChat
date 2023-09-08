package ox0;

import a70.C112760b;
import com.google.protobuf.C23861l0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C19613h1;
import com.tencent.p014mm.storage.C19636w0;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.wechat.p326mm.biz.BizCgiCardProto;
import com.tencent.wechat.p326mm.biz.BizCgiProto;
import com.tencent.wechat.p326mm.biz.BizManager;
import com.tencent.wechat.p326mm.biz.BizProto;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import jw0.C21289b;
import jw0.C21291d;
import ky3.C88334c;
import my3.C61594j;
import my3.C61595o;
import nj3.C76912y0;
import p007bo.C16801f;
import p007bo.C16813m;
import te3.C22521pi1;
import te3.re4;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: ox0.a */
public final class C21904a {

    /* renamed from: a */
    public static final C21904a f61955a = new C21904a();

    /* renamed from: a */
    public final void mo34944a(String str) {
        String str2;
        String str3;
        String str4;
        if (C16801f.f45399a.mo17845e()) {
            try {
                String str5 = C112760b.m154195C() + "biztest/biztestcase/" + str;
                if (!C86013q1.m106450k(str5)) {
                    str5 = C112760b.m154195C() + "biztest/" + str;
                }
                str2 = C86013q1.m106432N(str5);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.BizTestFinderHelper", "tryInterceptBridgeScriptRequest, failed, ", e);
                str2 = "";
            }
            if (Util.isNullOrNil(str2)) {
                str3 = "";
            } else {
                C87412m.m108591d(str2);
                String n = C112551y.m153814n(C112551y.m153814n(C112551y.m153814n(str2, "\n", "", false), " ", "", false), "ahref", "a href", false);
                Pattern compile = Pattern.compile("(?<=<CardId>).*(?=</CardId>)", 66);
                C87412m.m108593f(compile, "compile(pattern, ensureUnicodeCase(option.value))");
                String str6 = "testCardId:" + C19613h1.f55490a.mo122717f();
                C87412m.m108594g(str6, "replacement");
                str3 = compile.matcher(n).replaceAll(str6);
                C87412m.m108593f(str3, "nativePattern.matcher(in…).replaceAll(replacement)");
            }
            if (Util.isNullOrNil(str3)) {
                C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) "插入失败，读不到文件", 0);
                return;
            }
            int E = C112550d0.m153769E(str3, "<sysmsg", 0, false, 6, (Object) null);
            Map<String, String> map = null;
            if (E != -1) {
                String substring = str3.substring(E);
                C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
                Map<String, String> parseXml = XmlParser.parseXml(substring, "sysmsg", (String) null);
                if (parseXml == null) {
                    Log.m105921e("MicroMsg.BizTestFinderHelper", "XmlParser values is null, msgContent %s", str3);
                } else {
                    map = parseXml;
                }
            }
            re4 i = C19636w0.m21167i(map);
            C19613h1.m21030c(i, map);
            BizProto.BizMsgInfo lastMsgInfo = BizManager.getInstance().getLastMsgInfo();
            C87412m.m108593f(lastMsgInfo, "info");
            C21289b.m23809c(lastMsgInfo);
            BizCgiProto.ViewMsgCard.Builder newBuilder = BizCgiProto.ViewMsgCard.newBuilder();
            newBuilder.setMsgViewType(2);
            newBuilder.setMsgType(2);
            newBuilder.setBuffer("{\"is_float_box\":false}");
            BizCgiProto.NativeRecCardInfo.Builder newBuilder2 = BizCgiProto.NativeRecCardInfo.newBuilder();
            BizCgiCardProto.BizRecommendArticleXml.Builder newBuilder3 = BizCgiCardProto.BizRecommendArticleXml.newBuilder();
            BizCgiCardProto.BizRecommendArticle.Builder newBuilder4 = BizCgiCardProto.BizRecommendArticle.newBuilder();
            newBuilder4.setTitle(i.f64515d.f64239d);
            newBuilder4.setPos(0);
            newBuilder4.setWeight(-1);
            newBuilder4.setRecID(i.f64519h);
            newBuilder4.setStyle(104);
            newBuilder4.setRedDotFlag(1);
            newBuilder4.setRecSummary("测试视频号插入");
            newBuilder4.setCardId(i.f64526r);
            newBuilder4.setExpType("recommend_card_video_insert_videofinder_strategy");
            newBuilder4.setExtraData(i.f64527s);
            BizCgiCardProto.NativeFinderFeeds.Builder newBuilder5 = BizCgiCardProto.NativeFinderFeeds.newBuilder();
            newBuilder5.setSubType(i.f64529u.f186438d);
            LinkedList<C22521pi1> linkedList = i.f64529u.f186439e;
            C87412m.m108593f(linkedList, "wrapper.nativeFinderFeeds.finder_feeds");
            for (C22521pi1 pi12 : linkedList) {
                BizCgiCardProto.FinderRecommendData.Builder newBuilder6 = BizCgiCardProto.FinderRecommendData.newBuilder();
                newBuilder6.setBizuin(C19613h1.m21049v(pi12.f64427g));
                newBuilder6.setHeadimgUrl(pi12.f64424d);
                newBuilder6.setNickName(pi12.f64425e);
                newBuilder6.setUsername(pi12.f64426f);
                newBuilder6.setMbizuin(C19613h1.m21049v(pi12.f64427g));
                newBuilder6.setMappmsgid(pi12.f64428h);
                newBuilder6.setMidx(pi12.f64429i);
                newBuilder6.setIsRecommend(pi12.f64430j);
                newBuilder6.setFinderUin(pi12.f64431n);
                newBuilder6.setFinderEncryptUserName(pi12.f64432o);
                newBuilder6.setTitle(pi12.f64433p);
                newBuilder6.setCoverImgUrl(pi12.f64434q);
                newBuilder6.setFinderObjectId(pi12.f64435r);
                newBuilder6.setFinderExportId(pi12.f64436s);
                newBuilder6.setFinderObjectNonceId(pi12.f64437t);
                newBuilder6.setFinderMediaType(pi12.f64438u);
                newBuilder6.setFinderExportUsername("");
                newBuilder6.setFinderDuration(pi12.f64440w);
                newBuilder6.setFinderHeight(pi12.f64442y);
                newBuilder6.setFinderWidth(pi12.f64443z);
                newBuilder6.setFinderCoverHeight(pi12.f64406A);
                newBuilder6.setFinderCoverWidth(pi12.f64407B);
                newBuilder6.setFinderLikeCount(pi12.f64408C);
                newBuilder6.setFinderCommentCount(pi12.f64409D);
                newBuilder6.setFinderCreateTime(pi12.f64410E);
                newBuilder6.setShowFinder(pi12.f64411F);
                newBuilder6.setAlignment(pi12.f64412G);
                int g = C61595o.m72299g(new C61594j(1, 8), C88334c.f255322d);
                if (g > 4) {
                    str4 = g + "个朋友看过";
                } else {
                    str4 = "";
                }
                newBuilder6.setRecommendReason(str4);
                newBuilder6.setRecommendSendTime(pi12.f64414I);
                newBuilder6.setExpType(pi12.f64415J);
                newBuilder6.setMsgRecType(pi12.f64417L);
                newBuilder6.setCardRecType(pi12.f64418M);
                newBuilder6.setFinderSessionBuffer(pi12.f64419N);
                newBuilder6.setRecSummary(str4);
                newBuilder5.addFinderFeeds((BizCgiCardProto.FinderRecommendData) newBuilder6.build());
            }
            C23861l0 build = newBuilder5.build();
            C87412m.m108593f(build, "newBuilder().apply {\n   …     }\n\n        }.build()");
            newBuilder4.setNativeFinderFeeds((BizCgiCardProto.NativeFinderFeeds) build);
            newBuilder3.setBizAccountRecommend((BizCgiCardProto.BizRecommendArticle) newBuilder4.build());
            newBuilder2.setCardInfo((BizCgiCardProto.BizRecommendArticleXml) newBuilder3.build());
            newBuilder.setNativeRecCardInfo((BizCgiProto.NativeRecCardInfo) newBuilder2.build());
            BizManager c = C16813m.f45424a.mo17857c();
            AtomicInteger atomicInteger = C21291d.f60148a;
            c.mockInsertRecCardAsync(C21291d.f60148a.incrementAndGet(), (BizCgiProto.ViewMsgCard) newBuilder.build());
        }
    }

    /* renamed from: b */
    public final void mo34945b(int i) {
        C88334c cVar = C19613h1.f55490a;
        C19613h1.m21053z("finderbiztest_large_case" + i + ".xml", false);
        mo34944a("finderbiztest_large_case" + i + ".xml");
    }
}
