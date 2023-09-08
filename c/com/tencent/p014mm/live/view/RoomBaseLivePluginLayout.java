package com.tencent.p014mm.live.view;

import a60.C53979a;
import a60.C53983b;
import a60.C53984c;
import a60.C53985d;
import a60.C53986e;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Base64;
import b60.C28259d;
import b60.C28260e;
import b60.C54427b;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.VoipEvent;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.p136ui.C57833e1;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.trtc.TRTCCloudDef;
import com.tencent.xweb.file.XVFSFile;
import d50.C58107a;
import d50.C58113g;
import d50.C58114h;
import eb0.C31543z5;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Metadata;
import o40.C61926c;
import p50.C62197e;
import pe3.C47465a;
import rx3.C13598b0;
import te3.C49317ep2;
import te3.C49455fp2;
import te3.C49765hx0;
import te3.C50593nu0;
import te3.C52013xs0;
import te3.C64293cq2;
import te3.C64429ht0;
import te3.C64890zp2;
import y50.C38964c;
import y50.C38965d;
import y50.C38966e;
import y50.C38970o0;
import y50.C53496k;
import y50.C66505a;
import y50.C66507b;
import y50.C66512f;
import y50.C66517i0;
import y50.C66519j0;
import y50.C66521k0;
import y50.C66522l;
import z04.C112550d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/live/view/RoomBaseLivePluginLayout;", "Lcom/tencent/mm/live/view/BaseLivePluginLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-logic_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.live.view.RoomBaseLivePluginLayout */
public abstract class RoomBaseLivePluginLayout extends BaseLivePluginLayout {

    /* renamed from: d */
    public final IListener<VoipEvent> f157363d;

