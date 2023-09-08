package com.tencent.p014mm.plugin.webview.p128ui.tools.video.samelayer.finder;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import c30.C104289g;
import com.tencent.p014mm.autogen.events.OnFinderVideoPluginBackgroundEvent;
import com.tencent.p014mm.autogen.events.OnFinderVideoPluginForegroundEvent;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C28947a;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCLong;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60165e4;
import ht1.C60200t1;
import java.util.Iterator;
import kotlin.Metadata;
import o40.C61926c;
import org.json.JSONObject;
import p830xc.C91165a;
import q20.C89449a;
import rx3.C13598b0;
import te3.C64888zo1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler */
public final class WebViewVideoFinderActionHandler {

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/WebViewVideoFinderActionHandler$EnterFinderFullScreenInfo;", "Landroid/os/Parcelable;", "<init>", "()V", "CREATOR", "a", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$EnterFinderFullScreenInfo */
    public static final class EnterFinderFullScreenInfo implements Parcelable {
        public static final C57519a CREATOR = new C57519a((C8480h) null);

        /* renamed from: d */
        public C64888zo1 f164766d;

        /* renamed from: e */
        public String f164767e = "";

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$EnterFinderFullScreenInfo$a */
        public static final class C57519a implements Parcelable.Creator<EnterFinderFullScreenInfo> {
            public C57519a(C8480h hVar) {
            }

            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                EnterFinderFullScreenInfo enterFinderFullScreenInfo = new EnterFinderFullScreenInfo();
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    byte[] bArr = new byte[readInt];
                    parcel.readByteArray(bArr);
                    try {
                        C64888zo1 zo12 = new C64888zo1();
                        zo12.parseFrom(bArr);
                        enterFinderFullScreenInfo.f164766d = zo12;
                    } catch (Exception unused) {
                        enterFinderFullScreenInfo.f164766d = null;
                    }
                }
                String readString = parcel.readString();
                if (readString == null) {
                    readString = "";
                }
                enterFinderFullScreenInfo.f164767e = readString;
                return enterFinderFullScreenInfo;
            }

