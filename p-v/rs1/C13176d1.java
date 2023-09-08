package rs1;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54219z;
import bl3.C39818r;
import co1.C55041a;
import co1.C55051g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.feature.sight.api.ISightJNIService;
import com.tencent.p014mm.opensdk.modelmsg.WXFileObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$f;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.TrafficStats;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import go1.C8367b;
import go1.C8368c;
import go1.C8369d;
import gr1.C59670o2;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import ht1.C8816y1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import jq3.C60905o;
import ke3.C88144b;
import mf1.C10786a1;
import mf1.C10846o0;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import o40.C61926c;
import org.json.JSONObject;
import p910lj.C76701a;
import pf1.C11911l;
import pf1.C11929x;
import pf1.C62273n;
import pl1.C62367r0;
import rx3.C13605o;
import sx3.C110818d0;
import sx3.C36907w;
import sx3.C90363p0;
import te3.C64689rq2;
import te3.C64850yb1;
import te3.uc4;
import xp1.C15869b;
import xp1.C15874c;
import xp1.C15875d;
import z04.C112551y;

/* renamed from: rs1.d1 */
public final class C13176d1 extends UIComponent implements C8816y1 {

    /* renamed from: rs1.d1$a */
    public static final class C13177a implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ boolean f37478d;