    /* renamed from: e */
    public final IListener<?> f157364e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoomBaseLivePluginLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C40008f fVar = C40008f.f107254d;
        this.f157363d = new RoomBaseLivePluginLayout$mVoipCallEvent$1(this, fVar);
        this.f157364e = new RoomBaseLivePluginLayout$multiTalkActionListener$1(this, fVar);
    }

    public abstract /* synthetic */ int getLiveRole();

    public void mount() {
        super.mount();
        C66521k0.f191361a = this;
        this.f157363d.alive();
        this.f157364e.alive();
    }

    public void onAcceptLiveMic(C66505a aVar) {
        C66505a aVar2 = aVar;
        C87412m.m108594g(aVar2, "info");
        long j = aVar2.f191308a;
        String str = aVar2.f191309b;
        String str2 = "";
        String str3 = str == null ? str2 : str;
        int i = aVar2.f191311d;
        String str4 = aVar2.f191310c;
        if (str4 == null) {
            str4 = str2;
        }
        int i2 = aVar2.f191313f;
        int i3 = aVar2.f191312e;
        String str5 = aVar2.f191314g;
        String str6 = str5 == null ? str2 : str5;
        String str7 = aVar2.f191315h;
        if (str7 != null) {
            str2 = str7;
        }
        long j2 = aVar2.f191316i;
        byte[] bArr = aVar2.f191317j;
        if (bArr == null) {
            bArr = null;
        }
        byte[] decode = Base64.decode(str2, 0);
        C87412m.m108593f(decode, "decode(privateMapKey, 0)");
        Charset forName = Charset.forName("UTF-8");
        C87412m.m108593f(forName, "forName(\"UTF-8\")");
        String str8 = new String(decode, forName);
        long j3 = j2;
        TRTCCloudDef.TRTCParams tRTCParams = new TRTCCloudDef.TRTCParams(i, str4, str6, i2, str8, "");
        int i4 = 20;
        if (i3 != 0 && i3 == 1) {
            i4 = 21;
        }
        tRTCParams.role = i4;
        C64293cq2 cq22 = new C64293cq2();
        if (!Util.isNullOrNil(bArr)) {
            cq22.parseFrom(Base64.decode(bArr, 0));
        }
        C66522l.f191362a.mo90609b(cq22, (TRTCCloudDef.TRTCParams) null, new C58113g((String) null, 0, 0, (String) null, 0, 0, (C58107a) null, 0, 0, 0, (HashMap) null, 0, 0, (C64890zp2) null, (String) null, 0, 0, 131071, (C8480h) null));
        if (C62197e.f176819i1 == null) {
            C62197e.f176819i1 = new C62197e();
        }
        C62197e eVar = C62197e.f176819i1;
        C87412m.m108591d(eVar);
        String str9 = str8;
        eVar.mo85237y0(str9);
        C53979a.C53980a aVar3 = new C53979a.C53980a(j, str3, "", "", str4);
        C58114h hVar = RoomLiveService.f157201l;
        TRTCCloudDef.TRTCParams tRTCParams2 = hVar != null ? hVar.f166250a : null;
        if (tRTCParams2 != null) {
            tRTCParams2.privateMapKey = str9;
        }
        C53979a aVar4 = RoomLiveService.f157185Q;
        aVar4.getClass();
        MMHandlerThread.postToMainThread(new C53983b(aVar4, aVar3));
        RoomLiveService.f157202m = j3;
        C66519j0 j0Var = C66519j0.f191358d;
        long j4 = (j3 - 60) * ((long) 1000);
        if (j4 < 60000) {
            j4 = 60000;
        }
        j0Var.mo90602f(j4);
    }

    public void onAnchorCallInterruption(boolean z) {
    }

    public void onAnchorConnectionChange(boolean z) {
    }

    public void onApplyLiveMic(C66507b bVar) {
        C87412m.m108594g(bVar, "info");
        long j = bVar.f191324a;
        String str = bVar.f191325b;
        String str2 = str == null ? "" : str;
        String str3 = bVar.f191326c;
        String str4 = str3 == null ? "" : str3;
        String str5 = bVar.f191327d;
        String str6 = str5 == null ? "" : str5;
        String str7 = bVar.f191328e;
        String str8 = str7 == null ? "" : str7;
        RoomLiveService roomLiveService = RoomLiveService.f157190a;
        C53979a aVar = RoomLiveService.f157185Q;
        C53979a.C53980a aVar2 = new C53979a.C53980a(j, str2, str4, str6, str8);
        aVar.getClass();
        String str9 = "[sysmsg]anchor receive mic " + aVar2;
        C87412m.m108594g(str9, "debugText");
        Log.m105924i("MicroMsg.LiveCoreMic", str9);
        if (RoomLiveService.f157197h.f133050d == aVar2.f151236a) {
            Iterator<C53979a.C53980a> it = aVar.f151233h.iterator();
            while (it.hasNext()) {
                C53979a.C53980a next = it.next();
                if (C87412m.m108589b(next.f151240e, aVar2.f151240e)) {
                    String str10 = aVar2.f151237b;
                    C87412m.m108594g(str10, "<set-?>");
                    next.f151237b = str10;
                    String str11 = aVar2.f151239d;
                    C87412m.m108594g(str11, "<set-?>");
                    next.f151239d = str11;
                    return;
                }
            }
            aVar.f151233h.add(0, aVar2);
            MMHandlerThread.postToMainThread(new C53986e(aVar));
            return;
        }
        Log.m105920e("MicroMsg.LiveCoreMic", "anchor receive mic ,but error live_id for " + RoomLiveService.f157197h.f133050d);
    }

    public void onBanLiveComment(C38964c cVar) {
        C87412m.m108594g(cVar, "info");
        long j = cVar.f104977a;
        int i = cVar.f104978b;
        String str = cVar.f104979c;
        if (str == null) {
            str = "";
        }
        RoomLiveService roomLiveService = RoomLiveService.f157190a;
        C49317ep2 ep22 = RoomLiveService.f157197h;
        if (ep22.f133050d == j) {
            int i2 = 0;
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            ep22.f133060q = z;
            if (!z) {
                i2 = C31543z5.m39455e();
            }
            RoomLiveService.f157200k = i2;
            C53496k kVar = C53496k.f150436a;
            for (Map.Entry<String, C32226l<String, C13598b0>> value : C53496k.f150439d.entrySet()) {
                ((C32226l) value.getValue()).invoke(str);
            }
        }
    }

    public void onBattleApply() {
    }

    public void onBattleClose() {
    }

    public void onBattleDismiss() {
    }

    public void onBattleEnd() {
    }

    public void onBattleStart() {
    }

    public void onCloseApplyLiveMic(C38965d dVar) {
        C87412m.m108594g(dVar, "info");
        long j = dVar.f104980a;
        boolean z = dVar.f104981b;
        RoomLiveService roomLiveService = RoomLiveService.f157190a;
        C53979a aVar = RoomLiveService.f157185Q;
        aVar.getClass();
        String str = "[sysmsg]anchor set mic permission:" + z + " liveId:" + j;
        C87412m.m108594g(str, "debugText");
        Log.m105924i("MicroMsg.LiveCoreMic", str);
        if (j == RoomLiveService.f157197h.f133050d) {
            MMHandlerThread.postToMainThread(new C53985d(aVar, z));
        }
    }

    public void onCloseLive(C38966e eVar) {
        C87412m.m108594g(eVar, "info");
        long j = eVar.f104982a;
        RoomLiveService roomLiveService = RoomLiveService.f157190a;
        C53979a aVar = RoomLiveService.f157185Q;
        aVar.getClass();
        String str = "[sysmsg]anchor close live " + j;
        C87412m.m108594g(str, "debugText");
        Log.m105924i("MicroMsg.LiveCore", str);
        MMHandlerThread.postToMainThread(new C53984c(aVar, j));
        RoomLiveService.f157202m = 0;
    }

    public void onCloseLiveMic(C66512f fVar) {
        C87412m.m108594g(fVar, "info");
        long j = fVar.f191334a;
        String str = fVar.f191335b;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = fVar.f191336c;
        if (str3 != null) {
            str2 = str3;
        }
        RoomLiveService roomLiveService = RoomLiveService.f157190a;
        RoomLiveService.f157185Q.mo74654d(j, str, str2);
        C66519j0 j0Var = C66519j0.f191358d;
        C66519j0.C66520c cVar = C66519j0.C66520c.f191360d;
        Pattern pattern = C61926c.f176038a;
        MMHandlerThread.removeRunnable(cVar);
        C86709a0.m107529k().f251779b.mo123470p(760, j0Var);
    }

    public void onLiveMicSucc(C66517i0 i0Var) {
        C87412m.m108594g(i0Var, "info");
        long j = i0Var.f191347a;
        String str = i0Var.f191348b;
        String str2 = str == null ? "" : str;
        String str3 = i0Var.f191349c;
        String str4 = str3 == null ? "" : str3;
        String str5 = i0Var.f191350d;
        String str6 = str5 == null ? "" : str5;
        String str7 = i0Var.f191351e;
        String str8 = str7 == null ? "" : str7;
        String str9 = i0Var.f191352f;
        String str10 = str9 == null ? "" : str9;
        RoomLiveService roomLiveService = RoomLiveService.f157190a;
        RoomLiveService.f157185Q.mo74653c(j, str10, str2, str4, str6, str8);
    }

    public void onOnlineLiveList(C38970o0 o0Var) {
        C87412m.m108594g(o0Var, "info");
        String str = o0Var.f104990a;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = o0Var.f104991b;
        if (str3 == null) {
            str3 = str2;
        }
        String str4 = o0Var.f104992c;
        if (str4 == null) {
            str4 = str2;
        }
        C47465a parseFrom = new C49455fp2().parseFrom(Base64.decode(str, 0));
        C87412m.m108592e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.LiveInfoList");
        C49455fp2 fp22 = (C49455fp2) parseFrom;
        LinkedList<C49317ep2> linkedList = fp22.f133622d;
        if (linkedList != null && linkedList.size() > 0) {
            int E = C112550d0.m153769E(str3, XVFSFile.PATH_SEPARATOR, 0, false, 6, (Object) null);
            if (E != -1) {
                str2 = str3.substring(0, E);
                C87412m.m108593f(str2, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            LinkedList linkedList2 = new LinkedList();
            Iterator<C49317ep2> it = fp22.f133622d.iterator();
            while (it.hasNext()) {
                C49317ep2 next = it.next();
                if (!str4.equals(next.f133065v)) {
                    C28259d dVar = new C28259d();
                    dVar.field_liveId = next.f133050d;
                    dVar.field_hostRoomId = str2;
                    dVar.field_liveName = next.f133066w;
                    dVar.field_anchorUsername = next.f133065v;
                    dVar.field_isSender = false;
                    dVar.field_timeStamp = (long) next.f133052f;
                    linkedList2.add(dVar);
                }
            }
            C28260e jo = C28260e.m38144jo();
            jo.getClass();
            Iterator it4 = linkedList2.iterator();
            while (it4.hasNext()) {
                jo.insert((C28259d) it4.next());
            }
            C54427b.C28258a aVar = jo.f77821e;
            if (aVar != null) {
                ((C57833e1.C57834a) aVar).mo82259a(str2);
            }
        }
    }

    public void onPkMicLiveRoomImgChanged(C49765hx0 hx02) {
        C87412m.m108594g(hx02, "contract");
    }

    public void onRandomMicAccept(C52013xs0 xs02, C64429ht0 ht02) {
        C87412m.m108594g(xs02, "appMsg");
        C87412m.m108594g(ht02, "info");
    }

    public void onRandomMicApply(C50593nu0 nu02) {
        C87412m.m108594g(nu02, "info");
    }

    public void unMount() {
        super.unMount();
        C66521k0.f191361a = null;
        this.f157363d.dead();
        this.f157364e.dead();
    }
}