            public Object[] newArray(int i) {
                return new EnterFinderFullScreenInfo[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "parcel");
            C64888zo1 zo12 = this.f164766d;
            if (zo12 != null) {
                try {
                    C87412m.m108591d(zo12);
                    byte[] byteArray = zo12.toByteArray();
                    parcel.writeInt(byteArray.length);
                    parcel.writeByteArray(byteArray);
                } catch (Exception unused) {
                }
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(this.f164767e);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/WebViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper;", "Landroid/os/Parcelable;", "<init>", "()V", "CREATOR", "a", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper */
    public static final class FinderVideoInfoForMpWrapper implements Parcelable {
        public static final C57520a CREATOR = new C57520a((C8480h) null);

        /* renamed from: d */
        public C64888zo1 f164768d;

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper$a */
        public static final class C57520a implements Parcelable.Creator<FinderVideoInfoForMpWrapper> {
            public C57520a(C8480h hVar) {
            }

            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                FinderVideoInfoForMpWrapper finderVideoInfoForMpWrapper = new FinderVideoInfoForMpWrapper();
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    byte[] bArr = new byte[readInt];
                    parcel.readByteArray(bArr);
                    try {
                        C64888zo1 zo12 = new C64888zo1();
                        zo12.parseFrom(bArr);
                        finderVideoInfoForMpWrapper.f164768d = zo12;
                    } catch (Exception unused) {
                        finderVideoInfoForMpWrapper.f164768d = null;
                    }
                }
                return finderVideoInfoForMpWrapper;
            }

            public Object[] newArray(int i) {
                return new FinderVideoInfoForMpWrapper[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "parcel");
            C64888zo1 zo12 = this.f164768d;
            if (zo12 != null) {
                try {
                    C87412m.m108591d(zo12);
                    byte[] byteArray = zo12.toByteArray();
                    parcel.writeInt(byteArray.length);
                    parcel.writeByteArray(byteArray);
                } catch (Exception unused) {
                }
            } else {
                parcel.writeInt(0);
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/WebViewVideoFinderActionHandler$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/WebViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$a */
    public static final class C57521a implements C80883e<FinderVideoInfoForMpWrapper, IPCVoid> {
        public void invoke(Object obj, C1256g gVar) {
            C64888zo1 zo12;
            FinderVideoInfoForMpWrapper finderVideoInfoForMpWrapper = (FinderVideoInfoForMpWrapper) obj;
            if (!(finderVideoInfoForMpWrapper == null || (zo12 = finderVideoInfoForMpWrapper.f164768d) == null)) {
                ((C60165e4) C86312j.m106911c(C60165e4.class)).mo85169nQ(zo12);
            }
            OnFinderVideoPluginBackgroundEvent onFinderVideoPluginBackgroundEvent = new OnFinderVideoPluginBackgroundEvent();
            onFinderVideoPluginBackgroundEvent.f154852d.f154853a = finderVideoInfoForMpWrapper != null ? finderVideoInfoForMpWrapper.f164768d : null;
            onFinderVideoPluginBackgroundEvent.publish();
            if (gVar != null) {
                gVar.mo894a(IPCVoid.f10316d);
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/WebViewVideoFinderActionHandler$b;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/WebViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$b */
    public static final class C57522b implements C80883e<FinderVideoInfoForMpWrapper, IPCVoid> {
        public void invoke(Object obj, C1256g gVar) {
            C64888zo1 zo12;
            FinderVideoInfoForMpWrapper finderVideoInfoForMpWrapper = (FinderVideoInfoForMpWrapper) obj;
            if (!(finderVideoInfoForMpWrapper == null || (zo12 = finderVideoInfoForMpWrapper.f164768d) == null)) {
                ((C60165e4) C86312j.m106911c(C60165e4.class)).mo85145Fw(zo12);
            }
            OnFinderVideoPluginForegroundEvent onFinderVideoPluginForegroundEvent = new OnFinderVideoPluginForegroundEvent();
            onFinderVideoPluginForegroundEvent.f154854d.f154855a = finderVideoInfoForMpWrapper != null ? finderVideoInfoForMpWrapper.f164768d : null;
            onFinderVideoPluginForegroundEvent.publish();
            if (gVar != null) {
                gVar.mo894a(IPCVoid.f10316d);
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/WebViewVideoFinderActionHandler$c;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/WebViewVideoFinderActionHandler$EnterFinderFullScreenInfo;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$c */
    public static final class C57523c implements C80883e<EnterFinderFullScreenInfo, IPCVoid> {
        public void invoke(Object obj, C1256g gVar) {
            C64888zo1 zo12;
            C1256g gVar2 = gVar;
            EnterFinderFullScreenInfo enterFinderFullScreenInfo = (EnterFinderFullScreenInfo) obj;
            Class cls = C60200t1.class;
            if (!(enterFinderFullScreenInfo == null || (zo12 = enterFinderFullScreenInfo.f164766d) == null)) {
                Log.m105925i("MicroMsg.WebViewVideoFinderActionHandler", "enterFinderFullScreen invoke localFeedId: %s", zo12.f186756A);
                C60200t1 t1Var = (C60200t1) C86312j.m106911c(cls);
                String str = zo12.f186759e;
                String str2 = str == null ? "" : str;
                String str3 = zo12.f186760f;
                String str4 = str3 == null ? "" : str3;
                int i = zo12.f186762h;
                String str5 = zo12.f186763i;
                Class cls2 = cls;
                t1Var.mo76899xw(str2, "", str4, i, str5 == null ? "" : str5, zo12.f186771t, zo12.f186769r, zo12.f186770s, zo12.f186772u, zo12.f186773v, zo12.f186764j, zo12.f186765n, zo12.f186757B);
                C104289g gVar3 = new C104289g();
                gVar3.mo145953n("playBackTime", zo12.f186774w);
                gVar3.mo145966q("isPause", zo12.f186775x);
                gVar3.f308643a.mo110097e(gVar3.mo110099g("playbackRate"), zo12.f186776y);
                gVar3.mo145966q("showBarrage", zo12.f186777z);
                gVar3.put("feedID", zo12.f186756A);
                gVar3.put("mediaId", zo12.f186759e);
                EnterFinderFullScreenInfo enterFinderFullScreenInfo2 = enterFinderFullScreenInfo;
                if (enterFinderFullScreenInfo2.f164767e.length() > 0) {
                    JSONObject jSONObject = new JSONObject(enterFinderFullScreenInfo2.f164767e);
                    Iterator<String> keys = jSONObject.keys();
                    C87412m.m108593f(keys, "extKeys");
                    while (keys.hasNext()) {
                        String next = keys.next();
                        gVar3.put(next, jSONObject.opt(next));
                    }
                }
                C60200t1 t1Var2 = (C60200t1) C86312j.m106911c(cls2);
                Context context = MMApplicationContext.getContext();
                C87412m.m108593f(context, "getContext()");
                long P = C61926c.m72671P(zo12.f186756A);
                FinderObject finderObject = zo12.f186758d;
                t1Var2.wp0(context, P, (String) null, finderObject != null ? finderObject.objectNonceId : null, WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_PARSE_FAILED, gVar3);
            }
            C1256g gVar4 = gVar;
            if (gVar4 != null) {
                gVar4.mo894a(IPCVoid.f10316d);
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/WebViewVideoFinderActionHandler$d;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/FinderFeedInfoForVideoPlugin;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$d */
    public static final class C57524d implements C80883e<IPCString, FinderFeedInfoForVideoPlugin> {
        public void invoke(Object obj, C1256g gVar) {
            IPCString iPCString = (IPCString) obj;
            Class cls = C60200t1.class;
            String str = "";
            if (iPCString != null) {
                String str2 = iPCString.f10315d;
                if (!(str2 == null || str2.length() == 0)) {
                    FinderObject cb = ((C60200t1) C86312j.m106911c(cls)).mo76838cb(C61926c.m72671P(iPCString.f10315d), (String) null, WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_PARSE_FAILED, "");
                    if (cb == null) {
                        Log.m105920e("MicroMsg.WebViewVideoFinderActionHandler", "getFinderFeedInfo failed finderObject null");
                        if (gVar != null) {
                            FinderFeedInfoForVideoPlugin finderFeedInfoForVideoPlugin = new FinderFeedInfoForVideoPlugin();
                            finderFeedInfoForVideoPlugin.f164761d = str;
                            gVar.mo894a(finderFeedInfoForVideoPlugin);
                            return;
                        }
                        return;
                    }
                    Log.m105924i("MicroMsg.WebViewVideoFinderActionHandler", "getFinderFeedInfo success localFeedId: " + iPCString.f10315d);
                    if (gVar != null) {
                        FinderFeedInfoForVideoPlugin finderFeedInfoForVideoPlugin2 = new FinderFeedInfoForVideoPlugin();
                        String str3 = iPCString.f10315d;
                        if (str3 != null) {
                            str = str3;
                        }
                        finderFeedInfoForVideoPlugin2.f164761d = str;
                        finderFeedInfoForVideoPlugin2.f164762e = ((C60200t1) C86312j.m106911c(cls)).mo76788Nh(cb);
                        finderFeedInfoForVideoPlugin2.f164763f = ((C60200t1) C86312j.m106911c(cls)).mo76786NI(cb);
                        finderFeedInfoForVideoPlugin2.f164764g = ((C60200t1) C86312j.m106911c(cls)).mo76737BW(cb);
                        finderFeedInfoForVideoPlugin2.f164765h = ((C60200t1) C86312j.m106911c(cls)).Ze0(cb);
                        gVar.mo894a(finderFeedInfoForVideoPlugin2);
                        return;
                    }
                    return;
                }
            }
            Log.m105920e("MicroMsg.WebViewVideoFinderActionHandler", "getFinderFeedInfo localFeedId invalid");
            if (gVar != null) {
                FinderFeedInfoForVideoPlugin finderFeedInfoForVideoPlugin3 = new FinderFeedInfoForVideoPlugin();
                finderFeedInfoForVideoPlugin3.f164761d = str;
                gVar.mo894a(finderFeedInfoForVideoPlugin3);
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/WebViewVideoFinderActionHandler$e;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/ipcinvoker/type/IPCLong;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$e */
    public static final class C57525e implements C80883e<IPCString, IPCLong> {
        public void invoke(Object obj, C1256g gVar) {
            FinderObject finderObject;
            IPCString iPCString = (IPCString) obj;
            long j = 0;
            if (iPCString != null) {
                String str = iPCString.f10315d;
                if (!(str == null || str.length() == 0)) {
                    C60200t1 t1Var = (C60200t1) C86312j.m106911c(C60200t1.class);
                    String str2 = iPCString.f10315d;
                    if (str2 == null) {
                        str2 = "";
                    }
                    C64888zo1 nu02 = t1Var.nu0(str2, WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_PARSE_FAILED);
                    if (gVar != null) {
                        if (!(nu02 == null || (finderObject = nu02.f186758d) == null)) {
                            j = finderObject.f164794id;
                        }
                        gVar.mo894a(new IPCLong(j));
                        return;
                    }
                    return;
                }
            }
            Log.m105920e("MicroMsg.WebViewVideoFinderActionHandler", "getFinderPlayInfo data invalid");
            if (gVar != null) {
                gVar.mo894a(new IPCLong(0));
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/WebViewVideoFinderActionHandler$f;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/WebViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$f */
    public static final class C57526f implements C80883e<IPCString, FinderVideoInfoForMpWrapper> {
        public void invoke(Object obj, C1256g gVar) {
            IPCString iPCString = (IPCString) obj;
            if (iPCString != null) {
                String str = iPCString.f10315d;
                if (!(str == null || str.length() == 0)) {
                    C60200t1 t1Var = (C60200t1) C86312j.m106911c(C60200t1.class);
                    String str2 = iPCString.f10315d;
                    if (str2 == null) {
                        str2 = "";
                    }
                    C64888zo1 Rk = t1Var.mo76804Rk(C61926c.m72671P(str2), WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_PARSE_FAILED);
                    if (gVar != null) {
                        FinderVideoInfoForMpWrapper finderVideoInfoForMpWrapper = new FinderVideoInfoForMpWrapper();
                        finderVideoInfoForMpWrapper.f164768d = Rk;
                        gVar.mo894a(finderVideoInfoForMpWrapper);
                        return;
                    }
                    return;
                }
            }
            Log.m105920e("MicroMsg.WebViewVideoFinderActionHandler", "getFinderVideoInfo data invalid");
            if (gVar != null) {
                FinderVideoInfoForMpWrapper finderVideoInfoForMpWrapper2 = new FinderVideoInfoForMpWrapper();
                finderVideoInfoForMpWrapper2.f164768d = null;
                gVar.mo894a(finderVideoInfoForMpWrapper2);
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/video/samelayer/finder/WebViewVideoFinderActionHandler$g;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$g */
    public static final class C57527g implements C80883e<IPCString, IPCVoid> {
        public void invoke(Object obj, C1256g gVar) {
            IPCString iPCString = (IPCString) obj;
            Class cls = C60200t1.class;
            if (iPCString != null) {
                String str = iPCString.f10315d;
                if (!(str == null || str.length() == 0)) {
                    try {
                        JSONObject jSONObject = new JSONObject(iPCString.f10315d);
                        String optString = jSONObject.optString("data");
                        if (optString == null) {
                            optString = "";
                        }
                        if (jSONObject.has("isLike")) {
                            ((C60200t1) C86312j.m106911c(cls)).mo76858jn(optString, WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_PARSE_FAILED, jSONObject.optBoolean("isLike", false));
                        }
                        if (jSONObject.has("isFav")) {
                            ((C60200t1) C86312j.m106911c(cls)).mo76870qp(optString, WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_PARSE_FAILED, jSONObject.optBoolean("isFav", false));
                        }
                        if (gVar != null) {
                            gVar.mo894a(IPCVoid.f10316d);
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.WebViewVideoFinderActionHandler", e, "operateFinderVideo exception", new Object[0]);
                        if (gVar != null) {
                            gVar.mo894a(IPCVoid.f10316d);
                            return;
                        }
                        return;
                    }
                }
            }
            Log.m105920e("MicroMsg.WebViewVideoFinderActionHandler", "operateFinderVideo data invalid");
            if (gVar != null) {
                gVar.mo894a(IPCVoid.f10316d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$h */
    public static final class C57528h extends C87413o implements C32226l<IPCVoid, C13598b0> {

        /* renamed from: d */
        public static final C57528h f164769d = new C57528h();

        public C57528h() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((IPCVoid) obj, LocaleUtil.ITALIAN);
            Log.m105924i("MicroMsg.WebViewVideoFinderActionHandler", "onFinderVideoPluginBackgroundEvent callback");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$i */
    public static final class C57529i extends C87413o implements C32226l<IPCVoid, C13598b0> {

        /* renamed from: d */
        public static final C57529i f164770d = new C57529i();

        public C57529i() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((IPCVoid) obj, LocaleUtil.ITALIAN);
            Log.m105924i("MicroMsg.WebViewVideoFinderActionHandler", "onFinderVideoPluginForegroundEvent callback");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$j */
    public static final class C57530j extends C87413o implements C32226l<IPCVoid, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C91165a f164771d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57530j(C91165a aVar) {
            super(1);
            this.f164771d = aVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((IPCVoid) obj, "result");
            Log.m105924i("MicroMsg.WebViewVideoFinderActionHandler", "enterFinderFullScreen callback");
            this.f164771d.mo62549j("ok");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$k */
    public static final class C57531k extends C87413o implements C32226l<FinderVideoInfoForMpWrapper, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f164772d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<C64888zo1, C13598b0> f164773e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57531k(String str, C32226l<? super C64888zo1, C13598b0> lVar) {
            super(1);
            this.f164772d = str;
            this.f164773e = lVar;
        }

        public Object invoke(Object obj) {
            FinderVideoInfoForMpWrapper finderVideoInfoForMpWrapper = (FinderVideoInfoForMpWrapper) obj;
            C87412m.m108594g(finderVideoInfoForMpWrapper, "result");
            StringBuilder sb = new StringBuilder();
            sb.append("getFinderPlayInfo callback localFeedId: ");
            sb.append(this.f164772d);
            sb.append(", finderVideoInfo.mediaId: ");
            C64888zo1 zo12 = finderVideoInfoForMpWrapper.f164768d;
            sb.append(zo12 != null ? zo12.f186759e : null);
            Log.m105924i("MicroMsg.WebViewVideoFinderActionHandler", sb.toString());
            C64888zo1 zo13 = finderVideoInfoForMpWrapper.f164768d;
            if (zo13 == null) {
                this.f164773e.invoke(null);
            } else {
                this.f164773e.invoke(zo13);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final void m66265a(int i, C64888zo1 zo12) {
        FinderVideoInfoForMpWrapper finderVideoInfoForMpWrapper = new FinderVideoInfoForMpWrapper();
        finderVideoInfoForMpWrapper.f164768d = zo12;
        if (i == 2) {
            String str = WeChatProcess.PROCESS_MAIN;
            C87412m.m108593f(str, "PROCESS_MAIN");
            C28947a.m38500a(str, finderVideoInfoForMpWrapper, new C57521a(), C57528h.f164769d);
        } else if (i == 1) {
            String str2 = WeChatProcess.PROCESS_MAIN;
            C87412m.m108593f(str2, "PROCESS_MAIN");
            C28947a.m38500a(str2, finderVideoInfoForMpWrapper, new C57522b(), C57529i.f164770d);
        }
    }

    /* renamed from: b */
    public static final void m66266b(C91165a aVar, C64888zo1 zo12) {
        JSONObject optJSONObject;
        C87412m.m108594g(aVar, "invokeContext");
        C87412m.m108594g(zo12, "finderVideoInfoForMp");
        StringBuilder sb = new StringBuilder();
        sb.append("enterFinderFullScreen localFeedId: ");
        sb.append(zo12.f186756A);
        sb.append(", extInfo: ");
        JSONObject b = aVar.mo62539b();
        String str = null;
        sb.append(b != null ? b.optJSONObject("extInfo") : null);
        Log.m105924i("MicroMsg.WebViewVideoFinderActionHandler", sb.toString());
        EnterFinderFullScreenInfo enterFinderFullScreenInfo = new EnterFinderFullScreenInfo();
        enterFinderFullScreenInfo.f164766d = zo12;
        JSONObject b2 = aVar.mo62539b();
        if (!(b2 == null || (optJSONObject = b2.optJSONObject("extInfo")) == null)) {
            str = optJSONObject.toString();
        }
        if (str == null) {
            str = "";
        }
        enterFinderFullScreenInfo.f164767e = str;
        String str2 = WeChatProcess.PROCESS_MAIN;
        C87412m.m108593f(str2, "PROCESS_MAIN");
        C28947a.m38500a(str2, enterFinderFullScreenInfo, new C57523c(), new C57530j(aVar));
    }

    /* renamed from: c */
    public static final void m66267c(String str, C32226l<? super C64888zo1, C13598b0> lVar) {
        C87412m.m108594g(str, "localFeedId");
        C87412m.m108594g(lVar, "callback");
        Log.m105924i("MicroMsg.WebViewVideoFinderActionHandler", "getFinderVideoInfo localFeedId: " + str);
        String str2 = WeChatProcess.PROCESS_MAIN;
        C87412m.m108593f(str2, "PROCESS_MAIN");
        C28947a.m38500a(str2, new IPCString(str), new C57526f(), new C57531k(str, lVar));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m66268d(java.lang.String r9, t83.C13855j r10, t83.C13851h1 r11) {
        /*
            java.lang.String r0 = "action"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "env"
            gy3.C87412m.m108594g(r10, r0)
            java.lang.String r0 = "msg"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "handlerFinderAction action: "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.WebViewVideoFinderActionHandler"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            int r0 = r9.hashCode()
            r2 = -1741233496(0xffffffff9836e2a8, float:-2.363738E-24)
            java.lang.String r3 = ""
            java.lang.String r4 = "PROCESS_MAIN"
            r5 = 1
            r6 = 0
            r7 = 0
            if (r0 == r2) goto L_0x0151
            r2 = 295901137(0x11a317d1, float:2.5731544E-28)
            java.lang.String r8 = "data"
            if (r0 == r2) goto L_0x0080
            r2 = 329436478(0x13a2cd3e, float:4.1096934E-27)
            if (r0 == r2) goto L_0x0043
            goto L_0x018d
        L_0x0043:
            java.lang.String r0 = "getFinderPlayInfo"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x004d
            goto L_0x018d
        L_0x004d:
            java.util.Map<java.lang.String, java.lang.Object> r9 = r11.f38983a
            java.lang.Object r9 = r9.get(r8)
            boolean r0 = r9 instanceof java.lang.String
            if (r0 == 0) goto L_0x005a
            r6 = r9
            java.lang.String r6 = (java.lang.String) r6
        L_0x005a:
            if (r6 != 0) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r3 = r6
        L_0x005e:
            java.lang.Object[] r9 = new java.lang.Object[r5]
            r9[r7] = r3
            java.lang.String r0 = "getFinderPlayInfo data: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r9)
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_MAIN
            gy3.C87412m.m108593f(r9, r4)
            com.tencent.mm.ipcinvoker.type.IPCString r0 = new com.tencent.mm.ipcinvoker.type.IPCString
            r0.<init>(r3)
            com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$e r1 = new com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$e
            r1.<init>()
            com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.c r2 = new com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.c
            r2.<init>(r10, r11)
            com.tencent.p014mm.ipcinvoker.C28947a.m38500a(r9, r0, r1, r2)
            goto L_0x018d
        L_0x0080:
            java.lang.String r0 = "operateFinderVideo"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x008a
            goto L_0x018d
        L_0x008a:
            java.util.Map<java.lang.String, java.lang.Object> r9 = r11.f38983a
            java.lang.Object r9 = r9.get(r8)
            boolean r0 = r9 instanceof java.lang.String
            if (r0 == 0) goto L_0x0097
            java.lang.String r9 = (java.lang.String) r9
            goto L_0x0098
        L_0x0097:
            r9 = r6
        L_0x0098:
            if (r9 != 0) goto L_0x009b
            goto L_0x009c
        L_0x009b:
            r3 = r9
        L_0x009c:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "operateFinderVideo data: "
            r9.append(r0)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r9)
            int r9 = r3.length()
            if (r9 != 0) goto L_0x00b7
            goto L_0x00b8
        L_0x00b7:
            r5 = 0
        L_0x00b8:
            if (r5 == 0) goto L_0x00d6
            t83.g r9 = r10.f39001d
            java.lang.String r10 = r11.f38990c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r11 = r11.f38996i
            r0.append(r11)
            java.lang.String r11 = ":fail"
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r9.mo10774a(r10, r11, r6)
            goto L_0x018d
        L_0x00d6:
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            r9.put(r8, r3)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r11.f38983a
            java.lang.String r2 = "isLike"
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x0101
            java.util.Map<java.lang.String, java.lang.Object> r0 = r11.f38983a
            java.lang.Object r0 = r0.get(r2)
            boolean r3 = r0 instanceof java.lang.String
            if (r3 == 0) goto L_0x00f5
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x00f6
        L_0x00f5:
            r0 = r6
        L_0x00f6:
            if (r0 == 0) goto L_0x00fd
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            goto L_0x00fe
        L_0x00fd:
            r0 = 0
        L_0x00fe:
            r9.put(r2, r0)
        L_0x0101:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r11.f38983a
            java.lang.String r2 = "isFav"
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x0121
            java.util.Map<java.lang.String, java.lang.Object> r0 = r11.f38983a
            java.lang.Object r0 = r0.get(r2)
            boolean r3 = r0 instanceof java.lang.String
            if (r3 == 0) goto L_0x0118
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
        L_0x0118:
            if (r6 == 0) goto L_0x011e
            boolean r7 = java.lang.Boolean.parseBoolean(r6)
        L_0x011e:
            r9.put(r2, r7)
        L_0x0121:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "operateFinderVideo operateData: "
            r0.append(r2)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_MAIN
            gy3.C87412m.m108593f(r0, r4)
            com.tencent.mm.ipcinvoker.type.IPCString r1 = new com.tencent.mm.ipcinvoker.type.IPCString
            java.lang.String r9 = r9.toString()
            r1.<init>(r9)
            com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$g r9 = new com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$g
            r9.<init>()
            com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.d r2 = new com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.d
            r2.<init>(r10, r11)
            com.tencent.p014mm.ipcinvoker.C28947a.m38500a(r0, r1, r9, r2)
            goto L_0x018d
        L_0x0151:
            java.lang.String r0 = "getFinderFeedInfo"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x015a
            goto L_0x018d
        L_0x015a:
            java.util.Map<java.lang.String, java.lang.Object> r9 = r11.f38983a
            java.lang.String r0 = "localFeedId"
            java.lang.Object r9 = r9.get(r0)
            boolean r0 = r9 instanceof java.lang.String
            if (r0 == 0) goto L_0x0169
            r6 = r9
            java.lang.String r6 = (java.lang.String) r6
        L_0x0169:
            if (r6 != 0) goto L_0x016c
            goto L_0x016d
        L_0x016c:
            r3 = r6
        L_0x016d:
            java.lang.Object[] r9 = new java.lang.Object[r5]
            r9[r7] = r3
            java.lang.String r0 = "getFinderFeedInfo localFeedId: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r9)
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_MAIN
            gy3.C87412m.m108593f(r9, r4)
            com.tencent.mm.ipcinvoker.type.IPCString r0 = new com.tencent.mm.ipcinvoker.type.IPCString
            r0.<init>(r3)
            com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$d r1 = new com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$d
            r1.<init>()
            com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.b r2 = new com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.b
            r2.<init>(r10, r11, r3)
            com.tencent.p014mm.ipcinvoker.C28947a.m38500a(r9, r0, r1, r2)
        L_0x018d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler.m66268d(java.lang.String, t83.j, t83.h1):void");
    }
}
