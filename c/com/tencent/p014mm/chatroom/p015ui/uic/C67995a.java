package com.tencent.p014mm.chatroom.p015ui.uic;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.ShareRoomHistoryStatStruct;
import com.tencent.p014mm.chatroom.p015ui.ChatroomInfoUI;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.p134kt.CommonKt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.sdk.statecenter.IStateActionResult;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import nj3.C76879j;
import nm2.C76927a;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p240sx.C77797h;
import p249ui.C78162a;
import p278yh.C79115l;
import p823sg.C90193h;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import tm3.C64961s;
import tm3.C78051b;
import tm3.C78065p;
import tm3.C78069w;
import yb2.C15946a;
import z04.C119027c;
import zt3.C119157j;

/* renamed from: com.tencent.mm.chatroom.ui.uic.a */
public final class C67995a extends C15946a {

    /* renamed from: d */
    public final C13601g f195142d = C36568h.m40985a(new C68001g(this));

    /* renamed from: e */
    public int f195143e;

    /* renamed from: f */
    public int f195144f;

    /* renamed from: g */
    public boolean f195145g = true;

    /* renamed from: h */
    public ArrayList<String> f195146h;

    /* renamed from: i */
    public long f195147i = -1;

    /* renamed from: j */
    public boolean f195148j;

    /* renamed from: n */
    public boolean f195149n;

    /* renamed from: o */
    public Pair<Long, Boolean> f195150o = new Pair<>(-1L, Boolean.FALSE);

    /* renamed from: p */
    public C98121d f195151p;

    /* renamed from: q */
    public boolean f195152q;

    /* renamed from: r */
    public boolean f195153r;

    /* renamed from: s */
    public List<? extends C72963f4> f195154s = new ArrayList();

    /* renamed from: t */
    public C98121d f195155t;

    /* renamed from: u */
    public final C13601g f195156u;

    /* renamed from: v */
    public final HashMap<String, String> f195157v;

    /* renamed from: w */
    public final HashMap<String, C67996a> f195158w;

    /* renamed from: x */
    public final C98124g.C98125a f195159x;

    /* renamed from: com.tencent.mm.chatroom.ui.uic.a$f */
    public static final class C55185f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C67995a f157016d;

        /* renamed from: e */
        public final /* synthetic */ String f157017e;

        /* renamed from: com.tencent.mm.chatroom.ui.uic.a$f$a */
        public static final class C55186a implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public static final C55186a f157018d = new C55186a();