        public C13177a(boolean z) {
            this.f37478d = z;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.mo107144g(1, "feed信息", C0966R.raw.finder_icons_link);
            e0Var.mo107144g(3, "强化流检查", C0966R.raw.bottomsheet_icon_refresh);
            e0Var.mo107144g(8, "指定档位", C0966R.raw.bottomsheet_icon_refresh);
            e0Var.mo107144g(9, "播放信息", C0966R.raw.bottomsheet_icon_refresh);
            if (this.f37478d) {
                e0Var.mo107144g(4, "VIDEO信息", C0966R.raw.bottomsheet_icon_brower);
                e0Var.mo107144g(5, "转发视频文件", C0966R.raw.bottomsheet_icon_transmit);
            }
            e0Var.mo107144g(2, "拷贝feed全量信息", C0966R.raw.bottomsheet_icon_star);
            e0Var.mo107144g(6, "拷贝feed点赞信息", C0966R.raw.bottomsheet_icon_star);
            e0Var.mo107144g(10, "组件优先级", C0966R.raw.bottomsheet_icon_star);
            e0Var.mo107144g(11, "H5半屏debug", C0966R.raw.bottomsheet_icon_brower);
        }
    }

    /* renamed from: rs1.d1$b */
    public static final class C13178b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ Context f37479d;

        /* renamed from: e */
        public final /* synthetic */ JSONObject f37480e;

        /* renamed from: f */
        public final /* synthetic */ BaseFinderFeed f37481f;

        /* renamed from: g */
        public final /* synthetic */ C13176d1 f37482g;

        /* renamed from: h */
        public final /* synthetic */ C64689rq2 f37483h;

        /* renamed from: i */
        public final /* synthetic */ C60905o f37484i;

        /* renamed from: j */
        public final /* synthetic */ String f37485j;

        /* renamed from: n */
        public final /* synthetic */ long f37486n;

        /* renamed from: rs1.d1$b$a */
        public static final class C13179a implements MMFragmentActivity$$f {

            /* renamed from: a */
            public final /* synthetic */ WXMediaMessage f37487a;

            /* renamed from: b */
            public final /* synthetic */ String f37488b;

            public C13179a(WXMediaMessage wXMediaMessage, String str) {
                this.f37487a = wXMediaMessage;
                this.f37488b = str;
            }

            /* JADX WARNING: Removed duplicated region for block: B:17:0x006f A[LOOP:1: B:15:0x0069->B:17:0x006f, LOOP_END] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mmOnActivityResult(int r4, int r5, android.content.Intent r6) {
                /*
                    r3 = this;
                    r4 = -1
                    if (r5 != r4) goto L_0x0089
                    java.lang.String r4 = "Select_Conv_User"
                    java.lang.String r4 = r6.getStringExtra(r4)
                    gy3.C87412m.m108591d(r4)
                    z04.k r5 = new z04.k
                    java.lang.String r6 = ","
                    r5.<init>((java.lang.String) r6)
                    r6 = 0
                    java.util.List r4 = r5.mo90760e(r4, r6)
                    boolean r5 = r4.isEmpty()
                    if (r5 != 0) goto L_0x0048
                    int r5 = r4.size()
                    java.util.ListIterator r5 = r4.listIterator(r5)
                L_0x0026:
                    boolean r0 = r5.hasPrevious()
                    if (r0 == 0) goto L_0x0048
                    java.lang.Object r0 = r5.previous()
                    java.lang.String r0 = (java.lang.String) r0
                    int r0 = r0.length()
                    r1 = 1
                    if (r0 != 0) goto L_0x003b
                    r0 = 1
                    goto L_0x003c
                L_0x003b:
                    r0 = 0
                L_0x003c:
                    if (r0 != 0) goto L_0x0026
                    int r5 = r5.nextIndex()
                    int r5 = r5 + r1
                    java.util.List r4 = sx3.C110818d0.m150947s0(r4, r5)
                    goto L_0x004a
                L_0x0048:
                    sx3.f0 r4 = sx3.C64186f0.f181907d
                L_0x004a:
                    java.lang.String[] r5 = new java.lang.String[r6]
                    java.lang.Object[] r4 = r4.toArray(r5)
                    java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
                    gy3.C87412m.m108592e(r4, r5)
                    java.lang.String[] r4 = (java.lang.String[]) r4
                    java.util.ArrayList r4 = com.tencent.p014mm.sdk.platformtools.Util.stringsToList(r4)
                    java.lang.String r5 = "toUserList"
                    gy3.C87412m.m108593f(r4, r5)
                    com.tencent.mm.opensdk.modelmsg.WXMediaMessage r5 = r3.f37487a
                    java.lang.String r6 = r3.f37488b
                    java.util.Iterator r4 = r4.iterator()
                L_0x0069:
                    boolean r0 = r4.hasNext()
                    if (r0 == 0) goto L_0x0089
                    java.lang.Object r0 = r4.next()
                    java.lang.String r0 = (java.lang.String) r0
                    com.tencent.mm.autogen.events.FinderSendMsgEvent r1 = new com.tencent.mm.autogen.events.FinderSendMsgEvent
                    r1.<init>()
                    com.tencent.mm.autogen.events.FinderSendMsgEvent$a r2 = r1.f9242d
                    r2.f9243a = r5
                    r2.f9244b = r0
                    r0 = 4
                    r2.f9245c = r0
                    r2.f9246d = r6
                    r1.publish()
                    goto L_0x0069
                L_0x0089:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: rs1.C13176d1.C13178b.C13179a.mmOnActivityResult(int, int, android.content.Intent):void");
            }
        }

        public C13178b(Context context, JSONObject jSONObject, BaseFinderFeed baseFinderFeed, C13176d1 d1Var, C64689rq2 rq22, C60905o oVar, String str, long j) {
            this.f37479d = context;
            this.f37480e = jSONObject;
            this.f37481f = baseFinderFeed;
            this.f37482g = d1Var;
            this.f37483h = rq22;
            this.f37484i = oVar;
            this.f37485j = str;
            this.f37486n = j;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C86001b0 q;
            String str;
            Class cls = ISightJNIService.class;
            int i2 = 0;
            switch (menuItem.getItemId()) {
                case 1:
                    C15869b bVar = C15869b.f42722a;
                    Context context = this.f37479d;
                    String jSONObject = this.f37480e.toString();
                    C87412m.m108593f(jSONObject, "json.toString()");
                    C15869b.m14792b(bVar, context, jSONObject, (String) null, 4, (Object) null);
                    return;
                case 2:
                    ClipboardHelper.setText(this.f37485j);
                    C76701a.makeText(this.f37484i.f173499A, (CharSequence) "debug info " + this.f37485j, 1).show();
                    return;
                case 3:
                    C15869b.m14792b(C15869b.f42722a, this.f37479d, "后台配置:" + this.f37481f.mo3513o().getPosTriggerConfig(), (String) null, 4, (Object) null);
                    return;
                case 4:
                    C64689rq2 rq22 = this.f37483h;
                    long j = this.f37486n;
                    Context context2 = this.f37479d;
                    C62367r0 a = C55041a.f154526a.mo76098a(j, rq22, false);
                    C15869b.m14792b(C15869b.f42722a, context2, "path:" + a.getPath() + " \nsize:" + Util.getSizeKB(C86013q1.m106451l(a.getPath())) + "\nmediaId:" + a.f177253e.f185275p + "\nurl=" + rq22.f185266d + " \n" + ((ISightJNIService) C86312j.m106911c(cls)).getSimpleMp4InfoVFS(a.getPath()) + " \nisH265:" + ((ISightJNIService) C86312j.m106911c(cls)).isH265VideoVFS(a.getPath()), (String) null, 4, (Object) null);
                    return;
                case 5:
                    C64689rq2 rq23 = this.f37483h;
                    BaseFinderFeed baseFinderFeed = this.f37481f;
                    Context context3 = this.f37479d;
                    C62367r0 a2 = C55041a.f154526a.mo76098a(baseFinderFeed.getItemId(), rq23, false);
                    String str2 = "path:" + a2.getPath() + " \nsize:" + Util.getSizeKB(C86013q1.m106451l(a2.getPath())) + "\nmediaId:" + a2.f177253e.f185275p + "\nurl=" + rq23.f185266d;
                    Intent intent = new Intent();
                    WXFileObject wXFileObject = new WXFileObject();
                    wXFileObject.setFilePath(a2.getPath());
                    WXMediaMessage wXMediaMessage = new WXMediaMessage();
                    wXMediaMessage.mediaObject = wXFileObject;
                    Uri n = C116299g2.m163858n(a2.getPath());
                    String path = n.getPath();
                    if (path != null) {
                        String k = C116299g2.m163855k(path, false, false);
                        if (!n.getPath().equals(k)) {
                            n = n.buildUpon().path(k).build();
                        }
                    }
                    String path2 = n.getPath();
                    int lastIndexOf = path2.lastIndexOf("/");
                    if (lastIndexOf >= 0) {
                        path2 = path2.substring(lastIndexOf + 1);
                    }
                    wXMediaMessage.title = path2;
                    C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                    long j2 = 0;
                    if (l.mo177810a() && (q = l.f348991a.mo119945q(l.f348992b)) != null) {
                        j2 = q.f250473c;
                    }
                    wXMediaMessage.description = Util.getSizeKB(j2);
                    intent.putExtra("Select_Conv_Type", 3);
                    intent.putExtra("select_is_ret", true);
                    intent.putExtra("Retr_Msg_Type", 2);
                    C87412m.m108592e(context3, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
                    C88144b.m109804v((MMFragmentActivity) context3, ".ui.transmit.SelectConversationUI", intent, 1004, new C13179a(wXMediaMessage, str2));
                    return;
                case 6:
                    StringBuilder sb = new StringBuilder("friendLikeCount=" + this.f37481f.mo3513o().getFeedObject().friendLikeCount + " incFriendLikeCount=" + this.f37481f.mo3513o().getFeedObject().incFriendLikeCount + 10);
                    LinkedList<FinderCommentInfo> linkedList = this.f37481f.mo3513o().getFeedObject().likeList;
                    C87412m.m108593f(linkedList, "item.feedObject.feedObject.likeList");
                    for (FinderCommentInfo finderCommentInfo : linkedList) {
                        sb.append(finderCommentInfo.nickname);
                        sb.append("=");
                        sb.append(Util.formatUnixTime(finderCommentInfo.createtime));
                        sb.append("\n");
                    }
                    C15869b bVar2 = C15869b.f42722a;
                    Context context4 = this.f37479d;
                    String sb4 = sb.toString();
                    C87412m.m108593f(sb4, "ss.toString()");
                    C15869b.m14792b(bVar2, context4, sb4, (String) null, 4, (Object) null);
                    return;
                case 8:
                    C13176d1 d1Var = this.f37482g;
                    Context context5 = this.f37479d;
                    C64689rq2 rq24 = this.f37483h;
                    FinderObject feedObject = this.f37481f.mo3513o().getFeedObject();
                    C60905o oVar = this.f37484i;
                    d1Var.getClass();
                    C87412m.m108594g(context5, "context");
                    C87412m.m108594g(rq24, "video");
                    C87412m.m108594g(feedObject, "feedObject");
                    C87412m.m108594g(oVar, "holder");
                    LinkedList linkedList2 = new LinkedList();
                    LinkedList linkedList3 = new LinkedList();
                    LinkedList<C64850yb1> linkedList4 = rq24.f185265Z;
                    C87412m.m108593f(linkedList4, "video.hdr_spec");
                    for (C64850yb1 yb12 : linkedList4) {
                        String str3 = yb12.f186466d;
                        if (str3 == null) {
                            str3 = "unknown-hdr";
                        }
                        linkedList2.add(str3);
                        linkedList3.add(C55051g.m62152a(yb12));
                    }
                    LinkedList<C64850yb1> linkedList5 = rq24.f185282v;
                    C87412m.m108593f(linkedList5, "video.spec");
                    for (C64850yb1 yb13 : linkedList5) {
                        String str4 = yb13.f186466d;
                        if (str4 == null) {
                            str4 = "unknown-sdr";
                        }
                        linkedList2.add(str4);
                        linkedList3.add(C55051g.m62152a(yb13));
                    }
                    C8479f0 f0Var = new C8479f0();
                    f0Var.f27484d = C15869b.m14793c(C15869b.f42722a, context5, linkedList3, C13176d1.m12587e3(oVar), (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null, new C63551g1(linkedList2, oVar, f0Var), 24, (Object) null);
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("handleSelectSpec feedId:");
                    sb5.append(C61926c.m72691p(feedObject.f164794id));
                    sb5.append(" desc:");
                    FinderObjectDesc finderObjectDesc = feedObject.objectDesc;
                    String str5 = "";
                    if (finderObjectDesc == null || (str = finderObjectDesc.description) == null) {
                        str = str5;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        str5 = str.substring(0, Math.min(4, str.length()));
                        C87412m.m108593f(str5, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    sb5.append(str5);
                    Log.m105924i("MicroMsg.FinderDebugUIC", sb5.toString());
                    return;
                case 9:
                    C13176d1 d1Var2 = this.f37482g;
                    C60905o oVar2 = this.f37484i;
                    d1Var2.getClass();
                    Class cls2 = FinderCommonFeatureService.class;
                    FinderVideoLayout finderVideoLayout = (FinderVideoLayout) oVar2.f44854d.findViewById(C0966R.C0970id.d7a);
                    if (finderVideoLayout.getVideoView() instanceof FinderThumbPlayerProxy) {
                        C59670o2 videoView = finderVideoLayout.getVideoView();
                        C87412m.m108592e(videoView, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy");
                        FinderThumbPlayerProxy.C3913a aVar = ((FinderThumbPlayerProxy) videoView).f161712K;
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("position:" + aVar.f17566b);
                        sb6.append("\n");
                        sb6.append("decodeType:" + aVar.f17567c);
                        sb6.append("\n");
                        sb6.append("preloadType:" + aVar.f17568d);
                        sb6.append("\n");
                        sb6.append("firstFrameTime:" + aVar.f17569e);
                        sb6.append("\n");
                        sb6.append("viewType:" + aVar.f17571g);
                        sb6.append("\n");
                        sb6.append("specType:" + aVar.f17572h);
                        sb6.append("\n");
                        C13605o oVar3 = (C13605o) ((FinderCommonFeatureService) C86312j.m106911c(cls2)).Hx0().f154563r.get(aVar.f17565a);
                        if (oVar3 != null) {
                            i2 = (int) ((Number) oVar3.f38559f).longValue();
                        }
                        sb6.append("preloadMaxBitRate:" + i2);
                        sb6.append("\n");
                        sb6.append("videoBitRate:" + aVar.f17573i);
                        sb6.append("\n");
                        ((FinderCommonFeatureService) C86312j.m106911c(cls2)).Fx0().getClass();
                        long j3 = TrafficStats.totalWxRx;
                        long e = ((FinderCommonFeatureService) C86312j.m106911c(cls2)).Fx0().mo52128e();
                        long j4 = ((FinderCommonFeatureService) C86312j.m106911c(cls2)).Fx0().f71363d;
                        long j5 = ((FinderCommonFeatureService) C86312j.m106911c(cls2)).Fx0().f71363d;
                        sb6.append("global rx:" + j3);
                        sb6.append("\n");
                        sb6.append("cdn    rx:" + e + " gap:" + (j3 - e));
                        sb6.append("\n");
                        sb6.append("finder rx:" + j4 + " gap:" + (e - j4));
                        sb6.append("\n");
                        sb6.append("report rx:" + j5 + " gap:" + (j4 - j5));
                        C15869b bVar3 = C15869b.f42722a;
                        Activity context6 = d1Var2.getContext();
                        String sb7 = sb6.toString();
                        C87412m.m108593f(sb7, "debugInfoStr.toString()");
                        C15869b.m14792b(bVar3, context6, sb7, (String) null, 4, (Object) null);
                        return;
                    }
                    return;
                case 10:
                    C13176d1 d1Var3 = this.f37482g;
                    Context context7 = this.f37479d;
                    BaseFinderFeed baseFinderFeed2 = this.f37481f;
                    C60905o oVar4 = this.f37484i;
                    d1Var3.getClass();
                    C87412m.m108594g(context7, "context");
                    C87412m.m108594g(baseFinderFeed2, "feed");
                    C87412m.m108594g(oVar4, "holder");
                    C8368c cVar = C8368c.f27352a;
                    List<C8367b> list = C8369d.f27355a;
                    int a3 = C90363p0.m113142a(C36907w.m41090l(list, 10));
                    if (a3 < 16) {
                        a3 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(a3);
                    for (T next : list) {
                        linkedHashMap.put(((C8367b) next).f27348a, next);
                    }
                    List y0 = C110818d0.m150953y0(linkedHashMap.keySet());
                    C15869b.m14793c(C15869b.f42722a, context7, y0, "组件优先级", (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null, new C13227f1(linkedHashMap, y0, context7, d1Var3, oVar4, baseFinderFeed2), 24, (Object) null);
                    return;
                case 11:
                    C13176d1 d1Var4 = this.f37482g;
                    Context context8 = this.f37479d;
                    C60905o oVar5 = this.f37484i;
                    d1Var4.getClass();
                    C13210e1 e1Var = new C13210e1(context8, oVar5);
                    C87412m.m108594g(context8, "context");
                    EditText editText = new EditText(context8);
                    editText.setGravity(3);
                    editText.setTextSize(1, 14.0f);
                    editText.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    editText.setTextColor(context8.getResources().getColor(C0966R.color.f3133gi));
                    editText.setTypeface(Typeface.MONOSPACE);
                    int dimensionPixelSize = context8.getResources().getDimensionPixelSize(C0966R.dimen.f3963ll);
                    editText.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                    C76879j.m92747r(context8, "视频号测试", editText, "确定", "取消", new C15875d(e1Var, editText), C15874c.f42731d);
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13176d1(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public static final void m12586c3(C13176d1 d1Var, C60905o oVar, BaseFinderFeed baseFinderFeed, int i, int i2, int i3, int i4, String str) {
        Object obj;
        boolean z;
        int i5 = i2;
        d1Var.getClass();
        if (baseFinderFeed.mo3513o().getFeedObject().adFlag == 0) {
            baseFinderFeed.mo3513o().getFeedObject().adFlag = 100000;
            C39622i0 a = C39818r.f106831a.mo62443b(d1Var.getContext()).mo75002a(C10786a1.class);
            C87412m.m108593f(a, "UICProvider.of(context).…eedJumperUIC::class.java)");
            C10846o0.m10834o3((C10846o0) a, baseFinderFeed, oVar, (String) null, false, (C11929x) null, 28, (Object) null);
        }
        FinderJumpInfo finderJumpInfo = new FinderJumpInfo();
        finderJumpInfo.wording = str;
        finderJumpInfo.icon_url = "http:";
        finderJumpInfo.business_type = i4;
        LinkedList<uc4> linkedList = finderJumpInfo.style;
        uc4 uc4 = new uc4();
        uc4.f142760f = i5;
        uc4.f142761g = true;
        uc4.f142762h = i3;
        uc4.f142763i = true;
        linkedList.add(uc4);
        C62273n nVar = (C62273n) C39818r.f106831a.mo62446e(C60200t1.class).mo75002a(C62273n.class);
        long itemId = baseFinderFeed.getItemId();
        nVar.getClass();
        C54219z<Set<C11911l>> g3 = nVar.mo87341g3(itemId, i);
        Set<C11911l> value = g3.getValue();
        HashSet hashSet = value instanceof HashSet ? (HashSet) value : null;
        if (hashSet == null) {
            hashSet = new HashSet();
        }
        HashSet hashSet2 = hashSet;
        Iterator it = hashSet2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C11911l) obj).f34805c == i5) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C11911l lVar = (C11911l) obj;
        if (lVar == null) {
            LinkedList linkedList2 = new LinkedList();
            linkedList2.add(finderJumpInfo);
            hashSet2.add(new C11911l(i, itemId, i2, linkedList2, false, (String) null, 48, (C8480h) null));
            g3.postValue(hashSet2);
            return;
        }
        List<FinderJumpInfo> list = lVar.f34806d;
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            FinderJumpInfo finderJumpInfo2 = (FinderJumpInfo) next;
            if (finderJumpInfo2.business_type == finderJumpInfo.business_type && C112551y.m153810j(finderJumpInfo2.wording, finderJumpInfo.wording, false, 2, (Object) null)) {
                arrayList.add(next);
            }
        }
        if (!(!arrayList.isEmpty())) {
            List<FinderJumpInfo> list2 = lVar.f34806d;
            C87412m.m108592e(list2, "null cannot be cast to non-null type java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderJumpInfo>");
            ((LinkedList) list2).add(finderJumpInfo);
            g3.postValue(hashSet2);
        }
    }

    /* renamed from: e3 */
    public static final String m12587e3(C60905o oVar) {
        FinderVideoLayout finderVideoLayout = (FinderVideoLayout) oVar.f44854d.findViewById(C0966R.C0970id.d7a);
        if (!((finderVideoLayout != null ? finderVideoLayout.getVideoView() : null) instanceof FinderThumbPlayerProxy)) {
            return "档位选择";
        }
        C59670o2 videoView = finderVideoLayout.getVideoView();
        C87412m.m108592e(videoView, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy");
        FinderThumbPlayerProxy.C3913a aVar = ((FinderThumbPlayerProxy) videoView).f161712K;
        return "目前播放档位: " + aVar.f17572h;
    }

    /* renamed from: V1 */
    public boolean mo9642V1() {
        return BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED || CrashReportFactory.hasDebuger();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v27, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v55, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v59, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12676d3(android.content.Context r20, com.tencent.p014mm.plugin.finder.model.BaseFinderFeed r21, pl1.C62367r0 r22, jq3.C60905o r23) {
        /*
            r19 = this;
            r1 = r20
            r3 = r21
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "item"
            gy3.C87412m.m108594g(r3, r0)
            java.lang.String r0 = "holder"
            r6 = r23
            gy3.C87412m.m108594g(r6, r0)
            qo3.n r10 = new qo3.n
            r0 = 0
            r10.<init>((android.content.Context) r1, (int) r0, (boolean) r0)
            long r8 = r21.getItemId()
            com.tencent.mm.plugin.finder.storage.FeedData$a r2 = com.tencent.p014mm.plugin.finder.storage.FeedData.Companion
            com.tencent.mm.plugin.finder.storage.FeedData r2 = r2.mo78883a(r3)
            java.util.LinkedList r2 = r2.getMediaList()
            java.lang.Object r2 = sx3.C110818d0.m150914L(r2)
            r5 = r2
            te3.rq2 r5 = (te3.C64689rq2) r5
            int r2 = r5.f185268f
            r4 = 4
            if (r2 != r4) goto L_0x0036
            r0 = 1
        L_0x0036:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r4 = "tag"
            java.lang.String r7 = "ClickMoreDebug"
            org.json.JSONObject r4 = r2.put(r4, r7)
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r21.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r7 = r7.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderContact r7 = r7.contact
            java.lang.String r11 = ""
            if (r7 == 0) goto L_0x0056
            java.lang.String r7 = r7.nickname
            if (r7 != 0) goto L_0x0057
        L_0x0056:
            r7 = r11
        L_0x0057:
            java.lang.String r12 = "nickname"
            org.json.JSONObject r4 = r4.put(r12, r7)
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r21.mo3513o()
            long r12 = r7.getId()
            java.lang.String r7 = o40.C61926c.m72691p(r12)
            java.lang.String r12 = "feedId"
            org.json.JSONObject r4 = r4.put(r12, r7)
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r21.mo3513o()
            long r12 = r7.getId()
            java.lang.String r7 = "signedFeedId"
            org.json.JSONObject r4 = r4.put(r7, r12)
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r21.mo3513o()
            int r7 = r7.getCreateTime()
            long r12 = (long) r7
            r14 = 1
            long r12 = r12 * r14
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.formatUnixTime(r12)
            java.lang.String r12 = "feedTime"
            org.json.JSONObject r4 = r4.put(r12, r7)
            int r7 = r5.f185269g
            java.lang.String r12 = "videoDuration"
            org.json.JSONObject r4 = r4.put(r12, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            float r12 = r5.f185270h
            r7.append(r12)
            r12 = 58
            r7.append(r12)
            float r12 = r5.f185271i
            r7.append(r12)
            java.lang.String r7 = r7.toString()
            java.lang.String r12 = "mediaWH"
            org.json.JSONObject r4 = r4.put(r12, r7)
            float r7 = r5.f185271i
            r12 = 1065353216(0x3f800000, float:1.0)
            float r13 = r5.f185270h
            int r14 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r14 >= 0) goto L_0x00c7
            r12 = r13
        L_0x00c7:
            float r7 = r7 / r12
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r12 = "mediaRadio"
            org.json.JSONObject r4 = r4.put(r12, r7)
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r21.mo3513o()
            java.lang.String r7 = r7.getDescription()
            java.lang.String r12 = "description"
            org.json.JSONObject r4 = r4.put(r12, r7)
            java.lang.String r7 = "isVideo"
            org.json.JSONObject r4 = r4.put(r7, r0)
            r7 = 0
            if (r22 == 0) goto L_0x00ee
            java.lang.String r12 = r22.mo87422g()
            goto L_0x00ef
        L_0x00ee:
            r12 = r7
        L_0x00ef:
            java.lang.String r13 = "file_format"
            org.json.JSONObject r4 = r4.put(r13, r12)
            com.tencent.mm.plugin.finder.storage.FinderItem r12 = r21.mo3513o()
            java.lang.String r12 = r12.field_username
            java.lang.String r13 = "username"
            org.json.JSONObject r4 = r4.put(r13, r12)
            fe1.d$b r12 = fe1.C58961d.f168673a
            com.tencent.mm.plugin.finder.storage.FinderItem r13 = r21.mo3513o()
            java.lang.String r13 = r13.field_username
            com.tencent.mm.plugin.finder.storage.FinderItem r14 = r21.mo3513o()
            te3.cg r14 = r14.getBizInfo()
            if (r14 == 0) goto L_0x0116
            java.lang.String r7 = r14.f182468d
        L_0x0116:
            r14 = r7
            r15 = 0
            r16 = 0
            r17 = 12
            r18 = 0
            boolean r7 = fe1.C58961d.C58963b.m68836h(r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r12 = "isFollow"
            org.json.JSONObject r4 = r4.put(r12, r7)
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r21.mo3513o()
            int r7 = r7.getMediaType()
            java.lang.String r12 = "mediaType"
            org.json.JSONObject r4 = r4.put(r12, r7)
            java.lang.String r7 = r5.f185266d
            if (r7 != 0) goto L_0x013b
            r7 = r11
        L_0x013b:
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r7)
            java.lang.String r12 = "mediaId"
            org.json.JSONObject r4 = r4.put(r12, r7)
            java.lang.String r7 = r5.f185266d
            java.lang.String r12 = "url"
            org.json.JSONObject r4 = r4.put(r12, r7)
            java.lang.String r7 = r5.f185267e
            java.lang.String r12 = "thumbUrl"
            org.json.JSONObject r4 = r4.put(r12, r7)
            java.lang.String r7 = r5.f185288z
            java.lang.String r12 = "thumbUrlToken"
            org.json.JSONObject r4 = r4.put(r12, r7)
            java.lang.String r7 = r5.f185239F
            java.lang.String r12 = "fullThumbUrl"
            org.json.JSONObject r4 = r4.put(r12, r7)
            java.lang.String r7 = r5.f185240G
            java.lang.String r12 = "fullThumbUrlToken"
            org.json.JSONObject r4 = r4.put(r12, r7)
            java.lang.String r7 = r5.f185283w
            java.lang.String r12 = "coverUrl"
            org.json.JSONObject r4 = r4.put(r12, r7)
            java.lang.String r7 = r5.f185234A
            java.lang.String r12 = "coverUrlToken"
            org.json.JSONObject r4 = r4.put(r12, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r12 = r5.f185266d
            r7.append(r12)
            java.lang.String r12 = r5.f185286y
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)
            r7.append(r12)
            java.lang.String r7 = r7.toString()
            java.lang.String r12 = "longUrl"
            org.json.JSONObject r4 = r4.put(r12, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r12 = r5.f185267e
            r7.append(r12)
            java.lang.String r12 = r5.f185288z
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)
            r7.append(r12)
            java.lang.String r7 = r7.toString()
            java.lang.String r12 = "longThumbUrl"
            org.json.JSONObject r4 = r4.put(r12, r7)
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r21.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r7 = r7.getFeedObject()
            java.lang.String r7 = r7.debugMessage
            if (r7 != 0) goto L_0x01c7
            r7 = r11
        L_0x01c7:
            java.lang.String r12 = "debugMessage"
            org.json.JSONObject r4 = r4.put(r12, r7)
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r21.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r7 = r7.getFeedObject()
            te3.kf1 r7 = r7.object_extend
            if (r7 == 0) goto L_0x01df
            int r7 = r7.f136758t
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
        L_0x01df:
            java.lang.String r7 = "attr_func_flag"
            r4.put(r7, r11)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "content="
            r4.append(r7)
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r21.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r7 = r7.getFeedObject()
            org.json.JSONObject r7 = o40.C61937h.m72709h(r7)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            java.lang.String r7 = z04.C66725r.m78728b(r4)
            java.lang.String r4 = "MicroMsg.FinderDebugUIC"
            java.lang.String r11 = "START####################################################START"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "long click more button! "
            r11.append(r12)
            r11.append(r2)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "long click more button allInfo! "
            r11.append(r12)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r11)
            java.lang.String r11 = "END  ####################################################  END"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r11)
            boolean r4 = r19.mo9642V1()
            if (r4 == 0) goto L_0x0259
            rs1.d1$a r4 = new rs1.d1$a
            r4.<init>(r0)
            r10.f225771i = r4
            rs1.d1$b r11 = new rs1.d1$b
            r0 = r11
            r1 = r20
            r3 = r21
            r4 = r19
            r6 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.f225782p = r11
            r10.mo107573q()
        L_0x0259:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13176d1.mo12676d3(android.content.Context, com.tencent.mm.plugin.finder.model.BaseFinderFeed, pl1.r0, jq3.o):void");
    }
}
