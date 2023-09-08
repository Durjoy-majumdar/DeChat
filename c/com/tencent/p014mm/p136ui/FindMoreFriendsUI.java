package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.lifecycle.C0120a0;
import c00.C0405n;
import c00.C0406o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.DynamicConfigUpdatedEvent;
import com.tencent.p014mm.autogen.events.FindMoreFriendEntryRedDotEvent;
import com.tencent.p014mm.autogen.events.GameLifeStorageNotifyEvent;
import com.tencent.p014mm.autogen.events.GameMessageStorageNotifyEvent;
import com.tencent.p014mm.autogen.events.GameMsgDownloadImgEvent;
import com.tencent.p014mm.autogen.events.GetEntranceStateEvent;
import com.tencent.p014mm.autogen.events.JDSysMsgNotifyEvent;
import com.tencent.p014mm.autogen.events.LbsroomLogicEvent;
import com.tencent.p014mm.autogen.events.OnSearchSearchBoxCtrlInfoChangedEvent;
import com.tencent.p014mm.autogen.events.SearchSysMsgNotifyEvent;
import com.tencent.p014mm.autogen.events.SendEntranceStateEvent;
import com.tencent.p014mm.autogen.events.ShakeCardMsgNotifyEvent;
import com.tencent.p014mm.autogen.events.ShakeMessageStorageNotifyEvent;
import com.tencent.p014mm.autogen.events.StatusNotifyFunctionEvent;
import com.tencent.p014mm.autogen.events.UnreadChangeEvent;
import com.tencent.p014mm.autogen.events.WebSearchConfigEvent;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.p136ui.base.preference.C73244a;
import com.tencent.p014mm.p136ui.base.preference.IconPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.tools.C45081s1;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2458a;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.newtips.NormalIconNewTipPreference;
import com.tencent.p014mm.plugin.newtips.model.C115627l;
import com.tencent.p014mm.plugin.newtips.model.C115631n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsManageFindMoreV2UI;
import com.tencent.p014mm.plugin.sns.p106ui.SnsSettingUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.C5438v;
import com.tencent.p014mm.plugin.subapp.jdbiz.C96461f;
import com.tencent.p014mm.plugin.subapp.jdbiz.C96463h;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.plugin.websearch.FTSWebViewLogic;
import com.tencent.p014mm.plugin.webview.modeltools.C6080m;
import com.tencent.p014mm.pluginsdk.event.IListenerMStorage;
import com.tencent.p014mm.pluginsdk.platformtools.C96796d;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.xweb.WCWebUpdater;
import di3.C86312j;
import eb0.C31461f3;
import eb0.C75592q0;
import eb0.C97624e3;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import f62.C75706q0;
import f62.C75707s0;
import fd0.C75743h;
import fn3.C59263a;
import gt1.C20838b;
import gy3.C87412m;
import h81.C32735h;
import ht1.C46112m3;
import ht1.C60165e4;
import ht1.C60200t1;
import ht1.C76243a5;
import ic0.C21070h;
import ic0.C98661k;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import jc0.C21210b;
import jr2.C99018v;
import jr2.C99019x;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kr0.C76633z0;
import ky2.C10432i;
import l20.C21388a;
import ms2.C99966g;
import na3.C88908g;
import nt1.C61894a;
import o03.C21723h;
import ob0.C35136m;
import org.json.JSONObject;
import os2.C100421x;
import p03.C21912d;
import p147ea.C7606d;
import p151er.C20609s;
import p151er.C75651n;
import p158gt.C76057w;
import p158gt.C8451i;
import p167hz.C21032k;
import p196ln.C76705f;
import p200lx.C34409r;
import p274xx.C66446g;
import p327ct.C30914c;
import p504em.C75626b;
import p626nv.C109759g;
import p787ai.C79547b;
import pj3.C47511g;
import s00.C90110f;
import sw1.C48477m;
import t03.C22420e;
import t03.C22426h;
import t83.C13841a;
import te3.C49768hy;
import te3.C64355f00;
import te3.C64586nn1;
import te3.C64702s7;
import te3.m64;
import te3.tg4;
import te3.wc4;
import tw0.C90583b;
import tw0.C90584e;
import u73.C101982p;
import u73.C22611g1;
import u73.C22613h1;
import u73.C52468u0;
import u73.C78137s0;
import uc3.C78146a;
import uo3.C78253a;
import wc3.C102426c0;
import wc3.C78535a0;
import xl3.C23102c;
import xl3.C23104f;
import zp3.C79406f;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.FindMoreFriendsUI */
public class FindMoreFriendsUI extends AbstractTabChildPreference implements MStorage.IOnStorageChange, MStorageEx.IOnStorageChange, C97624e3, C31461f3 {

    /* renamed from: Z0 */
    public static final /* synthetic */ int f55665Z0 = 0;

    /* renamed from: A */
    public String f55666A = null;

    /* renamed from: B */
    public boolean f55667B = true;

    /* renamed from: C */
    public boolean f55668C = false;

    /* renamed from: D */
    public boolean f55669D = false;

    /* renamed from: E */
    public boolean f55670E = false;

    /* renamed from: F */
    public int f55671F = 0;

    /* renamed from: G */
    public long f55672G = 0;

    /* renamed from: H */
    public boolean f55673H = false;

    /* renamed from: I */
    public int f55674I;

    /* renamed from: J */
    public long f55675J;

    /* renamed from: K */
    public int f55676K;

    /* renamed from: L */
    public int f55677L;

    /* renamed from: M */
    public View f55678M;

    /* renamed from: N */
    public MMHandler f55679N = new C19677e(Looper.getMainLooper());

    /* renamed from: P */
    public IListener<SearchSysMsgNotifyEvent> f55680P;

    /* renamed from: Q */
    public MStorage.IOnStorageChange f55681Q;

    /* renamed from: Q0 */
    public C76057w.C76058a f55682Q0;

    /* renamed from: R */
    public IListener f55683R;

    /* renamed from: R0 */
    public long f55684R0;

    /* renamed from: S */
    public IListener f55685S;

    /* renamed from: S0 */
    public C23104f f55686S0;

    /* renamed from: T */
    public IListener f55687T;

    /* renamed from: T0 */
    public C0120a0<C2458a> f55688T0;

    /* renamed from: U */
    public IListenerMStorage f55689U;

    /* renamed from: U0 */
    public boolean f55690U0;

    /* renamed from: V */
    public IListenerMStorage f55691V;

    /* renamed from: V0 */
    public C23102c f55692V0;

    /* renamed from: W */
    public IListenerMStorage f55693W;

    /* renamed from: W0 */
    public Random f55694W0;

    /* renamed from: X */
    public IListener f55695X;

    /* renamed from: X0 */
    public boolean f55696X0;

    /* renamed from: Y */
    public String f55697Y;

    /* renamed from: Y0 */
    public boolean f55698Y0;

    /* renamed from: Z */
    public C19665s f55699Z;

    /* renamed from: p0 */
    public C75706q0 f55700p0;

    /* renamed from: s */
    public long f55701s;

    /* renamed from: t */
    public C73244a f55702t;

    /* renamed from: u */
    public String f55703u = "";

    /* renamed from: v */
    public int f55704v = 0;

    /* renamed from: w */
    public String f55705w = null;

    /* renamed from: x */
    public String f55706x = null;

    /* renamed from: x0 */
    public IListener<WebSearchConfigEvent> f55707x0;

    /* renamed from: y */
    public String f55708y = null;

    /* renamed from: y0 */
    public IListener<GetEntranceStateEvent> f55709y0;

    /* renamed from: z */
    public String f55710z = null;

    /* renamed from: com.tencent.mm.ui.FindMoreFriendsUI$m */
    public class C6727m implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f24148d;

        public C6727m(View view) {
            this.f24148d = view;
        }