            public final void onClick(DialogInterface dialogInterface, int i) {
                Log.m105924i("MicroMsg.SelectWxChatRoomAddMemberUIC", "initMenu(uploading) click i know");
            }
        }

        public C55185f(C67995a aVar, String str) {
            this.f157016d = aVar;
            this.f157017e = str;
        }

        public final void run() {
            C76879j.m92754y(this.f157016d.getActivity(), Util.isNullOrNil(this.f157017e) ? this.f157016d.getString(C0966R.string.hub) : this.f157017e, "", this.f157016d.getString(C0966R.string.lkg), C55186a.f157018d);
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.uic.a$a */
    public static final class C67996a {

        /* renamed from: a */
        public String f195160a;

        /* renamed from: b */
        public boolean f195161b;

        public C67996a(String str, String str2, boolean z) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(str2, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
            this.f195160a = str2;
            this.f195161b = z;
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.uic.a$b */
    public static final class C67997b extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C67995a f195162d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C67997b(C67995a aVar) {
            super(1);
            this.f195162d = aVar;
        }

        public Object invoke(Object obj) {
            IStateAction action;
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            C67995a aVar = this.f195162d;
            IStateAction action2 = wVar.getAction();
            if (action2 != null && (action2 instanceof C78051b)) {
                C78051b bVar = (C78051b) action2;
                if (aVar.f195148j || aVar.f195152q) {
                    IStateAction action3 = wVar.getAction();
                    if (action3 != null) {
                        C78162a aVar2 = new C78162a(true);
                        aVar2.f229010b = aVar.f195148j;
                        aVar2.f229011c = aVar.f195152q;
                        action3.setResult(aVar2);
                    }
                } else if ((aVar.f195149n || aVar.f195153r) && (action = wVar.getAction()) != null) {
                    C78162a aVar3 = new C78162a(true);
                    aVar3.f229012d = aVar.f195153r;
                    action.setResult(aVar3);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.uic.a$c */
    public static final class C67998c extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C67995a f195163d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C67998c(C67995a aVar) {
            super(1);
            this.f195163d = aVar;
        }

        public Object invoke(Object obj) {
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            C67995a aVar = this.f195163d;
            IStateAction action = wVar.getAction();
            if (action != null && (action instanceof C64961s)) {
                C64961s sVar = (C64961s) action;
                aVar.mo93385l3();
                aVar.mo93383j3().mo109052j().setOnClickListener(new C68003b(aVar));
                aVar.mo93383j3().mo109057o().setOnClickListener(new C68004c(aVar));
                C76927a.f224799q = new C76927a();
                C76927a a = C76927a.m92781a();
                String g3 = aVar.mo93381g3();
                ShareRoomHistoryStatStruct shareRoomHistoryStatStruct = a.f224800a;
                shareRoomHistoryStatStruct.f194392d = shareRoomHistoryStatStruct.mo86045b("RoomId", g3, true);
                a.f224800a.f194414z = C45628s0.m50735A(g3) ? 1 : 0;
                if (C72996z1.m85807K5(aVar.mo93381g3()) && !C45628s0.m50735A(aVar.mo93381g3())) {
                    if (((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).P50(aVar.mo93381g3()) > 0) {
                        aVar.mo93383j3().mo109052j().setVisibility(0);
                        C76927a.m92781a().f224800a.f194393e = 1;
                        ((SelectWxChatRoomAddMemberUIC$recordMsgNetSceneEventIListener$2$1) ((C36570n) aVar.f195156u).getValue()).alive();
                    }
                }
                aVar.mo93383j3().mo109052j().setVisibility(8);
                C76927a.m92781a().f224800a.f194393e = 0;
                ((SelectWxChatRoomAddMemberUIC$recordMsgNetSceneEventIListener$2$1) ((C36570n) aVar.f195156u).getValue()).alive();
            }
            C67995a aVar2 = this.f195163d;
            IStateAction action2 = wVar.getAction();
            if (action2 != null && (action2 instanceof C78051b)) {
                C76927a a2 = C76927a.m92781a();
                ArrayList arrayList = new ArrayList(wVar.f228826n);
                a2.f224800a.f194395g = (long) arrayList.size();
                ShareRoomHistoryStatStruct shareRoomHistoryStatStruct2 = a2.f224800a;
                shareRoomHistoryStatStruct2.f194408t = shareRoomHistoryStatStruct2.mo86045b("InvitedUsrs", Util.listToString(arrayList, ";"), true);
                IStateActionResult result = ((C78051b) action2).getResult();
                if (result != null && (result instanceof C78162a)) {
                    C78162a aVar3 = (C78162a) result;
                    if (aVar3.f228795a) {
                        if (aVar3.f229010b || aVar3.f229011c) {
                            C76879j.m92754y(aVar2.getActivity(), aVar2.getString(C0966R.string.huc), "", aVar2.getString(C0966R.string.lkg), C55187d.f157019d);
                            C76927a.m92781a().f224812m++;
                        } else if (aVar3.f229012d) {
                            C76879j.m92754y(aVar2.getActivity(), aVar2.getString(C0966R.string.hub), "", aVar2.getString(C0966R.string.lkg), C55188e.f157020d);
                            C76927a.m92781a().f224813n++;
                            C76927a.m92781a().f224811l++;
                        }
                    }
                }
            }
            C78065p pVar = (C78065p) wVar.checkAction(C78065p.class);
            if (pVar != null) {
                C67995a aVar4 = this.f195163d;
                Intent intent = new Intent();
                intent.putExtra("Select_Contact", Util.listToString(pVar.f228813a, ","));
                ChatroomInfoUI.LocalHistoryInfo localHistoryInfo = new ChatroomInfoUI.LocalHistoryInfo();
                C98121d dVar = aVar4.f195151p;
                if (dVar != null) {
                    localHistoryInfo.f108055d = dVar.field_fileId;
                    localHistoryInfo.f108056e = dVar.field_aesKey;
                    localHistoryInfo.f108057f = dVar.field_filemd5;
                    localHistoryInfo.f108058g = (int) dVar.field_fileLength;
                    localHistoryInfo.f108059h = aVar4.f195144f;
                }
                C98121d dVar2 = aVar4.f195155t;
                if (dVar2 != null) {
                    localHistoryInfo.f108060i = dVar2.field_fileId;
                    localHistoryInfo.f108061j = dVar2.field_aesKey;
                    localHistoryInfo.f108062n = dVar2.field_filemd5;
                    localHistoryInfo.f108063o = (int) dVar2.field_fileLength;
                    localHistoryInfo.f108064p = aVar4.f195144f;
                }
                intent.putExtra("select_record_msg_info", localHistoryInfo);
                Object obj2 = aVar4.f195150o.first;
                C87412m.m108593f(obj2, "selectMsgSendResult.first");
                intent.putExtra("select_record_fake_msg_id", ((Number) obj2).longValue());
                aVar4.getActivity().setResult(-1, intent);
                aVar4.getActivity().finish();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.uic.a$d */
    public static final class C67999d implements C98124g.C98125a {

        /* renamed from: d */
        public final /* synthetic */ C67995a f195164d;

        public C67999d(C67995a aVar) {
            this.f195164d = aVar;
        }

        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            if (i == -21005) {
                Log.m105925i("MicroMsg.SelectWxChatRoomAddMemberUIC", "ERR_CNDCOM_MEDIA_IS_UPLOADING cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, Integer.valueOf(i), cVar, dVar);
                return 0;
            } else if (dVar != null && dVar.field_retCode == 0) {
                C67996a aVar = this.f195164d.f195158w.get(str);
                if (aVar == null || !aVar.f195161b) {
                    C67995a aVar2 = this.f195164d;
                    aVar2.f195151p = dVar;
                    aVar2.f195148j = false;
                } else {
                    C67995a aVar3 = this.f195164d;
                    aVar3.f195155t = dVar;
                    aVar3.f195152q = false;
                }
                C87412m.m108591d(aVar);
                Log.m105925i("MicroMsg.SelectWxChatRoomAddMemberUIC", "sceneResult.field_retCode == 0 cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s] result:%s", str, Integer.valueOf(i), cVar, dVar, Boolean.valueOf(C86013q1.m106447h(aVar.f195160a)));
                this.f195164d.mo93385l3();
                C76927a a = C76927a.m92781a();
                long a2 = C31543z5.m39451a();
                long j = a.f224808i;
                if (a2 > j) {
                    a.f224800a.f194407s = a2 - j;
                }
                return 0;
            } else if (dVar != null) {
                Log.m105929w("MicroMsg.SelectWxChatRoomAddMemberUIC", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, Integer.valueOf(i), cVar, dVar);
                this.f195164d.mo93384k3(dVar.field_retCode, "cdn ret error", "");
                return 0;
            } else if (i != 0) {
                Log.m105929w("MicroMsg.SelectWxChatRoomAddMemberUIC", "start error!; cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, Integer.valueOf(i), cVar, dVar);
                this.f195164d.mo93384k3(0, "cdn start error", "");
                return 0;
            } else {
                Log.m105925i("MicroMsg.SelectWxChatRoomAddMemberUIC", "on process, cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, Integer.valueOf(i), cVar, dVar);
                if (cVar != null) {
                    Log.m105919d("MicroMsg.SelectWxChatRoomAddMemberUIC", "cdn process: %f", Double.valueOf(((double) cVar.field_finishedLength) / ((double) cVar.field_toltalLength)));
                }
                return 0;
            }
        }

        /* renamed from: h */
        public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(byteArrayOutputStream, "buff");
        }

        /* renamed from: j */
        public byte[] mo1775j(String str, byte[] bArr) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(bArr, "inbuf");
            return new byte[0];
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.uic.a$e */
    public static final class C68000e extends C87413o implements C32224a<SelectWxChatRoomAddMemberUIC$recordMsgNetSceneEventIListener$2$1> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f195165d;

        /* renamed from: e */
        public final /* synthetic */ C67995a f195166e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C68000e(AppCompatActivity appCompatActivity, C67995a aVar) {
            super(0);
            this.f195165d = appCompatActivity;
            this.f195166e = aVar;
        }

        public Object invoke() {
            return new SelectWxChatRoomAddMemberUIC$recordMsgNetSceneEventIListener$2$1(this.f195165d, this.f195166e);
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.uic.a$g */
    public static final class C68001g extends C87413o implements C32224a<C79115l> {

        /* renamed from: d */
        public final /* synthetic */ C67995a f195167d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C68001g(C67995a aVar) {
            super(0);
            this.f195167d = aVar;
        }

        public Object invoke() {
            return new C79115l(this.f195167d.getRootView());
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.uic.a$h */
    public static final class C68002h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C67995a f195168d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C68002h(C67995a aVar) {
            super(0);
            this.f195168d = aVar;
        }

        public Object invoke() {
            C67995a aVar = this.f195168d;
            if (aVar.f195144f == 0) {
                aVar.mo93383j3().mo109055m().setVisibility(8);
                this.f195168d.mo93383j3().mo109057o().setVisibility(8);
                this.f195168d.mo93383j3().mo109046d().setVisibility(8);
                this.f195168d.mo93383j3().mo109054l().setVisibility(0);
                this.f195168d.mo93383j3().mo109056n().setTextColor(this.f195168d.getActivity().getResources().getColor(C0966R.color.abj));
                this.f195168d.mo93383j3().mo109056n().setText(C0966R.string.ijr);
                this.f195168d.mo93383j3().mo109052j().setBackground(this.f195168d.getActivity().getResources().getDrawable(C0966R.C0969drawable.aqc));
            } else if (aVar.f195149n || aVar.f195153r) {
                aVar.mo93383j3().mo109055m().setVisibility(8);
                this.f195168d.mo93383j3().mo109057o().setVisibility(0);
                this.f195168d.mo93383j3().mo109046d().setVisibility(8);
                this.f195168d.mo93383j3().mo109054l().setVisibility(8);
                this.f195168d.mo93383j3().mo109056n().setTextColor(this.f195168d.getActivity().getResources().getColor(C0966R.color.Brand_100));
                this.f195168d.mo93383j3().mo109056n().setText(this.f195168d.getActivity().getString(C0966R.string.f361258ik0, new Object[]{String.valueOf(this.f195168d.f195144f)}));
                this.f195168d.mo93383j3().mo109052j().setBackground(this.f195168d.getActivity().getResources().getDrawable(C0966R.C0969drawable.aqd));
            } else if (aVar.f195148j || aVar.f195152q) {
                aVar.mo93383j3().mo109055m().setVisibility(8);
                this.f195168d.mo93383j3().mo109057o().setVisibility(8);
                this.f195168d.mo93383j3().mo109046d().setVisibility(0);
                this.f195168d.mo93383j3().mo109054l().setVisibility(8);
                this.f195168d.mo93383j3().mo109056n().setTextColor(this.f195168d.getActivity().getResources().getColor(C0966R.color.Brand_100));
                this.f195168d.mo93383j3().mo109056n().setText(this.f195168d.getActivity().getString(C0966R.string.f361258ik0, new Object[]{String.valueOf(this.f195168d.f195144f)}));
                this.f195168d.mo93383j3().mo109052j().setBackground(this.f195168d.getActivity().getResources().getDrawable(C0966R.C0969drawable.aqd));
            } else {
                aVar.mo93383j3().mo109055m().setVisibility(0);
                this.f195168d.mo93383j3().mo109057o().setVisibility(8);
                this.f195168d.mo93383j3().mo109046d().setVisibility(8);
                this.f195168d.mo93383j3().mo109054l().setVisibility(8);
                this.f195168d.mo93383j3().mo109056n().setTextColor(this.f195168d.getActivity().getResources().getColor(C0966R.color.Brand_100));
                this.f195168d.mo93383j3().mo109056n().setText(this.f195168d.getActivity().getString(C0966R.string.f361258ik0, new Object[]{String.valueOf(this.f195168d.f195144f)}));
                this.f195168d.mo93383j3().mo109052j().setBackground(this.f195168d.getActivity().getResources().getDrawable(C0966R.C0969drawable.aqd));
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67995a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f195156u = C36568h.m40985a(new C68000e(appCompatActivity, this));
        this.f195157v = new HashMap<>();
        this.f195158w = new HashMap<>();
        this.f195159x = new C67999d(this);
    }

    /* renamed from: g3 */
    public final String mo93381g3() {
        String stringExtra = getIntent().getStringExtra("chatroomName");
        return stringExtra == null ? "" : stringExtra;
    }

    /* renamed from: i3 */
    public final C98124g mo93382i3(String str, boolean z) {
        C98124g gVar = new C98124g();
        gVar.f287661e = true;
        gVar.f287662f = this.f195159x;
        byte[] bytes = ("" + Util.currentTicks() + ", " + str).getBytes(C119027c.f356488a);
        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
        String f = C90193h.m112878f(bytes);
        gVar.field_mediaId = f;
        gVar.field_fullpath = str;
        gVar.field_thumbpath = "";
        gVar.field_fileType = 5;
        gVar.field_talker = "";
        gVar.field_priority = 2;
        gVar.field_needStorage = false;
        gVar.field_isStreamMedia = false;
        gVar.field_appType = 0;
        gVar.field_bzScene = 0;
        HashMap<String, String> hashMap = this.f195157v;
        C87412m.m108593f(f, "info.field_mediaId");
        String str2 = gVar.field_fullpath;
        C87412m.m108593f(str2, "info.field_fullpath");
        hashMap.put(f, str2);
        HashMap<String, C67996a> hashMap2 = this.f195158w;
        String str3 = gVar.field_mediaId;
        C87412m.m108593f(str3, "info.field_mediaId");
        String str4 = gVar.field_mediaId;
        C87412m.m108593f(str4, "info.field_mediaId");
        String str5 = gVar.field_fullpath;
        C87412m.m108593f(str5, "info.field_fullpath");
        hashMap2.put(str3, new C67996a(str4, str5, z));
        return gVar;
    }

    /* renamed from: j3 */
    public final C79115l mo93383j3() {
        return (C79115l) ((C36570n) this.f195142d).getValue();
    }

    /* renamed from: k3 */
    public final void mo93384k3(int i, String str, String str2) {
        Log.m105925i("MicroMsg.SelectWxChatRoomAddMemberUIC", "triggerErrorCallback errCode:%s errMsg:%s", Integer.valueOf(i), Util.nullAs(str, ""));
        this.f195149n = true;
        this.f195153r = true;
        this.f195148j = false;
        this.f195152q = false;
        mo93385l3();
        ((C119157j) C119157j.f356862d).mo183895z(new C55185f(this, str2));
        C76927a a = C76927a.m92781a();
        long a2 = C31543z5.m39451a();
        long j = a.f224808i;
        if (a2 > j) {
            a.f224800a.f194407s = a2 - j;
        }
        C76927a.m92781a().f224811l++;
    }

    /* renamed from: l3 */
    public final void mo93385l3() {
        CommonKt.uiThread(new C68002h(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00bf  */
    /* renamed from: m3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo93386m3() {
        /*
            r13 = this;
            java.lang.Class<qo.l> r0 = p663qo.C101213l.class
            java.lang.String r1 = "MicroMsg.SelectWxChatRoomAddMemberUIC"
            java.lang.String r2 = "uploadRecordXml"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            java.lang.String r2 = "uploadRecordXmlImp"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            java.lang.Class<f62.k0> r2 = f62.C75700k0.class
            k40.a r2 = f40.C86709a0.m107533q(r2)
            f62.k0 r2 = (f62.C75700k0) r2
            g62.l r2 = r2.mo96095LE()
            android.util.Pair<java.lang.Long, java.lang.Boolean> r3 = r13.f195150o
            java.lang.Object r3 = r3.first
            java.lang.String r4 = "selectMsgSendResult.first"
            gy3.C87412m.m108593f(r3, r4)
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
            com.tencent.mm.storage.g4 r2 = (com.tencent.p014mm.storage.C72972g4) r2
            com.tencent.mm.storage.f4 r2 = r2.b00(r3)
            java.lang.String r3 = r2.getContent()
            java.lang.String r4 = ""
            java.lang.String r5 = "add to cdn failed"
            r6 = 1
            java.lang.String r7 = "wcf://selectrecord/uploadcache/"
            r8 = 0
            r9 = 0
            if (r3 != 0) goto L_0x0049
            java.lang.String r2 = "uploadRecordXmlImp msgInfo.getContent() is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            goto L_0x00e8
        L_0x0049:
            java.lang.String r2 = r2.getContent()
            java.lang.String r3 = "msgInfo.content"
            gy3.C87412m.m108593f(r2, r3)
            java.lang.String r3 = "this as java.lang.String).getBytes(charset)"
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r10 == 0) goto L_0x0062
            java.lang.String r2 = "xml is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            goto L_0x00b1
        L_0x0062:
            c62.C0419f.Bx0()
            boolean r10 = com.tencent.p014mm.vfs.C86013q1.m106450k(r7)
            if (r10 != 0) goto L_0x006e
            com.tencent.p014mm.vfs.C86013q1.m106461v(r7)
        L_0x006e:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ab }
            r10.<init>()     // Catch:{ Exception -> 0x00ab }
            r10.append(r7)     // Catch:{ Exception -> 0x00ab }
            java.nio.charset.Charset r11 = z04.C119027c.f356488a     // Catch:{ Exception -> 0x00ab }
            byte[] r12 = r2.getBytes(r11)     // Catch:{ Exception -> 0x00ab }
            gy3.C87412m.m108593f(r12, r3)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r12 = p823sg.C90193h.m112878f(r12)     // Catch:{ Exception -> 0x00ab }
            r10.append(r12)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x00ab }
            boolean r12 = com.tencent.p014mm.vfs.C86013q1.m106450k(r10)     // Catch:{ Exception -> 0x00ab }
            if (r12 == 0) goto L_0x0093
            com.tencent.p014mm.vfs.C86013q1.m106447h(r10)     // Catch:{ Exception -> 0x00ab }
        L_0x0093:
            byte[] r2 = r2.getBytes(r11)     // Catch:{ Exception -> 0x00ab }
            gy3.C87412m.m108593f(r2, r3)     // Catch:{ Exception -> 0x00ab }
            int r3 = r2.length     // Catch:{ Exception -> 0x00ab }
            com.tencent.p014mm.vfs.C86013q1.m106438T(r10, r2, r8, r3)     // Catch:{ Exception -> 0x00ab }
            nm2.a r2 = nm2.C76927a.m92781a()     // Catch:{ Exception -> 0x00ab }
            long r11 = com.tencent.p014mm.vfs.C86013q1.m106451l(r10)     // Catch:{ Exception -> 0x00ab }
            com.tencent.mm.autogen.mmdata.rpt.ShareRoomHistoryStatStruct r2 = r2.f224800a     // Catch:{ Exception -> 0x00ab }
            r2.f194411w = r11     // Catch:{ Exception -> 0x00ab }
            goto L_0x00b2
        L_0x00ab:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r8]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r4, r3)
        L_0x00b1:
            r10 = r9
        L_0x00b2:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r2 == 0) goto L_0x00bf
            java.lang.String r2 = "uploadRecordXmlImp filePath is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            goto L_0x00e8
        L_0x00bf:
            gi.g r2 = r13.mo93382i3(r10, r8)
            di3.d r3 = di3.C86312j.m106911c(r0)
            qo.l r3 = (p663qo.C101213l) r3
            boolean r3 = r3.if0(r2)
            if (r3 != 0) goto L_0x00de
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.String r2 = r2.field_mediaId
            r3[r8] = r2
            java.lang.String r2 = "uploadRecordXmlImp: cdntra addSendTask failed. clientid:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r3)
            r13.mo93384k3(r8, r5, r4)
        L_0x00de:
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r8] = r10
            java.lang.String r3 = "uploadRecordXmlImp filePath：%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r2)
        L_0x00e8:
            java.lang.String r2 = "uploadRecordXmlNewImp"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            nm2.b r2 = nm2.C76928b.f224816a
            java.util.List<? extends com.tencent.mm.storage.f4> r3 = r13.f195154s
            te3.cs r2 = r2.mo107265c(r3)
            if (r2 != 0) goto L_0x0100
            java.lang.String r0 = "uploadRecordXmlNewImp historyMsgList is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            goto L_0x018d
        L_0x0100:
            java.util.LinkedList<te3.j3> r3 = r2.f131925d
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0110
            java.lang.String r0 = "uploadRecordXmlNewImp historyMsgList.msgList.isEmpty"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            goto L_0x018d
        L_0x0110:
            c62.C0419f.Bx0()
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r7)
            if (r3 != 0) goto L_0x011c
            com.tencent.p014mm.vfs.C86013q1.m106461v(r7)
        L_0x011c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0151 }
            r3.<init>()     // Catch:{ Exception -> 0x0151 }
            r3.append(r7)     // Catch:{ Exception -> 0x0151 }
            byte[] r7 = r2.toByteArray()     // Catch:{ Exception -> 0x0151 }
            java.lang.String r7 = p823sg.C90193h.m112878f(r7)     // Catch:{ Exception -> 0x0151 }
            r3.append(r7)     // Catch:{ Exception -> 0x0151 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0151 }
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)     // Catch:{ Exception -> 0x0151 }
            if (r7 == 0) goto L_0x013c
            com.tencent.p014mm.vfs.C86013q1.m106447h(r3)     // Catch:{ Exception -> 0x0151 }
        L_0x013c:
            byte[] r2 = r2.toByteArray()     // Catch:{ Exception -> 0x0151 }
            com.tencent.p014mm.vfs.C86013q1.m106437S(r3, r2)     // Catch:{ Exception -> 0x0151 }
            nm2.a r2 = nm2.C76927a.m92781a()     // Catch:{ Exception -> 0x0151 }
            long r10 = com.tencent.p014mm.vfs.C86013q1.m106451l(r3)     // Catch:{ Exception -> 0x0151 }
            com.tencent.mm.autogen.mmdata.rpt.ShareRoomHistoryStatStruct r2 = r2.f224800a     // Catch:{ Exception -> 0x0151 }
            r2.f194411w = r10     // Catch:{ Exception -> 0x0151 }
            r9 = r3
            goto L_0x0157
        L_0x0151:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r8]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r4, r3)
        L_0x0157:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r2 == 0) goto L_0x0164
            java.lang.String r0 = "uploadRecordXmlNewImp filePath is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            goto L_0x018d
        L_0x0164:
            gi.g r2 = r13.mo93382i3(r9, r6)
            di3.d r0 = di3.C86312j.m106911c(r0)
            qo.l r0 = (p663qo.C101213l) r0
            boolean r0 = r0.if0(r2)
            if (r0 != 0) goto L_0x0183
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r2 = r2.field_mediaId
            r0[r8] = r2
            java.lang.String r2 = "uploadRecordXmlNewImp: cdntra addSendTask failed. clientid:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r0)
            r13.mo93384k3(r8, r5, r4)
        L_0x0183:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r8] = r9
            java.lang.String r2 = "uploadRecordXmlNewImp filePath：%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r0)
        L_0x018d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.chatroom.p015ui.uic.C67995a.mo93386m3():void");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (intent != null && i == 10001) {
            int intExtra = intent.getIntExtra("select_record_msg_num", 0);
            this.f195143e = intExtra;
            this.f195144f = intExtra;
            this.f195146h = intent.getStringArrayListExtra("key_select_record_msg_black_list");
            this.f195151p = null;
            this.f195155t = null;
            this.f195149n = false;
            this.f195153r = false;
            if (this.f195143e == 0) {
                this.f195148j = false;
                this.f195152q = false;
                mo93385l3();
            } else {
                this.f195148j = true;
                this.f195152q = true;
                this.f195147i = intent.getLongExtra("select_record_min_msg_id", -1);
                C77797h hVar = (C77797h) C86312j.m106911c(C77797h.class);
                int i3 = this.f195143e;
                int Ui0 = hVar.Ui0();
                if (1 <= Ui0 && Ui0 < i3) {
                    this.f195144f = hVar.Ui0();
                }
                mo93385l3();
                C76927a.m92781a().f224808i = C31543z5.m39451a();
                this.f195154s = new ArrayList(hVar.mo107937VR());
                Pair<Long, Boolean> yb = hVar.mo107939yb(getActivity(), "msginfo@fakeuser", true, mo93381g3());
                this.f195150o = yb;
                if (!((Boolean) yb.second).booleanValue()) {
                    ((SelectWxChatRoomAddMemberUIC$recordMsgNetSceneEventIListener$2$1) ((C36570n) this.f195156u).getValue()).alive();
                } else {
                    mo93386m3();
                }
            }
            C76927a.m92781a().f224800a.f194397i = (long) this.f195144f;
            Pair<Long, Boolean> pair = this.f195150o;
            Log.m105925i("MicroMsg.SelectWxChatRoomAddMemberUIC", "GET_SELECT_RECORD_MSG selectMsgNum:%s actualSelectMsgNum:%s msgId:%s direct:%s", Integer.valueOf(this.f195143e), Integer.valueOf(this.f195144f), pair.first, pair.second);
        }
    }

    public void onCreate(Bundle bundle) {
        UIStateCenter stateCenter;
        UIStateCenter stateCenter2;
        super.onCreate(bundle);
        BaseMvvmActivity d3 = mo14598d3();
        if (!(d3 == null || (stateCenter2 = d3.getStateCenter()) == null)) {
            stateCenter2.process((C0125s) getActivity(), new C67997b(this));
        }
        BaseMvvmActivity d35 = mo14598d3();
        if (d35 != null && (stateCenter = d35.getStateCenter()) != null) {
            stateCenter.observe((C0125s) getActivity(), new C67998c(this));
        }
    }
}