        public void run() {
            View view = this.f24148d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/FindMoreFriendsUI$35", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/FindMoreFriendsUI$35", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f24148d.startAnimation(AnimationUtils.loadAnimation(FindMoreFriendsUI.this.getContext(), C0966R.C0968anim.f2394bx));
        }
    }

    /* renamed from: com.tencent.mm.ui.FindMoreFriendsUI$t */
    public static class C6728t implements C80883e<Bundle, Bundle> {
        private C6728t() {
        }

        public /* bridge */ /* synthetic */ void invoke(Object obj, C1256g gVar) {
            Bundle bundle = (Bundle) obj;
        }
    }

    /* renamed from: com.tencent.mm.ui.FindMoreFriendsUI$a */
    public class C19653a implements NormalIconNewTipPreference.C69941b {
        public C19653a() {
        }

        /* renamed from: a */
        public void mo25932a(String str) {
            FindMoreFriendsUI.this.f55708y = str;
        }
    }

    /* renamed from: com.tencent.mm.ui.FindMoreFriendsUI$f */
    public class C19654f implements C76057w.C76058a {

        /* renamed from: com.tencent.mm.ui.FindMoreFriendsUI$f$a */
        public class C19655a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f55719d;

            /* renamed from: e */
            public final /* synthetic */ Bitmap f55720e;

            public C19655a(String str, Bitmap bitmap) {
                this.f55719d = str;
                this.f55720e = bitmap;
            }

            public void run() {
                StringBuilder sb = new StringBuilder();
                sb.append("download url ");
                sb.append(this.f55719d);
                sb.append(" , result ");
                sb.append(this.f55720e == null);
                Log.m105924i("MicroMsg.FindMoreFriendsUI", sb.toString());
                IconPreference iconPreference = (IconPreference) FindMoreFriendsUI.this.f55702t.mo72519a("jd_market_entrance");
                if (iconPreference != null) {
                    if (this.f55719d.equals(FindMoreFriendsUI.this.f55666A)) {
                        iconPreference.mo101930L(this.f55720e);
                        FindMoreFriendsUI.this.f55666A = null;
                    }
                    FindMoreFriendsUI.this.f55702t.notifyDataSetChanged();
                }
                if (this.f55719d.equals(FindMoreFriendsUI.this.f55705w)) {
                    ((IconPreference) FindMoreFriendsUI.this.f55702t.mo72519a("find_friends_by_look")).f215053N = new BitmapDrawable(FindMoreFriendsUI.this.getContext().getResources(), this.f55720e);
                    FindMoreFriendsUI findMoreFriendsUI = FindMoreFriendsUI.this;
                    findMoreFriendsUI.f55705w = null;
                    findMoreFriendsUI.f55702t.notifyDataSetChanged();
                }
                if (this.f55719d.equals(FindMoreFriendsUI.this.f55706x)) {
                    ((IconPreference) FindMoreFriendsUI.this.f55702t.mo72519a("find_friends_by_search")).f215053N = new BitmapDrawable(FindMoreFriendsUI.this.getContext().getResources(), this.f55720e);
                    FindMoreFriendsUI findMoreFriendsUI2 = FindMoreFriendsUI.this;
                    findMoreFriendsUI2.f55706x = null;
                    findMoreFriendsUI2.f55702t.notifyDataSetChanged();
                }
                if (this.f55719d.equals(FindMoreFriendsUI.this.f55708y)) {
                    ((IconPreference) FindMoreFriendsUI.this.f55702t.mo72519a("find_friends_by_look")).mo101930L(this.f55720e);
                    FindMoreFriendsUI findMoreFriendsUI3 = FindMoreFriendsUI.this;
                    findMoreFriendsUI3.f55708y = null;
                    findMoreFriendsUI3.f55702t.notifyDataSetChanged();
                }
                if (this.f55719d.equals(FindMoreFriendsUI.this.f55710z)) {
                    ((IconPreference) FindMoreFriendsUI.this.f55702t.mo72519a("find_friends_by_search")).mo101930L(this.f55720e);
                    FindMoreFriendsUI findMoreFriendsUI4 = FindMoreFriendsUI.this;
                    findMoreFriendsUI4.f55710z = null;
                    findMoreFriendsUI4.f55702t.notifyDataSetChanged();
                }
                if (this.f55719d.equals(FindMoreFriendsUI.this.f55697Y)) {
                    Bitmap bitmap = this.f55720e;
                    ((IconPreference) FindMoreFriendsUI.this.f55702t.mo72519a("my_life_around")).mo101930L(BitmapUtil.getRoundedCornerBitmap(bitmap, false, ((float) bitmap.getWidth()) * 0.1f));
                    FindMoreFriendsUI findMoreFriendsUI5 = FindMoreFriendsUI.this;
                    findMoreFriendsUI5.f55697Y = null;
                    findMoreFriendsUI5.f55702t.notifyDataSetChanged();
                }
            }
        }

        public C19654f() {
        }

        /* renamed from: a */
        public void mo25933a(String str, Bitmap bitmap, String str2) {
            MMHandlerThread.postToMainThread(new C19655a(str, bitmap));
        }
    }

    /* renamed from: com.tencent.mm.ui.FindMoreFriendsUI$g */
    public class C19656g implements NormalIconNewTipPreference.C69941b {
        public C19656g() {
        }

        /* renamed from: a */
        public void mo25932a(String str) {
            FindMoreFriendsUI.this.f55666A = str;
        }
    }

    /* renamed from: com.tencent.mm.ui.FindMoreFriendsUI$l */
    public class C19657l implements C21070h {

        /* renamed from: a */
        public final /* synthetic */ boolean f55723a;

        /* renamed from: b */
        public final /* synthetic */ GameMsgDownloadImgEvent f55724b;

        /* renamed from: c */
        public final /* synthetic */ IconPreference f55725c;

        /* renamed from: d */
        public final /* synthetic */ int f55726d;

        /* renamed from: e */
        public final /* synthetic */ long f55727e;

        /* renamed from: f */
        public final /* synthetic */ String f55728f;

        /* renamed from: g */
        public final /* synthetic */ String f55729g;

        /* renamed from: com.tencent.mm.ui.FindMoreFriendsUI$l$a */
        public class C19658a implements Runnable {
            public C19658a() {
            }

            public void run() {
                FindMoreFriendsUI findMoreFriendsUI = FindMoreFriendsUI.this;
                findMoreFriendsUI.f55667B = false;
                FindMoreFriendsUI.this.mo25872C0((IconPreference) findMoreFriendsUI.f55702t.mo72519a("more_tab_game_recommend"), 8, 8, 8, false, 8, 8, 8);
            }
        }

        /* renamed from: com.tencent.mm.ui.FindMoreFriendsUI$l$b */
        public class C19659b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bitmap f55732d;

            /* renamed from: e */
            public final /* synthetic */ int f55733e;

            public C19659b(Bitmap bitmap, int i) {
                this.f55732d = bitmap;
                this.f55733e = i;
            }

            public void run() {
                C19657l lVar = C19657l.this;
                FindMoreFriendsUI.this.f55667B = true;
                lVar.f55725c.mo101930L(this.f55732d);
                C19657l lVar2 = C19657l.this;
                int i = lVar2.f55726d;
                if (i == 3) {
                    FindMoreFriendsUI.this.mo25872C0(lVar2.f55725c, 8, 8, 8, false, 0, 0, 0);
                } else if (i == 4) {
                    FindMoreFriendsUI.this.mo25872C0(lVar2.f55725c, 8, 8, 0, false, 0, 0, 0);
                }
                Log.m105925i("MicroMsg.FindMoreFriendsUI", "gamelog.reddot, finder, update, download entrance image success, msgId:%d, showType:%d", Long.valueOf(C19657l.this.f55727e), Integer.valueOf(C19657l.this.f55726d));
                C19657l lVar3 = C19657l.this;
                FindMoreFriendsUI.this.mo25930z0(lVar3.f55727e, lVar3.f55726d, lVar3.f55728f);
                if (this.f55733e == 2) {
                    C115669n.INSTANCE.idkeyStat(858, 13, 1, false);
                }
            }
        }

        /* renamed from: com.tencent.mm.ui.FindMoreFriendsUI$l$c */
        public class C19660c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f55735d;

            public C19660c(int i) {
                this.f55735d = i;
            }

            public void run() {
                FindMoreFriendsUI findMoreFriendsUI = FindMoreFriendsUI.this;
                findMoreFriendsUI.f55667B = true;
                IconPreference iconPreference = (IconPreference) findMoreFriendsUI.f55702t.mo72519a("more_tab_game_recommend");
                C19657l lVar = C19657l.this;
                int i = lVar.f55726d;
                if (i == 3) {
                    iconPreference.f215054P = FindMoreFriendsUI.this.getString(C0966R.string.f360088a12);
                    iconPreference.f215055Q = C0966R.C0969drawable.ake;
                    FindMoreFriendsUI.this.mo25872C0(iconPreference, 0, 8, 8, false, 8, 8, 8);
                    C19657l lVar2 = C19657l.this;
                    FindMoreFriendsUI.this.mo25930z0(lVar2.f55727e, 1, lVar2.f55728f);
                } else if (i == 4) {
                    iconPreference.mo101939Y(lVar.f55729g, -1, Color.parseColor("#8c8c8c"));
                    FindMoreFriendsUI.this.mo25872C0(iconPreference, 8, 8, 0, true, 8, 8, 8);
                    C19657l lVar3 = C19657l.this;
                    FindMoreFriendsUI.this.mo25930z0(lVar3.f55727e, 2, lVar3.f55728f);
                }
                Log.m105925i("MicroMsg.FindMoreFriendsUI", "gamelog.reddot, finder, update, download entrance image failed, msgId:%d, showType:%d", Long.valueOf(C19657l.this.f55727e), Integer.valueOf(C19657l.this.f55726d));
                C115669n nVar = C115669n.INSTANCE;
                nVar.idkeyStat(858, 12, 1, false);
                if (this.f55735d == 2) {
                    nVar.idkeyStat(858, 14, 1, false);
                }
            }
        }

        public C19657l(boolean z, GameMsgDownloadImgEvent gameMsgDownloadImgEvent, IconPreference iconPreference, int i, long j, String str, String str2) {
            this.f55723a = z;
            this.f55724b = gameMsgDownloadImgEvent;
            this.f55725c = iconPreference;
            this.f55726d = i;
            this.f55727e = j;
            this.f55728f = str;
            this.f55729g = str2;
        }

        /* renamed from: a */
        public void mo6676a(String str, View view) {
            MMHandlerThread.postToMainThread(new C19658a());
        }

        /* renamed from: b */
        public void mo6677b(String str, View view, C21210b bVar) {
            Bitmap bitmap;
            GameMsgDownloadImgEvent gameMsgDownloadImgEvent = this.f55724b;
            GameMsgDownloadImgEvent.C40107a aVar = gameMsgDownloadImgEvent.f107555d;
            aVar.f107557a = 2;
            aVar.f107558b = str;
            gameMsgDownloadImgEvent.publish();
            if (bVar != null) {
                int i = bVar.f59986b;
                if (bVar.f59985a != 0 || (bitmap = bVar.f59988d) == null) {
                    MMHandlerThread.postToMainThread(new C19660c(i));
                } else {
                    MMHandlerThread.postToMainThread(new C19659b(bitmap, i));
                }
            }
        }

        /* renamed from: c */
        public Bitmap mo6678c(String str, View view, C21210b bVar) {
            Bitmap roundedCornerBitmap;
            Bitmap bitmap = bVar.f59988d;
            if (bitmap == null || bitmap.isRecycled() || !this.f55723a || (roundedCornerBitmap = BitmapUtil.getRoundedCornerBitmap(bVar.f59988d, true, (float) C79406f.m96347a(FindMoreFriendsUI.this.thisActivity(), 2.0f))) == null) {
                return null;
            }
            return roundedCornerBitmap;
        }
    }

    /* renamed from: com.tencent.mm.ui.FindMoreFriendsUI$n */
    public class C19661n implements Runnable {
        public C19661n() {
        }

        public void run() {
            Log.m105925i("MicroMsg.FindMoreFriendsUI", "status %d (%d), extStatus %d (%d), pluginFlag %d (%d)", Integer.valueOf(FindMoreFriendsUI.this.f55674I), Integer.valueOf(C75592q0.m90787q()), Long.valueOf(FindMoreFriendsUI.this.f55675J), Long.valueOf(C75592q0.m90781k()), Integer.valueOf(FindMoreFriendsUI.this.f55676K), Integer.valueOf(C75592q0.m90785o()));
            FindMoreFriendsUI.this.f55675J = C75592q0.m90781k();
            FindMoreFriendsUI.this.f55674I = C75592q0.m90787q();
            FindMoreFriendsUI.this.f55676K = C75592q0.m90785o();
            FindMoreFriendsUI.this.mo25885M0();
        }
    }

    /* renamed from: com.tencent.mm.ui.FindMoreFriendsUI$p */
    public class C19662p implements NormalIconNewTipPreference.C69941b {
        public C19662p() {
        }

        /* renamed from: a */
        public void mo25932a(String str) {
            FindMoreFriendsUI.this.f55710z = str;
        }
    }

    /* renamed from: com.tencent.mm.ui.FindMoreFriendsUI$q */
    public class C19663q implements MStorage.IOnStorageChange {
        public C19663q() {
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            Log.m105919d("MicroMsg.FindMoreFriendsUI", "onMStorageNotifyEvent, %s ", str);
            FindMoreFriendsUI findMoreFriendsUI = FindMoreFriendsUI.this;
            int i = FindMoreFriendsUI.f55665Z0;
            findMoreFriendsUI.mo25879I0();
            C73244a aVar = FindMoreFriendsUI.this.f55702t;
            if (aVar != null) {
                aVar.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.FindMoreFriendsUI$r */
    public class C19664r implements Runnable {
        public C19664r() {
        }

        public void run() {
            FinderIconViewTipPreference finderIconViewTipPreference;
            FindMoreFriendsUI.this.f55674I = C75592q0.m90787q();
            FindMoreFriendsUI.this.f55676K = C75592q0.m90785o();
            FindMoreFriendsUI.this.f55675J = C75592q0.m90781k();
            long currentTimeMillis = System.currentTimeMillis();
            FindMoreFriendsUI.this.mo25885M0();
            FindMoreFriendsUI findMoreFriendsUI = FindMoreFriendsUI.this;
            if (!findMoreFriendsUI.f55696X0 && !findMoreFriendsUI.f55698Y0) {
                if (findMoreFriendsUI.mo25911m0()) {
                    FindMoreFriendsUI.this.mo25928x0(true, (FinderIconViewTipPreference) null);
                    C61894a.m72627d("finder");
                }
                C23102c cVar = FindMoreFriendsUI.this.f55692V0;
                boolean c = cVar != null ? cVar.mo36506c() : true;
                C60165e4.C46105a aVar = new C60165e4.C46105a();
                FindMoreFriendsUI findMoreFriendsUI2 = FindMoreFriendsUI.this;
                C73244a aVar2 = findMoreFriendsUI2.f55702t;
                if (!(aVar2 == null || (finderIconViewTipPreference = (FinderIconViewTipPreference) aVar2.mo72519a(findMoreFriendsUI2.f55692V0.mo36505b())) == null)) {
                    aVar = finderIconViewTipPreference.mo25970p0();
                }
                ((C60165e4) C86312j.m106911c(C60165e4.class)).wf0(true, c, aVar);
                if (c) {
                    C61894a.m72627d(WeChatBrands.Business.GROUP_LIVE);
                }
                if ((FindMoreFriendsUI.this.f55676K & 32768) == 0) {
                    C61894a.m72627d("sns");
                }
                FindMoreFriendsUI.this.f55696X0 = true;
            }
            Log.m105925i("MicroMsg.FindMoreFriendsUI", "[updateStatus] cost:%sms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
    }

    /* renamed from: com.tencent.mm.ui.FindMoreFriendsUI$s */
    public enum C19665s {
        TYPE_NONE,
        TYPE_NORMAL,
        TYPE_TEXT,
        TYPE_IMG,
        TYPE_IMG_TEXT,
        TYPE_NEW_HINT
    }

    /* renamed from: com.tencent.mm.ui.FindMoreFriendsUI$o */
    public class C19667o implements Runnable {
        public C19667o(FindMoreFriendsUI findMoreFriendsUI) {
        }

        public void run() {
            ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76905z2().mo58458b(506365, 13);
        }
    }

    /* renamed from: com.tencent.mm.ui.FindMoreFriendsUI$d */
    public class C19669d implements View.OnClickListener {
        public C19669d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/FindMoreFriendsUI$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FindMoreFriendsUI findMoreFriendsUI = FindMoreFriendsUI.this;
            Intent intent = new Intent(FindMoreFriendsUI.this.getContext(), SettingsManageFindMoreV2UI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            FindMoreFriendsUI findMoreFriendsUI2 = findMoreFriendsUI;
            C117292a.m165358d(findMoreFriendsUI2, aVar.mo10232b(), "com/tencent/mm/ui/FindMoreFriendsUI$19", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            findMoreFriendsUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(findMoreFriendsUI2, "com/tencent/mm/ui/FindMoreFriendsUI$19", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/ui/FindMoreFriendsUI$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.FindMoreFriendsUI$h */
    public class C19670h implements Runnable {
        public C19670h(FindMoreFriendsUI findMoreFriendsUI) {
        }

        public void run() {
            ((C90110f) C86312j.m106911c(C90110f.class)).mo124152cj();
        }
    }

    /* renamed from: com.tencent.mm.ui.FindMoreFriendsUI$i */
    public class C19671i implements DialogInterface.OnClickListener {
        public C19671i() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C46112m3) C86312j.m106911c(C46112m3.class)).s00(Boolean.FALSE);
            FindMoreFriendsUI findMoreFriendsUI = FindMoreFriendsUI.this;
            int i2 = FindMoreFriendsUI.f55665Z0;
            findMoreFriendsUI.mo25912n0(false, false);
        }
    }

    /* renamed from: com.tencent.mm.ui.FindMoreFriendsUI$j */
    public class C19672j implements Runnable {
        public C19672j() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:105:0x0447  */
        /* JADX WARNING: Removed duplicated region for block: B:118:0x04c1  */
        /* JADX WARNING: Removed duplicated region for block: B:129:0x04e9  */
        /* JADX WARNING: Removed duplicated region for block: B:130:0x051b  */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x0321  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x039c  */
        /* JADX WARNING: Removed duplicated region for block: B:98:0x0429 A[SYNTHETIC, Splitter:B:98:0x0429] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r22 = this;
                r1 = r22
                java.lang.Class<sw1.p> r2 = sw1.C48483p.class
                com.tencent.mm.ui.FindMoreFriendsUI r0 = com.tencent.p014mm.p136ui.FindMoreFriendsUI.this
                int r3 = com.tencent.p014mm.p136ui.FindMoreFriendsUI.f55665Z0
                r0.getClass()
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()
                f40.o r3 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r3 = r3.mo121142i()
                com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_GAME_LAST_SAVED_LANGUAGE_STRING
                java.lang.String r5 = ""
                java.lang.Object r3 = r3.mo119685f(r4, r5)
                java.lang.String r3 = (java.lang.String) r3
                java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r3)
                boolean r6 = r3.equalsIgnoreCase(r0)
                r7 = 6
                r8 = 5
                r9 = 2
                r10 = 0
                r11 = 1
                java.lang.String r12 = "MicroMsg.FindMoreFriendsUI"
                if (r6 != 0) goto L_0x005a
                java.lang.Object[] r6 = new java.lang.Object[r9]
                r6[r10] = r3
                r6[r11] = r0
                java.lang.String r3 = "checkLangChange lastLang:%s, currentLang:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r3, r6)
                f40.o r3 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r3 = r3.mo121142i()
                r3.mo119677K(r4, r0)
                com.tencent.mm.autogen.events.GameCommOperationEvent r0 = new com.tencent.mm.autogen.events.GameCommOperationEvent
                r0.<init>()
                com.tencent.mm.autogen.events.GameCommOperationEvent$a r3 = r0.f9268d
                r3.f9270a = r8
                java.lang.String r4 = java.lang.String.valueOf(r7)
                r3.f9271b = r4
                r0.publish()
            L_0x005a:
                com.tencent.mm.ui.FindMoreFriendsUI r0 = com.tencent.p014mm.p136ui.FindMoreFriendsUI.this
                boolean r3 = r0.f55670E
                if (r3 == 0) goto L_0x04d8
                r0.f55670E = r10
                di3.d r0 = di3.C86312j.m106911c(r2)
                sw1.p r0 = (sw1.C48483p) r0
                com.tencent.mm.plugin.game.model.a0 r3 = r0.mo66079ar()
                r3.getClass()
                com.tencent.mm.plugin.game.model.a0$a r13 = com.tencent.p014mm.plugin.game.model.C42036a0.C42037a.GAME_REDDOT_EXIT_EXPOSURE_LIMIT_REACH
                boolean r0 = com.tencent.p014mm.plugin.game.commlib.util.C30081b.m38959a()
                if (r0 != 0) goto L_0x0079
                goto L_0x04d8
            L_0x0079:
                long r14 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
                r16 = r5
                long r4 = r3.f113237a
                long r14 = r14 - r4
                long r4 = java.lang.Math.abs(r14)
                r14 = 5
                int r0 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
                if (r0 >= 0) goto L_0x008f
            L_0x008c:
                r14 = r12
                goto L_0x0200
            L_0x008f:
                com.tencent.mm.autogen.events.QueryGameLifeMsgEvent r0 = new com.tencent.mm.autogen.events.QueryGameLifeMsgEvent
                r0.<init>()
                r0.publish()
                com.tencent.mm.autogen.events.QueryGameLifeMsgEvent$a r0 = r0.f107703d
                boolean r0 = r0.f107704a
                if (r0 == 0) goto L_0x009e
                goto L_0x008c
            L_0x009e:
                long r4 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
                r3.f113237a = r4
                long r4 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
                f40.o r0 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()
                com.tencent.mm.storage.y1$a r14 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_GAME_REDDOT_LAST_LEVELUP_REFRESH_TIME_SEC_LONG
                r6 = 0
                java.lang.Long r15 = java.lang.Long.valueOf(r6)
                java.lang.Object r0 = r0.mo119685f(r14, r15)
                java.lang.Long r0 = (java.lang.Long) r0
                long r14 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Long) r0)
                py1.t3 r0 = com.tencent.p014mm.plugin.game.commlib.C41853c.m45376j()
                int r9 = r0.f128027e
                if (r9 > 0) goto L_0x00cc
                r9 = 300(0x12c, float:4.2E-43)
            L_0x00cc:
                int r8 = r0.f128028f
                if (r8 > 0) goto L_0x00d2
                r8 = 7200(0x1c20, float:1.009E-41)
            L_0x00d2:
                long r4 = r4 - r14
                long r4 = java.lang.Math.abs(r4)
                long r14 = (long) r9
                int r9 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
                if (r9 <= 0) goto L_0x00de
                r4 = 1
                goto L_0x00df
            L_0x00de:
                r4 = 0
            L_0x00df:
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                java.lang.Object[] r5 = new java.lang.Object[r11]
                r5[r10] = r4
                java.lang.String r9 = "MicroMsg.GameMessageService"
                java.lang.String r14 = "gamelog.srv_msg, service, reddotScore, isExposureCoolDown : %b."
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r14, r5)
                boolean r4 = r4.booleanValue()
                if (r4 != 0) goto L_0x00f5
                goto L_0x008c
            L_0x00f5:
                f40.o r4 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r4 = r4.mo121142i()
                com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_LAST_CLICK_GAME_REDDOT_TIME_LONG
                java.lang.Long r14 = java.lang.Long.valueOf(r6)
                java.lang.Object r4 = r4.mo119685f(r5, r14)
                java.lang.Long r4 = (java.lang.Long) r4
                long r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Long) r4)
                java.lang.Long r4 = java.lang.Long.valueOf(r4)
                long r4 = r4.longValue()
                long r4 = com.tencent.p014mm.sdk.platformtools.Util.secondsToNow(r4)
                long r4 = java.lang.Math.abs(r4)
                long r14 = (long) r8
                int r8 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
                if (r8 >= 0) goto L_0x0129
                java.lang.String r0 = "gamelog.srv_msg, service, reddotScore, click not cooldown."
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r0)
                goto L_0x008c
            L_0x0129:
                com.tencent.mm.plugin.game.model.w r4 = r3.mo65983l()
                java.lang.Boolean r5 = java.lang.Boolean.FALSE
                if (r4 == 0) goto L_0x01de
                r4.mo66075l2()
                int r14 = r4.field_channel
                if (r14 != r11) goto L_0x013a
                r14 = 1
                goto L_0x013b
            L_0x013a:
                r14 = 0
            L_0x013b:
                java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
                int r15 = r4.field_exposuredCount
                com.tencent.mm.plugin.game.model.w$e r8 = r4.f113467b2
                int r8 = r8.f113513a
                if (r15 < r8) goto L_0x014b
                java.lang.Boolean r8 = java.lang.Boolean.TRUE
                r14 = r5
                goto L_0x014c
            L_0x014b:
                r8 = r5
            L_0x014c:
                long r17 = java.lang.System.currentTimeMillis()
                r19 = 1000(0x3e8, double:4.94E-321)
                long r17 = r17 / r19
                long r6 = r4.field_expireTime
                int r15 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
                if (r15 > 0) goto L_0x015c
                r6 = 0
                goto L_0x015d
            L_0x015c:
                r6 = 1
            L_0x015d:
                if (r6 != 0) goto L_0x0166
                com.tencent.mm.plugin.game.model.a0$a r4 = com.tencent.p014mm.plugin.game.model.C42036a0.C42037a.GAME_REDDOT_EXIT_TIMEOUT
                r3.mo65977f(r4)
                r4 = 0
                goto L_0x0167
            L_0x0166:
                r5 = r14
            L_0x0167:
                if (r4 == 0) goto L_0x01db
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L_0x01a0
                r5 = 5
                java.lang.Object[] r0 = new java.lang.Object[r5]
                long r5 = r4.field_msgId
                java.lang.Long r3 = java.lang.Long.valueOf(r5)
                r0[r10] = r3
                java.lang.String r3 = r4.field_gameMsgId
                r0[r11] = r3
                com.tencent.mm.plugin.game.model.w$k r3 = r4.f113491q1
                java.lang.String r3 = r3.f113529c
                r5 = 2
                r0[r5] = r3
                int r3 = r4.field_exposuredCount
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r5 = 3
                r0[r5] = r3
                com.tencent.mm.plugin.game.model.w$e r3 = r4.f113467b2
                int r3 = r3.f113513a
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r4 = 4
                r0[r4] = r3
                java.lang.String r3 = "gamelog.srv_msg, service, reddotScore, ZeroQueue msgId: %d gameMsgId:%s is still valid. title: %s exposureCount(%d/%d)"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r3, r0)
                goto L_0x008c
            L_0x01a0:
                r5 = 6
                java.lang.Object[] r6 = new java.lang.Object[r5]
                r14 = r12
                long r11 = r4.field_msgId
                java.lang.Long r5 = java.lang.Long.valueOf(r11)
                r6[r10] = r5
                java.lang.String r5 = r4.field_gameMsgId
                r7 = 1
                r6[r7] = r5
                float r5 = r4.f113480j2
                java.lang.Float r5 = java.lang.Float.valueOf(r5)
                r11 = 2
                r6[r11] = r5
                com.tencent.mm.plugin.game.model.w$k r5 = r4.f113491q1
                java.lang.String r5 = r5.f113529c
                r11 = 3
                r6[r11] = r5
                int r5 = r4.field_exposuredCount
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r11 = 4
                r6[r11] = r5
                com.tencent.mm.plugin.game.model.w$e r5 = r4.f113467b2
                int r5 = r5.f113513a
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r11 = 5
                r6[r11] = r5
                java.lang.String r5 = "gamelog.srv_msg, service, reddotScore, before score currentMsg: %d gameMsgId:%s, score: %f. title: %s exposureCount(%d/%d)"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r5, r6)
                goto L_0x01dc
            L_0x01db:
                r14 = r12
            L_0x01dc:
                r5 = r8
                goto L_0x01df
            L_0x01de:
                r14 = r12
            L_0x01df:
                int r6 = r3.mo65980i()
                int r0 = r0.f128026d
                if (r0 > 0) goto L_0x01e9
                r0 = 12
            L_0x01e9:
                if (r6 < r0) goto L_0x0205
                r8 = 2
                java.lang.Object[] r3 = new java.lang.Object[r8]
                java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
                r3[r10] = r4
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r4 = 1
                r3[r4] = r0
                java.lang.String r0 = "gamelog.srv_msg, service, reddotScore, today exposured cnt limit is reached : %d. limit: %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r0, r3)
            L_0x0200:
                r10 = r14
                r4 = r16
                goto L_0x04da
            L_0x0205:
                java.lang.Class<sw1.q> r0 = sw1.C48484q.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                sw1.q r0 = (sw1.C48484q) r0
                com.tencent.mm.plugin.game.model.b0 r0 = r0.xi0()
                r0.getClass()
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r11 = "select * from GameRawMessage where isRead=0 and isHidden=0 and expireTime>"
                r8.append(r11)
                long r11 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
                r8.append(r11)
                java.lang.String r11 = " and "
                r8.append(r11)
                java.lang.String r11 = "channel"
                r8.append(r11)
                java.lang.String r11 = "=2 and "
                r8.append(r11)
                java.lang.String r11 = "entranceExposure"
                r8.append(r11)
                java.lang.String r11 = "=0 order by "
                r8.append(r11)
                java.lang.String r11 = "createTime"
                r8.append(r11)
                java.lang.String r11 = " desc limit 36"
                r8.append(r11)
                java.lang.String r8 = r8.toString()
                java.lang.String[] r11 = new java.lang.String[r10]
                android.database.Cursor r0 = r0.rawQuery(r8, r11)
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                if (r0 != 0) goto L_0x025a
                goto L_0x0274
            L_0x025a:
                boolean r11 = r0.moveToFirst()
                if (r11 == 0) goto L_0x0271
            L_0x0260:
                com.tencent.mm.plugin.game.model.w r11 = new com.tencent.mm.plugin.game.model.w
                r11.<init>()
                r11.convertFrom(r0)
                r8.add(r11)
                boolean r11 = r0.moveToNext()
                if (r11 != 0) goto L_0x0260
            L_0x0271:
                r0.close()
            L_0x0274:
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r7 = 1
                java.lang.Object[] r11 = new java.lang.Object[r7]
                int r12 = r8.size()
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                r11[r10] = r12
                java.lang.String r12 = "gamelog.srv_msg, service, reddotScore, score waiting queue start, listCnt[%d] ==============================="
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r12, r11)
                if (r4 != 0) goto L_0x0388
                int r11 = r8.size()
                if (r11 != 0) goto L_0x0388
                com.tencent.mm.storage.y1$a r11 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_GAME_REDDOT_LAST_EMPTY_REPORT_TIME_SEC_LONG
                java.lang.Class<v10.e> r12 = v10.C52735e.class
                di3.d r12 = di3.C86312j.m106911c(r12)
                v10.e r12 = (v10.C52735e) r12
                h81.h$c r7 = h81.C32735h.C32737c.clicfg_game_report_empty_redpoint
                java.lang.String r15 = "0"
                java.lang.String r7 = r12.C50(r7, r15)
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r10 = "needReportEmptyRedpoint exp string: "
                r12.append(r10)
                r12.append(r7)
                java.lang.String r10 = r12.toString()
                java.lang.String r12 = "GameABConfig"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r10)
                boolean r7 = gy3.C87412m.m108589b(r7, r15)
                if (r7 == 0) goto L_0x02c9
                r19 = r4
                r20 = r5
                r21 = r6
                r10 = r14
                goto L_0x031b
            L_0x02c9:
                f40.o r7 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r7 = r7.mo121142i()
                r10 = r14
                r14 = 0
                long r14 = r7.mo119673G(r11, r14)
                f40.o r7 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r7 = r7.mo121142i()
                com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_GAME_REDDOT_EMPTY_REPORT_MIN_DURATION_SEC_LONG
                r19 = r4
                r20 = r5
                r4 = 86400(0x15180, double:4.26873E-319)
                long r4 = r7.mo119673G(r1, r4)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r7 = "need report empty reddot last time: "
                r1.append(r7)
                r1.append(r14)
                java.lang.String r7 = ", nowTime: "
                r1.append(r7)
                r21 = r6
                long r6 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
                r1.append(r6)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r1)
                long r6 = com.tencent.p014mm.sdk.platformtools.Util.secondsToNow(r14)
                long r6 = java.lang.Math.abs(r6)
                int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r1 >= 0) goto L_0x031d
            L_0x031b:
                r7 = 0
                goto L_0x031e
            L_0x031d:
                r7 = 1
            L_0x031e:
                if (r7 != 0) goto L_0x0321
                goto L_0x038f
            L_0x0321:
                java.lang.String r1 = "do checkNeedReportEmptyRedpoint"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r1)
                py1.k4 r1 = new py1.k4
                r1.<init>()
                java.lang.String r4 = "zh_CN"
                r1.f127838d = r4
                r4 = r16
                r1.f127839e = r4
                py1.g r5 = new py1.g
                r5.<init>()
                int r6 = android.os.Build.VERSION.SDK_INT
                r5.f127701d = r6
                android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                vf.a$b r6 = p723vf.C90773a.m113839e(r6)
                int r6 = r6.f260682d
                r5.f127702e = r6
                r1.f127840f = r5
                ob0.c$b r5 = new ob0.c$b
                r5.<init>()
                r5.f127066a = r1
                py1.l4 r1 = new py1.l4
                r1.<init>()
                r5.f127067b = r1
                java.lang.String r1 = "/cgi-bin/mmgame-bin/gamemsgpushappsvr/reportinactiveuser"
                r5.f127068c = r1
                r1 = 5063(0x13c7, float:7.095E-42)
                r5.f127069d = r1
                ob0.c r1 = r5.mo72403a()
                f40.o r5 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r5 = r5.mo121142i()
                long r6 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
                java.lang.Long r6 = java.lang.Long.valueOf(r6)
                r5.mo119677K(r11, r6)
                java.lang.Class<com.tencent.mm.ipcinvoker.wx_extension.j> r5 = com.tencent.p014mm.ipcinvoker.wx_extension.C40324j.class
                di3.d r5 = di3.C86312j.m106911c(r5)
                com.tencent.mm.ipcinvoker.wx_extension.j r5 = (com.tencent.p014mm.ipcinvoker.wx_extension.C40324j) r5
                com.tencent.mm.plugin.game.model.z r6 = new com.tencent.mm.plugin.game.model.z
                r6.<init>(r3)
                r5.mo63014eH(r1, r6)
                goto L_0x0391
            L_0x0388:
                r19 = r4
                r20 = r5
                r21 = r6
                r10 = r14
            L_0x038f:
                r4 = r16
            L_0x0391:
                java.util.Iterator r1 = r8.iterator()
                r8 = 0
            L_0x0396:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L_0x0423
                java.lang.Object r5 = r1.next()
                com.tencent.mm.plugin.game.model.w r5 = (com.tencent.p014mm.plugin.game.model.C42119w) r5
                r5.mo66075l2()
                di3.d r6 = di3.C86312j.m106911c(r2)
                sw1.p r6 = (sw1.C48483p) r6
                com.tencent.mm.plugin.game.model.a0 r6 = r6.mo66079ar()
                boolean r6 = r6.mo65985n(r5)
                di3.d r7 = di3.C86312j.m106911c(r2)
                sw1.p r7 = (sw1.C48483p) r7
                com.tencent.mm.plugin.game.model.a0 r7 = r7.mo66079ar()
                boolean r7 = r7.mo65986o(r5)
                if (r6 != 0) goto L_0x0396
                if (r7 == 0) goto L_0x03c6
                goto L_0x0396
            L_0x03c6:
                if (r8 != 0) goto L_0x03c9
                goto L_0x03d1
            L_0x03c9:
                float r6 = r8.f113480j2
                float r7 = r5.f113480j2
                int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                if (r6 >= 0) goto L_0x03d2
            L_0x03d1:
                r8 = r5
            L_0x03d2:
                int r6 = r0.size()
                r7 = 10
                if (r6 >= r7) goto L_0x0402
                java.lang.String r6 = r5.field_gameMsgId
                int r6 = r6.length()
                if (r6 <= 0) goto L_0x0402
                java.util.HashMap r6 = new java.util.HashMap
                r6.<init>()
                float r7 = r5.field_clickScore
                java.lang.String r7 = java.lang.Float.toString(r7)
                java.lang.String r11 = "s"
                r6.put(r11, r7)
                float r7 = r5.f113480j2
                java.lang.String r7 = java.lang.Float.toString(r7)
                java.lang.String r11 = "fs"
                r6.put(r11, r7)
                java.lang.String r7 = r5.field_gameMsgId
                r0.put(r7, r6)
            L_0x0402:
                r6 = 3
                java.lang.Object[] r11 = new java.lang.Object[r6]
                long r6 = r5.field_msgId
                java.lang.Long r6 = java.lang.Long.valueOf(r6)
                r7 = 0
                r11[r7] = r6
                java.lang.String r6 = r5.field_gameMsgId
                r7 = 1
                r11[r7] = r6
                float r5 = r5.f113480j2
                java.lang.Float r5 = java.lang.Float.valueOf(r5)
                r6 = 2
                r11[r6] = r5
                java.lang.String r5 = "gamelog.srv_msg, service, reddotScore, score waiting queue msgid: %d, gameMsgId:%s, score: %f"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r5, r11)
                goto L_0x0396
            L_0x0423:
                int r1 = r0.size()
                if (r1 <= 0) goto L_0x0444
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ RuntimeException -> 0x0434 }
                r1.<init>(r0)     // Catch:{ RuntimeException -> 0x0434 }
                java.lang.String r0 = r1.toString()     // Catch:{ RuntimeException -> 0x0434 }
                r5 = r0
                goto L_0x0445
            L_0x0434:
                r0 = move-exception
                r1 = 1
                java.lang.Object[] r5 = new java.lang.Object[r1]
                java.lang.String r0 = r0.getMessage()
                r1 = 0
                r5[r1] = r0
                java.lang.String r0 = "msgScoreReportStr error: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r0, r5)
            L_0x0444:
                r5 = r4
            L_0x0445:
                if (r8 == 0) goto L_0x04c1
                boolean r0 = r20.booleanValue()
                if (r0 == 0) goto L_0x0453
                r3.mo65977f(r13)
                r4 = r19
                goto L_0x0460
            L_0x0453:
                r4 = r19
                if (r19 == 0) goto L_0x0460
                float r0 = r4.f113480j2
                float r1 = r8.f113480j2
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 < 0) goto L_0x0460
                r8 = r4
            L_0x0460:
                if (r8 == r4) goto L_0x047f
                if (r4 == 0) goto L_0x0469
                com.tencent.mm.plugin.game.model.a0$a r0 = com.tencent.p014mm.plugin.game.model.C42036a0.C42037a.GAME_REDDOT_EXIT_COVERED
                r3.mo65977f(r0)
            L_0x0469:
                di3.d r0 = di3.C86312j.m106911c(r2)
                sw1.p r0 = (sw1.C48483p) r0
                com.tencent.mm.plugin.game.model.a0 r0 = r0.mo66079ar()
                r0.mo65994w(r8)
                r0.mo65993v(r8)
                r0.mo65992u(r8)
                r0.mo65991t(r8)
            L_0x047f:
                r0 = 7
                java.lang.Object[] r0 = new java.lang.Object[r0]
                long r3 = r8.field_msgId
                java.lang.Long r1 = java.lang.Long.valueOf(r3)
                r3 = 0
                r0[r3] = r1
                java.lang.String r1 = r8.field_gameMsgId
                r3 = 1
                r0[r3] = r1
                float r1 = r8.f113480j2
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                r3 = 2
                r0[r3] = r1
                com.tencent.mm.plugin.game.model.w$k r1 = r8.f113491q1
                java.lang.String r1 = r1.f113529c
                r3 = 3
                r0[r3] = r1
                int r1 = r8.field_exposuredCount
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r3 = 4
                r0[r3] = r1
                com.tencent.mm.plugin.game.model.w$e r1 = r8.f113467b2
                int r1 = r1.f113513a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r3 = 5
                r0[r3] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r21)
                r3 = 6
                r0[r3] = r1
                java.lang.String r1 = "gamelog.srv_msg, service, reddotScore, after score choosenMessage: %d gameMsgId:%s, score: %f, title:%s, exposureCount:%d/%d, todayExposuredCnt: %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r1, r0)
                goto L_0x04d2
            L_0x04c1:
                r4 = r19
                boolean r0 = r20.booleanValue()
                if (r0 == 0) goto L_0x04d2
                if (r4 == 0) goto L_0x04d2
                boolean r0 = r4.f113482k2
                if (r0 == 0) goto L_0x04d2
                r3.mo65977f(r13)
            L_0x04d2:
                java.lang.String r0 = "gamelog.srv_msg, service, reddotScore, score waiting queue end ==============================="
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r0)
                goto L_0x04db
            L_0x04d8:
                r4 = r5
                r10 = r12
            L_0x04da:
                r5 = r4
            L_0x04db:
                com.tencent.mm.autogen.events.QueryGameMessageEvent r0 = new com.tencent.mm.autogen.events.QueryGameMessageEvent
                r0.<init>()
                r0.publish()
                com.tencent.mm.autogen.events.QueryGameMessageEvent$a r1 = r0.f107710d
                boolean r3 = r1.f107722l
                if (r3 == 0) goto L_0x051b
                r3 = 3
                java.lang.Object[] r2 = new java.lang.Object[r3]
                long r3 = r1.f107719i
                java.lang.Long r1 = java.lang.Long.valueOf(r3)
                r3 = 0
                r2[r3] = r1
                com.tencent.mm.autogen.events.QueryGameMessageEvent$a r1 = r0.f107710d
                java.lang.String r3 = r1.f107726p
                r4 = 1
                r2[r4] = r3
                java.lang.String r1 = r1.f107720j
                r3 = 2
                r2[r3] = r1
                java.lang.String r1 = "gamelog.reddot, finder, update, replace msg, msgId:%d, gameMsgId:%s, noticeId:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r2)
                r1 = r22
                com.tencent.mm.ui.FindMoreFriendsUI r2 = com.tencent.p014mm.p136ui.FindMoreFriendsUI.this
                r2.getClass()
                zt3.t r3 = zt3.C119157j.f356862d
                com.tencent.mm.ui.k0 r4 = new com.tencent.mm.ui.k0
                r4.<init>(r2, r0, r5)
                zt3.j r3 = (zt3.C119157j) r3
                r3.mo183895z(r4)
                goto L_0x062c
            L_0x051b:
                r1 = r22
                com.tencent.mm.autogen.events.QueryGameLifeMsgEvent r3 = new com.tencent.mm.autogen.events.QueryGameLifeMsgEvent
                r3.<init>()
                r3.publish()
                boolean r4 = com.tencent.p014mm.plugin.game.commlib.util.C30081b.m38959a()
                com.tencent.mm.autogen.events.QueryGameLifeMsgEvent$a r6 = r3.f107703d
                boolean r8 = r6.f107704a
                if (r8 == 0) goto L_0x05f5
                com.tencent.mm.autogen.events.QueryGameMessageEvent$a r8 = r0.f107710d
                int r9 = r8.f107724n
                r7 = 1
                if (r9 != r7) goto L_0x0541
                long r11 = r6.f107709f
                long r8 = r8.f107725o
                int r13 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
                if (r13 < 0) goto L_0x053f
                goto L_0x0541
            L_0x053f:
                r8 = 0
                goto L_0x0542
            L_0x0541:
                r8 = 1
            L_0x0542:
                if (r4 != 0) goto L_0x0573
                r4 = 2
                java.lang.Object[] r0 = new java.lang.Object[r4]
                long r4 = r6.f107708e
                java.lang.Long r2 = java.lang.Long.valueOf(r4)
                r4 = 0
                r0[r4] = r2
                com.tencent.mm.autogen.events.QueryGameLifeMsgEvent$a r2 = r3.f107703d
                int r2 = r2.f107707d
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r4 = 1
                r0[r4] = r2
                java.lang.String r2 = "gamelog.reddot, finder, update, gameLife msg, lastMsgId:%d, unread:%d, notLevelUp"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r2, r0)
                com.tencent.mm.ui.FindMoreFriendsUI r0 = com.tencent.p014mm.p136ui.FindMoreFriendsUI.this
                r0.getClass()
                zt3.t r2 = zt3.C119157j.f356862d
                com.tencent.mm.ui.l0 r4 = new com.tencent.mm.ui.l0
                r4.<init>(r0, r3)
                zt3.j r2 = (zt3.C119157j) r2
                r2.mo183895z(r4)
                goto L_0x062c
            L_0x0573:
                if (r8 == 0) goto L_0x05b2
                r4 = 2
                java.lang.Object[] r0 = new java.lang.Object[r4]
                long r4 = r6.f107708e
                java.lang.Long r4 = java.lang.Long.valueOf(r4)
                r5 = 0
                r0[r5] = r4
                com.tencent.mm.autogen.events.QueryGameLifeMsgEvent$a r4 = r3.f107703d
                int r4 = r4.f107707d
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r5 = 1
                r0[r5] = r4
                java.lang.String r4 = "gamelog.reddot, finder, update, gameLife msg, lastMsgId:%d, unread:%d, gameLifeShouldShow, hitLevelUp"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r4, r0)
                di3.d r0 = di3.C86312j.m106911c(r2)
                sw1.p r0 = (sw1.C48483p) r0
                com.tencent.mm.plugin.game.model.a0 r0 = r0.mo66079ar()
                com.tencent.mm.plugin.game.model.a0$a r2 = com.tencent.p014mm.plugin.game.model.C42036a0.C42037a.GAME_REDDOT_EXIT_GAMELIFE_COVERED
                r0.mo65977f(r2)
                com.tencent.mm.ui.FindMoreFriendsUI r0 = com.tencent.p014mm.p136ui.FindMoreFriendsUI.this
                r0.getClass()
                zt3.t r2 = zt3.C119157j.f356862d
                com.tencent.mm.ui.l0 r4 = new com.tencent.mm.ui.l0
                r4.<init>(r0, r3)
                zt3.j r2 = (zt3.C119157j) r2
                r2.mo183895z(r4)
                goto L_0x062c
            L_0x05b2:
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                long r8 = r6.f107708e
                java.lang.Long r4 = java.lang.Long.valueOf(r8)
                r6 = 0
                r2[r6] = r4
                com.tencent.mm.autogen.events.QueryGameLifeMsgEvent$a r4 = r3.f107703d
                int r4 = r4.f107707d
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r6 = 1
                r2[r6] = r4
                java.lang.String r4 = "gamelog.reddot, finder, update, gameLife msg is covered by new event, lastMsgId:%d, unread:%d, gameLife should not show, hitLevelUp"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r4, r2)
                f40.o r2 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r2 = r2.mo121142i()
                com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_GAME_LIFE_LATEST_MSG_ID_LONG
                com.tencent.mm.autogen.events.QueryGameLifeMsgEvent$a r3 = r3.f107703d
                long r6 = r3.f107708e
                java.lang.Long r3 = java.lang.Long.valueOf(r6)
                r2.mo119677K(r4, r3)
                com.tencent.mm.ui.FindMoreFriendsUI r2 = com.tencent.p014mm.p136ui.FindMoreFriendsUI.this
                r2.getClass()
                zt3.t r3 = zt3.C119157j.f356862d
                com.tencent.mm.ui.k0 r4 = new com.tencent.mm.ui.k0
                r4.<init>(r2, r0, r5)
                zt3.j r3 = (zt3.C119157j) r3
                r3.mo183895z(r4)
                goto L_0x062c
            L_0x05f5:
                r2 = 4
                java.lang.Object[] r2 = new java.lang.Object[r2]
                com.tencent.mm.autogen.events.QueryGameMessageEvent$a r3 = r0.f107710d
                long r8 = r3.f107719i
                java.lang.Long r3 = java.lang.Long.valueOf(r8)
                r6 = 0
                r2[r6] = r3
                com.tencent.mm.autogen.events.QueryGameMessageEvent$a r3 = r0.f107710d
                java.lang.String r6 = r3.f107726p
                r7 = 1
                r2[r7] = r6
                java.lang.String r3 = r3.f107720j
                r6 = 2
                r2[r6] = r3
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)
                r4 = 3
                r2[r4] = r3
                java.lang.String r3 = "gamelog.reddot, finder, update, normal msg, msgId:%d, gameMsgId:%s, noticeId:%s, levelUp: %b"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r3, r2)
                com.tencent.mm.ui.FindMoreFriendsUI r2 = com.tencent.p014mm.p136ui.FindMoreFriendsUI.this
                r2.getClass()
                zt3.t r3 = zt3.C119157j.f356862d
                com.tencent.mm.ui.k0 r4 = new com.tencent.mm.ui.k0
                r4.<init>(r2, r0, r5)
                zt3.j r3 = (zt3.C119157j) r3
                r3.mo183895z(r4)
            L_0x062c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.FindMoreFriendsUI.C19672j.run():void");
        }
    }

    /* renamed from: com.tencent.mm.ui.FindMoreFriendsUI$k */
    public class C19673k implements C98661k {

        /* renamed from: a */
        public final /* synthetic */ GameMsgDownloadImgEvent f55753a;

        public C19673k(FindMoreFriendsUI findMoreFriendsUI, GameMsgDownloadImgEvent gameMsgDownloadImgEvent) {
            this.f55753a = gameMsgDownloadImgEvent;
        }

        /* renamed from: a */
        public void mo6935a(String str, View view, Bitmap bitmap, Object... objArr) {
            GameMsgDownloadImgEvent gameMsgDownloadImgEvent = this.f55753a;
            GameMsgDownloadImgEvent.C40107a aVar = gameMsgDownloadImgEvent.f107555d;
            aVar.f107557a = 2;
            aVar.f107558b = str;
            gameMsgDownloadImgEvent.publish();
        }
    }

    /* renamed from: com.tencent.mm.ui.FindMoreFriendsUI$b */
    public class C19674b implements C75706q0 {
        public C19674b() {
        }

        /* renamed from: o */
        public void mo25945o(String str, Map<String, String> map, C35136m.C35137a aVar) {
            C72994y1.C72995a aVar2 = C72994y1.C72995a.MY_LIFE_AROUND_APP_RED_DOT_IMG_URL_STRING;
            C72994y1.C72995a aVar3 = C72994y1.C72995a.MY_LIFE_AROUND_APP_RED_DOT_TEXT_STRING;
            C72994y1.C72995a aVar4 = C72994y1.C72995a.MY_LIFE_AROUND_APP_RED_DOT_TYPE_STRING;
            if (Util.nullAsNil(str).equals("lifeappreddot") && map != null) {
                boolean equals = "1".equals(map.get(".sysmsg.lifeappreddot"));
                Log.m105925i("MicroMsg.FindMoreFriendsUI", "life around xml msg content, showRedDot: %s.", Boolean.valueOf(equals));
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.MY_LIFE_AROUND_APP_RED_DOT_TAG_BOOLEAN, Boolean.valueOf(equals));
                if (equals) {
                    String str2 = map.get(".sysmsg.lifeappreddot.$type");
                    String str3 = map.get(".sysmsg.lifeappreddot.$text");
                    String str4 = map.get(".sysmsg.lifeappreddot.$imageurl");
                    Log.m105919d("MicroMsg.FindMoreFriendsUI", "life around xml msg content, type: %s, text: %s, imgUrl: %s.", str2, str3, str4);
                    FindMoreFriendsUI findMoreFriendsUI = FindMoreFriendsUI.this;
                    int i = FindMoreFriendsUI.f55665Z0;
                    if (findMoreFriendsUI.mo25878H0(str3, str4)) {
                        C86709a0.m107535s().mo121142i().mo119677K(aVar4, str2);
                        C86709a0.m107535s().mo121142i().mo119677K(aVar3, str3);
                        C86709a0.m107535s().mo121142i().mo119677K(aVar2, str4);
                        return;
                    }
                    return;
                }
                FindMoreFriendsUI.this.f55699Z = C19665s.TYPE_NONE;
                C86709a0.m107535s().mo121142i().mo119677K(aVar4, "0");
                C86709a0.m107535s().mo121142i().mo119677K(aVar3, "");
                C86709a0.m107535s().mo121142i().mo119677K(aVar2, "");
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.FindMoreFriendsUI$c */
    public class C19675c implements Runnable {

        /* renamed from: d */
        public int f55755d = 0;

        /* renamed from: e */
        public final /* synthetic */ View f55756e;

        public C19675c(View view) {
            this.f55756e = view;
        }

        public void run() {
            if (FindMoreFriendsUI.this.getView() != null) {
                int a = C75044y4.m89989a(FindMoreFriendsUI.this.getContext());
                int g = C75044y4.m89995g(FindMoreFriendsUI.this.getContext(), -1);
                if (g <= 0) {
                    if (this.f55755d < 2) {
                        Log.m105924i("MicroMsg.FindMoreFriendsUI", "[trySetParentViewPadding] try getStatusHeight again!");
                        FindMoreFriendsUI.this.getView().post(this);
                    } else {
                        Log.m105920e("MicroMsg.FindMoreFriendsUI", "[trySetParentViewPadding] try getStatusHeight finally!");
                    }
                    this.f55755d++;
                } else {
                    FindMoreFriendsUI findMoreFriendsUI = FindMoreFriendsUI.this;
                    int i = FindMoreFriendsUI.f55665Z0;
                    int g0 = findMoreFriendsUI.mo25904g0();
                    if (g0 != FindMoreFriendsUI.this.getView().getPaddingTop()) {
                        Log.m105925i("MicroMsg.FindMoreFriendsUI", "[trySetParentViewPadding] now:%s old:%s", Integer.valueOf(g0), Integer.valueOf(FindMoreFriendsUI.this.getView().getPaddingTop()));
                        FindMoreFriendsUI.this.getView().setPadding(0, g0, 0, this.f55756e.getHeight());
                    } else {
                        Log.m105925i("MicroMsg.FindMoreFriendsUI", "[trySetParentViewPadding] has try more once! it's right! actionBarHeight:%s actionBarHeight:%s", Integer.valueOf(g), Integer.valueOf(a));
                    }
                }
                Log.m105925i("MicroMsg.FindMoreFriendsUI", "[trySetParentViewPadding] tryCount:%s actionBarHeight:%s actionBarHeight:%s", Integer.valueOf(this.f55755d), Integer.valueOf(g), Integer.valueOf(a));
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.FindMoreFriendsUI$e */
    public class C19677e extends MMHandler {
        public C19677e(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (message.what == 1) {
                FindMoreFriendsUI findMoreFriendsUI = FindMoreFriendsUI.this;
                if (findMoreFriendsUI.f55702t != null) {
                    findMoreFriendsUI.mo25877G0(true);
                }
            }
        }
    }

    public FindMoreFriendsUI() {
        C40008f fVar = C40008f.f107254d;
        this.f55680P = new IListener<SearchSysMsgNotifyEvent>(fVar) {
            {
                this.__eventId = 1507664325;
            }

            public boolean callback(IEvent iEvent) {
                SearchSysMsgNotifyEvent searchSysMsgNotifyEvent = (SearchSysMsgNotifyEvent) iEvent;
                FindMoreFriendsUI findMoreFriendsUI = FindMoreFriendsUI.this;
                int i = FindMoreFriendsUI.f55665Z0;
                findMoreFriendsUI.mo25880J0();
                FindMoreFriendsUI.this.mo25897Z();
                return false;
            }
        };
        this.f55681Q = new C19663q();
        this.f55683R = new IListener<StatusNotifyFunctionEvent>(fVar) {
            {
                this.__eventId = 1510396759;
            }

            public boolean callback(IEvent iEvent) {
                StatusNotifyFunctionEvent statusNotifyFunctionEvent = (StatusNotifyFunctionEvent) iEvent;
                Log.m105925i("MicroMsg.FindMoreFriendsUI", "mark sns read %d", Integer.valueOf(statusNotifyFunctionEvent.f79014d.f79015a));
                if (statusNotifyFunctionEvent.f79014d.f79015a == 9) {
                    new MMHandler(Looper.getMainLooper()).post(new C30862n0(this));
                }
                return true;
            }
        };
        this.f55685S = new IListener<JDSysMsgNotifyEvent>(fVar) {
            {
                this.__eventId = 1450669203;
            }

            public boolean callback(IEvent iEvent) {
                JDSysMsgNotifyEvent jDSysMsgNotifyEvent = (JDSysMsgNotifyEvent) iEvent;
                if (C96796d.m124292a() != null) {
                    String str = C96463h.yx0().Cx0().f282212a;
                    if (Util.isNullOrNil(str)) {
                        str = C96463h.yx0().Bx0();
                    }
                    C115669n nVar = C115669n.INSTANCE;
                    FindMoreFriendsUI findMoreFriendsUI = FindMoreFriendsUI.this;
                    int i = FindMoreFriendsUI.f55665Z0;
                    nVar.mo160131h(11178, str, C96463h.yx0().Dx0().f282216b, Integer.valueOf(findMoreFriendsUI.mo25901e0()));
                }
                FindMoreFriendsUI findMoreFriendsUI2 = FindMoreFriendsUI.this;
                int i2 = FindMoreFriendsUI.f55665Z0;
                findMoreFriendsUI2.mo25877G0(true);
                FindMoreFriendsUI.this.f55702t.notifyDataSetChanged();
                return true;
            }
        };
        this.f55687T = new IListener<DynamicConfigUpdatedEvent>(fVar, 1) {
            {
                this.__eventId = -443124368;
            }

            public boolean callback(IEvent iEvent) {
                DynamicConfigUpdatedEvent dynamicConfigUpdatedEvent = (DynamicConfigUpdatedEvent) iEvent;
                Log.m105924i("MicroMsg.FindMoreFriendsUI", "dynamic config file change");
                FindMoreFriendsUI.this.f55679N.sendEmptyMessage(1);
                return true;
            }
        };
        this.f55689U = new IListenerMStorage() {
            /* renamed from: e */
            public void mo25931e(IEvent iEvent) {
                if (iEvent instanceof GameMessageStorageNotifyEvent) {
                    FindMoreFriendsUI.m21190U(FindMoreFriendsUI.this, true, false);
                    FindMoreFriendsUI.this.f55702t.notifyDataSetChanged();
                }
            }
        };
        this.f55691V = new IListenerMStorage() {
            /* renamed from: e */
            public void mo25931e(IEvent iEvent) {
                if (iEvent instanceof GameLifeStorageNotifyEvent) {
                    FindMoreFriendsUI.m21190U(FindMoreFriendsUI.this, true, true);
                    FindMoreFriendsUI.this.f55702t.notifyDataSetChanged();
                }
            }
        };
        this.f55693W = new IListenerMStorage() {
            /* renamed from: e */
            public void mo25931e(IEvent iEvent) {
                if (iEvent instanceof ShakeMessageStorageNotifyEvent) {
                    FindMoreFriendsUI findMoreFriendsUI = FindMoreFriendsUI.this;
                    int i = FindMoreFriendsUI.f55665Z0;
                    findMoreFriendsUI.mo25881K0();
                    FindMoreFriendsUI.this.f55702t.notifyDataSetChanged();
                }
            }
        };
        this.f55695X = new IListener<ShakeCardMsgNotifyEvent>(fVar) {
            {
                this.__eventId = -994942154;
            }

            public boolean callback(IEvent iEvent) {
                if (!(((ShakeCardMsgNotifyEvent) iEvent) instanceof ShakeCardMsgNotifyEvent)) {
                    return false;
                }
                FindMoreFriendsUI findMoreFriendsUI = FindMoreFriendsUI.this;
                int i = FindMoreFriendsUI.f55665Z0;
                findMoreFriendsUI.mo25881K0();
                FindMoreFriendsUI.this.f55702t.notifyDataSetChanged();
                return false;
            }
        };
        this.f55699Z = C19665s.TYPE_NONE;
        this.f55700p0 = new C19674b();
        this.f55707x0 = new IListener<WebSearchConfigEvent>(fVar) {
            {
                this.__eventId = -1764466964;
            }

            public boolean callback(IEvent iEvent) {
                WebSearchConfigEvent webSearchConfigEvent = (WebSearchConfigEvent) iEvent;
                FindMoreFriendsUI.this.getContentView().post(new C19795g0(this));
                return false;
            }
        };
        this.f55709y0 = new IListener<GetEntranceStateEvent>(fVar) {
            {
                this.__eventId = -1188553307;
            }

            public boolean callback(IEvent iEvent) {
                ((GetEntranceStateEvent) iEvent).f107593d.f107594a = FindMoreFriendsUI.this.f55668C;
                return false;
            }
        };
        this.f55682Q0 = new C19654f();
        this.f55684R0 = 0;
        this.f55686S0 = null;
        this.f55688T0 = null;
        this.f55690U0 = false;
        this.f55692V0 = null;
        this.f55694W0 = new Random();
        this.f55696X0 = false;
        this.f55698Y0 = false;
    }

    /* renamed from: U */
    public static void m21190U(FindMoreFriendsUI findMoreFriendsUI, boolean z, boolean z2) {
        findMoreFriendsUI.getClass();
        boolean z3 = true;
        if (z2) {
            if (System.currentTimeMillis() - findMoreFriendsUI.f55672G > 1000) {
                findMoreFriendsUI.f55672G = System.currentTimeMillis();
            } else {
                z3 = false;
            }
        }
        if (z3) {
            findMoreFriendsUI.mo25876F0();
            if (z) {
                findMoreFriendsUI.f55702t.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: A0 */
    public final void mo25871A0() {
        SendEntranceStateEvent sendEntranceStateEvent = new SendEntranceStateEvent();
        sendEntranceStateEvent.f107751d.f107752a = this.f55668C;
        sendEntranceStateEvent.publish();
    }

    /* renamed from: C0 */
    public final void mo25872C0(IconPreference iconPreference, int i, int i2, int i3, boolean z, int i4, int i5, int i6) {
        iconPreference.mo101936T(i);
        iconPreference.mo96250V(i2);
        iconPreference.mo101937U(i3);
        iconPreference.mo101940Z(z);
        iconPreference.mo101934R(i4);
        iconPreference.mo101932N(i5);
        iconPreference.mo101933P(i6);
        mo25923t0("more_tab_game_recommend", i == 0 || i2 == 0 || i3 == 0 || z || i4 == 0 || i5 == 0 || i6 == 0);
    }

    /* renamed from: D */
    public void mo25873D() {
        Log.m105924i("MicroMsg.FindMoreFriendsUI", "on tab recreate ui");
    }

    /* renamed from: D0 */
    public final void mo25874D0(IconPreference iconPreference, int i, int i2, boolean z, int i3, int i4, int i5) {
        iconPreference.mo96250V(i);
        iconPreference.mo101937U(i2);
        iconPreference.mo101940Z(z);
        iconPreference.mo101934R(i3);
        iconPreference.mo101932N(i4);
        iconPreference.mo101933P(i5);
    }

    /* renamed from: E0 */
    public final void mo25875E0() {
        View findViewById = getView().getRootView().findViewById(C0966R.C0970id.f358508fj3);
        int a = C75044y4.m89989a(getContext());
        int g = C75044y4.m89995g(getContext(), -1);
        C19675c cVar = new C19675c(findViewById);
        if (g <= 0) {
            getView().post(cVar);
            return;
        }
        getView().setPadding(0, mo25904g0(), 0, findViewById.getHeight());
        Log.m105925i("MicroMsg.FindMoreFriendsUI", "[trySetParentViewPadding] actionBarHeight:%s actionBarHeight:%s", Integer.valueOf(g), Integer.valueOf(a));
        getView().postDelayed(cVar, 100);
    }

    /* renamed from: F0 */
    public final void mo25876F0() {
        NormalIconNewTipPreference normalIconNewTipPreference = (NormalIconNewTipPreference) this.f55702t.mo72519a("more_tab_game_recommend");
        if (normalIconNewTipPreference != null) {
            normalIconNewTipPreference.mo96254e0(this.f55702t);
            ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175770k(normalIconNewTipPreference);
            ((C119157j) C119157j.f356862d).mo183876g(new C19672j(), "updateGame");
        }
    }

    /* renamed from: G0 */
    public final void mo25877G0(boolean z) {
        boolean z2 = true;
        if (C96796d.m124292a() != null) {
            if (C96463h.yx0().mo134444UX()) {
                this.f55677L++;
                C96461f Dx0 = C96463h.yx0().Dx0();
                NormalIconNewTipPreference normalIconNewTipPreference = (NormalIconNewTipPreference) this.f55702t.mo72519a("jd_market_entrance");
                normalIconNewTipPreference.mo69924H(C96463h.yx0().Ax0());
                normalIconNewTipPreference.mo96254e0(this.f55702t);
                ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175770k(normalIconNewTipPreference);
                C76057w.C76058a aVar = this.f55682Q0;
                C19656g gVar = new C19656g();
                normalIconNewTipPreference.f201752r1 = aVar;
                normalIconNewTipPreference.f201753s1 = gVar;
                normalIconNewTipPreference.mo96252c0();
                boolean z3 = C96463h.yx0().Ex0() && Dx0.mo134437e() && !Dx0.mo134436d();
                if (!((C66446g) C86312j.m106911c(C66446g.class)).mo61616yL()) {
                    Log.m105924i("MicroMsg.FindMoreFriendsUI", "JudgeRedDot dont show reddot! ReddotService interrupt");
                    z3 = false;
                }
                if (!normalIconNewTipPreference.mo64138m(z3 && (!Util.isNullOrNil(Dx0.f282221g) || !Util.isNullOrNil(Dx0.f282222h) || Dx0.f282220f))) {
                    normalIconNewTipPreference.mo101936T(8);
                    normalIconNewTipPreference.mo96250V(8);
                    normalIconNewTipPreference.mo101937U(8);
                    normalIconNewTipPreference.mo101940Z(false);
                    normalIconNewTipPreference.mo101934R(8);
                    if (z3) {
                        if (!Util.isNullOrNil(Dx0.f282221g)) {
                            normalIconNewTipPreference.mo101936T(8);
                            normalIconNewTipPreference.mo96250V(8);
                            normalIconNewTipPreference.mo101939Y(Dx0.f282221g, -1, -7566196);
                            normalIconNewTipPreference.mo101937U(0);
                        }
                        if (!Util.isNullOrNil(Dx0.f282222h)) {
                            Bitmap bitmap = ((C8451i) C86312j.m106911c(C8451i.class)).get(Dx0.f282222h);
                            normalIconNewTipPreference.mo101934R(0);
                            normalIconNewTipPreference.mo101932N(0);
                            normalIconNewTipPreference.mo101933P(0);
                            normalIconNewTipPreference.mo101940Z(false);
                            if (bitmap != null) {
                                this.f55666A = null;
                                normalIconNewTipPreference.mo101930L(bitmap);
                            } else {
                                ((C76057w) C86312j.m106911c(C76057w.class)).h60(Dx0.f282222h, this.f55682Q0);
                                this.f55666A = Dx0.f282222h;
                            }
                            if (!Util.isNullOrNil(Dx0.f282221g)) {
                                normalIconNewTipPreference.mo64136k(C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE_ICON, true);
                            } else {
                                normalIconNewTipPreference.mo64136k(C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT_ICON, true);
                            }
                        } else if (!Util.isNullOrNil(Dx0.f282221g)) {
                            normalIconNewTipPreference.mo101940Z(true);
                            normalIconNewTipPreference.mo64136k(C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE, true);
                        } else if (Dx0.f282220f) {
                            normalIconNewTipPreference.mo96250V(0);
                            normalIconNewTipPreference.f215054P = "";
                            normalIconNewTipPreference.f215055Q = -1;
                            normalIconNewTipPreference.mo101936T(8);
                            normalIconNewTipPreference.mo64136k(C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT, true);
                        } else {
                            normalIconNewTipPreference.mo96252c0();
                        }
                    } else {
                        normalIconNewTipPreference.mo96252c0();
                    }
                    mo25923t0("jd_market_entrance", z3);
                }
                if (z) {
                    this.f55702t.notifyDataSetChanged();
                }
                C85801v1 i = C86709a0.m107535s().mo121142i();
                C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_JD_ENTRANCE_RESET_EXPOSURE_FLAG_BOOLEAN_SYNC;
                boolean g = i.mo119686g(aVar2, false);
                if (!mo25908k0() || g) {
                    String str = C96463h.yx0().Cx0().f282212a;
                    if (Util.isNullOrNil(str)) {
                        str = C96463h.yx0().Bx0();
                    }
                    C86709a0.m107535s().mo121142i().mo119677K(aVar2, Boolean.FALSE);
                    C115669n nVar = C115669n.INSTANCE;
                    nVar.mo175911u(931, 12);
                    nVar.mo160131h(11178, str, C96463h.yx0().Dx0().f282216b, Integer.valueOf(mo25901e0()), 2);
                }
                z2 = false;
            } else {
                String Ax0 = C96463h.yx0().Ax0();
                String zx02 = C96463h.yx0().zx0();
                if (!mo25908k0() && LocaleUtil.isSimplifiedChineseAppLang()) {
                    if (Util.isNullOrNil(Ax0)) {
                        C115669n.INSTANCE.mo175911u(931, 2);
                    }
                    if (Util.isNullOrNil(zx02)) {
                        C115669n.INSTANCE.mo175911u(931, 4);
                    }
                }
            }
        }
        this.f55702t.mo72529n("jd_market_entrance", z2);
    }

    /* renamed from: H0 */
    public final boolean mo25878H0(String str, String str2) {
        boolean z = !Util.isNullOrNil(str);
        boolean z2 = !Util.isNullOrNil(str2);
        C19665s sVar = (!z || !z2) ? z2 ? C19665s.TYPE_IMG : z ? C19665s.TYPE_TEXT : C19665s.TYPE_NORMAL : C19665s.TYPE_IMG_TEXT;
        Log.m105925i("MicroMsg.FindMoreFriendsUI", "new type: %s, now type: %s.", sVar, this.f55699Z);
        if (sVar.compareTo(this.f55699Z) < 0) {
            return false;
        }
        this.f55699Z = sVar;
        return true;
    }

    /* renamed from: I0 */
    public final void mo25879I0() {
        if (this.f55686S0 == null) {
            this.f55686S0 = new C23104f(getContext(), this);
        }
        C23104f fVar = this.f55686S0;
        fVar.getClass();
        int i = 0;
        if (((C10432i) C86312j.m106911c(C10432i.class)).mo10750e()) {
            fVar.f66385b.f55702t.mo72529n("find_friends_by_near", true);
            fVar.f66385b.f55702t.mo72529n("find_live_friends_by_near", true);
            fVar.f66385b.f55702t.mo72529n("find_friends_by_near_v3", true);
            if (!fVar.f66385b.mo25908k0()) {
                C115669n.INSTANCE.mo175913w(953, 5, 1);
            }
            Log.m105924i("NearbyEntryPreferenceMgr", "updateNearbyEntry return for isTeenMode.");
        } else {
            if (((C20838b) C86312j.m106911c(C20838b.class)).mo32540ag()) {
                fVar.f66385b.f55702t.mo72529n("find_friends_by_near", true);
                fVar.f66385b.f55702t.mo72529n("find_live_friends_by_near", true);
                boolean z = !fVar.f66385b.mo25907j0(70368744177664L);
                FindMoreFriendsUI findMoreFriendsUI = fVar.f66385b;
                boolean z2 = (findMoreFriendsUI.f55676K & 512) == 0;
                if (!z) {
                    findMoreFriendsUI.f55702t.mo72529n("find_friends_by_near_v3", true);
                    Log.m105929w("NearbyEntryPreferenceMgr", "updateNearbyEntryV3 return for openNearbyLiveFriends:%s", Boolean.valueOf(z));
                } else {
                    if (findMoreFriendsUI.f55668C) {
                        C59263a.f169450b = "";
                        C59263a.f169451c = "";
                        C59263a.f169449a.mo84408e(1, 2, C59263a.m69190b());
                    }
                    fVar.f66385b.f55702t.mo72529n("find_friends_by_near_v3", false);
                    Preference a = fVar.f66385b.f55702t.mo72519a("find_friends_by_near_v3");
                    C87412m.m108592e(a, "null cannot be cast to non-null type com.tencent.mm.ui.FinderIconViewTipPreference");
                    fVar.mo36509a((FinderIconViewTipPreference) a, z2);
                    Log.m105924i("NearbyEntryPreferenceMgr", "updateNearbyEntryV3");
                }
            } else {
                fVar.f66385b.f55702t.mo72529n("find_friends_by_near_v3", true);
                if (C78146a.m94353b()) {
                    fVar.f66385b.f55702t.mo72529n("find_friends_by_near", true);
                    Class cls = C60200t1.class;
                    boolean z3 = !fVar.f66385b.mo25907j0(70368744177664L);
                    FindMoreFriendsUI findMoreFriendsUI2 = fVar.f66385b;
                    boolean z4 = (findMoreFriendsUI2.f55676K & 512) == 0;
                    if (!z3) {
                        findMoreFriendsUI2.f55702t.mo72529n("find_live_friends_by_near", true);
                        Log.m105929w("NearbyEntryPreferenceMgr", "updateNearbyLiveFriendsEntry return for openNearbyLiveFriends:%s", Boolean.valueOf(z3));
                    } else {
                        if (findMoreFriendsUI2.f55668C) {
                            C59263a.f169450b = "";
                            C59263a.f169451c = "";
                            C59263a.f169449a.mo84408e(1, 0, C59263a.m69190b());
                        }
                        fVar.f66385b.f55702t.mo72529n("find_live_friends_by_near", false);
                        Preference a2 = fVar.f66385b.f55702t.mo72519a("find_live_friends_by_near");
                        C87412m.m108592e(a2, "null cannot be cast to non-null type com.tencent.mm.ui.FinderIconViewTipPreference");
                        FinderIconViewTipPreference finderIconViewTipPreference = (FinderIconViewTipPreference) a2;
                        Log.m105924i("NearbyEntryPreferenceMgr", "updateNearbyLiveFriendsEntry");
                        int kD = C75743h.xx0().mo100937kD();
                        if (z4) {
                            i = kD;
                        }
                        if (i <= 0) {
                            C85801v1 i2 = C86709a0.m107535s().mo121142i();
                            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FIRST_SHOW_NEARBY_REDDOT_BOOLEAN_SYNC;
                            if (i2.mo119686g(aVar, true) && ((C60200t1) C86312j.m106911c(cls)).Nt0().mo77229H5()) {
                                Log.m105924i("NearbyEntryPreferenceMgr", "updateNearbyLiveFriendsEntry: add nearby new red dot");
                                ((C60200t1) C86312j.m106911c(cls)).Nt0().mo77270j().mo2465b();
                                C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.FALSE);
                            }
                        }
                        fVar.mo36509a(finderIconViewTipPreference, z4);
                        fVar.mo36510b(((C60200t1) C86312j.m106911c(cls)).Nt0().mo77229H5());
                    }
                } else {
                    fVar.f66385b.f55702t.mo72529n("find_live_friends_by_near", true);
                    C0120a0<C2458a> a0Var = fVar.f66386c;
                    if (a0Var != null) {
                        ((C76243a5) C86312j.m106911c(C76243a5.class)).mo13217RA(a0Var);
                    }
                    boolean z5 = (fVar.f66385b.f55676K & 512) == 0;
                    C88144b.m109788f("nearby");
                    Log.m105924i("NearbyEntryPreferenceMgr", "updateNearbyFriendsEntry enableNearbyFriends:" + z5 + ", nearbyPluginInstalled:" + true);
                    if (z5) {
                        fVar.f66385b.f55702t.mo72529n("find_friends_by_near", false);
                        Preference a3 = fVar.f66385b.f55702t.mo72519a("find_friends_by_near");
                        C87412m.m108592e(a3, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.IconPreference");
                        IconPreference iconPreference = (IconPreference) a3;
                        LbsroomLogicEvent lbsroomLogicEvent = new LbsroomLogicEvent();
                        lbsroomLogicEvent.f193724d.f193726a = 7;
                        lbsroomLogicEvent.publish();
                        if (lbsroomLogicEvent.f193725e.f193727a) {
                            iconPreference.mo101932N(8);
                        } else {
                            iconPreference.mo101932N(0);
                            Context context = fVar.f66384a;
                            Drawable e = C74933u4.m89768e(context, C0966R.raw.icons_filled_footstep, context.getResources().getColor(C0966R.color.f3107fh));
                            iconPreference.f215050K = e;
                            iconPreference.f215073Z = null;
                            iconPreference.f215049J = -1;
                            ImageView imageView = iconPreference.f215051L;
                            if (imageView != null) {
                                imageView.setImageDrawable(e);
                            }
                            iconPreference.mo101935S(C74942w4.m89786c(fVar.f66384a, C0966R.dimen.f3738cr), C74942w4.m89786c(fVar.f66384a, C0966R.dimen.f3738cr));
                        }
                        int kD2 = C75743h.xx0().mo100937kD();
                        if (!C78146a.m94354c() || C78146a.m94353b()) {
                            if (kD2 > 0) {
                                iconPreference.mo101936T(0);
                                int b = C45081s1.m49933b(fVar.f66384a, kD2);
                                iconPreference.f215054P = "" + kD2;
                                iconPreference.f215055Q = b;
                                C59263a.m69191c((long) kD2);
                            } else {
                                iconPreference.mo101936T(8);
                                iconPreference.f215054P = "";
                                iconPreference.f215055Q = -1;
                            }
                        } else if (kD2 > 0) {
                            iconPreference.mo96250V(0);
                            C59263a.m69191c((long) kD2);
                        } else {
                            iconPreference.mo96250V(8);
                        }
                    } else {
                        fVar.f66385b.f55702t.mo72529n("find_friends_by_near", true);
                        if (!fVar.f66385b.mo25908k0()) {
                            C115669n.INSTANCE.mo175913w(953, 5, 1);
                        }
                    }
                }
            }
            i = 1;
        }
        if (i != 0) {
            this.f55677L++;
        }
    }

    /* renamed from: J0 */
    public final void mo25880J0() {
        boolean j0 = mo25907j0(2097152);
        boolean e = ((C0405n) C86312j.m106911c(C0405n.class)).mo279e();
        C88144b.m109788f("search");
        Log.m105925i("MicroMsg.FindMoreFriendsUI", "openSearch %s, plugin installed %s isTeenMode: %s", Boolean.valueOf(!j0), Boolean.TRUE, Boolean.valueOf(e));
        if (j0 || e) {
            this.f55702t.mo72529n("find_friends_by_search", true);
            if (!mo25908k0()) {
                C115669n.INSTANCE.mo175913w(953, 4, 1);
                return;
            }
            return;
        }
        this.f55677L++;
        this.f55702t.mo72529n("find_friends_by_search", false);
        try {
            JSONObject p4 = ((C0406o) C86312j.m106911c(C0406o.class)).mo448p4("discoverSearchEntry");
            String optString = p4.optString("wording");
            p4.optString("androidIcon");
            NormalIconNewTipPreference normalIconNewTipPreference = (NormalIconNewTipPreference) this.f55702t.mo72519a("find_friends_by_search");
            if (Util.isNullOrNil(optString)) {
                normalIconNewTipPreference.mo69924H(getString(C0966R.string.cwg));
            } else {
                normalIconNewTipPreference.mo69924H(optString);
            }
            normalIconNewTipPreference.mo96254e0(this.f55702t);
            ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175770k(normalIconNewTipPreference);
            C76057w.C76058a aVar = this.f55682Q0;
            C19662p pVar = new C19662p();
            normalIconNewTipPreference.f201752r1 = aVar;
            normalIconNewTipPreference.f201753s1 = pVar;
            normalIconNewTipPreference.mo96252c0();
            MMHandlerThread.postToMainThread(new C19794f0(this, normalIconNewTipPreference, C22611g1.f65023c.f65024a));
            if (LauncherUI.getCurrentTabIndex() == 2) {
                C22611g1.f65023c.mo35733a(1);
            }
            if (!((C75626b) C86312j.m106911c(C75626b.class)).mo58021Xy()) {
                ((C119157j) C119157j.f356862d).mo183879j(new C52468u0(true, false), 0, "WebSearchThread");
            }
        } catch (Exception e2) {
            Log.printErrStackTrace("MicroMsg.FindMoreFriendsUI", e2, "update search entry exception!", new Object[0]);
        }
    }

    /* renamed from: K0 */
    public final void mo25881K0() {
        boolean z = true;
        boolean z2 = (this.f55676K & 256) == 0;
        C88144b.m109788f("shake");
        boolean e = ((C10432i) C86312j.m106911c(C10432i.class)).mo10750e();
        Log.m105925i("MicroMsg.FindMoreFriendsUI", "openShake %s, plugin installed %s, isTeenMode:%s", Boolean.valueOf(z2), Boolean.TRUE, Boolean.valueOf(e));
        if (!z2 || e) {
            this.f55702t.mo72529n("find_friends_by_shake", true);
            if (!mo25908k0()) {
                C115669n.INSTANCE.mo175913w(953, 2, 1);
                return;
            }
            return;
        }
        this.f55677L++;
        this.f55702t.mo72529n("find_friends_by_shake", false);
        IconPreference iconPreference = (IconPreference) this.f55702t.mo72519a("find_friends_by_shake");
        int Ow = C75743h.yx0().mo101222Ow() + C78535a0.m94863b().getShakeMessageUnreadCnt();
        if (Ow > 0) {
            iconPreference.mo101936T(0);
            int b = C45081s1.m49933b(getContext(), Ow);
            iconPreference.f215054P = "" + Ow;
            iconPreference.f215055Q = b;
        } else {
            iconPreference.mo101936T(8);
            iconPreference.f215054P = "";
            iconPreference.f215055Q = -1;
        }
        iconPreference.mo101932N(8);
        C78535a0.m94863b().checkShakeCardEntrance();
        boolean b2 = C78535a0.m94863b().isShakeCardEntranceOpen() ? ((C21388a) ((C30914c) C86312j.m106911c(C30914c.class)).mo17862sM()).mo33494b(262154, 266258) : false;
        if (b2) {
            String str = (String) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_SHAKE_CARD_ENTRANCE_RED_DOT_TEXT_STRING_SYNC, "");
            if (!TextUtils.isEmpty(str)) {
                iconPreference.mo96250V(8);
                iconPreference.mo101936T(0);
                iconPreference.f215054P = "" + str;
                iconPreference.f215055Q = C0966R.C0969drawable.f357395az0;
            } else if (Ow > 0) {
                iconPreference.mo96250V(0);
            } else {
                iconPreference.mo96250V(0);
                iconPreference.mo101936T(8);
                iconPreference.f215054P = "";
                iconPreference.f215055Q = -1;
            }
        } else {
            iconPreference.mo96250V(8);
        }
        String nullAs = Util.nullAs((String) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_IBEACON_PUSH_BEACONINFO_STRING, (Object) null), "");
        Boolean valueOf = Boolean.valueOf(Util.nullAs((Boolean) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_IBEACON_PUSH_IS_OPEN_BOOLEAN, (Object) null), false));
        int intValue = ((Integer) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_IBEACON_SHAKE_TAB_DISPLAY_INT, 0)).intValue();
        if (!valueOf.booleanValue() || nullAs == null || nullAs.equals("") || Ow > 0 || b2) {
            iconPreference.mo101937U(8);
        } else if (intValue == 0) {
            iconPreference.mo96250V(8);
            iconPreference.mo101937U(0);
            String[] split = nullAs.split(",");
            if (split.length > 0) {
                iconPreference.mo101939Y(split[0], -1, Color.parseColor("#8c8c8c"));
            }
            iconPreference.mo101940Z(true);
            iconPreference.mo101934R(8);
        } else if (intValue == 1) {
            iconPreference.mo101937U(8);
            iconPreference.mo101936T(0);
            iconPreference.f215080f1 = true;
        }
        if (Ow <= 0 && !b2) {
            z = false;
        }
        mo25923t0("find_friends_by_shake", z);
    }

    /* renamed from: L */
    public int mo25882L() {
        return C0966R.xml.f8894ao;
    }

    /* renamed from: L0 */
    public final void mo25883L0() {
        int i;
        boolean z;
        Class cls = C76705f.class;
        Class cls2 = C99018v.class;
        boolean z2 = (this.f55676K & 32768) == 0;
        Log.m105925i("MicroMsg.FindMoreFriendsUI", "openSns %s, plugin installed %s", Boolean.valueOf(z2), Boolean.TRUE);
        if (!z2) {
            C85801v1 i2 = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_SNS_ENTRY_SWITCH_INT;
            if (i2.mo119689j(aVar, 0) == 1) {
                Log.m105928w("MicroMsg.FindMoreFriendsUI", "opened sns entry recently");
                C115669n.INSTANCE.mo175911u(150, 71);
            } else if (C86709a0.m107535s().mo121142i().mo119689j(aVar, 0) == -1) {
                Log.m105924i("MicroMsg.FindMoreFriendsUI", "closed sns entry recently");
                C115669n.INSTANCE.mo175911u(150, 70);
            }
        }
        if (z2) {
            this.f55677L++;
            this.f55702t.mo72529n("album_dyna_photo_ui_title", false);
            FriendSnsPreference friendSnsPreference = (FriendSnsPreference) this.f55702t.mo72519a("album_dyna_photo_ui_title");
            friendSnsPreference.f215053N = C74942w4.m89785b(getContext(), C0966R.attr.f2742gp);
            boolean nullAsFalse = Util.nullAsFalse((Boolean) C97625j3.m125812b().mo105906u().mo119684e(48, (Object) null));
            friendSnsPreference.mo101936T(8);
            friendSnsPreference.mo101933P(8);
            if (nullAsFalse) {
                friendSnsPreference.mo101936T(0);
                friendSnsPreference.f215054P = getString(C0966R.string.f360088a12);
                friendSnsPreference.f215055Q = C0966R.C0969drawable.ake;
            }
            String str = (String) C97625j3.m125812b().mo105906u().mo119684e(68377, (Object) null);
            this.f55703u = str;
            if (!Util.isNullOrNil(str) && LauncherUI.getCurrentTabIndex() == 2 && C97625j3.m125812b().mo105906u().mo119688i(68419, 0) == 0) {
                C86709a0.m107528h();
                C5438v.m5358a(2, (String) C86709a0.m107535s().mo121142i().mo119684e(68418, ""), this.f55704v);
                C97625j3.m125812b().mo105906u().mo119676J(68419, 1);
            }
            Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_SNS_MEDIA_COLLAPSE_SNS_ID_LONG, (Object) null);
            long longValue = f == null ? 0 : ((Long) f).longValue();
            Log.m105925i("MicroMsg.FindMoreFriendsUI", "newer snsobj %s", Util.nullAs(this.f55703u, ""));
            friendSnsPreference.mo101934R(0);
            if (!Util.isNullOrNil(this.f55703u)) {
                Log.m105924i("MicroMsg.FindMoreFriendsUI", "updateSnsEntry: show RightAvatar");
                friendSnsPreference.mo101932N(0);
                friendSnsPreference.mo101933P(((C66446g) C86312j.m106911c(C66446g.class)).mo61613tF() ? 0 : 8);
                String str2 = this.f55703u;
                friendSnsPreference.f215049J = -1;
                friendSnsPreference.f214218l1 = str2;
                friendSnsPreference.f214219m1 = 0;
                if (friendSnsPreference.f215051L != null) {
                    ((C76705f) C86312j.m106911c(cls)).mo106849z(friendSnsPreference.f215051L, str2);
                }
            } else {
                SnsMethodCalculate.markStartTimeMs("enableShowErrorIcon", "com.tencent.mm.plugin.sns.snstimeline.SnsPostActionFailedHandler");
                if (C86709a0.m107523b().mo121114l()) {
                    Object e = C86709a0.m107535s().mo121142i().mo119684e(589825, Boolean.FALSE);
                    C87412m.m108592e(e, "null cannot be cast to non-null type kotlin.Boolean");
                    z = ((Boolean) e).booleanValue() || C99966g.f292912b;
                    Log.m105924i("MicroMsg.SnsPostActionFailedHandler", "account hasInitialized, enableShowErrorIcon: show = [" + z + ']');
                } else {
                    z = C99966g.f292912b;
                    Log.m105924i("MicroMsg.SnsPostActionFailedHandler", "enableShowErrorIcon: show = [" + z + ']');
                }
                SnsMethodCalculate.markEndTimeMs("enableShowErrorIcon", "com.tencent.mm.plugin.sns.snstimeline.SnsPostActionFailedHandler");
                if (z) {
                    Log.m105924i("MicroMsg.FindMoreFriendsUI", "updateSnsEntry: show right icon warning");
                    friendSnsPreference.f215049J = -1;
                    friendSnsPreference.f214218l1 = null;
                    friendSnsPreference.f214219m1 = 0;
                    if (friendSnsPreference.f215051L != null) {
                        ((C76705f) C86312j.m106911c(cls)).mo106849z(friendSnsPreference.f215051L, (String) null);
                    }
                    friendSnsPreference.mo101931M(C0966R.raw.tipsbar_icon_warning);
                    friendSnsPreference.mo101932N(0);
                    friendSnsPreference.mo101933P(8);
                } else {
                    long j = longValue;
                    int i3 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                    if (i3 == 0 || !((C99018v) C86312j.m106911c(cls2)).ej0(j)) {
                        Log.m105924i("MicroMsg.FindMoreFriendsUI", "updateSnsEntry: no right Image");
                        friendSnsPreference.mo101932N(8);
                    } else {
                        Log.m105924i("MicroMsg.FindMoreFriendsUI", "updateSnsEntry: show RightProspect Collapsed");
                        friendSnsPreference.mo101932N(0);
                        friendSnsPreference.mo101933P(0);
                        friendSnsPreference.f214218l1 = null;
                        friendSnsPreference.f215049J = -1;
                        friendSnsPreference.f214219m1 = j;
                        if (!(i3 == 0 || friendSnsPreference.f215051L == null)) {
                            ((C99018v) C86312j.m106911c(cls2)).mo138363bU(friendSnsPreference.f214219m1, friendSnsPreference.f215051L, friendSnsPreference.f121274d.hashCode());
                        }
                    }
                }
            }
            if (C99019x.m128969a() != null) {
                C100421x xVar = (C100421x) C99019x.m128969a();
                xVar.getClass();
                SnsMethodCalculate.markStartTimeMs("isHoldUnread", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
                boolean z3 = xVar.f294192e;
                SnsMethodCalculate.markEndTimeMs("isHoldUnread", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
                if (z3) {
                    i = 0;
                    this.f55704v = 0;
                } else {
                    i = 0;
                    this.f55704v = ((C100421x) C99019x.m128969a()).mo139896kD();
                }
            } else {
                i = 0;
            }
            if (this.f55704v != 0) {
                friendSnsPreference.mo101936T(i);
                int b = C45081s1.m49933b(getContext(), this.f55704v);
                friendSnsPreference.f215054P = this.f55704v + "";
                friendSnsPreference.f215055Q = b;
            }
            friendSnsPreference.mo96250V(8);
            friendSnsPreference.mo101937U(8);
            new UnreadChangeEvent().publish();
            mo25923t0("album_dyna_photo_ui_title", !Util.isNullOrNil(this.f55703u) || this.f55704v != 0);
            C61894a.f175996b = !Util.isNullOrNil(this.f55703u) || this.f55704v != 0;
            return;
        }
        this.f55702t.mo72529n("album_dyna_photo_ui_title", true);
        if (!mo25908k0()) {
            C115669n.INSTANCE.mo175913w(953, 0, 1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0e5e, code lost:
        if (com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.DiscoveryNearby.checkAvailable(getContext()) == false) goto L_0x0efe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0ef8, code lost:
        if (r0 == false) goto L_0x0efe;
     */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo25884M(pj3.C47511g r35, com.tencent.p014mm.p136ui.base.preference.Preference r36) {
        /*
            r34 = this;
            r8 = r34
            r6 = r35
            r7 = r36
            com.tencent.mm.storage.y1$a r9 = com.tencent.p014mm.storage.C72994y1.C72995a.MY_LIFE_AROUND_APP_RED_DOT_IMG_URL_STRING
            java.lang.Class<na3.g> r10 = na3.C88908g.class
            java.lang.Class<kr0.x0> r11 = kr0.C76630x0.class
            java.lang.Class<lc3.b> r12 = lc3.C10485b.class
            java.lang.Class<ht1.t1> r13 = ht1.C60200t1.class
            java.lang.Class<nv.g> r14 = p626nv.C109759g.class
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r6)
            r0.add(r7)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r1 = "com/tencent/mm/ui/AbstractTabChildPreference"
            java.lang.String r2 = "onPreferenceTreeClick"
            java.lang.String r3 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            r4 = r34
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            r0 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r3 = r7.f121285r
            r15 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            r2[r15] = r3
            long r16 = java.lang.System.currentTimeMillis()
            java.lang.Long r3 = java.lang.Long.valueOf(r16)
            r5 = 1
            java.lang.Integer r16 = java.lang.Integer.valueOf(r5)
            r2[r5] = r3
            java.lang.String r3 = "MicroMsg.FindMoreFriendsUI"
            java.lang.String r15 = "onPreferenceTreeClick key:%s stamp:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r15, r2)
            java.lang.String r2 = r7.f121285r
            java.lang.String r15 = "album_dyna_photo_ui_title"
            boolean r2 = r15.equals(r2)
            r15 = 10
            java.lang.String r0 = ""
            if (r2 == 0) goto L_0x01cc
            long r23 = java.lang.System.currentTimeMillis()
            long r5 = r8.f55684R0
            long r23 = r23 - r5
            r5 = 2000(0x7d0, double:9.88E-321)
            int r25 = (r23 > r5 ? 1 : (r23 == r5 ? 0 : -1))
            if (r25 <= 0) goto L_0x01cc
            long r3 = java.lang.System.currentTimeMillis()
            r8.f55684R0 = r3
            com.tencent.p014mm.plugin.report.service.C85405m.m105411a(r15)
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r1 = r1.mo105906u()
            r3 = 68377(0x10b19, float:9.5817E-41)
            r2 = 0
            java.lang.Object r1 = r1.mo119684e(r3, r2)
            java.lang.String r1 = (java.lang.String) r1
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            r5 = 68418(0x10b42, float:9.5874E-41)
            if (r4 != 0) goto L_0x00ab
            eb0.c r4 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r4 = r4.mo105906u()
            java.lang.Object r4 = r4.mo119684e(r5, r0)
            java.lang.String r4 = (java.lang.String) r4
            int r6 = r8.f55704v
            r7 = 3
            com.tencent.p014mm.plugin.sns.statistics.C5438v.m5358a(r7, r4, r6)
        L_0x00ab:
            com.tencent.mm.autogen.events.GetSnsResumeEvent r4 = new com.tencent.mm.autogen.events.GetSnsResumeEvent
            r4.<init>()
            r4.publish()
            com.tencent.mm.autogen.events.GetSnsResumeEvent$a r4 = r4.f264895d
            boolean r4 = r4.f264896a
            if (r4 != 0) goto L_0x00de
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            jr2.l r6 = jr2.C99019x.m128969a()
            if (r6 == 0) goto L_0x00d2
            jr2.l r6 = jr2.C99019x.m128969a()
            os2.x r6 = (os2.C100421x) r6
            int r6 = r6.mo139896kD()
            r8.f55704v = r6
            if (r6 <= 0) goto L_0x00d2
            r4 = 0
        L_0x00d2:
            eb0.c r6 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r6 = r6.mo105906u()
            r6.mo119676J(r3, r0)
            goto L_0x00df
        L_0x00de:
            r4 = 1
        L_0x00df:
            eb0.c r3 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r3 = r3.mo105906u()
            r6 = 589825(0x90001, float:8.26521E-40)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r3.mo119676J(r6, r7)
            hy.o0$a r3 = new hy.o0$a
            r3.<init>()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x0101
            int r1 = r8.f55704v
            if (r1 <= 0) goto L_0x00ff
            goto L_0x0101
        L_0x00ff:
            r1 = 0
            goto L_0x0102
        L_0x0101:
            r1 = 1
        L_0x0102:
            r3.f223347c = r1
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r1 = r1.mo105906u()
            r6 = 68384(0x10b20, float:9.5826E-41)
            r2 = 0
            java.lang.Object r1 = r1.mo119684e(r6, r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r6 = 1
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Boolean) r1, (boolean) r6)
            r3.f223348d = r1
            jr2.l r1 = jr2.C99019x.m128969a()
            os2.x r1 = (os2.C100421x) r1
            int r1 = r1.mo139896kD()
            r3.f223349e = r1
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r1 = r1.mo105906u()
            java.lang.Object r1 = r1.mo119684e(r5, r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r0)
            r3.f223350f = r0
            r3.f223351g = r4
            java.lang.Class<hy.o0> r0 = p166hy.C98567o0.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            hy.o0 r0 = (p166hy.C98567o0) r0
            android.app.Activity r1 = r34.getContext()
            r4 = 1
            r0.yb0(r1, r2, r4, r3)
            java.lang.String r0 = "sns-start"
            bp3.C79760s.m96908a(r0)
            java.lang.String r0 = "sns"
            nt1.C61894a.m72626a(r0)
            java.lang.Class<fy.j> r0 = p154fy.C87121j.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            fy.j r0 = (p154fy.C87121j) r0
            java.lang.String r1 = eb0.C75592q0.m90789s()
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            long r6 = eb0.C31543z5.m39451a()
            r9 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r9
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r6 = 0
            r3[r6] = r4
            eb0.c r4 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r4 = r4.mo105906u()
            r2 = 0
            java.lang.Object r2 = r4.mo119684e(r5, r2)
            r5 = 1
            r3[r5] = r2
            java.lang.String r2 = "%s,%s"
            java.lang.String r2 = java.lang.String.format(r2, r3)
            java.lang.String r3 = "MomentsTimelineStatus"
            r4 = 9
            r0.mo71223wE(r1, r4, r3, r2)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.String r1 = "1"
            r2 = 10958(0x2ace, float:1.5355E-41)
            r0.kvStat(r2, r1)
            java.lang.Class<em.b> r0 = p504em.C75626b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            em.b r0 = (p504em.C75626b) r0
            boolean r0 = r0.mo58021Xy()
            if (r0 != 0) goto L_0x01bb
            com.tencent.mm.sdk.platformtools.MMHandler r0 = new com.tencent.mm.sdk.platformtools.MMHandler
            r0.<init>()
            com.tencent.mm.ui.FindMoreFriendsUI$h r1 = new com.tencent.mm.ui.FindMoreFriendsUI$h
            r1.<init>(r8)
            r2 = 500(0x1f4, double:2.47E-321)
            r0.postDelayed(r1, r2)
        L_0x01bb:
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r3 = "com/tencent/mm/ui/AbstractTabChildPreference"
            java.lang.String r4 = "onPreferenceTreeClick"
            java.lang.String r6 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            r1 = r34
            r7 = 1
            r5 = r6
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r7
        L_0x01cc:
            r6 = 1
            java.lang.String r5 = r7.f121285r
            java.lang.String r2 = "find_friends_by_near"
            boolean r2 = r2.equals(r5)
            java.lang.String r5 = "find_live_friends_by_near"
            if (r2 != 0) goto L_0x0e17
            java.lang.String r2 = r7.f121285r
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x0e17
            java.lang.String r2 = r7.f121285r
            java.lang.String r15 = "find_friends_by_near_v3"
            boolean r2 = r15.equals(r2)
            if (r2 == 0) goto L_0x01ed
            goto L_0x0e17
        L_0x01ed:
            java.lang.String r2 = r7.f121285r
            java.lang.String r5 = "find_friends_by_shake"
            boolean r2 = r5.equals(r2)
            r15 = 8
            if (r2 == 0) goto L_0x02d3
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r2 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.DiscoveryShake
            android.app.Activity r3 = r34.getContext()
            boolean r2 = r2.checkAvailable(r3)
            if (r2 != 0) goto L_0x0214
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r3 = "com/tencent/mm/ui/AbstractTabChildPreference"
            java.lang.String r4 = "onPreferenceTreeClick"
            java.lang.String r5 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            r1 = r34
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r6
        L_0x0214:
            java.lang.Boolean r2 = eb0.C75592q0.m90762J()
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0253
            r2 = r35
            com.tencent.mm.ui.base.preference.Preference r2 = r2.mo72519a(r5)
            com.tencent.mm.ui.base.preference.IconPreference r2 = (com.tencent.p014mm.p136ui.base.preference.IconPreference) r2
            if (r2 == 0) goto L_0x0253
            r2.mo96250V(r15)
            eb0.c r2 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r2 = r2.mo105906u()
            r3 = 340231(0x53107, float:4.76765E-40)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r2.mo119676J(r3, r4)
            eb0.c r2 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r2 = r2.mo105906u()
            r2.mo119681a(r6)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 232(0xe8, double:1.146E-321)
            r12 = 4
            r14 = 1
            r16 = 0
            r9.idkeyStat(r10, r12, r14, r16)
        L_0x0253:
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.String r3 = "3"
            r4 = 10958(0x2ace, float:1.5355E-41)
            r2.kvStat(r4, r3)
            eb0.c r3 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r3 = r3.mo105906u()
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_IBEACON_PUSH_BEACONINFO_STRING
            r5 = 0
            java.lang.Object r3 = r3.mo119685f(r4, r5)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r3, (java.lang.String) r0)
            eb0.c r4 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r4 = r4.mo105906u()
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_IBEACON_PUSH_IS_OPEN_BOOLEAN
            java.lang.Object r4 = r4.mo119685f(r7, r5)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r5 = 0
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Boolean) r4, (boolean) r5)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x029b
            if (r3 == 0) goto L_0x029b
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x029b
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L_0x029d
        L_0x029b:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L_0x029d:
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x02b0
            r0 = 12653(0x316d, float:1.773E-41)
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r1
            r3[r6] = r1
            r2.mo160131h(r0, r3)
        L_0x02b0:
            com.tencent.mm.autogen.events.ReportClickFindFriendShakeEvent r0 = new com.tencent.mm.autogen.events.ReportClickFindFriendShakeEvent
            r0.<init>()
            r0.publish()
            android.app.Activity r0 = r34.getContext()
            java.lang.String r1 = "shake"
            java.lang.String r2 = ".ui.ShakeReportUI"
            ke3.C88144b.m109789g(r0, r1, r2)
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r3 = "com/tencent/mm/ui/AbstractTabChildPreference"
            java.lang.String r4 = "onPreferenceTreeClick"
            java.lang.String r5 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            r1 = r34
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r6
        L_0x02d3:
            r5 = r35
            java.lang.String r2 = r7.f121285r
            java.lang.String r15 = "find_friends_by_qrcode"
            boolean r2 = r15.equals(r2)
            r15 = 5
            if (r2 == 0) goto L_0x03bd
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r0 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.GlobalScan
            android.app.Activity r2 = r34.getContext()
            boolean r0 = r0.checkAvailable(r2)
            if (r0 != 0) goto L_0x02fb
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r3 = "com/tencent/mm/ui/AbstractTabChildPreference"
            java.lang.String r4 = "onPreferenceTreeClick"
            java.lang.String r5 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            r1 = r34
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r6
        L_0x02fb:
            java.lang.Class<ct.c> r0 = p327ct.C30914c.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ct.c r0 = (p327ct.C30914c) r0
            ct.d r0 = r0.mo17862sM()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_TRANSLATION_RED_DOT_STRING_SYNC
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.NEW_BANDAGE_WATCHER_SCAN_ENTRY_RED_DOT_STRING_SYNC
            l20.a r0 = (l20.C21388a) r0
            r0.mo33501j(r2, r3)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r2 = "CLICK_ENTER_SCAN"
            r0.putBoolean(r2, r6)
            java.lang.Class<uk2.c> r2 = uk2.C14201c.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            uk2.c r2 = (uk2.C14201c) r2
            uk2.b r2 = r2.mo12578gN()
            int r3 = p182kk.C61104a.m71654j()
            r2.mo6118a(r15, r3)
            android.app.Activity r2 = r34.getContext()
            boolean r0 = p182kk.C61104a.m71653i(r2, r6, r0)
            if (r0 != 0) goto L_0x03ae
            android.app.Activity r0 = r34.getContext()
            boolean r0 = p182kk.C61104a.m71665u(r0)
            if (r0 != 0) goto L_0x03ae
            android.app.Activity r0 = r34.getContext()
            boolean r0 = p182kk.C61104a.m71647c(r0, r6)
            if (r0 != 0) goto L_0x03ae
            android.app.Activity r0 = r34.getContext()
            boolean r0 = p182kk.C61104a.m71659o(r0, r6)
            if (r0 == 0) goto L_0x0356
            goto L_0x03ae
        L_0x0356:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.String r2 = "2"
            r3 = 10958(0x2ace, float:1.5355E-41)
            r0.kvStat(r3, r2)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "BaseScanUI_qrcode_right_btn_direct_album"
            r2.putExtra(r3, r6)
            java.lang.String r3 = "key_scan_entry_scene"
            r4 = 2
            r2.putExtra(r3, r4)
            java.lang.String r3 = "key_scan_report_enter_scene"
            r2.putExtra(r3, r15)
            java.lang.String r3 = "key_config_black_interval"
            r2.putExtra(r3, r6)
            java.lang.String r3 = "key_enable_multi_code"
            r2.putExtra(r3, r6)
            java.lang.String r3 = "key_scan_goods_enable_dynamic_wording"
            r2.putExtra(r3, r6)
            java.lang.String r3 = "key_enable_scan_code_product_merge"
            r2.putExtra(r3, r6)
            r3 = 11265(0x2c01, float:1.5786E-41)
            java.lang.Object[] r4 = new java.lang.Object[r6]
            r5 = 0
            r4[r5] = r1
            r0.mo160131h(r3, r4)
            android.app.Activity r0 = r34.getContext()
            java.lang.String r1 = "scanner"
            java.lang.String r3 = ".ui.BaseScanUI"
            r4 = 0
            ke3.C88144b.m109791i(r0, r1, r3, r2, r4)
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r3 = "com/tencent/mm/ui/AbstractTabChildPreference"
            java.lang.String r4 = "onPreferenceTreeClick"
            java.lang.String r5 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            r1 = r34
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r6
        L_0x03ae:
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r3 = "com/tencent/mm/ui/AbstractTabChildPreference"
            java.lang.String r4 = "onPreferenceTreeClick"
            java.lang.String r5 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            r1 = r34
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r6
        L_0x03bd:
            java.lang.String r1 = r7.f121285r
            java.lang.String r2 = "more_tab_game_recommend"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x04f0
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r0 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.DiscoveryGame
            android.app.Activity r1 = r34.getContext()
            boolean r0 = r0.checkAvailable(r1)
            if (r0 != 0) goto L_0x03e2
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r3 = "com/tencent/mm/ui/AbstractTabChildPreference"
            java.lang.String r4 = "onPreferenceTreeClick"
            java.lang.String r5 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            r1 = r34
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r6
        L_0x03e2:
            di3.d r0 = di3.C86312j.m106911c(r14)
            nv.g r0 = (p626nv.C109759g) r0
            nv.e r0 = r0.V40()
            r1 = 12
            com.tencent.mm.plugin.newtips.model.l r0 = (com.tencent.p014mm.plugin.newtips.model.C115627l) r0
            r0.mo175762a(r1)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.String r0 = "6"
            r1 = 10958(0x2ace, float:1.5355E-41)
            r9.kvStat(r1, r0)
            r10 = 848(0x350, double:4.19E-321)
            r12 = 2
            r14 = 1
            r16 = 0
            r9.idkeyStat(r10, r12, r14, r16)
            eb0.c r0 = eb0.C97625j3.m125812b()
            boolean r0 = r0.mo105883I()
            if (r0 != 0) goto L_0x042d
            android.app.Activity r0 = r34.getContext()
            r1 = 0
            nj3.C76912y0.m92771j(r0, r1)
            java.lang.String r0 = "gamelog.entry, finder, click, no sd card"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r3 = "com/tencent/mm/ui/AbstractTabChildPreference"
            java.lang.String r4 = "onPreferenceTreeClick"
            java.lang.String r5 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            r1 = r34
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r6
        L_0x042d:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r4 = "from_find_more_friend"
            r1.putExtra(r4, r6)
            r4 = 901(0x385, float:1.263E-42)
            java.lang.String r7 = "game_report_from_scene"
            r1.putExtra(r7, r4)
            boolean r4 = r8.f55667B
            if (r4 == 0) goto L_0x0465
            com.tencent.mm.autogen.events.QueryGameMessageEvent r4 = new com.tencent.mm.autogen.events.QueryGameMessageEvent
            r4.<init>()
            r4.publish()
            com.tencent.mm.ui.base.preference.Preference r2 = r5.mo72519a(r2)
            com.tencent.mm.ui.base.preference.IconPreference r2 = (com.tencent.p014mm.p136ui.base.preference.IconPreference) r2
            com.tencent.mm.autogen.events.QueryGameMessageEvent$a r5 = r4.f107710d
            java.lang.String r5 = r5.f107714d
            if (r5 == 0) goto L_0x0465
            if (r2 == 0) goto L_0x0465
            gc0.a r5 = gc0.C20828a.m22825b()
            com.tencent.mm.autogen.events.QueryGameMessageEvent$a r4 = r4.f107710d
            java.lang.String r4 = r4.f107714d
            android.widget.ImageView r2 = r2.f215051L
            r5.mo32513a(r4, r2)
        L_0x0465:
            java.lang.Class<tw0.e> r2 = tw0.C90584e.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            tw0.e r2 = (tw0.C90584e) r2
            int r4 = tw0.C90583b.f260268l
            r2.mo60856OH(r4)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            boolean r4 = r8.f55669D
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r5 = 0
            r2[r5] = r4
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r2[r6] = r4
            java.lang.String r4 = "gamelog.entry, finder, click, start game center, hasGameLifeMsg:%b, time:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r2)
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r4 = "start_time"
            r1.putExtra(r4, r2)
            java.lang.String r2 = "from_source_activity"
            android.app.Activity r3 = r34.getContext()     // Catch:{ Exception -> 0x04a9 }
            android.content.ComponentName r3 = r3.getComponentName()     // Catch:{ Exception -> 0x04a9 }
            java.lang.String r3 = r3.getClassName()     // Catch:{ Exception -> 0x04a9 }
            r1.putExtra(r2, r3)     // Catch:{ Exception -> 0x04a9 }
            goto L_0x04aa
        L_0x04a9:
        L_0x04aa:
            boolean r2 = r8.f55669D
            java.lang.String r3 = "has_game_life_chat_msg"
            r1.putExtra(r3, r2)
            int r2 = r8.f55671F
            java.lang.String r3 = "game_life_msg_count"
            r1.putExtra(r3, r2)
            android.app.Activity r2 = r34.getContext()
            java.lang.String r3 = "game"
            java.lang.String r4 = ".ui.GameCenterUI"
            r0 = 0
            ke3.C88144b.m109791i(r2, r3, r4, r1, r0)
            java.lang.Class<tt.e> r0 = p244tt.C14088e.class
            di3.d r1 = di3.C86312j.m106911c(r0)
            tt.e r1 = (p244tt.C14088e) r1
            boolean r1 = r1.mo13515b7()
            if (r1 == 0) goto L_0x04e1
            di3.d r0 = di3.C86312j.m106911c(r0)
            tt.e r0 = (p244tt.C14088e) r0
            r1 = 7
            com.tencent.liteapp.report.WxaLiteAppStartReport r2 = new com.tencent.liteapp.report.WxaLiteAppStartReport
            r2.<init>()
            r0.mo13513Wx(r1, r2)
        L_0x04e1:
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r3 = "com/tencent/mm/ui/AbstractTabChildPreference"
            java.lang.String r4 = "onPreferenceTreeClick"
            java.lang.String r5 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            r1 = r34
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r6
        L_0x04f0:
            java.lang.String r1 = r7.f121285r
            java.lang.String r2 = "find_friends_by_micromsg"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x051b
            android.app.Activity r0 = r34.getContext()
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "subapp"
            java.lang.String r3 = ".ui.pluginapp.ContactSearchUI"
            r4 = 0
            ke3.C88144b.m109791i(r0, r2, r3, r1, r4)
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r3 = "com/tencent/mm/ui/AbstractTabChildPreference"
            java.lang.String r4 = "onPreferenceTreeClick"
            java.lang.String r5 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            r1 = r34
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r6
        L_0x051b:
            java.lang.String r1 = r7.f121285r
            java.lang.String r2 = "find_friends_by_mobile"
            boolean r1 = r2.equals(r1)
            r2 = 6
            if (r1 == 0) goto L_0x05ab
            zl.l r0 = hg0.C76186t.m91534b()
            zl.l r1 = p286zl.C79396l.SUCC
            if (r0 == r1) goto L_0x0554
            android.content.Intent r0 = new android.content.Intent
            android.app.Activity r1 = r34.getContext()
            java.lang.Class<com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI> r3 = com.tencent.p014mm.plugin.account.bind.p021ui.BindMContactIntroUI.class
            r0.<init>(r1, r3)
            java.lang.String r1 = "key_upload_scene"
            r0.putExtra(r1, r2)
            android.app.Activity r1 = r34.getContext()
            com.tencent.p014mm.p136ui.MMWizardActivity.m7017L7(r1, r0)
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r3 = "com/tencent/mm/ui/AbstractTabChildPreference"
            java.lang.String r4 = "onPreferenceTreeClick"
            java.lang.String r5 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            r1 = r34
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r6
        L_0x0554:
            android.content.Intent r0 = new android.content.Intent
            android.app.Activity r1 = r34.getContext()
            java.lang.Class<com.tencent.mm.plugin.account.bind.ui.MobileFriendUI> r2 = com.tencent.p014mm.plugin.account.bind.p021ui.MobileFriendUI.class
            r0.<init>(r1, r2)
            k20.a r9 = new k20.a
            r9.<init>()
            r9.mo10233c(r0)
            java.lang.Object[] r1 = r9.mo10232b()
            java.lang.String r2 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r3 = "onPreferenceTreeClick"
            java.lang.String r4 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            java.lang.String r5 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r10 = "(Landroid/content/Intent;)V"
            r0 = r34
            r11 = 1
            r6 = r7
            r7 = r10
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            r0 = 0
            java.lang.Object r0 = r9.mo10231a(r0)
            android.content.Intent r0 = (android.content.Intent) r0
            r8.startActivity(r0)
            java.lang.String r1 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r2 = "onPreferenceTreeClick"
            java.lang.String r3 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r34
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r3 = "com/tencent/mm/ui/AbstractTabChildPreference"
            java.lang.String r4 = "onPreferenceTreeClick"
            java.lang.String r5 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            r1 = r34
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r11
        L_0x05ab:
            java.lang.String r1 = r7.f121285r
            java.lang.String r6 = "find_friends_by_facebook"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x060a
            android.content.Intent r0 = new android.content.Intent
            android.app.Activity r1 = r34.getContext()
            java.lang.Class<com.tencent.mm.plugin.account.ui.MMFBFriendUI> r2 = com.tencent.p014mm.plugin.account.p024ui.MMFBFriendUI.class
            r0.<init>(r1, r2)
            k20.a r9 = new k20.a
            r9.<init>()
            r9.mo10233c(r0)
            java.lang.Object[] r1 = r9.mo10232b()
            java.lang.String r2 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r3 = "onPreferenceTreeClick"
            java.lang.String r4 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r0 = r34
            r10 = 1
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            r0 = 0
            java.lang.Object r0 = r9.mo10231a(r0)
            android.content.Intent r0 = (android.content.Intent) r0
            r8.startActivity(r0)
            java.lang.String r1 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r2 = "onPreferenceTreeClick"
            java.lang.String r3 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r34
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r3 = "com/tencent/mm/ui/AbstractTabChildPreference"
            java.lang.String r4 = "onPreferenceTreeClick"
            java.lang.String r5 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            r1 = r34
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r10
        L_0x060a:
            r6 = 1
            java.lang.String r1 = r7.f121285r
            java.lang.String r15 = "settings_mm_card_package"
            boolean r1 = r15.equals(r1)
            if (r1 == 0) goto L_0x063a
            java.lang.String r0 = "enter to cardhome"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            com.tencent.mm.autogen.events.GotoCardHomePageEvent r0 = new com.tencent.mm.autogen.events.GotoCardHomePageEvent
            r0.<init>()
            com.tencent.mm.autogen.events.GotoCardHomePageEvent$a r1 = r0.f107606d
            android.app.Activity r2 = r34.getContext()
            r1.f107608a = r2
            r0.publish()
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r3 = "com/tencent/mm/ui/AbstractTabChildPreference"
            java.lang.String r4 = "onPreferenceTreeClick"
            java.lang.String r5 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            r1 = r34
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r6
        L_0x063a:
            java.lang.String r1 = r7.f121285r
            java.lang.String r15 = "jd_market_entrance"
            boolean r1 = r1.equals(r15)
            r15 = 1112(0x458, float:1.558E-42)
            r2 = -1
            if (r1 == 0) goto L_0x0819
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r1 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.DiscoveryShop
            android.app.Activity r4 = r34.getContext()
            boolean r1 = r1.checkAvailable(r4)
            if (r1 != 0) goto L_0x0662
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r3 = "com/tencent/mm/ui/AbstractTabChildPreference"
            java.lang.String r4 = "onPreferenceTreeClick"
            java.lang.String r5 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            r1 = r34
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r6
        L_0x0662:
            di3.d r1 = di3.C86312j.m106911c(r14)
            nv.g r1 = (p626nv.C109759g) r1
            nv.e r1 = r1.V40()
            com.tencent.mm.plugin.newtips.model.l r1 = (com.tencent.p014mm.plugin.newtips.model.C115627l) r1
            r4 = 11
            r1.mo175762a(r4)
            r1 = 9
            ie3.C87716k.f253994a = r1
            com.tencent.mm.pluginsdk.platformtools.d$a r1 = com.tencent.p014mm.pluginsdk.platformtools.C96796d.m124292a()
            if (r1 == 0) goto L_0x080a
            com.tencent.mm.plugin.subapp.jdbiz.h r1 = com.tencent.p014mm.plugin.subapp.jdbiz.C96463h.yx0()
            java.lang.String r1 = r1.Bx0()
            com.tencent.mm.plugin.subapp.jdbiz.h r4 = com.tencent.p014mm.plugin.subapp.jdbiz.C96463h.yx0()
            com.tencent.mm.plugin.subapp.jdbiz.e r4 = r4.Cx0()
            r5 = 2
            java.lang.Object[] r9 = new java.lang.Object[r5]
            r5 = 0
            r9[r5] = r1
            r9[r6] = r4
            java.lang.String r5 = "jumpUrl %s, jumpWeapp %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r9)
            int r5 = r34.mo25901e0()
            com.tencent.mm.plugin.subapp.jdbiz.h r9 = com.tencent.p014mm.plugin.subapp.jdbiz.C96463h.yx0()
            r9.vx0()
            com.tencent.mm.plugin.subapp.jdbiz.h r9 = com.tencent.p014mm.plugin.subapp.jdbiz.C96463h.yx0()
            r9.wx0()
            com.tencent.mm.ui.base.preference.IconPreference r7 = (com.tencent.p014mm.p136ui.base.preference.IconPreference) r7
            r7.f215054P = r0
            r7.f215055Q = r2
            java.lang.String r0 = r4.f282212a
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r0 = r0 ^ r6
            r2 = 11179(0x2bab, float:1.5665E-41)
            r7 = 2131824665(0x7f111019, float:1.9282164E38)
            r9 = 2131831685(0x7f112b85, float:1.9296403E38)
            if (r0 == 0) goto L_0x0797
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r1 = r4.f282212a
            r10 = 0
            r0[r10] = r1
            java.lang.String r1 = "jump to jd weapp %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r1, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r12 = r4.f282212a
            r1[r10] = r12
            com.tencent.mm.plugin.subapp.jdbiz.h r10 = com.tencent.p014mm.plugin.subapp.jdbiz.C96463h.yx0()
            com.tencent.mm.plugin.subapp.jdbiz.f r10 = r10.Dx0()
            java.lang.String r10 = r10.f282216b
            r1[r6] = r10
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r10 = 2
            r1[r10] = r5
            r0.mo160131h(r2, r1)
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r1 = h81.C32735h.C32737c.clicfg_appbrand_dialog_optimize_switch
            int r0 = r0.mo58779Qe(r1, r6)
            if (r0 != r6) goto L_0x0700
            r5 = 1
            goto L_0x0701
        L_0x0700:
            r5 = 0
        L_0x0701:
            if (r5 == 0) goto L_0x074c
            di0.o r0 = new di0.o
            r0.<init>()
            java.lang.String r1 = r4.f282212a
            r0.f250929a = r1
            int r1 = r4.f282214c
            r0.f250932d = r1
            java.lang.String r1 = r4.f282213b
            r0.f250934f = r1
            r0.f250939k = r15
            boolean r1 = r34.mo25909l0()
            if (r1 == 0) goto L_0x073d
            com.tencent.mm.plugin.appbrand.api.WeAppOpenDeclarePromptBundle r1 = new com.tencent.mm.plugin.appbrand.api.WeAppOpenDeclarePromptBundle
            r1.<init>()
            r1.f157919d = r6
            java.lang.String r2 = r8.getString(r7)
            r1.f157921f = r2
            java.lang.String r2 = r8.getString(r9)
            r1.f157922g = r2
            r2 = 2131821556(0x7f1103f4, float:1.9275859E38)
            java.lang.String r2 = r8.getString(r2)
            r1.f157923h = r2
            r2 = 0
            r1.f157924i = r2
            r0.f250951w = r1
        L_0x073d:
            di3.d r1 = di3.C86312j.m106911c(r11)
            kr0.x0 r1 = (kr0.C76630x0) r1
            android.app.Activity r2 = r34.getContext()
            r1.mo106898tv(r2, r0)
            goto L_0x080a
        L_0x074c:
            java.lang.String r0 = "onClickOfJDEntrance clicfg_appbrand_dialog_optimize_switch close"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r0 = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject
            r0.<init>()
            r0.f245533f = r15
            boolean r1 = r34.mo25909l0()
            if (r1 == 0) goto L_0x0775
            android.app.Activity r1 = r34.getContext()
            java.lang.String r2 = r8.getString(r9)
            java.lang.String r3 = r8.getString(r7)
            com.tencent.mm.ui.h0 r5 = new com.tencent.mm.ui.h0
            r5.<init>(r8, r4, r0)
            r0 = 0
            nj3.C76879j.m92713G(r1, r2, r3, r0, r5)
            goto L_0x080a
        L_0x0775:
            di3.d r1 = di3.C86312j.m106911c(r11)
            r18 = r1
            kr0.x0 r18 = (kr0.C76630x0) r18
            android.app.Activity r19 = r34.getContext()
            java.lang.String r1 = r4.f282212a
            r22 = 0
            int r2 = r4.f282214c
            java.lang.String r3 = r4.f282213b
            java.lang.String r21 = ""
            r20 = r1
            r23 = r2
            r24 = r3
            r25 = r0
            r18.Ko0(r19, r20, r21, r22, r23, r24, r25)
            goto L_0x080a
        L_0x0797:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r0 != 0) goto L_0x080a
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r4 = 0
            r0[r4] = r1
            java.lang.String r10 = "jump to jd webview %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r10, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r4] = r1
            com.tencent.mm.plugin.subapp.jdbiz.h r4 = com.tencent.p014mm.plugin.subapp.jdbiz.C96463h.yx0()
            com.tencent.mm.plugin.subapp.jdbiz.f r4 = r4.Dx0()
            java.lang.String r4 = r4.f282216b
            r3[r6] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r5 = 2
            r3[r5] = r4
            r0.mo160131h(r2, r3)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r2 = "rawUrl"
            r0.putExtra(r2, r1)
            java.lang.String r1 = "useJs"
            r0.putExtra(r1, r6)
            java.lang.String r1 = "vertical_scroll"
            r0.putExtra(r1, r6)
            java.lang.String r1 = "minimize_secene"
            r0.putExtra(r1, r6)
            java.lang.String r1 = "KPublisherId"
            java.lang.String r2 = "jd_store"
            r0.putExtra(r1, r2)
            com.tencent.mm.ui.i0 r1 = new com.tencent.mm.ui.i0
            r1.<init>(r8, r0)
            boolean r0 = r34.mo25909l0()
            if (r0 == 0) goto L_0x0807
            android.app.Activity r0 = r34.getContext()
            java.lang.String r2 = r8.getString(r9)
            java.lang.String r3 = r8.getString(r7)
            com.tencent.mm.ui.j0 r4 = new com.tencent.mm.ui.j0
            r4.<init>(r8, r1)
            r1 = 0
            nj3.C76879j.m92713G(r0, r2, r3, r1, r4)
            goto L_0x080a
        L_0x0807:
            r1.run()
        L_0x080a:
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r3 = "com/tencent/mm/ui/AbstractTabChildPreference"
            java.lang.String r4 = "onPreferenceTreeClick"
            java.lang.String r5 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            r1 = r34
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r6
        L_0x0819:
            java.lang.String r1 = r7.f121285r
            java.lang.String r15 = "ip_call_entrance"
            boolean r1 = r15.equals(r1)
            r26 = 4
            if (r1 == 0) goto L_0x095f
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r1 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.DiscoveryWeChatOut
            android.app.Activity r3 = r34.getContext()
            boolean r1 = r1.checkAvailable(r3)
            if (r1 != 0) goto L_0x0840
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r3 = "com/tencent/mm/ui/AbstractTabChildPreference"
            java.lang.String r4 = "onPreferenceTreeClick"
            java.lang.String r5 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            r1 = r34
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r6
        L_0x0840:
            com.tencent.mm.ui.base.preference.Preference r1 = r5.mo72519a(r15)
            com.tencent.mm.ui.base.preference.IconPreference r1 = (com.tencent.p014mm.p136ui.base.preference.IconPreference) r1
            r3 = 8
            r1.mo96250V(r3)
            r1.mo101937U(r3)
            r5 = 0
            r1.mo101940Z(r5)
            r1.mo101934R(r3)
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r1 = r1.mo105906u()
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERFINO_IPCALL_HAS_ENTRY_FIND_WORDING_STRING
            java.lang.Object r1 = r1.mo119685f(r3, r0)
            java.lang.String r1 = (java.lang.String) r1
            eb0.c r5 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r5 = r5.mo105906u()
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERFINO_IPCALL_HAS_ENTRY_FIND_REDDOT_NEWXML_BOOLEAN
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            java.lang.Object r5 = r5.mo119685f(r7, r9)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != r6) goto L_0x088d
            q12.C12033h.m11735a(r6, r2, r2)
            eb0.c r5 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r5 = r5.mo105906u()
            r5.mo119677K(r7, r9)
            r5 = 1
            goto L_0x088e
        L_0x088d:
            r5 = 0
        L_0x088e:
            eb0.c r7 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r7 = r7.mo105906u()
            com.tencent.mm.storage.y1$a r9 = com.tencent.p014mm.storage.C72994y1.C72995a.USERFINO_IPCALL_HAS_ENTRY_FIND_REDDOT_INT
            java.lang.Object r7 = r7.mo119685f(r9, r4)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            k40.a r10 = f40.C86709a0.m107533q(r12)
            lc3.b r10 = (lc3.C10485b) r10
            pj.f r10 = r10.vh0()
            java.lang.String r11 = "WCOEntranceRedDot"
            r13 = 0
            int r10 = r10.mo107404b(r11, r13)
            if (r7 >= r10) goto L_0x08f1
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r7 = 6
            java.lang.Object[] r10 = new java.lang.Object[r7]
            r10[r13] = r4
            r10[r6] = r4
            r7 = 2
            r10[r7] = r16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7 = 3
            r10[r7] = r2
            r10[r26] = r2
            r7 = 5
            r10[r7] = r2
            r2 = 13254(0x33c6, float:1.8573E-41)
            r5.mo160131h(r2, r10)
            eb0.c r2 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r2 = r2.mo105906u()
            k40.a r5 = f40.C86709a0.m107533q(r12)
            lc3.b r5 = (lc3.C10485b) r5
            pj.f r5 = r5.vh0()
            r7 = 0
            int r5 = r5.mo107404b(r11, r7)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2.mo119677K(r9, r5)
            r5 = 1
        L_0x08f1:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0902
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r1 = r1.mo105906u()
            r1.mo119677K(r3, r0)
        L_0x0902:
            if (r5 == 0) goto L_0x090c
            com.tencent.mm.autogen.events.UnreadChangeEvent r0 = new com.tencent.mm.autogen.events.UnreadChangeEvent
            r0.<init>()
            r0.publish()
        L_0x090c:
            boolean r0 = p182kk.C61104a.m71644D()
            if (r0 != 0) goto L_0x0944
            boolean r0 = p182kk.C61104a.m71648d()
            if (r0 == 0) goto L_0x0919
            goto L_0x0944
        L_0x0919:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 12061(0x2f1d, float:1.6901E-41)
            r2 = 6
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r16
            r2[r6] = r4
            r3 = 2
            r2[r3] = r4
            r3 = 3
            r2[r3] = r4
            r2[r26] = r4
            r3 = 5
            r2[r3] = r4
            r0.mo160131h(r1, r2)
            android.app.Activity r0 = r34.getContext()
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "ipcall"
            java.lang.String r3 = ".ui.IPCallAddressUI"
            ke3.C88144b.m109790h(r0, r2, r3, r1)
            goto L_0x0950
        L_0x0944:
            android.app.Activity r0 = r34.getContext()
            r1 = 2131833192(0x7f113168, float:1.929946E38)
            r2 = 0
            r3 = 0
            nj3.C76879j.m92743n(r0, r1, r3, r2, r2)
        L_0x0950:
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r3 = "com/tencent/mm/ui/AbstractTabChildPreference"
            java.lang.String r4 = "onPreferenceTreeClick"
            java.lang.String r5 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            r1 = r34
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r6
        L_0x095f:
            r1 = 6
            java.lang.String r5 = r7.f121285r
            java.lang.String r15 = "app_brand_entrance"
            boolean r5 = r15.equals(r5)
            if (r5 == 0) goto L_0x09b5
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r0 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.DiscoveryAppbrand
            android.app.Activity r1 = r34.getContext()
            boolean r0 = r0.checkAvailable(r1)
            if (r0 != 0) goto L_0x0985
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r3 = "com/tencent/mm/ui/AbstractTabChildPreference"
            java.lang.String r4 = "onPreferenceTreeClick"
            java.lang.String r5 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            r1 = r34
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r6
        L_0x0985:
            di3.d r0 = di3.C86312j.m106911c(r14)
            nv.g r0 = (p626nv.C109759g) r0
            nv.e r0 = r0.V40()
            com.tencent.mm.plugin.newtips.model.l r0 = (com.tencent.p014mm.plugin.newtips.model.C115627l) r0
            r1 = 43
            r0.mo175762a(r1)
            java.lang.Class<kr0.z0> r0 = kr0.C76633z0.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            kr0.z0 r0 = (kr0.C76633z0) r0
            android.app.Activity r1 = r34.getContext()
            r2 = 0
            r0.mo94230XU(r1, r6, r2)
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r3 = "com/tencent/mm/ui/AbstractTabChildPreference"
            java.lang.String r4 = "onPreferenceTreeClick"
            java.lang.String r5 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            r1 = r34
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r6
        L_0x09b5:
            java.lang.String r5 = r7.f121285r
            java.lang.String r15 = "find_friends_by_search"
            boolean r5 = r15.equals(r5)
            if (r5 == 0) goto L_0x09fd
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r0 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.DiscoverySearch
            android.app.Activity r1 = r34.getContext()
            boolean r0 = r0.checkAvailable(r1)
            if (r0 != 0) goto L_0x09da
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r3 = "com/tencent/mm/ui/AbstractTabChildPreference"
            java.lang.String r4 = "onPreferenceTreeClick"
            java.lang.String r5 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            r1 = r34
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r6
        L_0x09da:
            r34.mo25906i0()
            di3.d r0 = di3.C86312j.m106911c(r14)
            nv.g r0 = (p626nv.C109759g) r0
            nv.e r0 = r0.V40()
            com.tencent.mm.plugin.newtips.model.l r0 = (com.tencent.p014mm.plugin.newtips.model.C115627l) r0
            r1 = 9
            r0.mo175762a(r1)
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r3 = "com/tencent/mm/ui/AbstractTabChildPreference"
            java.lang.String r4 = "onPreferenceTreeClick"
            java.lang.String r5 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            r1 = r34
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r6
        L_0x09fd:
            java.lang.String r5 = r7.f121285r
            java.lang.String r15 = "find_friends_by_look"
            boolean r5 = r15.equals(r5)
            if (r5 == 0) goto L_0x0a43
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r0 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.DiscoveryLooks
            android.app.Activity r2 = r34.getContext()
            boolean r0 = r0.checkAvailable(r2)
            if (r0 != 0) goto L_0x0a22
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r3 = "com/tencent/mm/ui/AbstractTabChildPreference"
            java.lang.String r4 = "onPreferenceTreeClick"
            java.lang.String r5 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            r1 = r34
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r6
        L_0x0a22:
            r34.mo25905h0()
            di3.d r0 = di3.C86312j.m106911c(r14)
            nv.g r0 = (p626nv.C109759g) r0
            nv.e r0 = r0.V40()
            com.tencent.mm.plugin.newtips.model.l r0 = (com.tencent.p014mm.plugin.newtips.model.C115627l) r0
            r0.mo175762a(r1)
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r3 = "com/tencent/mm/ui/AbstractTabChildPreference"
            java.lang.String r4 = "onPreferenceTreeClick"
            java.lang.String r5 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            r1 = r34
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r6
        L_0x0a43:
            java.lang.String r5 = r7.f121285r
            java.lang.String r15 = "my_life_around"
            boolean r5 = r15.equals(r5)
            if (r5 == 0) goto L_0x0c81
            boolean r5 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.isCoolassistEnv()
            if (r5 != 0) goto L_0x0b61
            boolean r5 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r5 == 0) goto L_0x0a5f
            boolean r5 = p156gj.C87203t.m108279o()
            if (r5 != 0) goto L_0x0a5f
            goto L_0x0b61
        L_0x0a5f:
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r7 = 0
            r1[r7] = r16
            long r27 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            java.lang.Long r7 = java.lang.Long.valueOf(r27)
            r1[r6] = r7
            com.tencent.mm.ui.FindMoreFriendsUI$s r7 = r8.f55699Z
            int r7 = r7.ordinal()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r13 = 2
            r1[r13] = r7
            f40.o r7 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r7 = r7.mo121142i()
            java.lang.Object r7 = r7.mo119685f(r9, r0)
            r9 = 3
            r1[r9] = r7
            f40.o r7 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r7 = r7.mo121142i()
            com.tencent.mm.storage.y1$a r9 = com.tencent.p014mm.storage.C72994y1.C72995a.MY_LIFE_AROUND_APP_RED_DOT_TEXT_STRING
            java.lang.Object r7 = r7.mo119685f(r9, r0)
            r1[r26] = r7
            f40.o r7 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r7 = r7.mo121142i()
            com.tencent.mm.storage.y1$a r9 = com.tencent.p014mm.storage.C72994y1.C72995a.MY_LIFE_AROUND_APP_RED_DOT_TYPE_STRING
            java.lang.String r13 = "0"
            java.lang.Object r7 = r7.mo119685f(r9, r13)
            r9 = 5
            r1[r9] = r7
            r7 = 17065(0x42a9, float:2.3913E-41)
            r5.mo160131h(r7, r1)
            com.tencent.mm.ui.FindMoreFriendsUI$s r1 = r8.f55699Z
            com.tencent.mm.ui.FindMoreFriendsUI$s r5 = com.tencent.p014mm.p136ui.FindMoreFriendsUI.C19665s.TYPE_NEW_HINT
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0ae2
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.MY_LIFE_AROUND_APP_NEW_RED_DOT_TAG_BOOLEAN
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r1.mo119677K(r5, r7)
            com.tencent.mm.ui.FindMoreFriendsUI$s r1 = com.tencent.p014mm.p136ui.FindMoreFriendsUI.C19665s.TYPE_NONE
            r8.f55699Z = r1
            com.tencent.mm.ui.base.preference.a r1 = r8.f55702t
            com.tencent.mm.ui.base.preference.Preference r1 = r1.mo72519a(r15)
            com.tencent.mm.ui.base.preference.IconPreference r1 = (com.tencent.p014mm.p136ui.base.preference.IconPreference) r1
            r5 = 8
            r1.mo101936T(r5)
            r1.f215054P = r0
            r1.f215055Q = r2
        L_0x0ae2:
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.MY_LIFE_AROUND_APP_RED_DOT_TAG_BOOLEAN
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.Object r0 = r0.mo119685f(r1, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            di3.d r1 = di3.C86312j.m106911c(r10)
            na3.g r1 = (na3.C88908g) r1
            java.lang.String r2 = "labs_nearbylife"
            r1.open(r2)
            di3.d r1 = di3.C86312j.m106911c(r10)
            na3.g r1 = (na3.C88908g) r1
            java.lang.String r28 = r1.mo123295sB(r2)
            di3.d r1 = di3.C86312j.m106911c(r10)
            na3.g r1 = (na3.C88908g) r1
            int r30 = r1.mo123292c8(r2)
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r1 = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject
            r1.<init>()
            r2 = 1112(0x458, float:1.558E-42)
            r1.f245533f = r2
            k40.a r2 = f40.C86709a0.m107533q(r12)
            lc3.b r2 = (lc3.C10485b) r2
            pj.f r2 = r2.vh0()
            java.lang.String r5 = "LifeAppEntranceBringRedDot"
            r7 = 0
            int r2 = r2.mo107404b(r5, r7)
            java.lang.Object[] r5 = new java.lang.Object[r6]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            r5[r7] = r9
            java.lang.String r7 = "withRedTag: %d."
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r7, r5)
            if (r2 == 0) goto L_0x0b48
            if (r0 == 0) goto L_0x0b48
            java.lang.String r5 = "?hasRedDot=true"
            r32 = r5
            goto L_0x0b4a
        L_0x0b48:
            r32 = 0
        L_0x0b4a:
            di3.d r0 = di3.C86312j.m106911c(r11)
            r26 = r0
            kr0.x0 r26 = (kr0.C76630x0) r26
            android.app.Activity r27 = r34.getContext()
            r29 = 0
            r31 = 0
            r33 = r1
            r26.Ko0(r27, r28, r29, r30, r31, r32, r33)
            goto L_0x0c61
        L_0x0b61:
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r7 = 0
            r1[r7] = r16
            long r27 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            java.lang.Long r7 = java.lang.Long.valueOf(r27)
            r1[r6] = r7
            com.tencent.mm.ui.FindMoreFriendsUI$s r7 = r8.f55699Z
            int r7 = r7.ordinal()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r13 = 2
            r1[r13] = r7
            f40.o r7 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r7 = r7.mo121142i()
            java.lang.Object r7 = r7.mo119685f(r9, r0)
            r9 = 3
            r1[r9] = r7
            f40.o r7 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r7 = r7.mo121142i()
            com.tencent.mm.storage.y1$a r9 = com.tencent.p014mm.storage.C72994y1.C72995a.MY_LIFE_AROUND_APP_RED_DOT_TEXT_STRING
            java.lang.Object r7 = r7.mo119685f(r9, r0)
            r1[r26] = r7
            f40.o r7 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r7 = r7.mo121142i()
            com.tencent.mm.storage.y1$a r9 = com.tencent.p014mm.storage.C72994y1.C72995a.MY_LIFE_AROUND_APP_RED_DOT_TYPE_STRING
            java.lang.String r13 = "0"
            java.lang.Object r7 = r7.mo119685f(r9, r13)
            r9 = 5
            r1[r9] = r7
            r7 = 17065(0x42a9, float:2.3913E-41)
            r5.mo160131h(r7, r1)
            com.tencent.mm.ui.FindMoreFriendsUI$s r1 = r8.f55699Z
            com.tencent.mm.ui.FindMoreFriendsUI$s r5 = com.tencent.p014mm.p136ui.FindMoreFriendsUI.C19665s.TYPE_NEW_HINT
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0be4
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.MY_LIFE_AROUND_APP_NEW_RED_DOT_TAG_BOOLEAN
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r1.mo119677K(r5, r7)
            com.tencent.mm.ui.FindMoreFriendsUI$s r1 = com.tencent.p014mm.p136ui.FindMoreFriendsUI.C19665s.TYPE_NONE
            r8.f55699Z = r1
            com.tencent.mm.ui.base.preference.a r1 = r8.f55702t
            com.tencent.mm.ui.base.preference.Preference r1 = r1.mo72519a(r15)
            com.tencent.mm.ui.base.preference.IconPreference r1 = (com.tencent.p014mm.p136ui.base.preference.IconPreference) r1
            r5 = 8
            r1.mo101936T(r5)
            r1.f215054P = r0
            r1.f215055Q = r2
        L_0x0be4:
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.MY_LIFE_AROUND_APP_RED_DOT_TAG_BOOLEAN
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.Object r0 = r0.mo119685f(r1, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            di3.d r1 = di3.C86312j.m106911c(r10)
            na3.g r1 = (na3.C88908g) r1
            java.lang.String r2 = "labs_nearbylife"
            r1.open(r2)
            di3.d r1 = di3.C86312j.m106911c(r10)
            na3.g r1 = (na3.C88908g) r1
            java.lang.String r28 = r1.mo123295sB(r2)
            di3.d r1 = di3.C86312j.m106911c(r10)
            na3.g r1 = (na3.C88908g) r1
            int r30 = r1.mo123292c8(r2)
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r1 = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject
            r1.<init>()
            r2 = 1112(0x458, float:1.558E-42)
            r1.f245533f = r2
            k40.a r2 = f40.C86709a0.m107533q(r12)
            lc3.b r2 = (lc3.C10485b) r2
            pj.f r2 = r2.vh0()
            java.lang.String r5 = "LifeAppEntranceBringRedDot"
            r7 = 0
            int r2 = r2.mo107404b(r5, r7)
            java.lang.Object[] r5 = new java.lang.Object[r6]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            r5[r7] = r9
            java.lang.String r7 = "withRedTag: %d."
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r7, r5)
            if (r2 == 0) goto L_0x0c4a
            if (r0 == 0) goto L_0x0c4a
            java.lang.String r5 = "?hasRedDot=true"
            r32 = r5
            goto L_0x0c4c
        L_0x0c4a:
            r32 = 0
        L_0x0c4c:
            di3.d r0 = di3.C86312j.m106911c(r11)
            r26 = r0
            kr0.x0 r26 = (kr0.C76630x0) r26
            android.app.Activity r27 = r34.getContext()
            r29 = 0
            r31 = 0
            r33 = r1
            r26.Ko0(r27, r28, r29, r30, r31, r32, r33)
        L_0x0c61:
            di3.d r0 = di3.C86312j.m106911c(r14)
            nv.g r0 = (p626nv.C109759g) r0
            nv.e r0 = r0.V40()
            com.tencent.mm.plugin.newtips.model.l r0 = (com.tencent.p014mm.plugin.newtips.model.C115627l) r0
            r1 = 10
            r0.mo175762a(r1)
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r3 = "com/tencent/mm/ui/AbstractTabChildPreference"
            java.lang.String r4 = "onPreferenceTreeClick"
            java.lang.String r5 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            r1 = r34
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r6
        L_0x0c81:
            java.lang.String r1 = r7.f121285r
            java.lang.String r2 = "find_friends_by_finder"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0d9d
            di3.d r1 = di3.C86312j.m106911c(r13)
            if (r1 == 0) goto L_0x0d9d
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r1 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.DiscoveryChannels
            android.app.Activity r2 = r34.getContext()
            boolean r1 = r1.checkAvailable(r2)
            if (r1 != 0) goto L_0x0cac
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r3 = "com/tencent/mm/ui/AbstractTabChildPreference"
            java.lang.String r4 = "onPreferenceTreeClick"
            java.lang.String r5 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            r1 = r34
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r6
        L_0x0cac:
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_FIND_MORE_UI_RED_DOT_BOOLEAN_SYNC
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r1.mo119677K(r2, r4)
            ot1.a r1 = ot1.C11767a.f34453a
            java.lang.String r2 = "entrance"
            boolean r1 = r1.mo11659a(r2)
            if (r1 == 0) goto L_0x0cd4
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r3 = "com/tencent/mm/ui/AbstractTabChildPreference"
            java.lang.String r4 = "onPreferenceTreeClick"
            java.lang.String r5 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            r1 = r34
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r6
        L_0x0cd4:
            di3.d r1 = di3.C86312j.m106911c(r13)
            ht1.t1 r1 = (ht1.C60200t1) r1
            boolean r1 = r1.mo76873sF()
            if (r1 != 0) goto L_0x0cf5
            java.lang.String r0 = "second check finderEntry"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r3 = "com/tencent/mm/ui/AbstractTabChildPreference"
            java.lang.String r4 = "onPreferenceTreeClick"
            java.lang.String r5 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            r1 = r34
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r6
        L_0x0cf5:
            java.lang.Class<com.tencent.mm.plugin.magicbrush.h0> r1 = com.tencent.p014mm.plugin.magicbrush.C30196h0.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            com.tencent.mm.plugin.magicbrush.h0 r1 = (com.tencent.p014mm.plugin.magicbrush.C30196h0) r1
            java.lang.String r2 = "enterFinderFromMoreFriends"
            r1.mo57219iB(r2)
            java.lang.Class<dr.b> r1 = p496dr.C31264b.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            dr.b r1 = (p496dr.C31264b) r1
            te3.ly4 r1 = r1.ur0()
            if (r1 == 0) goto L_0x0d16
            int r1 = r1.f137722d
            if (r1 != r6) goto L_0x0d16
            r5 = 1
            goto L_0x0d17
        L_0x0d16:
            r5 = 0
        L_0x0d17:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "needShowOverSeaDialog"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r1)
            if (r5 == 0) goto L_0x0d69
            r1 = 2131829403(0x7f11229b, float:1.9291774E38)
            java.lang.String r1 = r8.getString(r1)
            java.lang.Class<dr.b> r2 = p496dr.C31264b.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            dr.b r2 = (p496dr.C31264b) r2
            te3.ly4 r2 = r2.ur0()
            java.lang.String r2 = r2.f137723e
            if (r2 != 0) goto L_0x0d45
            goto L_0x0d46
        L_0x0d45:
            r0 = r2
        L_0x0d46:
            java.lang.Class<ht1.a5> r2 = ht1.C76243a5.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ht1.a5 r2 = (ht1.C76243a5) r2
            android.app.Activity r3 = r34.getContext()
            com.tencent.mm.ui.FindMoreFriendsUI$i r4 = new com.tencent.mm.ui.FindMoreFriendsUI$i
            r4.<init>()
            r2.Sb0(r3, r1, r0, r4)
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r3 = "com/tencent/mm/ui/AbstractTabChildPreference"
            java.lang.String r4 = "onPreferenceTreeClick"
            java.lang.String r5 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            r1 = r34
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r6
        L_0x0d69:
            di3.d r0 = di3.C86312j.m106911c(r13)
            ht1.t1 r0 = (ht1.C60200t1) r0
            ht1.b4 r0 = r0.Nt0()
            int r0 = r0.mo77247S5()
            r1 = 5
            if (r0 == r1) goto L_0x0d8a
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = r34.mo25902f0()
            if (r0 == 0) goto L_0x0d85
            r0 = 0
            r8.mo25912n0(r0, r6)
            goto L_0x0d8e
        L_0x0d85:
            r0 = 0
            r8.mo25912n0(r0, r0)
            goto L_0x0d8e
        L_0x0d8a:
            r0 = 0
            r8.mo25912n0(r6, r0)
        L_0x0d8e:
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r3 = "com/tencent/mm/ui/AbstractTabChildPreference"
            java.lang.String r4 = "onPreferenceTreeClick"
            java.lang.String r5 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            r1 = r34
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r6
        L_0x0d9d:
            java.lang.String r0 = r7.f121285r
            java.lang.String r1 = "find_friends_by_finder_live"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0dc8
            java.lang.String r0 = r7.f121285r
            java.lang.String r1 = "find_friends_by_finder_live_above_look"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0db8
            di3.d r0 = di3.C86312j.m106911c(r13)
            if (r0 == 0) goto L_0x0db8
            goto L_0x0dc8
        L_0x0db8:
            r0 = 0
            java.lang.String r2 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r3 = "com/tencent/mm/ui/AbstractTabChildPreference"
            java.lang.String r4 = "onPreferenceTreeClick"
            java.lang.String r5 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            r1 = r34
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            r0 = 0
            return r0
        L_0x0dc8:
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r0 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.DiscoveryChannelsLive
            android.app.Activity r1 = r34.getContext()
            boolean r0 = r0.checkAvailable(r1)
            if (r0 != 0) goto L_0x0de3
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r3 = "com/tencent/mm/ui/AbstractTabChildPreference"
            java.lang.String r4 = "onPreferenceTreeClick"
            java.lang.String r5 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            r1 = r34
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r6
        L_0x0de3:
            java.lang.Class<com.tencent.mm.plugin.magicbrush.h0> r0 = com.tencent.p014mm.plugin.magicbrush.C30196h0.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.magicbrush.h0 r0 = (com.tencent.p014mm.plugin.magicbrush.C30196h0) r0
            java.lang.String r1 = "enterFinderFromMoreFriends"
            r0.mo57219iB(r1)
            java.lang.Class<ir.n> r0 = p565ir.C60606n.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ir.n r0 = (p565ir.C60606n) r0
            boolean r0 = r0.Q30()
            if (r0 == 0) goto L_0x0e02
            r34.mo25917p0()
            goto L_0x0e05
        L_0x0e02:
            r34.mo25914o0()
        L_0x0e05:
            fn3.C59263a.m69192d()
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r3 = "com/tencent/mm/ui/AbstractTabChildPreference"
            java.lang.String r4 = "onPreferenceTreeClick"
            java.lang.String r5 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            r1 = r34
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r6
        L_0x0e17:
            java.lang.String r0 = r7.f121285r
            boolean r0 = r5.equals(r0)
            r0 = r0 ^ r6
            java.lang.Class<aw.d> r1 = p447aw.C103918d.class
            r2 = 1001(0x3e9, float:1.403E-42)
            t91.C64208c.f181966p = r2
            boolean r2 = uc3.C78146a.m94353b()
            if (r2 == 0) goto L_0x0e54
            java.lang.Class<gt1.b> r2 = gt1.C20838b.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            gt1.b r2 = (gt1.C20838b) r2
            boolean r2 = r2.mo32540ag()
            if (r2 == 0) goto L_0x0e46
            fn3.a r9 = fn3.C59263a.f169449a
            java.lang.String r14 = fn3.C59263a.m69190b()
            r10 = 2
            r12 = 2
            r9.mo84408e(r10, r12, r14)
            goto L_0x0e62
        L_0x0e46:
            fn3.a r18 = fn3.C59263a.f169449a
            java.lang.String r23 = fn3.C59263a.m69190b()
            r19 = 2
            r21 = 0
            r18.mo84408e(r19, r21, r23)
            goto L_0x0e62
        L_0x0e54:
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r2 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.DiscoveryNearby
            android.app.Activity r5 = r34.getContext()
            boolean r2 = r2.checkAvailable(r5)
            if (r2 != 0) goto L_0x0e62
            goto L_0x0efe
        L_0x0e62:
            if (r0 == 0) goto L_0x0efb
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r2 = 274436(0x43004, float:3.84567E-40)
            r4 = 0
            java.lang.Object r0 = r0.mo119684e(r2, r4)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = nc0.C76850a.m92639k(r0)
            java.lang.String r2 = "android.permission.ACCESS_FINE_LOCATION"
            if (r0 == 0) goto L_0x0ed0
            di3.d r0 = di3.C86312j.m106911c(r1)
            aw.d r0 = (p447aw.C103918d) r0
            androidx.fragment.app.FragmentActivity r3 = r34.thisActivity()
            boolean r0 = r0.Lb0(r3, r2)
            if (r0 != 0) goto L_0x0efb
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            java.lang.Object r0 = r0.mo119685f(r3, r4)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0ec0
            androidx.fragment.app.FragmentActivity r0 = r34.thisActivity()
            r1 = 2131832233(0x7f112da9, float:1.9297514E38)
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()
            r4 = 0
            r2[r4] = r3
            java.lang.String r1 = r8.getString(r1, r2)
            r2 = 30764(0x782c, float:4.311E-41)
            qg0.C12215a.m11778c(r0, r1, r2, r6)
            goto L_0x0efe
        L_0x0ec0:
            di3.d r0 = di3.C86312j.m106911c(r1)
            aw.d r0 = (p447aw.C103918d) r0
            androidx.fragment.app.FragmentActivity r1 = r34.getActivity()
            r3 = 66
            r0.mo125790zt(r1, r2, r3)
            goto L_0x0efe
        L_0x0ed0:
            di3.d r0 = di3.C86312j.m106911c(r1)
            r9 = r0
            aw.d r9 = (p447aw.C103918d) r9
            androidx.fragment.app.FragmentActivity r10 = r34.thisActivity()
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            java.lang.String[] r11 = new java.lang.String[]{r2, r0}
            r12 = 66
            r13 = 0
            r14 = 0
            boolean r0 = r9.Uu0(r10, r11, r12, r13, r14)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r4 = 0
            r1[r4] = r2
            java.lang.String r2 = "summerper checkPermission checkLocation[%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r1)
            if (r0 != 0) goto L_0x0efb
            goto L_0x0efe
        L_0x0efb:
            r34.mo25898a0()
        L_0x0efe:
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r3 = "com/tencent/mm/ui/AbstractTabChildPreference"
            java.lang.String r4 = "onPreferenceTreeClick"
            java.lang.String r5 = "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"
            r1 = r34
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.FindMoreFriendsUI.mo25884M(pj3.g, com.tencent.mm.ui.base.preference.Preference):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:125:0x0624  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x08b0  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x094b  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0997  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0a20  */
    /* JADX WARNING: Removed duplicated region for block: B:203:? A[RETURN, SYNTHETIC] */
    /* renamed from: M0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25885M0() {
        /*
            r34 = this;
            r8 = r34
            java.lang.Class<nv.g> r0 = p626nv.C109759g.class
            java.lang.Class<kr0.h0> r1 = kr0.C88274h0.class
            java.lang.Class<ht1.t1> r2 = ht1.C60200t1.class
            java.lang.Class<ht1.a5> r3 = ht1.C76243a5.class
            java.lang.Class<ky2.i> r4 = ky2.C10432i.class
            r9 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r8.f55677L = r9
            long r5 = java.lang.System.currentTimeMillis()
            r8.f55701s = r5
            android.view.View r5 = r8.f55678M
            r7 = 8
            if (r5 == 0) goto L_0x0061
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            r6.mo10233c(r11)
            java.lang.Object[] r12 = r6.mo10232b()
            java.lang.String r13 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r14 = "updateStatus"
            java.lang.String r15 = "()V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r5
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r6 = r6.mo10231a(r9)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r5.setVisibility(r6)
            java.lang.String r12 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r13 = "updateStatus"
            java.lang.String r14 = "()V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
        L_0x0061:
            boolean r5 = r8.f215105h
            if (r5 == 0) goto L_0x0a33
            boolean r5 = r34.isAdded()
            if (r5 != 0) goto L_0x006d
            goto L_0x0a33
        L_0x006d:
            r11 = 6
            java.lang.Object[] r5 = new java.lang.Object[r11]
            int r6 = r8.f55674I
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r9] = r6
            int r6 = eb0.C75592q0.m90787q()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r12 = 1
            r5[r12] = r6
            long r13 = r8.f55675J
            java.lang.Long r6 = java.lang.Long.valueOf(r13)
            r13 = 2
            r5[r13] = r6
            long r14 = eb0.C75592q0.m90781k()
            java.lang.Long r6 = java.lang.Long.valueOf(r14)
            r14 = 3
            r5[r14] = r6
            int r6 = r8.f55676K
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r15 = 4
            r5[r15] = r6
            int r6 = eb0.C75592q0.m90785o()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r16 = 5
            r5[r16] = r6
            java.lang.String r6 = "MicroMsg.FindMoreFriendsUI"
            java.lang.String r11 = "status %d (%d), extStatus %d (%d), pluginFlag %d (%d)"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r11, r5)
            r34.mo25883L0()
            boolean r5 = r34.mo25911m0()
            com.tencent.mm.ui.base.preference.a r11 = r8.f55702t
            r7 = r5 ^ 1
            java.lang.String r14 = "find_friends_by_finder"
            r11.mo72529n(r14, r7)
            if (r5 == 0) goto L_0x014a
            r8.f55690U0 = r12
            int r5 = r8.f55677L
            int r5 = r5 + r12
            r8.f55677L = r5
            com.tencent.mm.ui.base.preference.a r5 = r8.f55702t
            com.tencent.mm.ui.base.preference.Preference r5 = r5.mo72519a(r14)
            com.tencent.mm.ui.FinderIconViewTipPreference r5 = (com.tencent.p014mm.p136ui.FinderIconViewTipPreference) r5
            r5.f201755u1 = r12
            android.view.View r7 = r5.f201747m1
            di3.d r11 = di3.C86312j.m106911c(r2)
            ht1.t1 r11 = (ht1.C60200t1) r11
            if (r7 == 0) goto L_0x00f6
            android.widget.TextView r15 = r5.f215072Y0
            android.view.ViewGroup r13 = r5.f55805w1
            r11.ft0(r7, r15, r13)
            android.app.Activity r13 = r34.getContext()
            r15 = 2131830028(0x7f11250c, float:1.9293042E38)
            java.lang.String r13 = r13.getString(r15)
            r7.setContentDescription(r13)
        L_0x00f6:
            ht1.b4 r7 = r11.Nt0()
            r7.mo77258b6()
            java.lang.Class<ir.n> r7 = p565ir.C60606n.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            ir.n r7 = (p565ir.C60606n) r7
            r7.mo85004Ft()
            androidx.lifecycle.a0<com.tencent.mm.plugin.finder.extension.reddot.a> r7 = r8.f55688T0
            if (r7 != 0) goto L_0x0133
            di3.d r7 = di3.C86312j.m106911c(r3)
            ht1.a5 r7 = (ht1.C76243a5) r7
            com.tencent.mm.ui.m0 r13 = new com.tencent.mm.ui.m0
            r13.<init>(r8, r5, r11)
            androidx.lifecycle.a0 r5 = r7.mo13240jb(r13)
            r8.f55688T0 = r5
            di3.d r5 = di3.C86312j.m106911c(r3)
            ht1.a5 r5 = (ht1.C76243a5) r5
            androidx.lifecycle.a0<com.tencent.mm.plugin.finder.extension.reddot.a> r7 = r8.f55688T0
            r5.mo13214Lv(r8, r7)
            di3.d r5 = di3.C86312j.m106911c(r3)
            ht1.a5 r5 = (ht1.C76243a5) r5
            androidx.lifecycle.a0<com.tencent.mm.plugin.finder.extension.reddot.a> r7 = r8.f55688T0
            r5.mo13220SB(r8, r7)
        L_0x0133:
            di3.d r5 = di3.C86312j.m106911c(r3)
            ht1.a5 r5 = (ht1.C76243a5) r5
            androidx.lifecycle.a0<com.tencent.mm.plugin.finder.extension.reddot.a> r7 = r8.f55688T0
            r5.mo13243oc(r7)
            di3.d r5 = di3.C86312j.m106911c(r3)
            ht1.a5 r5 = (ht1.C76243a5) r5
            androidx.lifecycle.a0<com.tencent.mm.plugin.finder.extension.reddot.a> r7 = r8.f55688T0
            r5.tc0(r7)
            goto L_0x0167
        L_0x014a:
            boolean r5 = r8.f55690U0
            if (r5 == 0) goto L_0x0165
            di3.d r5 = di3.C86312j.m106911c(r3)
            ht1.a5 r5 = (ht1.C76243a5) r5
            boolean r5 = r5.mo13213Jy()
            if (r5 != 0) goto L_0x0165
            java.lang.Class<ht1.t3> r5 = ht1.C60204t3.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            ht1.t3 r5 = (ht1.C60204t3) r5
            r5.mo78748Pm(r12)
        L_0x0165:
            r8.f55690U0 = r9
        L_0x0167:
            xl3.c r5 = r8.f55692V0
            if (r5 != 0) goto L_0x0176
            xl3.c r5 = new xl3.c
            android.app.Activity r7 = r34.getContext()
            r5.<init>(r7, r8)
            r8.f55692V0 = r5
        L_0x0176:
            xl3.c r5 = r8.f55692V0
            r5.getClass()
            java.lang.Class<gt1.b> r7 = gt1.C20838b.class
            di3.d r11 = di3.C86312j.m106911c(r7)
            gt1.b r11 = (gt1.C20838b) r11
            boolean r11 = r11.mo32539RP()
            r5.f66379c = r11
            boolean r11 = r5.mo36506c()
            java.lang.String r13 = "FinderLiveEntryPreferenceMgr"
            if (r11 != 0) goto L_0x0199
            java.lang.String r2 = "updateFinderLiveEntry return for isEnableFinderLiveEntry."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r2)
            goto L_0x0295
        L_0x0199:
            com.tencent.mm.ui.FindMoreFriendsUI r11 = r5.f66378b
            boolean r11 = r11.f55668C
            if (r11 == 0) goto L_0x01bd
            di3.d r7 = di3.C86312j.m106911c(r7)
            gt1.b r7 = (gt1.C20838b) r7
            boolean r7 = r7.mo32539RP()
            if (r7 == 0) goto L_0x01ae
            r22 = 3
            goto L_0x01b0
        L_0x01ae:
            r22 = 1
        L_0x01b0:
            r27 = r22
            fn3.a r24 = fn3.C59263a.f169449a
            r25 = 1
            java.lang.String r29 = fn3.C59263a.m69189a()
            r24.mo84408e(r25, r27, r29)
        L_0x01bd:
            com.tencent.mm.ui.FindMoreFriendsUI r7 = r5.f66378b
            com.tencent.mm.ui.base.preference.a r7 = r7.f55702t
            if (r7 == 0) goto L_0x01cc
            java.lang.String r11 = r5.mo36505b()
            com.tencent.mm.ui.base.preference.Preference r7 = r7.mo72519a(r11)
            goto L_0x01cd
        L_0x01cc:
            r7 = 0
        L_0x01cd:
            boolean r11 = r7 instanceof com.tencent.p014mm.p136ui.FinderIconViewTipPreference
            if (r11 == 0) goto L_0x01d4
            com.tencent.mm.ui.FinderIconViewTipPreference r7 = (com.tencent.p014mm.p136ui.FinderIconViewTipPreference) r7
            goto L_0x01d5
        L_0x01d4:
            r7 = 0
        L_0x01d5:
            if (r7 != 0) goto L_0x01df
            java.lang.String r2 = "updateFinderLiveEntry return for preference."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r2)
            goto L_0x0295
        L_0x01df:
            r5.mo36507d()
            r5.f66381e = r7
            androidx.lifecycle.a0<com.tencent.mm.plugin.finder.extension.reddot.a> r11 = r5.f66380d
            r15 = 32
            java.lang.String r9 = "observeFinderLiveRedDot preference:"
            if (r11 == 0) goto L_0x0251
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r9)
            r11.append(r7)
            r11.append(r15)
            int r12 = r7.hashCode()
            r11.append(r12)
            java.lang.String r12 = " return for observing."
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r11)
            boolean r11 = r5.f66382f
            boolean r12 = r5.f66379c
            if (r11 == r12) goto L_0x0283
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r9)
            r11.append(r7)
            r11.append(r15)
            int r7 = r7.hashCode()
            r11.append(r7)
            java.lang.String r7 = " refresh red not, enableFinderLiveEntryAboveLook:"
            r11.append(r7)
            boolean r7 = r5.f66379c
            r11.append(r7)
            java.lang.String r7 = " lastIsEnableFinderLiveEntryAboveLook:"
            r11.append(r7)
            boolean r7 = r5.f66382f
            r11.append(r7)
            java.lang.String r7 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r7)
            di3.d r3 = di3.C86312j.m106911c(r3)
            ht1.a5 r3 = (ht1.C76243a5) r3
            r3.mo13241je()
            boolean r3 = r5.f66379c
            r5.f66382f = r3
            goto L_0x0283
        L_0x0251:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r9)
            r11.append(r7)
            r11.append(r15)
            int r7 = r7.hashCode()
            r11.append(r7)
            java.lang.String r7 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r7)
            xl3.b r7 = new xl3.b
            r7.<init>(r5)
            r5.f66380d = r7
            di3.d r3 = di3.C86312j.m106911c(r3)
            ht1.a5 r3 = (ht1.C76243a5) r3
            com.tencent.mm.ui.FindMoreFriendsUI r9 = r5.f66378b
            r3.mo13231Zj(r9, r7)
            boolean r3 = r5.f66379c
            r5.f66382f = r3
        L_0x0283:
            di3.d r2 = di3.C86312j.m106911c(r2)
            ht1.t1 r2 = (ht1.C60200t1) r2
            ht1.b4 r2 = r2.Nt0()
            boolean r2 = r2.mo77235K5()
            r5.mo36508e(r2)
            r9 = 1
        L_0x0295:
            if (r9 == 0) goto L_0x029d
            int r2 = r8.f55677L
            r3 = 1
            int r2 = r2 + r3
            r8.f55677L = r2
        L_0x029d:
            r2 = 1048576(0x100000, double:5.180654E-318)
            boolean r2 = r8.mo25907j0(r2)
            java.lang.String r3 = "scanner"
            ke3.C88144b.m109788f(r3)
            r3 = 2
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r3 = r2 ^ 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r7 = 0
            r5[r7] = r3
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r9 = 1
            r5[r9] = r3
            java.lang.String r11 = "openScan %s, plugin installed %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r11, r5)
            java.lang.String r11 = "find_friends_by_qrcode"
            if (r2 != 0) goto L_0x0309
            com.tencent.mm.ui.base.preference.a r2 = r8.f55702t
            r2.mo72529n(r11, r7)
            int r2 = r8.f55677L
            int r2 = r2 + r9
            r8.f55677L = r2
            java.lang.Class<ct.c> r2 = p327ct.C30914c.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ct.c r2 = (p327ct.C30914c) r2
            ct.d r2 = r2.mo17862sM()
            com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_TRANSLATION_RED_DOT_STRING_SYNC
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.NEW_BANDAGE_WATCHER_SCAN_ENTRY_RED_DOT_STRING_SYNC
            l20.a r2 = (l20.C21388a) r2
            boolean r2 = r2.mo33496d(r5, r7)
            if (r2 == 0) goto L_0x02f7
            com.tencent.mm.ui.base.preference.a r2 = r8.f55702t
            com.tencent.mm.ui.base.preference.Preference r2 = r2.mo72519a(r11)
            com.tencent.mm.ui.base.preference.NormalIconPreference r2 = (com.tencent.p014mm.p136ui.base.preference.NormalIconPreference) r2
            r5 = 0
            r2.mo96250V(r5)
            r2 = 1
            r8.mo25923t0(r11, r2)
            goto L_0x0320
        L_0x02f7:
            r2 = 1
            r5 = 0
            com.tencent.mm.ui.base.preference.a r7 = r8.f55702t
            com.tencent.mm.ui.base.preference.Preference r7 = r7.mo72519a(r11)
            com.tencent.mm.ui.base.preference.NormalIconPreference r7 = (com.tencent.p014mm.p136ui.base.preference.NormalIconPreference) r7
            r9 = 4
            r7.mo96250V(r9)
            r8.mo25923t0(r11, r5)
            goto L_0x0320
        L_0x0309:
            r2 = 1
            com.tencent.mm.ui.base.preference.a r5 = r8.f55702t
            r5.mo72529n(r11, r2)
            boolean r2 = r34.mo25908k0()
            if (r2 != 0) goto L_0x0320
            com.tencent.mm.plugin.report.service.n r25 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r26 = 953(0x3b9, double:4.71E-321)
            r28 = 1
            r30 = 1
            r25.mo175913w(r26, r28, r30)
        L_0x0320:
            r34.mo25881K0()
            r34.mo25880J0()
            r34.mo25879I0()
            r12 = 4194304(0x400000, double:2.0722615E-317)
            boolean r2 = r8.mo25907j0(r12)
            di3.d r5 = di3.C86312j.m106911c(r4)
            ky2.i r5 = (ky2.C10432i) r5
            boolean r5 = r5.mo10750e()
            r7 = 2
            java.lang.Object[] r9 = new java.lang.Object[r7]
            r7 = r2 ^ 1
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r12 = 0
            r9[r12] = r7
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            r13 = 1
            r9[r13] = r7
            java.lang.String r7 = "openShoppingEntry %s, isTeenMode:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r9)
            java.lang.String r9 = "jd_market_entrance"
            if (r2 != 0) goto L_0x035c
            if (r5 != 0) goto L_0x035c
            r8.mo25877G0(r12)
            goto L_0x0372
        L_0x035c:
            com.tencent.mm.ui.base.preference.a r2 = r8.f55702t
            r2.mo72529n(r9, r13)
            boolean r2 = r34.mo25908k0()
            if (r2 != 0) goto L_0x0372
            com.tencent.mm.plugin.report.service.n r25 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r26 = 953(0x3b9, double:4.71E-321)
            r28 = 7
            r30 = 1
            r25.mo175913w(r26, r28, r30)
        L_0x0372:
            sw1.m r2 = sw1.C48477m.C13789a.m13091a()
            if (r2 == 0) goto L_0x0381
            android.app.Activity r5 = r34.getContext()
            boolean r2 = r2.ju0(r5)
            goto L_0x0382
        L_0x0381:
            r2 = 0
        L_0x0382:
            r12 = 8388608(0x800000, double:4.144523E-317)
            boolean r5 = r8.mo25907j0(r12)
            di3.d r7 = di3.C86312j.m106911c(r4)
            ky2.i r7 = (ky2.C10432i) r7
            boolean r7 = r7.mo10750e()
            java.lang.String r12 = "more_tab_game_recommend"
            if (r2 == 0) goto L_0x03d5
            if (r5 != 0) goto L_0x03d5
            if (r7 != 0) goto L_0x03d5
            boolean r13 = r8.f55668C
            if (r13 == 0) goto L_0x03a7
            com.tencent.mm.autogen.events.ShowGameCenterEntranceEvent r13 = new com.tencent.mm.autogen.events.ShowGameCenterEntranceEvent
            r13.<init>()
            r13.publish()
        L_0x03a7:
            r13 = 3
            java.lang.Object[] r15 = new java.lang.Object[r13]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r13 = 0
            r15[r13] = r2
            r2 = 1
            r5 = r5 ^ r2
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r15[r2] = r5
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)
            r7 = 2
            r15[r7] = r5
            java.lang.String r5 = "gamelog.entry, finder, show, shouldShowGame %s, openGameEntry %s, isTeenMode:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r5, r15)
            com.tencent.mm.ui.base.preference.a r5 = r8.f55702t
            r5.mo72529n(r12, r13)
            r34.mo25876F0()
            int r5 = r8.f55677L
            int r5 = r5 + r2
            r8.f55677L = r5
            r25 = r14
            goto L_0x040b
        L_0x03d5:
            r13 = 0
            r25 = r14
            r15 = 3
            java.lang.Object[] r14 = new java.lang.Object[r15]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r14[r13] = r2
            r2 = 1
            r5 = r5 ^ r2
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r14[r2] = r5
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)
            r7 = 2
            r14[r7] = r5
            java.lang.String r5 = "gamelog.entry, finder, hide, shouldShowGame %s, openGameEntry %s, isTeenMode:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r5, r14)
            com.tencent.mm.ui.base.preference.a r5 = r8.f55702t
            r5.mo72529n(r12, r2)
            boolean r2 = r34.mo25908k0()
            if (r2 != 0) goto L_0x040b
            com.tencent.mm.plugin.report.service.n r26 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r27 = 953(0x3b9, double:4.71E-321)
            r29 = 8
            r31 = 1
            r26.mo175913w(r27, r29, r31)
        L_0x040b:
            com.tencent.mm.autogen.events.ShouldShowAppBrandEntranceInFindMoreEvent r2 = new com.tencent.mm.autogen.events.ShouldShowAppBrandEntranceInFindMoreEvent
            r2.<init>()
            com.tencent.mm.autogen.events.ShouldShowAppBrandEntranceInFindMoreEvent$a r5 = r2.f236288d
            r7 = 1
            r5.f236290a = r7
            r2.publish()
            com.tencent.mm.autogen.events.ShouldShowAppBrandEntranceInFindMoreEvent$b r2 = r2.f236289e
            boolean r2 = r2.f236291a
            r13 = 16777216(0x1000000, double:8.289046E-317)
            boolean r5 = r8.mo25907j0(r13)
            di3.d r7 = di3.C86312j.m106911c(r4)
            ky2.i r7 = (ky2.C10432i) r7
            boolean r7 = r7.mo10750e()
            di3.d r4 = di3.C86312j.m106911c(r4)
            ky2.i r4 = (ky2.C10432i) r4
            int r4 = r4.Oh0()
            r13 = 4
            java.lang.Object[] r14 = new java.lang.Object[r13]
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r2)
            r15 = 0
            r14[r15] = r13
            r13 = r5 ^ 1
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r15 = 1
            r14[r15] = r13
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r7)
            r15 = 2
            r14[r15] = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r4)
            r19 = 3
            r14[r19] = r13
            java.lang.String r13 = "shouldShowMiniProgram %s, openMiniProgramEntry %s, isTeenMode: %b, miniProgramOption: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r13, r14)
            java.lang.String r13 = "app_brand_entrance"
            if (r2 == 0) goto L_0x04c0
            if (r5 != 0) goto L_0x04c0
            if (r7 == 0) goto L_0x046a
            if (r4 != r15) goto L_0x046a
            goto L_0x04c0
        L_0x046a:
            di3.d r2 = di3.C86312j.m106911c(r1)
            kr0.h0 r2 = (kr0.C88274h0) r2
            r2.mo113312xm()
            int r2 = r8.f55677L
            r4 = 1
            int r2 = r2 + r4
            r8.f55677L = r2
            com.tencent.mm.ui.base.preference.a r2 = r8.f55702t
            r4 = 0
            r2.mo72529n(r13, r4)
            com.tencent.mm.ui.base.preference.a r2 = r8.f55702t
            com.tencent.mm.ui.base.preference.Preference r2 = r2.mo72519a(r13)
            com.tencent.mm.plugin.newtips.NormalIconNewTipPreference r2 = (com.tencent.p014mm.plugin.newtips.NormalIconNewTipPreference) r2
            di3.d r4 = di3.C86312j.m106911c(r0)
            nv.g r4 = (p626nv.C109759g) r4
            nv.e r4 = r4.V40()
            com.tencent.mm.plugin.newtips.model.l r4 = (com.tencent.p014mm.plugin.newtips.model.C115627l) r4
            r4.mo175770k(r2)
            com.tencent.mm.plugin.newtips.model.l r4 = gc2.C116945b.yx0()
            jc2.c r5 = new jc2.c
            java.lang.String r2 = r2.f201748n1
            r5.<init>((java.lang.String) r2)
            android.util.Pair r2 = r4.mo175764c(r5)
            java.lang.Object r2 = r2.second
            if (r2 == 0) goto L_0x04ab
            r2 = 1
            goto L_0x04ac
        L_0x04ab:
            r2 = 0
        L_0x04ac:
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            r14 = 0
            r5[r14] = r7
            java.lang.String r7 = "updateMiniProgramEntry, wantShowRedDot:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r5)
            r8.mo25923t0(r13, r2)
            goto L_0x04d7
        L_0x04c0:
            r4 = 1
            com.tencent.mm.ui.base.preference.a r2 = r8.f55702t
            r2.mo72529n(r13, r4)
            boolean r2 = r34.mo25908k0()
            if (r2 != 0) goto L_0x04d7
            com.tencent.mm.plugin.report.service.n r26 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r27 = 953(0x3b9, double:4.71E-321)
            r29 = 9
            r31 = 1
            r26.mo175913w(r27, r29, r31)
        L_0x04d7:
            boolean r2 = com.tencent.p014mm.plugin.ipcall.C4611d.m4902a()
            r4 = 33554432(0x2000000, double:1.6578092E-316)
            boolean r4 = r8.mo25907j0(r4)
            r5 = 2
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            r14 = 0
            r7[r14] = r5
            r5 = r4 ^ 1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r14 = 1
            r7[r14] = r5
            java.lang.String r5 = "showShowWeChatOut %s, openWeChatOutEntry %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r5, r7)
            java.lang.String r5 = "ip_call_entrance"
            java.lang.String r15 = ""
            if (r2 == 0) goto L_0x05be
            if (r4 != 0) goto L_0x05be
            int r2 = r8.f55677L
            int r2 = r2 + r14
            r8.f55677L = r2
            com.tencent.mm.ui.base.preference.a r2 = r8.f55702t
            r4 = 0
            r2.mo72529n(r5, r4)
            com.tencent.mm.ui.base.preference.a r2 = r8.f55702t
            com.tencent.mm.ui.base.preference.Preference r2 = r2.mo72519a(r5)
            com.tencent.mm.ui.base.preference.IconPreference r2 = (com.tencent.p014mm.p136ui.base.preference.IconPreference) r2
            eb0.c r4 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r4 = r4.mo105906u()
            com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERFINO_IPCALL_HAS_ENTRY_FIND_REDDOT_INT
            java.lang.Object r4 = r4.mo119685f(r5, r10)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Class<lc3.b> r5 = lc3.C10485b.class
            k40.a r5 = f40.C86709a0.m107533q(r5)
            lc3.b r5 = (lc3.C10485b) r5
            pj.f r5 = r5.vh0()
            java.lang.String r14 = "WCOEntranceRedDot"
            r7 = 0
            int r5 = r5.mo107404b(r14, r7)
            if (r4 >= r5) goto L_0x0553
            r2.mo101936T(r7)
            r4 = 2131821611(0x7f11042b, float:1.927597E38)
            java.lang.String r5 = r8.getString(r4)
            r2.f215054P = r5
            r4 = 2131234251(0x7f080dcb, float:1.8084662E38)
            r2.f215055Q = r4
            r4 = 8
            goto L_0x0558
        L_0x0553:
            r4 = 8
            r2.mo101936T(r4)
        L_0x0558:
            r2.mo101934R(r4)
            eb0.c r5 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r5 = r5.mo105906u()
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERFINO_IPCALL_HAS_ENTRY_FIND_REDDOT_NEWXML_BOOLEAN
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            java.lang.Object r5 = r5.mo119685f(r7, r14)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r7 = 1
            if (r5 != r7) goto L_0x057c
            r2.mo101940Z(r7)
            r2.mo101936T(r4)
            r4 = 1
            goto L_0x0581
        L_0x057c:
            r4 = 0
            r2.mo101940Z(r4)
            r4 = 0
        L_0x0581:
            eb0.c r5 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r5 = r5.mo105906u()
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERFINO_IPCALL_HAS_ENTRY_FIND_WORDING_STRING
            java.lang.Object r5 = r5.mo119685f(r7, r15)
            java.lang.String r5 = (java.lang.String) r5
            r7 = -7566196(0xffffffffff8c8c8c, float:NaN)
            r14 = -1
            r2.mo101939Y(r5, r14, r7)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x059f
            r4 = 1
        L_0x059f:
            if (r4 == 0) goto L_0x05a8
            r4 = 0
            r2.mo101937U(r4)
            r7 = 8
            goto L_0x05ad
        L_0x05a8:
            r7 = 8
            r2.mo101937U(r7)
        L_0x05ad:
            com.tencent.mm.ui.base.preference.PreferenceSmallCategory r2 = new com.tencent.mm.ui.base.preference.PreferenceSmallCategory
            android.app.Activity r4 = r34.getContext()
            r5 = 0
            r2.<init>(r4, r5)
            com.tencent.mm.ui.base.preference.a r4 = r8.f55702t
            r5 = -1
            r4.mo72524h(r2, r5)
            goto L_0x05c6
        L_0x05be:
            r7 = 8
            com.tencent.mm.ui.base.preference.a r2 = r8.f55702t
            r4 = 1
            r2.mo72529n(r5, r4)
        L_0x05c6:
            r34.mo25897Z()
            com.tencent.mm.storage.y1$a r14 = com.tencent.p014mm.storage.C72994y1.C72995a.MY_LIFE_AROUND_APP_RED_DOT_IMG_URL_STRING
            com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.MY_LIFE_AROUND_APP_RED_DOT_TEXT_STRING
            kr0.g1 r2 = kr0.C88273g1.FIND_MORE_NEARBY
            java.lang.Class<na3.g> r4 = na3.C88908g.class
            di3.d r18 = di3.C86312j.m106911c(r4)
            r7 = r18
            na3.g r7 = (na3.C88908g) r7
            r18 = r13
            java.lang.String r13 = "labs_nearbylife"
            boolean r7 = r7.Ib0(r13)
            r30 = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r31 = r12
            java.lang.String r12 = "updateMyLifeAroundEntrance isInExperiment: "
            r9.append(r12)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r9)
            if (r7 == 0) goto L_0x061f
            di3.d r4 = di3.C86312j.m106911c(r4)
            na3.g r4 = (na3.C88908g) r4
            boolean r4 = r4.mo123296x(r13)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "updateMyLifeAroundEntrance isOpen: "
            r7.append(r9)
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            if (r4 == 0) goto L_0x061f
            r4 = 1
            goto L_0x0620
        L_0x061f:
            r4 = 0
        L_0x0620:
            java.lang.String r7 = "my_life_around"
            if (r4 == 0) goto L_0x08b0
            java.lang.Class<h81.h> r4 = h81.C32735h.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            h81.h r4 = (h81.C32735h) r4
            h81.h$c r9 = h81.C32735h.C32737c.clicfg_nearby_app_preload_type
            r12 = 0
            int r4 = r4.mo58779Qe(r9, r12)
            r9 = 1
            java.lang.Object[] r13 = new java.lang.Object[r9]
            java.lang.Integer r23 = java.lang.Integer.valueOf(r4)
            r13[r12] = r23
            java.lang.String r12 = "life around preload, preload: %d."
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r12, r13)
            if (r9 != r4) goto L_0x064d
            di3.d r1 = di3.C86312j.m106911c(r1)
            kr0.h0 r1 = (kr0.C88274h0) r1
            r1.mo113305TH(r2)
            goto L_0x0659
        L_0x064d:
            r9 = 2
            if (r9 != r4) goto L_0x0659
            di3.d r1 = di3.C86312j.m106911c(r1)
            kr0.h0 r1 = (kr0.C88274h0) r1
            r1.mo113305TH(r2)
        L_0x0659:
            com.tencent.mm.ui.base.preference.a r1 = r8.f55702t
            com.tencent.mm.ui.base.preference.Preference r1 = r1.mo72519a(r7)
            r9 = r1
            com.tencent.mm.plugin.newtips.NormalIconNewTipPreference r9 = (com.tencent.p014mm.plugin.newtips.NormalIconNewTipPreference) r9
            r1 = 2131820546(0x7f110002, float:1.927381E38)
            java.lang.String r1 = r8.getString(r1)
            r9.mo69924H(r1)
            int r1 = r8.f55677L
            r2 = 1
            int r1 = r1 + r2
            r8.f55677L = r1
            com.tencent.mm.ui.base.preference.a r1 = r8.f55702t
            r2 = 0
            r1.mo72529n(r7, r2)
            com.tencent.mm.ui.base.preference.a r1 = r8.f55702t
            r9.mo96254e0(r1)
            di3.d r0 = di3.C86312j.m106911c(r0)
            nv.g r0 = (p626nv.C109759g) r0
            nv.e r0 = r0.V40()
            com.tencent.mm.plugin.newtips.model.l r0 = (com.tencent.p014mm.plugin.newtips.model.C115627l) r0
            r0.mo175770k(r9)
            gt.w$a r0 = r8.f55682Q0
            com.tencent.mm.ui.d0 r1 = new com.tencent.mm.ui.d0
            r1.<init>(r8)
            r9.f201752r1 = r0
            r9.f201753s1 = r1
            r9.mo96252c0()
            java.lang.Class<gt.w> r0 = p158gt.C76057w.class
            java.lang.Class<gt.i> r1 = p158gt.C8451i.class
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.MY_LIFE_AROUND_APP_NEW_RED_DOT_TAG_BOOLEAN
            java.lang.Object r2 = r2.mo119685f(r4, r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r12 = r2.booleanValue()
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r12)
            r4 = 0
            r3[r4] = r2
            java.lang.String r2 = "updateMyLifeAroundEntrance showNewRedDot %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r3)
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.MY_LIFE_AROUND_APP_RED_DOT_TAG_BOOLEAN
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            java.lang.Object r2 = r2.mo119685f(r3, r4)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            r7 = 0
            r4[r7] = r3
            java.lang.String r3 = "updateMyLifeAroundEntrance showRedDot %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r3, r4)
            if (r12 != 0) goto L_0x0701
            if (r2 == 0) goto L_0x06ff
            com.tencent.mm.ui.FindMoreFriendsUI$s r3 = r8.f55699Z
            com.tencent.mm.ui.FindMoreFriendsUI$s r4 = com.tencent.p014mm.p136ui.FindMoreFriendsUI.C19665s.TYPE_IMG_TEXT
            if (r3 == r4) goto L_0x0701
            com.tencent.mm.ui.FindMoreFriendsUI$s r4 = com.tencent.p014mm.p136ui.FindMoreFriendsUI.C19665s.TYPE_IMG
            if (r3 == r4) goto L_0x0701
            com.tencent.mm.ui.FindMoreFriendsUI$s r4 = com.tencent.p014mm.p136ui.FindMoreFriendsUI.C19665s.TYPE_TEXT
            if (r3 == r4) goto L_0x0701
            com.tencent.mm.ui.FindMoreFriendsUI$s r4 = com.tencent.p014mm.p136ui.FindMoreFriendsUI.C19665s.TYPE_NORMAL
            if (r3 != r4) goto L_0x06ff
            goto L_0x0701
        L_0x06ff:
            r3 = 0
            goto L_0x0702
        L_0x0701:
            r3 = 1
        L_0x0702:
            boolean r3 = r9.mo64138m(r3)
            if (r3 == 0) goto L_0x0709
            goto L_0x075f
        L_0x0709:
            if (r12 == 0) goto L_0x0727
            com.tencent.mm.ui.FindMoreFriendsUI$s r3 = com.tencent.p014mm.p136ui.FindMoreFriendsUI.C19665s.TYPE_NEW_HINT
            r8.f55699Z = r3
            r3 = 0
            r9.mo101936T(r3)
            r3 = 2131821611(0x7f11042b, float:1.927597E38)
            java.lang.String r3 = r8.getString(r3)
            r9.f215054P = r3
            r3 = 2131234251(0x7f080dcb, float:1.8084662E38)
            r9.f215055Q = r3
            com.tencent.mm.plugin.newtips.model.n r3 = com.tencent.p014mm.plugin.newtips.model.C115631n.MMNEWTIPS_SHOWTYPE_NEW
            r4 = 1
            r9.mo64136k(r3, r4)
        L_0x0727:
            if (r2 == 0) goto L_0x083d
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            java.lang.Object r2 = r2.mo119685f(r5, r15)
            java.lang.String r2 = (java.lang.String) r2
            f40.o r3 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r3 = r3.mo121142i()
            java.lang.Object r3 = r3.mo119685f(r14, r15)
            java.lang.String r3 = (java.lang.String) r3
            r8.mo25878H0(r2, r3)
            com.tencent.mm.ui.FindMoreFriendsUI$s r4 = r8.f55699Z
            int r4 = r4.ordinal()
            r6 = 1
            if (r4 == r6) goto L_0x0820
            java.lang.String r6 = "#8c8c8c"
            r7 = 2
            if (r4 == r7) goto L_0x07fd
            r7 = 1036831949(0x3dcccccd, float:0.1)
            r12 = 3
            if (r4 == r12) goto L_0x07b7
            r12 = 4
            if (r4 == r12) goto L_0x0766
        L_0x075f:
            r33 = r5
            r13 = -1
            r26 = 8
            goto L_0x0858
        L_0x0766:
            di3.d r1 = di3.C86312j.m106911c(r1)
            gt.i r1 = (p158gt.C8451i) r1
            android.graphics.Bitmap r1 = r1.get(r3)
            if (r1 == 0) goto L_0x0785
            r4 = 0
            r8.f55697Y = r4
            int r0 = r1.getWidth()
            float r0 = (float) r0
            float r0 = r0 * r7
            r3 = 0
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap(r1, r3, r0)
            r9.mo101930L(r0)
            goto L_0x0792
        L_0x0785:
            r8.f55697Y = r3
            di3.d r0 = di3.C86312j.m106911c(r0)
            gt.w r0 = (p158gt.C76057w) r0
            gt.w$a r1 = r8.f55682Q0
            r0.h60(r3, r1)
        L_0x0792:
            int r0 = android.graphics.Color.parseColor(r6)
            r7 = -1
            r9.mo101939Y(r2, r7, r0)
            r2 = 8
            r3 = 0
            r4 = 0
            r6 = 0
            r12 = 0
            r13 = 0
            r0 = r34
            r1 = r9
            r33 = r5
            r5 = r6
            r6 = r12
            r12 = -1
            r26 = 8
            r7 = r13
            r0.mo25874D0(r1, r2, r3, r4, r5, r6, r7)
            com.tencent.mm.plugin.newtips.model.n r0 = com.tencent.p014mm.plugin.newtips.model.C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE_ICON
            r1 = 1
            r9.mo64136k(r0, r1)
            goto L_0x083b
        L_0x07b7:
            r33 = r5
            r12 = -1
            r26 = 8
            di3.d r1 = di3.C86312j.m106911c(r1)
            gt.i r1 = (p158gt.C8451i) r1
            android.graphics.Bitmap r1 = r1.get(r3)
            if (r1 == 0) goto L_0x07db
            r2 = 0
            r8.f55697Y = r2
            int r0 = r1.getWidth()
            float r0 = (float) r0
            float r0 = r0 * r7
            r2 = 0
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap(r1, r2, r0)
            r9.mo101930L(r0)
            goto L_0x07e8
        L_0x07db:
            r8.f55697Y = r3
            di3.d r0 = di3.C86312j.m106911c(r0)
            gt.w r0 = (p158gt.C76057w) r0
            gt.w$a r1 = r8.f55682Q0
            r0.h60(r3, r1)
        L_0x07e8:
            r2 = 8
            r3 = 8
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r34
            r1 = r9
            r0.mo25874D0(r1, r2, r3, r4, r5, r6, r7)
            com.tencent.mm.plugin.newtips.model.n r0 = com.tencent.p014mm.plugin.newtips.model.C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT_ICON
            r1 = 1
            r9.mo64136k(r0, r1)
            goto L_0x083b
        L_0x07fd:
            r33 = r5
            r12 = -1
            r26 = 8
            int r0 = android.graphics.Color.parseColor(r6)
            r9.mo101939Y(r2, r12, r0)
            r2 = 8
            r3 = 0
            r4 = 1
            r5 = 8
            r6 = 8
            r7 = 8
            r0 = r34
            r1 = r9
            r0.mo25874D0(r1, r2, r3, r4, r5, r6, r7)
            com.tencent.mm.plugin.newtips.model.n r0 = com.tencent.p014mm.plugin.newtips.model.C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE
            r1 = 1
            r9.mo64136k(r0, r1)
            goto L_0x083b
        L_0x0820:
            r33 = r5
            r12 = -1
            r26 = 8
            r2 = 0
            r3 = 8
            r4 = 0
            r5 = 8
            r6 = 8
            r7 = 8
            r0 = r34
            r1 = r9
            r0.mo25874D0(r1, r2, r3, r4, r5, r6, r7)
            com.tencent.mm.plugin.newtips.model.n r0 = com.tencent.p014mm.plugin.newtips.model.C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT
            r1 = 1
            r9.mo64136k(r0, r1)
        L_0x083b:
            r13 = -1
            goto L_0x0858
        L_0x083d:
            r33 = r5
            r13 = -1
            r26 = 8
            r2 = 8
            r3 = 8
            r4 = 0
            r5 = 8
            r6 = 8
            r7 = 8
            r0 = r34
            r1 = r9
            r0.mo25874D0(r1, r2, r3, r4, r5, r6, r7)
            if (r12 != 0) goto L_0x0858
            r9.mo96252c0()
        L_0x0858:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 17065(0x42a9, float:2.3913E-41)
            r2 = 6
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r2 = 0
            r3[r2] = r10
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r4 = 1
            r3[r4] = r2
            com.tencent.mm.ui.FindMoreFriendsUI$s r2 = r8.f55699Z
            int r2 = r2.ordinal()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 2
            r3[r4] = r2
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            java.lang.Object r2 = r2.mo119685f(r14, r15)
            r4 = 3
            r3[r4] = r2
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            r4 = r33
            java.lang.Object r2 = r2.mo119685f(r4, r15)
            r4 = 4
            r3[r4] = r2
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.MY_LIFE_AROUND_APP_RED_DOT_TYPE_STRING
            java.lang.String r5 = "0"
            java.lang.Object r2 = r2.mo119685f(r4, r5)
            r3[r16] = r2
            r0.mo160131h(r1, r3)
            goto L_0x08b9
        L_0x08b0:
            r13 = -1
            r26 = 8
            com.tencent.mm.ui.base.preference.a r0 = r8.f55702t
            r1 = 1
            r0.mo72529n(r7, r1)
        L_0x08b9:
            r0 = 11
            d3.c[] r0 = new p329d3.C58104c[r0]
            d3.c r1 = new d3.c
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r2 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.DiscoveryNearby
            java.lang.String r3 = "find_friends_by_near"
            r1.<init>(r3, r2)
            r2 = 0
            r0[r2] = r1
            d3.c r1 = new d3.c
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r2 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.DiscoveryNearbyLiveFriends
            java.lang.String r3 = "find_live_friends_by_near"
            r1.<init>(r3, r2)
            r2 = 1
            r0[r2] = r1
            d3.c r1 = new d3.c
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r2 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.DiscoveryShake
            java.lang.String r3 = "find_friends_by_shake"
            r1.<init>(r3, r2)
            r2 = 2
            r0[r2] = r1
            d3.c r1 = new d3.c
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r2 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.GlobalScan
            r1.<init>(r11, r2)
            r2 = 3
            r0[r2] = r1
            d3.c r1 = new d3.c
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r2 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.DiscoveryGame
            r3 = r31
            r1.<init>(r3, r2)
            r2 = 4
            r0[r2] = r1
            d3.c r1 = new d3.c
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r2 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.DiscoveryShop
            r3 = r30
            r1.<init>(r3, r2)
            r0[r16] = r1
            d3.c r1 = new d3.c
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r2 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.DiscoveryAppbrand
            r3 = r18
            r1.<init>(r3, r2)
            r2 = 6
            r0[r2] = r1
            d3.c r1 = new d3.c
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r2 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.DiscoverySearch
            java.lang.String r3 = "find_friends_by_search"
            r1.<init>(r3, r2)
            r2 = 7
            r0[r2] = r1
            d3.c r1 = new d3.c
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r2 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.DiscoveryLooks
            java.lang.String r3 = "find_friends_by_look"
            r1.<init>(r3, r2)
            r0[r26] = r1
            d3.c r1 = new d3.c
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r2 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.DiscoveryChannels
            r3 = r25
            r1.<init>(r3, r2)
            r3 = 9
            r0[r3] = r1
            d3.c r1 = new d3.c
            java.lang.String r3 = "find_friends_by_finder_live"
            r1.<init>(r3, r2)
            r2 = 10
            r0[r2] = r1
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x0945:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0983
            java.lang.Object r1 = r0.next()
            d3.c r1 = (p329d3.C58104c) r1
            com.tencent.mm.ui.base.preference.a r2 = r8.f55702t
            F r3 = r1.f166179a
            java.lang.String r3 = (java.lang.String) r3
            com.tencent.mm.ui.base.preference.Preference r2 = r2.mo72519a(r3)
            boolean r3 = r2 instanceof com.tencent.p014mm.p136ui.base.preference.IconPreference
            if (r3 == 0) goto L_0x0945
            com.tencent.mm.ui.base.preference.IconPreference r2 = (com.tencent.p014mm.p136ui.base.preference.IconPreference) r2
            S r3 = r1.f166180b
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r3 = (com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries) r3
            boolean r3 = r3.banned()
            if (r3 == 0) goto L_0x0975
            com.tencent.mm.ui.base.preference.a r3 = r8.f55702t
            F r4 = r1.f166179a
            java.lang.String r4 = (java.lang.String) r4
            r5 = 1
            r3.mo72529n(r4, r5)
        L_0x0975:
            S r1 = r1.f166180b
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r1 = (com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries) r1
            boolean r1 = r1.signRequsted()
            if (r1 == 0) goto L_0x0945
            r2.getClass()
            goto L_0x0945
        L_0x0983:
            com.tencent.mm.ui.base.preference.a r0 = r8.f55702t
            java.lang.String r1 = "find_friends_by_facebook"
            r2 = 1
            r0.mo72529n(r1, r2)
            com.tencent.mm.ui.base.preference.a r0 = r8.f55702t
            java.lang.String r1 = "settings_emoji_store"
            r0.mo72529n(r1, r2)
            int r0 = r8.f55677L
            if (r0 != 0) goto L_0x0a15
            r0 = 16908298(0x102000a, float:2.3877257E-38)
            android.view.View r0 = r8.findViewById(r0)
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r1 = r8.f55678M
            if (r1 != 0) goto L_0x09d6
            android.app.Activity r1 = r34.getContext()
            android.view.LayoutInflater r1 = r1.getLayoutInflater()
            r2 = 2131495612(0x7f0c0abc, float:1.8614766E38)
            r3 = 0
            android.view.View r1 = r1.inflate(r2, r3)
            r8.f55678M = r1
            r2 = 2131305714(0x7f0924f2, float:1.8229607E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            com.tencent.mm.ui.FindMoreFriendsUI$d r2 = new com.tencent.mm.ui.FindMoreFriendsUI$d
            r2.<init>()
            r1.setOnClickListener(r2)
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            r1.<init>(r13, r13)
            android.view.View r2 = r8.f55678M
            r0.addView(r2, r1)
            goto L_0x0a15
        L_0x09d6:
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            r0.mo10233c(r10)
            java.lang.Object[] r15 = r0.mo10232b()
            java.lang.String r16 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r17 = "updateStatus"
            java.lang.String r18 = "()V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r1
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            r2 = 0
            java.lang.Object r0 = r0.mo10231a(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1.setVisibility(r0)
            java.lang.String r2 = "com/tencent/mm/ui/FindMoreFriendsUI"
            java.lang.String r3 = "updateStatus"
            java.lang.String r4 = "()V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
        L_0x0a15:
            com.tencent.mm.ui.base.preference.a r0 = r8.f55702t
            r0.notifyDataSetChanged()
            boolean r0 = r34.mo25908k0()
            if (r0 != 0) goto L_0x0a33
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.FIND_MORE_UI_ENTRY_LAST_REPORT_TIME_LONG_SYNC
            long r2 = r8.f55701s
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.mo119677K(r1, r2)
        L_0x0a33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.FindMoreFriendsUI.mo25885M0():void");
    }

    /* renamed from: N */
    public boolean mo25886N(C47511g gVar, Preference preference, View view) {
        Class cls = C60200t1.class;
        if (!"find_friends_by_finder".equals(preference.f121285r) || C86312j.m106911c(cls) == null || (!WeChatEnvironment.isCoolassistEnv() && !BuildInfo.IS_FLAVOR_PURPLE && !BuildInfo.DEBUG)) {
            try {
                if ("album_dyna_photo_ui_title".equals(preference.f121285r) && (BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.DEBUG || WeChatEnvironment.hasDebugger())) {
                    int i = SnsSettingUI.f82073g;
                    Intent intent = new Intent(getContext(), SnsSettingUI.class);
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/ui/FindMoreFriendsUI", "onPreferenceTreeLongClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;Landroid/view/View;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(this, "com/tencent/mm/ui/FindMoreFriendsUI", "onPreferenceTreeLongClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;Landroid/view/View;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    return true;
                }
            } catch (Exception unused) {
            }
            return "app_brand_entrance".equals(preference.f121285r) && ((C76633z0) C86312j.m106911c(C76633z0.class)).mo94229Wm(getContext());
        }
        ((C60200t1) C86312j.m106911c(cls)).mo76852gr(getContext());
        return true;
    }

    /* renamed from: N0 */
    public void mo25887N0(m64 m64) {
        if ((C75592q0.m90785o() & 32768) == 0) {
            this.f55704v++;
            mo25883L0();
            this.f55702t.notifyDataSetChanged();
        }
    }

    /* renamed from: O */
    public void mo25888O(Bundle bundle) {
        Log.m105924i("MicroMsg.FindMoreFriendsUI", "on tab create");
        this.f55702t = this.f215101d;
        this.f55674I = C75592q0.m90787q();
        this.f55676K = C75592q0.m90785o();
        this.f55675J = C75592q0.m90781k();
        new C78253a(getContext());
        Log.m105924i("MicroMsg.FindMoreFriendsUI", "on tab create end");
        this.f55702t.mo72529n("find_friends_by_shake", true);
        this.f55702t.mo72529n("ip_call_entrance", true);
    }

    /* renamed from: P */
    public void mo25889P() {
        Log.m105924i("MicroMsg.FindMoreFriendsUI", "on tab destroy");
        mo25925u0();
        ((C75707s0) C86312j.m106911c(C75707s0.class)).H60().mo120967O("lifeappreddot", this.f55700p0);
    }

    /* renamed from: Q */
    public void mo25890Q() {
        Log.m105924i("MicroMsg.FindMoreFriendsUI", "on tab pause");
        this.f55668C = false;
        this.f55696X0 = false;
        this.f55698Y0 = false;
        this.f55670E = false;
        this.f55673H = false;
        mo25871A0();
        mo25925u0();
    }

    /* renamed from: R */
    public void mo25891R() {
        boolean z;
        FinderIconViewTipPreference finderIconViewTipPreference;
        boolean z2 = false;
        Log.m105925i("MicroMsg.FindMoreFriendsUI", "on tab resume isTabSwitchInReport:%b isTabResumeReport:%b", Boolean.valueOf(this.f55696X0), Boolean.valueOf(this.f55698Y0));
        C73244a aVar = this.f55702t;
        if ((aVar instanceof C73244a) && aVar.f215137x == 0) {
            aVar.f215137x = System.currentTimeMillis();
        }
        this.f55668C = true;
        this.f55670E = true;
        this.f55673H = true;
        mo25871A0();
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96099XB().add(this.f55681Q);
        IListenerMStorage.m48928f(GameMessageStorageNotifyEvent.class.getName(), this.f55689U);
        IListenerMStorage.m48928f(ShakeMessageStorageNotifyEvent.class.getName(), this.f55693W);
        IListenerMStorage.m48928f(GameLifeStorageNotifyEvent.class.getName(), this.f55691V);
        this.f55685S.alive();
        this.f55680P.alive();
        this.f55687T.alive();
        this.f55683R.alive();
        this.f55695X.alive();
        this.f55707x0.alive();
        this.f55709y0.alive();
        C75743h.yx0().add(this);
        C97625j3.m125812b().mo105908w().add(this);
        C97625j3.m125812b().mo105886a(this);
        C97625j3.m125812b().mo105906u().add(this);
        if (C102426c0.m135143b() != null) {
            C102426c0.m135143b().mo131020f0(this);
        }
        View findViewById = findViewById(C0966R.C0970id.g3q);
        if (!(findViewById == null || findViewById.getVisibility() == 8)) {
            new MMHandler(Looper.getMainLooper()).post(new C6727m(findViewById));
        }
        if (isAdded()) {
            MMHandlerThread.postToMainThread(new C19661n());
        }
        mo25875E0();
        if (!this.f55696X0 && !this.f55698Y0) {
            if (mo25911m0()) {
                mo25928x0(true, (FinderIconViewTipPreference) null);
                C61894a.m72627d("finder");
            }
            C60165e4.C46105a aVar2 = new C60165e4.C46105a();
            C23102c cVar = this.f55692V0;
            if (cVar != null) {
                z = cVar.mo36506c();
                C73244a aVar3 = this.f55702t;
                if (!(aVar3 == null || (finderIconViewTipPreference = (FinderIconViewTipPreference) aVar3.mo72519a(this.f55692V0.mo36505b())) == null)) {
                    aVar2 = finderIconViewTipPreference.mo25970p0();
                }
            } else {
                z = true;
            }
            ((C60165e4) C86312j.m106911c(C60165e4.class)).wf0(true, z, aVar2);
            if (z) {
                C61894a.m72627d(WeChatBrands.Business.GROUP_LIVE);
            }
            if ((this.f55676K & 32768) == 0) {
                z2 = true;
            }
            if (z2) {
                C61894a.m72627d("sns");
            }
            MMHandlerThread.postToMainThread(new C19667o(this));
            this.f55698Y0 = true;
        }
        ((C34409r) C86312j.m106911c(C34409r.class)).mo59437ol(2, 0);
        Log.m105924i("MicroMsg.FindMoreFriendsUI", "on tab resume end");
    }

    /* renamed from: S */
    public void mo25892S() {
        Log.m105924i("MicroMsg.FindMoreFriendsUI", "on tab start");
        ((C75707s0) C86312j.m106911c(C75707s0.class)).H60().mo120969q("lifeappreddot", this.f55700p0);
    }

    /* renamed from: T */
    public void mo25893T() {
        Log.m105924i("MicroMsg.FindMoreFriendsUI", "on tab stop");
    }

    /* renamed from: V */
    public final void mo25894V(tg4 tg4, C64702s7 s7Var) {
        C64355f00 f002;
        wc4 wc4;
        if (s7Var == null || (f002 = s7Var.f185355d) == null) {
            Log.m105924i("MicroMsg.FindMoreFriendsUI", "analysisRedDotXml attributeXml empty");
        } else if (!TextUtils.isEmpty(f002.f183065d) || ((wc4 = s7Var.f185355d.f183066e) != null && (!TextUtils.isEmpty(wc4.f186073d) || !TextUtils.isEmpty(s7Var.f185355d.f183066e.f186074e)))) {
            C64355f00 f003 = s7Var.f185355d;
            tg4.f354436e = f003.f183065d;
            wc4 wc42 = f003.f183066e;
            if (wc42 != null) {
                tg4.f354439h = wc42.f186073d;
                tg4.f354441j = wc42.f186074e;
                tg4.f354440i = wc42.f186075f;
                tg4.f354442n = wc42.f186076g;
                tg4.f354446r = wc42.f186077h;
                tg4.f354447s = wc42.f186078i;
            }
            tg4.f354445q = f003.f183067f;
            tg4.f354443o = true;
        } else {
            Log.m105924i("MicroMsg.FindMoreFriendsUI", "analysisRedDotXml invalid attributeXml!");
        }
    }

    /* renamed from: X */
    public final void mo25895X(Intent intent, String str) {
        if (intent != null) {
            intent.removeExtra("key_yreportsdk_reddot_info");
        }
        if (((C60200t1) C86312j.m106911c(C60200t1.class)).Nt0().mo77235K5()) {
            Log.m105925i("MicroMsg.FindMoreFriendsUI", "bindRedDotInfoInFinderLive cost[%d] size[%d]", Long.valueOf(Util.ticksToNow(Util.currentTicks())), Integer.valueOf(mo25927w0(intent, str, (HashMap) null)));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:96:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02f5  */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25896Y(te3.C64586nn1 r18, com.tencent.p014mm.p136ui.FinderIconViewTipPreference r19, boolean r20, boolean r21, boolean r22, te3.C64586nn1 r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r10 = r19
            r11 = r21
            r2 = r23
            java.lang.Class<ht1.e4> r12 = ht1.C60165e4.class
            java.lang.Class<er.n> r3 = p151er.C75651n.class
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "changeRedDot icon url: "
            r4.append(r5)
            java.lang.String r5 = r1.f184505g
            r4.append(r5)
            java.lang.String r5 = " show_type:"
            r4.append(r5)
            int r5 = r1.f184502d
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "MicroMsg.FindMoreFriendsUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            if (r2 == 0) goto L_0x0036
            int r2 = r2.f184503e
            r9 = r2
            goto L_0x0037
        L_0x0036:
            r9 = 0
        L_0x0037:
            int r2 = r1.f184502d
            r4 = 4
            r6 = 14
            r7 = 11
            r14 = 7
            r15 = 12
            r13 = 13
            r8 = 1
            if (r2 == r14) goto L_0x0054
            if (r2 == r7) goto L_0x0054
            if (r2 == r4) goto L_0x0054
            if (r2 == r15) goto L_0x0054
            if (r2 == r13) goto L_0x0054
            if (r2 == r6) goto L_0x0054
            r13 = 16
            if (r2 != r13) goto L_0x00cf
        L_0x0054:
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r21)
            r16 = 0
            r2[r16] = r13
            java.lang.String r13 = "changeRedDot enableShowEntranceRedDot %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r13, r2)
            di3.d r2 = di3.C86312j.m106911c(r3)
            er.n r2 = (p151er.C75651n) r2
            int r2 = r2.mo55942Wz()
            r13 = -1
            if (r2 == r13) goto L_0x00cf
            di3.d r2 = di3.C86312j.m106911c(r3)
            er.n r2 = (p151er.C75651n) r2
            int r2 = r2.mo55942Wz()
            di3.d r13 = di3.C86312j.m106911c(r3)
            er.n r13 = (p151er.C75651n) r13
            java.util.List r13 = r13.jw0()
            int r13 = r13.size()
            if (r2 >= r13) goto L_0x00cf
            di3.d r13 = di3.C86312j.m106911c(r3)
            er.n r13 = (p151er.C75651n) r13
            java.util.List r13 = r13.jw0()
            java.lang.Object r13 = r13.get(r2)
            rx3.l r13 = (rx3.C13604l) r13
            A r13 = r13.f38555d
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r1.f184502d = r13
            di3.d r3 = di3.C86312j.m106911c(r3)
            er.n r3 = (p151er.C75651n) r3
            java.util.List r3 = r3.jw0()
            java.lang.Object r2 = r3.get(r2)
            rx3.l r2 = (rx3.C13604l) r2
            B r2 = r2.f38556e
            java.lang.String r2 = (java.lang.String) r2
            r1.f184504f = r2
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            int r2 = r1.f184502d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r13 = 0
            r3[r13] = r2
            java.lang.String r2 = r1.f184504f
            r3[r8] = r2
            java.lang.String r2 = "changeRedDot debug set showType %s title %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r3)
        L_0x00cf:
            int r2 = r1.f184502d
            r3 = 16
            if (r2 != r3) goto L_0x00fc
            r10.f201755u1 = r8
            te3.tg4 r3 = new te3.tg4
            r3.<init>()
            java.lang.String r2 = r1.f184505g
            r3.f354437f = r2
            java.lang.String r2 = r1.f184504f
            r3.f354436e = r2
            te3.s7 r1 = r1.f184519x
            r0.mo25894V(r3, r1)
            r19.mo25948B0()
            r4 = 4
            r5 = 1
            r6 = 0
            r7 = 1
            r1 = r19
            r2 = r21
            r13 = 1
            r8 = r22
            r1.mo25955J0(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0389
        L_0x00fc:
            r13 = 1
            if (r2 == r14) goto L_0x0342
            if (r2 == r15) goto L_0x0342
            if (r2 != r6) goto L_0x0105
            goto L_0x0342
        L_0x0105:
            r3 = 25
            r6 = 22
            r8 = 23
            if (r2 == r6) goto L_0x0305
            r14 = 24
            if (r2 == r14) goto L_0x0305
            if (r2 == r8) goto L_0x0305
            if (r2 != r3) goto L_0x0117
            goto L_0x0305
        L_0x0117:
            if (r2 == r4) goto L_0x02b5
            if (r2 == r7) goto L_0x02b5
            r3 = 13
            if (r2 != r3) goto L_0x0121
            goto L_0x02b5
        L_0x0121:
            r3 = 9
            if (r2 != r3) goto L_0x0151
            r3 = 0
            r10.f201755u1 = r3
            te3.tg4 r3 = new te3.tg4
            r3.<init>()
            java.lang.String r2 = r1.f184505g
            r3.f354437f = r2
            java.lang.String r2 = r1.f184504f
            r3.f354436e = r2
            te3.s7 r2 = r1.f184519x
            r0.mo25894V(r3, r2)
            r19.mo25948B0()
            r4 = 2
            java.lang.String r1 = r1.f184504f
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            r6 = 1
            r7 = 0
            r1 = r19
            r2 = r21
            r8 = r22
            r1.mo25955J0(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0389
        L_0x0151:
            r3 = 10
            if (r2 != r3) goto L_0x0180
            r10.f201755u1 = r13
            te3.tg4 r3 = new te3.tg4
            r3.<init>()
            java.lang.String r2 = r1.f184505g
            r3.f354437f = r2
            java.lang.String r2 = r1.f184504f
            r3.f354436e = r2
            te3.s7 r2 = r1.f184519x
            r0.mo25894V(r3, r2)
            r19.mo25948B0()
            r4 = 1
            java.lang.String r1 = r1.f184504f
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            r6 = 1
            r7 = 0
            r1 = r19
            r2 = r21
            r8 = r22
            r1.mo25955J0(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0389
        L_0x0180:
            r3 = 999(0x3e7, float:1.4E-42)
            if (r2 != r3) goto L_0x01dc
            te3.t10 r4 = r1.f184501B
            if (r4 == 0) goto L_0x01dc
            te3.en1 r4 = r4.f141896d
            if (r4 == 0) goto L_0x01dc
            int r2 = com.tencent.p014mm.sdk.platformtools.Log.getLogLevel()
            if (r2 > r13) goto L_0x01d0
            org.json.JSONObject r2 = r18.toJSON()
            java.lang.String r4 = r2.toString()
            int r4 = r4.length()
            r6 = 4000(0xfa0, float:5.605E-42)
            if (r4 <= r6) goto L_0x01c6
            java.lang.String r4 = r2.toString()
            r7 = 0
            java.lang.String r4 = r4.substring(r7, r6)
            java.lang.Object[] r8 = new java.lang.Object[r13]
            r8[r7] = r4
            java.lang.String r4 = "[analysisNodes#1] %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r4, r8)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.substring(r6)
            java.lang.Object[] r4 = new java.lang.Object[r13]
            r4[r7] = r2
            java.lang.String r2 = "[analysisNodes#2] %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r2, r4)
            goto L_0x01d0
        L_0x01c6:
            r7 = 0
            java.lang.Object[] r4 = new java.lang.Object[r13]
            r4[r7] = r2
            java.lang.String r2 = "[analysisNodes] %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r2, r4)
        L_0x01d0:
            r19.mo25948B0()
            te3.t10 r1 = r1.f184501B
            te3.en1 r1 = r1.f141896d
            r10.mo25954I0(r11, r1, r3, r9)
            goto L_0x0389
        L_0x01dc:
            r3 = 3
            r4 = 6
            if (r2 != r3) goto L_0x020e
            te3.tg4 r3 = new te3.tg4
            r3.<init>()
            java.lang.String r2 = r1.f184504f
            r3.f354436e = r2
            r0.mo25920s0(r3)
            if (r20 == 0) goto L_0x01ef
            r4 = 7
        L_0x01ef:
            te3.s7 r1 = r1.f184519x
            r0.mo25894V(r3, r1)
            r19.mo25948B0()
            r5 = 1
            r6 = 0
            r7 = 0
            r1 = r19
            r2 = r21
            r8 = r22
            r1.mo25955J0(r2, r3, r4, r5, r6, r7, r8, r9)
            di3.d r1 = di3.C86312j.m106911c(r12)
            ht1.e4 r1 = (ht1.C60165e4) r1
            r1.mo85146GI()
            goto L_0x0389
        L_0x020e:
            r3 = 28
            if (r2 != r3) goto L_0x0229
            te3.tg4 r3 = new te3.tg4
            r3.<init>()
            r19.mo25948B0()
            r4 = 15
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = r19
            r2 = r21
            r1.mo25955J0(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0389
        L_0x0229:
            if (r2 != r13) goto L_0x0230
            r10.mo25956f(r11)
            goto L_0x0389
        L_0x0230:
            r3 = 26
            if (r2 != r3) goto L_0x0263
            r3 = 0
            r10.f201755u1 = r3
            te3.tg4 r3 = new te3.tg4
            r3.<init>()
            java.lang.String r2 = r1.f184505g
            r3.f354437f = r2
            java.util.LinkedList<java.lang.String> r2 = r1.f184511p
            r3.f354438g = r2
            te3.s7 r1 = r1.f184519x
            r0.mo25894V(r3, r1)
            java.lang.String r1 = r3.f354439h
            r3.f354444p = r1
            java.lang.String r1 = ""
            r3.f354439h = r1
            r19.mo25948B0()
            r4 = 14
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = r19
            r2 = r21
            r1.mo25955J0(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0389
        L_0x0263:
            r3 = 100
            if (r2 == r3) goto L_0x02b0
            if (r2 != r4) goto L_0x026a
            goto L_0x02b0
        L_0x026a:
            r3 = 2
            if (r2 != r3) goto L_0x027f
            int r3 = r1.f184503e
            if (r3 <= 0) goto L_0x027f
            te3.tg4 r2 = new te3.tg4
            r2.<init>()
            int r1 = r1.f184503e
            r2.f354435d = r1
            r10.mo25958g(r11, r2)
            goto L_0x0389
        L_0x027f:
            r3 = 21
            if (r2 != r3) goto L_0x02aa
            r10.f201755u1 = r13
            te3.tg4 r3 = new te3.tg4
            r3.<init>()
            java.lang.String r2 = r1.f184505g
            r3.f354437f = r2
            java.lang.String r2 = r1.f184504f
            r3.f354436e = r2
            te3.s7 r1 = r1.f184519x
            r0.mo25894V(r3, r1)
            r19.mo25948B0()
            r4 = 10
            r5 = 1
            r6 = 0
            r7 = 1
            r1 = r19
            r2 = r21
            r8 = r22
            r1.mo25955J0(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0389
        L_0x02aa:
            r1 = 0
            r10.mo25956f(r1)
            goto L_0x0389
        L_0x02b0:
            r10.mo25960h(r13)
            goto L_0x0389
        L_0x02b5:
            r10.f201755u1 = r13
            te3.tg4 r3 = new te3.tg4
            r3.<init>()
            java.lang.String r2 = r1.f184505g
            r3.f354437f = r2
            java.lang.String r2 = r1.f184504f
            r3.f354436e = r2
            r0.mo25920s0(r3)
            te3.s7 r2 = r1.f184519x
            r0.mo25894V(r3, r2)
            if (r11 == 0) goto L_0x02d2
            int r2 = r1.f184502d
            if (r2 == r7) goto L_0x02df
        L_0x02d2:
            java.lang.String r2 = r1.f184504f
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x02e2
            int r2 = r1.f184502d
            if (r2 == r4) goto L_0x02df
            goto L_0x02e2
        L_0x02df:
            r4 = 13
            goto L_0x02e8
        L_0x02e2:
            int r2 = r1.f184502d
            r4 = 13
            if (r2 != r4) goto L_0x02ea
        L_0x02e8:
            r5 = 1
            goto L_0x02eb
        L_0x02ea:
            r5 = 0
        L_0x02eb:
            r19.mo25948B0()
            r6 = 4
            int r1 = r1.f184502d
            if (r1 == r4) goto L_0x02f5
            r7 = 1
            goto L_0x02f6
        L_0x02f5:
            r7 = 0
        L_0x02f6:
            r8 = 0
            r1 = r19
            r2 = r21
            r4 = r6
            r6 = r7
            r7 = r8
            r8 = r22
            r1.mo25955J0(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0389
        L_0x0305:
            r2 = 0
            r10.f201755u1 = r2
            te3.tg4 r4 = new te3.tg4
            r4.<init>()
            java.lang.String r2 = r1.f184505g
            r4.f354437f = r2
            java.util.LinkedList<java.lang.String> r2 = r1.f184511p
            r4.f354438g = r2
            java.lang.String r2 = r1.f184504f
            r4.f354436e = r2
            r0.mo25920s0(r4)
            te3.s7 r2 = r1.f184519x
            r0.mo25894V(r4, r2)
            int r1 = r1.f184502d
            if (r1 == r8) goto L_0x032a
            if (r1 != r3) goto L_0x0328
            goto L_0x032a
        L_0x0328:
            r15 = 11
        L_0x032a:
            if (r1 == r6) goto L_0x0331
            if (r1 != r8) goto L_0x032f
            goto L_0x0331
        L_0x032f:
            r6 = 0
            goto L_0x0332
        L_0x0331:
            r6 = 1
        L_0x0332:
            r19.mo25948B0()
            r5 = 1
            r7 = 0
            r8 = 0
            r1 = r19
            r2 = r21
            r3 = r4
            r4 = r15
            r1.mo25955J0(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0389
        L_0x0342:
            r2 = 0
            r10.f201755u1 = r2
            te3.tg4 r3 = new te3.tg4
            r3.<init>()
            java.lang.String r2 = r1.f184505g
            r3.f354437f = r2
            java.lang.String r2 = r1.f184504f
            r3.f354436e = r2
            r0.mo25920s0(r3)
            te3.s7 r2 = r1.f184519x
            r0.mo25894V(r3, r2)
            if (r11 == 0) goto L_0x0360
            int r2 = r1.f184502d
            if (r2 == r15) goto L_0x0371
        L_0x0360:
            java.lang.String r2 = r1.f184504f
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x036d
            int r2 = r1.f184502d
            r4 = 7
            if (r2 == r4) goto L_0x0371
        L_0x036d:
            int r2 = r1.f184502d
            if (r2 != r6) goto L_0x0373
        L_0x0371:
            r5 = 1
            goto L_0x0374
        L_0x0373:
            r5 = 0
        L_0x0374:
            r19.mo25948B0()
            r4 = 5
            int r1 = r1.f184502d
            if (r1 == r6) goto L_0x037e
            r6 = 1
            goto L_0x037f
        L_0x037e:
            r6 = 0
        L_0x037f:
            r7 = 0
            r1 = r19
            r2 = r21
            r8 = r22
            r1.mo25955J0(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0389:
            int r1 = com.tencent.p014mm.p136ui.LauncherUI.getCurrentTabIndex()
            r2 = 2
            if (r1 != r2) goto L_0x03eb
            r1 = 0
            r0.mo25928x0(r1, r10)
            ht1.e4$a r1 = r19.mo25970p0()
            di3.d r2 = di3.C86312j.m106911c(r12)
            ht1.e4 r2 = (ht1.C60165e4) r2
            er.s r3 = r10.f55779T1
            if (r3 == 0) goto L_0x03b3
            android.view.View r3 = r3.getView()
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x03b3
            er.s r3 = r10.f55779T1
            int r8 = r3.getRowCount()
            goto L_0x03b4
        L_0x03b3:
            r8 = 1
        L_0x03b4:
            int r3 = r19.mo25969o0()
            r4 = 0
            r2.mo85170os(r4, r8, r3, r1)
            ht1.e4$a r1 = new ht1.e4$a
            r1.<init>()
            xl3.c r2 = r0.f55692V0
            if (r2 == 0) goto L_0x03e0
            boolean r8 = r2.mo36506c()
            com.tencent.mm.ui.base.preference.a r2 = r0.f55702t
            if (r2 == 0) goto L_0x03e1
            xl3.c r3 = r0.f55692V0
            java.lang.String r3 = r3.mo36505b()
            com.tencent.mm.ui.base.preference.Preference r2 = r2.mo72519a(r3)
            com.tencent.mm.ui.FinderIconViewTipPreference r2 = (com.tencent.p014mm.p136ui.FinderIconViewTipPreference) r2
            if (r2 == 0) goto L_0x03e1
            ht1.e4$a r1 = r2.mo25970p0()
            goto L_0x03e1
        L_0x03e0:
            r8 = 1
        L_0x03e1:
            di3.d r2 = di3.C86312j.m106911c(r12)
            ht1.e4 r2 = (ht1.C60165e4) r2
            r3 = 0
            r2.wf0(r3, r8, r1)
        L_0x03eb:
            java.lang.String r1 = r10.f121285r
            r0.mo25923t0(r1, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.FindMoreFriendsUI.mo25896Y(te3.nn1, com.tencent.mm.ui.FinderIconViewTipPreference, boolean, boolean, boolean, te3.nn1):void");
    }

    /* renamed from: Z */
    public final void mo25897Z() {
        Log.m105924i("MicroMsg.FindMoreFriendsUI", "checkLookVisibility");
        if (!this.f215105h || !isAdded()) {
            Log.m105924i("MicroMsg.FindMoreFriendsUI", "checkLookVisibility preference not add");
            return;
        }
        try {
            if (WeChatBrands.Business.Entries.DiscoveryChannels.banned()) {
                this.f55702t.mo72529n("find_friends_by_finder", true);
            }
            JSONObject p4 = ((C0406o) C86312j.m106911c(C0406o.class)).mo448p4("discoverRecommendEntry");
            C21032k t4 = ((C21912d) C86312j.m106911c(C21912d.class)).mo34966t4();
            boolean A = t4 != null ? ((C21723h) t4).mo33981A() : true;
            Log.m105925i("MicroMsg.FindMoreFriendsUI", "showLookEntry %s", Boolean.valueOf(A));
            if (A) {
                String optString = p4.optString("wording");
                NormalIconNewTipPreference normalIconNewTipPreference = (NormalIconNewTipPreference) this.f55702t.mo72519a("find_friends_by_look");
                if (Util.isNullOrNil(optString)) {
                    normalIconNewTipPreference.mo69924H(getString(C0966R.string.cwb));
                } else {
                    normalIconNewTipPreference.mo69924H(optString);
                }
                normalIconNewTipPreference.mo96254e0(this.f55702t);
                ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175770k(normalIconNewTipPreference);
                C76057w.C76058a aVar = this.f55682Q0;
                C19653a aVar2 = new C19653a();
                normalIconNewTipPreference.f201752r1 = aVar;
                normalIconNewTipPreference.f201753s1 = aVar2;
                normalIconNewTipPreference.mo96252c0();
                this.f55677L++;
                this.f55702t.mo72529n("find_friends_by_look", false);
                MMHandlerThread.postToMainThread(new C19793e0(this, normalIconNewTipPreference));
                ((C22420e) C86312j.m106911c(C22420e.class)).h70();
                return;
            }
            this.f55702t.mo72529n("find_friends_by_look", true);
            if (!mo25908k0()) {
                C115669n.INSTANCE.mo175913w(953, 3, 1);
            }
        } catch (Exception e) {
            Log.m105920e("MicroMsg.FindMoreFriendsUI", Util.stackTraceToString(e));
        }
    }

    /* renamed from: a0 */
    public void mo25898a0() {
        C115669n.INSTANCE.kvStat(10958, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL);
        Boolean bool = (Boolean) C97625j3.m125812b().mo105906u().mo119684e(4104, (Object) null);
        LauncherUI launcherUI = (LauncherUI) getContext();
        if (launcherUI != null) {
            launcherUI.mo101375O7().mo101428l("tab_find_friend");
        }
        Intent intent = new Intent();
        ((C60165e4) C86312j.m106911c(C60165e4.class)).m60(((C60200t1) C86312j.m106911c(C60200t1.class)).mo76739CG(C59263a.m69190b(), intent), 0);
        C78146a.m94352a(getContext(), intent);
    }

    /* renamed from: d */
    public void mo25899d() {
        Log.m105925i("MicroMsg.FindMoreFriendsUI", "on tab switch in isTabSwitchInReport:%b isTabResumeReport:%b", Boolean.valueOf(this.f55696X0), Boolean.valueOf(this.f55698Y0));
        this.f55668C = true;
        this.f55670E = true;
        this.f55673H = true;
        mo25871A0();
        C79547b.f233255g.mo109607a(new C19664r());
        C78137s0.m94342f((List<String>) null, 20, 0, (List<C49768hy>) null, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00bd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00bf, code lost:
        return;
     */
    /* renamed from: d0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo25900d0(com.tencent.p014mm.autogen.events.QueryGameMessageEvent r18, com.tencent.p014mm.p136ui.base.preference.IconPreference r19, com.tencent.p014mm.autogen.events.QueryGameMessageEvent r20, java.lang.String r21, java.lang.String r22) {
        /*
            r17 = this;
            r11 = r17
            r0 = r19
            monitor-enter(r17)
            r1 = r18
            com.tencent.mm.autogen.events.QueryGameMessageEvent$a r1 = r1.f107710d     // Catch:{ all -> 0x00c0 }
            java.lang.String r12 = r1.f107714d     // Catch:{ all -> 0x00c0 }
            int r2 = r1.f107715e     // Catch:{ all -> 0x00c0 }
            int r3 = r1.f107716f     // Catch:{ all -> 0x00c0 }
            boolean r4 = r1.f107717g     // Catch:{ all -> 0x00c0 }
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)     // Catch:{ all -> 0x00c0 }
            if (r1 != 0) goto L_0x00be
            if (r0 == 0) goto L_0x00be
            android.widget.ImageView r1 = r0.f215051L     // Catch:{ all -> 0x00c0 }
            if (r1 != 0) goto L_0x001f
            goto L_0x00be
        L_0x001f:
            java.lang.String r1 = "MicroMsg.FindMoreFriendsUI"
            java.lang.String r5 = "gamelog.reddot, finder, update, download entrance image : %s, width: %d, height: %d"
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x00c0 }
            r7 = 0
            r6[r7] = r12     // Catch:{ all -> 0x00c0 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00c0 }
            r8 = 1
            r6[r8] = r7     // Catch:{ all -> 0x00c0 }
            r7 = 2
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00c0 }
            r6[r7] = r9     // Catch:{ all -> 0x00c0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r5, r6)     // Catch:{ all -> 0x00c0 }
            if (r2 <= 0) goto L_0x0051
            if (r3 <= 0) goto L_0x0051
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x00c0 }
            int r1 = kg3.C76577a.m92151b(r1, r2)     // Catch:{ all -> 0x00c0 }
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x00c0 }
            int r2 = kg3.C76577a.m92151b(r2, r3)     // Catch:{ all -> 0x00c0 }
            r0.mo101935S(r1, r2)     // Catch:{ all -> 0x00c0 }
        L_0x0051:
            r1 = r20
            com.tencent.mm.autogen.events.QueryGameMessageEvent$a r1 = r1.f107710d     // Catch:{ all -> 0x00c0 }
            long r9 = r1.f107719i     // Catch:{ all -> 0x00c0 }
            int r6 = r1.f107711a     // Catch:{ all -> 0x00c0 }
            com.tencent.mm.autogen.events.GameMsgDownloadImgEvent r5 = new com.tencent.mm.autogen.events.GameMsgDownloadImgEvent     // Catch:{ all -> 0x00c0 }
            r5.<init>()     // Catch:{ all -> 0x00c0 }
            com.tencent.mm.autogen.events.GameMsgDownloadImgEvent$a r1 = r5.f107555d     // Catch:{ all -> 0x00c0 }
            r1.f107557a = r8     // Catch:{ all -> 0x00c0 }
            r1.f107558b = r12     // Catch:{ all -> 0x00c0 }
            r5.publish()     // Catch:{ all -> 0x00c0 }
            com.tencent.mm.autogen.events.GameMsgDownloadImgEvent$b r1 = r5.f107556e     // Catch:{ all -> 0x00c0 }
            boolean r1 = r1.f107560b     // Catch:{ all -> 0x00c0 }
            if (r1 == 0) goto L_0x00bc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c0 }
            r1.<init>()     // Catch:{ all -> 0x00c0 }
            com.tencent.mm.autogen.events.GameMsgDownloadImgEvent$b r2 = r5.f107556e     // Catch:{ all -> 0x00c0 }
            java.lang.String r2 = r2.f107559a     // Catch:{ all -> 0x00c0 }
            r1.append(r2)     // Catch:{ all -> 0x00c0 }
            byte[] r2 = r12.getBytes()     // Catch:{ all -> 0x00c0 }
            java.lang.String r2 = p823sg.C90193h.m112878f(r2)     // Catch:{ all -> 0x00c0 }
            r1.append(r2)     // Catch:{ all -> 0x00c0 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00c0 }
            hc0.c$b r2 = new hc0.c$b     // Catch:{ all -> 0x00c0 }
            r2.<init>()     // Catch:{ all -> 0x00c0 }
            r2.f59346b = r8     // Catch:{ all -> 0x00c0 }
            r2.f59350f = r1     // Catch:{ all -> 0x00c0 }
            hc0.c r13 = r2.mo32666a()     // Catch:{ all -> 0x00c0 }
            gc0.a r14 = gc0.C20828a.m22825b()     // Catch:{ all -> 0x00c0 }
            r15 = 0
            com.tencent.mm.ui.FindMoreFriendsUI$k r7 = new com.tencent.mm.ui.FindMoreFriendsUI$k     // Catch:{ all -> 0x00c0 }
            r7.<init>(r11, r5)     // Catch:{ all -> 0x00c0 }
            com.tencent.mm.ui.FindMoreFriendsUI$l r16 = new com.tencent.mm.ui.FindMoreFriendsUI$l     // Catch:{ all -> 0x00c0 }
            r1 = r16
            r2 = r17
            r3 = r4
            r4 = r5
            r5 = r19
            r0 = r7
            r7 = r9
            r9 = r22
            r10 = r21
            r1.<init>(r3, r4, r5, r6, r7, r9, r10)     // Catch:{ all -> 0x00c0 }
            r2 = r14
            r3 = r12
            r4 = r15
            r5 = r13
            r6 = r0
            r7 = r16
            r2.mo32522k(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00c0 }
        L_0x00bc:
            monitor-exit(r17)
            return
        L_0x00be:
            monitor-exit(r17)
            return
        L_0x00c0:
            r0 = move-exception
            monitor-exit(r17)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.FindMoreFriendsUI.mo25900d0(com.tencent.mm.autogen.events.QueryGameMessageEvent, com.tencent.mm.ui.base.preference.IconPreference, com.tencent.mm.autogen.events.QueryGameMessageEvent, java.lang.String, java.lang.String):void");
    }

    /* renamed from: e0 */
    public final int mo25901e0() {
        if (C96796d.m124292a() != null) {
            C96461f Dx0 = C96463h.yx0().Dx0();
            if (C96463h.yx0().Ex0() && Dx0.mo134437e() && !Dx0.mo134436d()) {
                if ("3".equals(Dx0.f282215a) && !Util.isNullOrNil(Dx0.f282229o)) {
                    return 6;
                }
                if (!Util.isNullOrNil(Dx0.f282221g)) {
                    return 3;
                }
                if (Dx0.f282220f) {
                    return 2;
                }
            }
        }
        return 1;
    }

    /* renamed from: f0 */
    public final FinderJumpInfo mo25902f0() {
        Class cls = C60200t1.class;
        C55718s0 G5 = ((C60200t1) C86312j.m106911c(cls)).Nt0().mo77227G5("FinderEntrance");
        if (G5 == null) {
            return null;
        }
        C64586nn1 o2 = G5.mo77308o2("FinderEntrance");
        FinderJumpInfo finderJumpInfo = G5.f158585F.f186539A;
        if (o2 == null || finderJumpInfo == null || finderJumpInfo.jumpinfo_type != 3 || !((C60200t1) C86312j.m106911c(cls)).Nt0().mo77253Y5()) {
            return null;
        }
        return finderJumpInfo;
    }

    /* renamed from: f4 */
    public void mo24653f4() {
        if (this.f55702t != null) {
            this.f55674I = C75592q0.m90787q();
            mo25885M0();
        }
    }

    /* renamed from: g */
    public void mo25903g() {
        Log.m105926v("MicroMsg.FindMoreFriendsUI", "on tab switch out");
        this.f55668C = false;
        this.f55696X0 = false;
        this.f55698Y0 = false;
        this.f55670E = false;
        this.f55673H = false;
        mo25871A0();
    }

    /* renamed from: g0 */
    public final int mo25904g0() {
        int i;
        int a = C75044y4.m89989a(getContext());
        int g = C75044y4.m89995g(getContext(), -1);
        View findViewById = getView().getRootView().findViewById(C0966R.C0970id.f5383do);
        if (C85875k4.m106164U()) {
            return findViewById != null ? a + findViewById.getTop() : a + g;
        }
        int i2 = Build.VERSION.SDK_INT;
        boolean isInMultiWindowMode = (i2 < 24 || LauncherUI.getInstance() == null) ? false : LauncherUI.getInstance().isInMultiWindowMode();
        if (!isInMultiWindowMode) {
            SharedPreferences defaultPreference = MMApplicationContext.getDefaultPreference();
            if (((defaultPreference != null ? defaultPreference.getBoolean("Main_need_read_top_margin", false) : false) || i2 >= 31) && (i = defaultPreference.getInt("Main_top_marign", -1)) >= 0) {
                Log.m105925i("MicroMsg.FindMoreFriendsUI", "getTopHeight statusHeight:%s, topMargin:%s", Integer.valueOf(g), Integer.valueOf(i));
                return a + i;
            }
        }
        if (isInMultiWindowMode) {
            g = findViewById != null ? findViewById.getTop() : 0;
        }
        Log.m105925i("MicroMsg.FindMoreFriendsUI", "getTopHeight statusHeight:%s, isInMultiWindowMode:%s", Integer.valueOf(g), Boolean.valueOf(isInMultiWindowMode));
        return a + g;
    }

    /* renamed from: h0 */
    public final void mo25905h0() {
        if (!C43471q.m46984h(1)) {
            Log.m105920e("MicroMsg.FindMoreFriendsUI", "fts h5 template not avail");
            return;
        }
        String optString = ((C0406o) C86312j.m106911c(C0406o.class)).mo448p4("discoverRecommendEntry").optString("wording");
        if (Util.isNullOrNil(optString)) {
            Log.m105920e("MicroMsg.FindMoreFriendsUI", "empty query");
            return;
        }
        Log.m105924i("MicroMsg.FindMoreFriendsUI", "look one look clikced");
        C22426h.m26109k(getContext(), 21, (Bundle) null, "", (C13841a) null);
        ((C88908g) C86312j.m106911c(C88908g.class)).open("labs_browse");
        OnSearchSearchBoxCtrlInfoChangedEvent onSearchSearchBoxCtrlInfoChangedEvent = new OnSearchSearchBoxCtrlInfoChangedEvent();
        onSearchSearchBoxCtrlInfoChangedEvent.f264957d.f264958a = 0;
        onSearchSearchBoxCtrlInfoChangedEvent.publish();
        C22613h1.m26476b(21, optString);
        C22613h1.m26481g(21, 0);
        ((C21723h) ((C21912d) C86312j.m106911c(C21912d.class)).mo34966t4()).mo33986F();
    }

    /* renamed from: i0 */
    public final void mo25906i0() {
        if (!C43471q.m46984h(0)) {
            Log.m105920e("MicroMsg.FindMoreFriendsUI", "fts h5 template not avail");
            return;
        }
        String optString = ((C0406o) C86312j.m106911c(C0406o.class)).mo448p4("discoverSearchEntry").optString("wording");
        if (Util.isNullOrNil(optString)) {
            Log.m105920e("MicroMsg.FindMoreFriendsUI", "empty title");
            return;
        }
        C22611g1.f65023c.mo35733a(2);
        C22611g1 g1Var = C22611g1.f65023c;
        g1Var.getClass();
        g1Var.f65024a = new C22611g1.C22612a();
        g1Var.mo35734b();
        ((C88908g) C86312j.m106911c(C88908g.class)).open("labs1de6f3");
        C22613h1.m26478d("", 0, 0, 20);
        String lh02 = ((C0405n) C86312j.m106911c(C0405n.class)).lh0(20);
        String b = ((FTSWebViewLogic) C6080m.m5948g9()).mo134657b(20, 0, true);
        HashMap hashMap = new HashMap();
        hashMap.put("sessionId", lh02);
        hashMap.put("inputMarginTop", "32");
        hashMap.put("inputMarginLeftRight", "24");
        hashMap.put("inputHeight", "48");
        if (b != null && !b.isEmpty()) {
            hashMap.put("educationTab", Uri.encode(b));
        }
        hashMap.put("clickType", "0");
        ((C101982p) C86312j.m106911c(C101982p.class)).in0(getContext(), 20, "", lh02, true, hashMap, optString);
        ((C90584e) C86312j.m106911c(C90584e.class)).mo60856OH(C90583b.f260260d);
    }

    /* renamed from: j0 */
    public boolean mo25907j0(long j) {
        return (j & this.f55675J) != 0;
    }

    /* renamed from: k0 */
    public boolean mo25908k0() {
        return Util.isSameDay(C86709a0.m107535s().mo121142i().mo119673G(C72994y1.C72995a.FIND_MORE_UI_ENTRY_LAST_REPORT_TIME_LONG_SYNC, 0), this.f55701s);
    }

    /* renamed from: l0 */
    public final boolean mo25909l0() {
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_jd_entrance_declare, 0);
        boolean g = C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_JD_ENTRANCE_DECLARE_CLICK_BOOLEAN_SYNC, false);
        Log.m105925i("MicroMsg.FindMoreFriendsUI", "show declare needShow %d, hasShow %s", Integer.valueOf(Qe), Boolean.valueOf(g));
        return Qe != 0 && !g;
    }

    /* renamed from: l4 */
    public void mo25910l4(long j) {
    }

    /* renamed from: m0 */
    public final boolean mo25911m0() {
        Class cls = C10432i.class;
        boolean sF = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76873sF();
        boolean z = !mo25907j0(34359738368L);
        boolean z2 = ((C10432i) C86312j.m106911c(cls)).mo10750e() && ((C10432i) C86312j.m106911c(cls)).mo10740Mn() == 2;
        Log.m105925i("MicroMsg.FindMoreFriendsUI", "[isShowFinderEntrance] show:%s open:%s, isTeenModeAndNothing:%s", Boolean.valueOf(sF), Boolean.valueOf(z), Boolean.valueOf(z2));
        return sF && z && !z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001e, code lost:
        r3 = (com.tencent.p014mm.p136ui.FinderIconViewTipPreference) r3.mo72519a("find_friends_by_finder");
     */
    /* renamed from: n0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25912n0(boolean r14, boolean r15) {
        /*
            r13 = this;
            java.lang.Class<ht1.e4> r0 = ht1.C60165e4.class
            java.lang.Class<ht1.t1> r1 = ht1.C60200t1.class
            di3.d r2 = di3.C86312j.m106911c(r1)
            ht1.t1 r2 = (ht1.C60200t1) r2
            int r2 = r2.Pe0()
            kj2.d r3 = kj2.C117407d.INSTANCE
            r4 = 1279(0x4ff, double:6.32E-321)
            r6 = 0
            r8 = 1
            r10 = 0
            r3.idkeyStat(r4, r6, r8, r10)
            com.tencent.mm.ui.base.preference.a r3 = r13.f55702t
            if (r3 == 0) goto L_0x002d
            java.lang.String r4 = "find_friends_by_finder"
            com.tencent.mm.ui.base.preference.Preference r3 = r3.mo72519a(r4)
            com.tencent.mm.ui.FinderIconViewTipPreference r3 = (com.tencent.p014mm.p136ui.FinderIconViewTipPreference) r3
            if (r3 == 0) goto L_0x002d
            ht1.e4$a r3 = r3.mo25970p0()
            goto L_0x002e
        L_0x002d:
            r3 = 0
        L_0x002e:
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            di3.d r5 = di3.C86312j.m106911c(r1)
            ht1.t1 r5 = (ht1.C60200t1) r5
            r6 = 1
            java.lang.String r2 = r5.mo76842e7(r6, r6, r2, r4)
            di3.d r5 = di3.C86312j.m106911c(r0)
            ht1.e4 r5 = (ht1.C60165e4) r5
            r7 = 0
            java.lang.String r3 = r5.mo85175vS(r2, r7, r7, r3)
            java.lang.String r5 = "key_red_dot_id"
            r4.putExtra(r5, r3)
            if (r14 == 0) goto L_0x0062
            java.lang.Class<ht1.a5> r14 = ht1.C76243a5.class
            di3.d r14 = di3.C86312j.m106911c(r14)
            ht1.a5 r14 = (ht1.C76243a5) r14
            java.lang.String r14 = r14.Tq0()
            java.lang.String r15 = "KEY_ROUTE_TO_PAGE"
            r4.putExtra(r15, r14)
            goto L_0x0069
        L_0x0062:
            if (r15 == 0) goto L_0x0069
            java.lang.String r14 = "KEY_ROUTE_TO_TOPIC"
            r4.putExtra(r14, r6)
        L_0x0069:
            java.lang.String r14 = "KEY_FROM_PATH"
            java.lang.String r15 = "FinderEntrance"
            r4.putExtra(r14, r15)
            java.lang.String r14 = "key_yreportsdk_reddot_info"
            r4.removeExtra(r14)
            di3.d r14 = di3.C86312j.m106911c(r1)
            ht1.t1 r14 = (ht1.C60200t1) r14
            ht1.b4 r14 = r14.Nt0()
            boolean r14 = r14.mo77253Y5()
            if (r14 != 0) goto L_0x0086
            goto L_0x00be
        L_0x0086:
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            di3.d r14 = di3.C86312j.m106911c(r1)
            ht1.t1 r14 = (ht1.C60200t1) r14
            ht1.b4 r14 = r14.Nt0()
            java.lang.String r5 = "FinderMentionEntrance"
            java.lang.String r10 = "reddot_"
            java.lang.String r11 = "_left"
            java.lang.String r12 = "push_type;scene;live_sub_recall_type;order_uid;enter_action;put_strategy;"
            java.util.HashMap r14 = r14.mo77245Q5(r5, r10, r11, r12)
            int r14 = r13.mo25927w0(r4, r15, r14)
            r15 = 2
            java.lang.Object[] r15 = new java.lang.Object[r15]
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r8)
            java.lang.Long r5 = java.lang.Long.valueOf(r8)
            r15[r7] = r5
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r15[r6] = r14
            java.lang.String r14 = "MicroMsg.FindMoreFriendsUI"
            java.lang.String r5 = "bindRedDotInfoInFinder cost[%d] size[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r5, r15)
        L_0x00be:
            di3.d r14 = di3.C86312j.m106911c(r1)
            ht1.t1 r14 = (ht1.C60200t1) r14
            android.app.Activity r15 = r13.getContext()
            r14.Fc0(r15, r4, r6)
            di3.d r14 = di3.C86312j.m106911c(r0)
            ht1.e4 r14 = (ht1.C60165e4) r14
            java.lang.String r15 = "Enter"
            r14.N40(r2, r15)
            di3.d r14 = di3.C86312j.m106911c(r0)
            ht1.e4 r14 = (ht1.C60165e4) r14
            r14.mo85148KR(r2, r3)
            java.lang.String r14 = "finder"
            nt1.C61894a.m72626a(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.FindMoreFriendsUI.mo25912n0(boolean, boolean):void");
    }

    public boolean noActionBar() {
        return true;
    }

    /* renamed from: o0 */
    public void mo25914o0() {
        FinderIconViewTipPreference finderIconViewTipPreference;
        C60165e4.C46105a aVar = new C60165e4.C46105a();
        C73244a aVar2 = this.f55702t;
        if (!(aVar2 == null || (finderIconViewTipPreference = (FinderIconViewTipPreference) aVar2.mo72519a(this.f55692V0.mo36505b())) == null)) {
            aVar = finderIconViewTipPreference.mo25970p0();
        }
        Intent intent = new Intent();
        ((C60165e4) C86312j.m106911c(C60165e4.class)).mo85173sz(((C60200t1) C86312j.m106911c(C60200t1.class)).mo76739CG(C59263a.m69189a(), intent), 1, aVar);
        mo25895X(intent, "FinderLiveEntrance");
        ((C7606d) C86312j.m106911c(C7606d.class)).mo8742gH(getContext(), intent);
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Log.m105924i("MicroMsg.FindMoreFriendsUI", "onActivityCreated");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo25875E0();
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f55688T0 != null) {
            ((C76243a5) C86312j.m106911c(C76243a5.class)).mo13217RA(this.f55688T0);
        }
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        Log.m105924i("MicroMsg.FindMoreFriendsUI", "onNotifyChange(MStorage)");
        if (LauncherUI.getCurrentTabIndex() == 2) {
            boolean z = false;
            boolean z2 = true;
            if (this.f55674I != C75592q0.m90787q()) {
                this.f55674I = C75592q0.m90787q();
                z = true;
            }
            if (this.f55675J != C75592q0.m90781k()) {
                this.f55675J = C75592q0.m90781k();
                z = true;
            }
            if (this.f55676K != C75592q0.m90785o()) {
                this.f55676K = C75592q0.m90785o();
            } else {
                z2 = z;
            }
            if (z2) {
                mo25885M0();
            }
        }
    }

    /* renamed from: p0 */
    public void mo25917p0() {
        FinderIconViewTipPreference finderIconViewTipPreference;
        C60165e4.C46105a aVar = new C60165e4.C46105a();
        C73244a aVar2 = this.f55702t;
        if (!(aVar2 == null || (finderIconViewTipPreference = (FinderIconViewTipPreference) aVar2.mo72519a(this.f55692V0.mo36505b())) == null)) {
            aVar = finderIconViewTipPreference.mo25970p0();
        }
        Intent intent = new Intent();
        ((C60165e4) C86312j.m106911c(C60165e4.class)).mo85173sz(((C60200t1) C86312j.m106911c(C60200t1.class)).mo76739CG(C59263a.m69189a(), intent), 1, aVar);
        mo25895X(intent, "FinderLiveEntrance");
        C61894a.m72626a(WeChatBrands.Business.GROUP_LIVE);
        ((C7606d) C86312j.m106911c(C7606d.class)).mo8741aa(getContext(), intent);
    }

    /* renamed from: r */
    public void mo25918r() {
        Log.m105924i("MicroMsg.FindMoreFriendsUI", "turn to fg");
    }

    /* renamed from: r0 */
    public final void mo25919r0(FinderIconViewTipPreference finderIconViewTipPreference, int i, boolean z, long j) {
        this.f55679N.postDelayed(new C19803o0(this, i, finderIconViewTipPreference, z, false), j);
    }

    /* renamed from: s0 */
    public final void mo25920s0(tg4 tg4) {
        int Cr = ((C75651n) C86312j.m106911c(C75651n.class)).mo55939Cr();
        Random random = new Random();
        if (Cr > 0 && tg4 != null) {
            tg4.f354439h = "8.6万人";
            tg4.f354440i = "#FA9D3B";
            tg4.f354442n = "#56FA9D3B";
            if (Cr == 2 || Cr == 4) {
                if (random.nextInt(10) % 2 == 0) {
                    tg4.f354441j = "http://dldir1.qq.com/weixin/checkresupdate/icons_filled_fire_v1_3e6119848137473b86dd83e917afe31b.png";
                } else {
                    tg4.f354441j = "http://dldir1.qq.com/weixin/checkresupdate/heart_d0713c51c1cb4a18b62d562fafefac53.png";
                }
            }
            if (Cr == 3 || Cr == 4) {
                tg4.f354443o = true;
            }
        }
    }

    public boolean supportNavigationSwipeBack() {
        return false;
    }

    /* renamed from: t */
    public void mo25922t() {
        Log.m105924i("MicroMsg.FindMoreFriendsUI", "turn to bg");
    }

    /* renamed from: t0 */
    public void mo25923t0(String str, boolean z) {
        Log.m105925i("MicroMsg.FindMoreFriendsUI", "note entry red dot [%s] entry [%b]", str, Boolean.valueOf(z));
        FindMoreFriendEntryRedDotEvent findMoreFriendEntryRedDotEvent = new FindMoreFriendEntryRedDotEvent();
        FindMoreFriendEntryRedDotEvent.C28743a aVar = findMoreFriendEntryRedDotEvent.f78789d;
        aVar.f78790a = str;
        aVar.f78791b = z;
        findMoreFriendEntryRedDotEvent.publish();
    }

    /* renamed from: t1 */
    public void mo25924t1(SnsObject snsObject) {
        if ((C75592q0.m90785o() & 32768) == 0) {
            mo25883L0();
            this.f55702t.notifyDataSetChanged();
        }
    }

    /* renamed from: u0 */
    public final void mo25925u0() {
        this.f55685S.dead();
        this.f55680P.dead();
        this.f55687T.dead();
        this.f55683R.dead();
        this.f55695X.dead();
        this.f55707x0.dead();
        this.f55709y0.dead();
        if (C97625j3.m125811a()) {
            ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96099XB().remove(this.f55681Q);
            IListenerMStorage.m48929g(GameMessageStorageNotifyEvent.class.getName(), this.f55689U);
            IListenerMStorage.m48929g(ShakeMessageStorageNotifyEvent.class.getName(), this.f55693W);
            IListenerMStorage.m48929g(GameLifeStorageNotifyEvent.class.getName(), this.f55691V);
            C75743h.yx0().remove(this);
            C97625j3.m125812b().mo105908w().remove(this);
            C97625j3.m125812b().mo105885K(this);
            C97625j3.m125812b().mo105906u().remove(this);
            if (this.f55666A != null) {
                ((C8451i) C86312j.m106911c(C8451i.class)).mo9372SO(this.f55666A);
            }
        }
        if (C102426c0.m135143b() != null) {
            C102426c0.m135143b().Jt0(this);
        }
    }

    /* renamed from: v0 */
    public final void mo25926v0(boolean z) {
        C48477m.C13789a.m13091a().va0(z);
    }

    /* renamed from: w0 */
    public final int mo25927w0(Intent intent, String str, HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        HashMap<String, Object> Q5 = ((C60200t1) C86312j.m106911c(C60200t1.class)).Nt0().mo77245Q5(str, "reddot_", "", "push_type;scene;live_sub_recall_type;order_uid;enter_action;put_strategy;");
        if (!Q5.isEmpty()) {
            hashMap2.putAll(Q5);
        }
        if (hashMap != null && !hashMap.isEmpty()) {
            hashMap2.putAll(hashMap);
        }
        if (intent == null || hashMap2.isEmpty()) {
            return 0;
        }
        intent.putExtra("key_yreportsdk_reddot_info", hashMap2);
        return hashMap2.size();
    }

    /* renamed from: x0 */
    public final void mo25928x0(boolean z, FinderIconViewTipPreference finderIconViewTipPreference) {
        C73244a aVar;
        if (finderIconViewTipPreference == null && (aVar = this.f55702t) != null) {
            finderIconViewTipPreference = (FinderIconViewTipPreference) aVar.mo72519a("find_friends_by_finder");
        }
        if (finderIconViewTipPreference != null) {
            C20609s sVar = finderIconViewTipPreference.f55779T1;
            ((C60165e4) C86312j.m106911c(C60165e4.class)).mo85170os(z, (sVar == null || sVar.getView().getVisibility() != 0) ? 1 : finderIconViewTipPreference.f55779T1.getRowCount(), finderIconViewTipPreference.mo25969o0(), finderIconViewTipPreference.mo25970p0());
        }
    }

    /* renamed from: y0 */
    public void mo25929y0() {
        Log.m105924i("MicroMsg.FindMoreFriendsUI", "notify comment change");
        if ((C75592q0.m90785o() & 32768) == 0) {
            if (C99019x.m128969a() != null) {
                this.f55704v = ((C100421x) C99019x.m128969a()).mo139896kD();
            }
            mo25883L0();
            this.f55702t.notifyDataSetChanged();
        }
    }

    /* renamed from: z0 */
    public final void mo25930z0(long j, int i, String str) {
        C86709a0.m107528h();
        C85801v1 i2 = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.GAME_ENTRANCE_MSG_ID_LONG_SYNC;
        if (j != i2.mo119673G(aVar, 0)) {
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(j));
            C48477m a = C48477m.C13789a.m13091a();
            if (a != null) {
                a.m00(j, i, str);
            }
        }
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        Log.m105924i("MicroMsg.FindMoreFriendsUI", "onNotifyChange(MStorageEx)");
        if (LauncherUI.getCurrentTabIndex() == 2) {
            boolean z = false;
            boolean z2 = true;
            if (this.f55674I != C75592q0.m90787q()) {
                this.f55674I = C75592q0.m90787q();
                z = true;
            }
            if (this.f55675J != C75592q0.m90781k()) {
                this.f55675J = C75592q0.m90781k();
                z = true;
            }
            if (this.f55676K != C75592q0.m90785o()) {
                this.f55676K = C75592q0.m90785o();
            } else {
                z2 = z;
            }
            if (z2) {
                mo25885M0();
            }
            if ((obj instanceof Integer) && ((Integer) obj).intValue() == 68377) {
                mo25883L0();
            }
            if (mStorageEx instanceof C44660i2) {
                this.f55702t.notifyDataSetChanged();
            }
        }
    }
}
