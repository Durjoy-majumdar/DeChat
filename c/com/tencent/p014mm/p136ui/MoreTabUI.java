package com.tencent.p014mm.p136ui;

import a70.C112760b;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ConfigUpdatedEvent;
import com.tencent.p014mm.autogen.events.GotoCardHomePageEvent;
import com.tencent.p014mm.autogen.events.RequestEnterWalletEvent;
import com.tencent.p014mm.autogen.events.StoryVideoViewDetachEvent;
import com.tencent.p014mm.autogen.events.UpgradeConfigEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.StoryPreviewReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.StoryProfileTabExposeStruct;
import com.tencent.p014mm.p136ui.base.preference.C73244a;
import com.tencent.p014mm.p136ui.base.preference.IconPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreferenceFragment;
import com.tencent.p014mm.p136ui.base.preference.NormalIconTipPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.contact.AddressUI;
import com.tencent.p014mm.p136ui.widget.listview.PullDownListView;
import com.tencent.p014mm.p136ui.widget.pulldown.NestedBounceView;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2458a;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.newtips.NormalIconNewTipPreference;
import com.tencent.p014mm.plugin.newtips.model.C115620d;
import com.tencent.p014mm.plugin.newtips.model.C115627l;
import com.tencent.p014mm.plugin.newtips.model.C115631n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.story.api.AbsStoryGallery;
import com.tencent.p014mm.plugin.story.api.AbsStoryMuteView;
import com.tencent.p014mm.pluginsdk.p133ui.preference.AccountInfoPreference;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C30777t2;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.tinker.loader.shareutil.ShareTinkerLog;
import di3.C86312j;
import dm2.C45418c;
import eb0.C75592q0;
import eb0.C97625j3;
import f40.C86709a0;
import f40.C86718e;
import fd0.C75743h;
import gc0.C20828a;
import gc2.C116945b;
import hc0.C20937c;
import hr0.C33028c;
import ht1.C60165e4;
import ht1.C60200t1;
import ht1.C76243a5;
import ic0.C21070h;
import ie3.C76324c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import jc0.C21210b;
import jw2.C99069d;
import k13.C9555a;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import kj2.C117407d;
import ky2.C10432i;
import l20.C21388a;
import lc3.C10485b;
import lu3.C88654b;
import m13.C88689b;
import na3.C76846i;
import nc0.C76850a;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76912y0;
import nz0.C76982e;
import o00.C47315c;
import ob0.C11385n;
import ob0.C117747y;
import org.xwalk.core.XWalkEnvironment;
import p151er.C75651n;
import p206nj.C11171e;
import p206nj.C76860a;
import p220pr.C77288i;
import p244tt.C14088e;
import p271xn.C91298n;
import p272xq.C102712e;
import p327ct.C20362d;
import p327ct.C30914c;
import p617mz.C88862d;
import p626nv.C109759g;
import p629ny.C76979h;
import p640ox.C77049b;
import p773yy.C79168k;
import pj3.C47511g;
import qe3.C89625d;
import qg0.C12215a;
import qo3.C77407n;
import qy2.C47904x;
import qy2.C63347a;
import qy2.C77448f0;
import qy2.C77451h;
import qy2.C77453j;
import qy2.C77454m;
import ru0.C118231b;
import s00.C90110f;
import sf0.C77702q0;
import su0.C13781a;
import te3.C64586nn1;
import tw0.C90583b;
import tw0.C90584e;
import uz2.C78315f0;
import vo3.C78461f;
import xv2.C102775d;
import xv2.C102778f;
import xv2.C79005m;
import yb3.C79064a;

/* renamed from: com.tencent.mm.ui.MoreTabUI */
public class MoreTabUI extends AbstractTabChildPreference implements MStorageEx.IOnStorageChange, C102778f, C77454m {

    /* renamed from: Q0 */
    public static final /* synthetic */ int f214468Q0 = 0;

    /* renamed from: A */
    public StoryStatusMachine f214469A = new StoryStatusMachine((C730921) null);

    /* renamed from: B */
    public boolean f214470B = false;

    /* renamed from: C */
    public boolean f214471C = false;

    /* renamed from: D */
    public boolean f214472D = false;

    /* renamed from: E */
    public boolean f214473E = false;

    /* renamed from: F */
    public boolean f214474F = false;

    /* renamed from: G */
    public AccountInfoPreference f214475G = null;

    /* renamed from: H */
    public View f214476H;

    /* renamed from: I */
    public int f214477I = 0;

    /* renamed from: J */
    public int f214478J = 0;

    /* renamed from: K */
    public int f214479K = 0;

    /* renamed from: L */
    public boolean f214480L = false;

    /* renamed from: M */
    public boolean f214481M = false;

    /* renamed from: N */
    public boolean f214482N = false;

    /* renamed from: P */
    public boolean f214483P = false;

    /* renamed from: Q */
    public boolean f214484Q = false;

    /* renamed from: R */
    public boolean f214485R = false;

    /* renamed from: S */
    public C88654b f214486S;

    /* renamed from: T */
    public int f214487T = 0;

    /* renamed from: U */
    public C20362d.C20363a f214488U = new C20362d.C20363a() {
        /* renamed from: P0 */
        public void mo31843P0(int i, int i2, String str) {
            AccountInfoPreference accountInfoPreference;
            Class cls = C30914c.class;
            if (i == 262145 || i == 266260 || i == 262157 || i == 266267 || i == 262158 || i == 262164) {
                MoreTabUI moreTabUI = MoreTabUI.this;
                int i3 = MoreTabUI.f214468Q0;
                moreTabUI.mo101448p0();
                MoreTabUI.this.mo101447o0();
            } else if (i == 262147) {
                MoreTabUI moreTabUI2 = MoreTabUI.this;
                int i4 = MoreTabUI.f214468Q0;
                moreTabUI2.mo101446n0();
            } else if (i == 262156) {
                MoreTabUI moreTabUI3 = MoreTabUI.this;
                int i5 = MoreTabUI.f214468Q0;
                moreTabUI3.mo101450s0();
            } else if (i == 262152) {
                MoreTabUI moreTabUI4 = MoreTabUI.this;
                int i6 = MoreTabUI.f214468Q0;
                moreTabUI4.mo101445m0();
            } else if (i == 352279) {
                MoreTabUI moreTabUI5 = MoreTabUI.this;
                int i7 = MoreTabUI.f214468Q0;
                moreTabUI5.getClass();
                Log.m105925i("MicroMsg.MoreTabUI", "updateBubbleTip %s", str);
                if (!(moreTabUI5.f214474F || (accountInfoPreference = moreTabUI5.f214475G) == null || moreTabUI5.f214497u == null)) {
                    accountInfoPreference.mo100713I();
                }
            } else if (i == 352280 && MoreTabUI.this.f214483P && ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33503l(352280)) {
                ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33507p(352280, false);
            }
            MoreTabUI.this.f214495s.notifyDataSetChanged();
        }

        /* renamed from: v0 */
        public void mo31844v0(C72994y1.C72995a aVar, int i, String str) {
            if (aVar == C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_NEW_CARD_REDDOT_WORDING_STRING_SYNC) {
                MoreTabUI moreTabUI = MoreTabUI.this;
                int i2 = MoreTabUI.f214468Q0;
                moreTabUI.mo101445m0();
            } else if (aVar == C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_NEW_CARD_ICON_STRING_SYNC) {
                MoreTabUI moreTabUI2 = MoreTabUI.this;
                int i3 = MoreTabUI.f214468Q0;
                moreTabUI2.mo101445m0();
            } else if (aVar == C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_WALLET_MORE_TAB_STRING_SYNC || aVar == C72994y1.C72995a.USERINFO_WALLET_New_MY_ENTRY_TAB_REDDOT_STRING_SYNC) {
                MoreTabUI moreTabUI3 = MoreTabUI.this;
                int i4 = MoreTabUI.f214468Q0;
                moreTabUI3.mo101450s0();
            } else if (aVar == C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_DEVICE_PROTECT_STRING_SYNC) {
                MoreTabUI moreTabUI4 = MoreTabUI.this;
                int i5 = MoreTabUI.f214468Q0;
                moreTabUI4.mo101448p0();
            }
            MoreTabUI.this.f214495s.notifyDataSetChanged();
        }
    };

    /* renamed from: V */
    public C21070h f214489V = new C21070h() {
        /* renamed from: a */
        public void mo6676a(String str, View view) {
            final NormalIconNewTipPreference normalIconNewTipPreference = (NormalIconNewTipPreference) MoreTabUI.this.f214495s.mo72519a("settings_mm_cardpackage");
            MMHandlerThread.postToMainThread(new Runnable(this) {
                public void run() {
                    normalIconNewTipPreference.mo101932N(0);
                    normalIconNewTipPreference.mo101931M(C0966R.C0969drawable.f357296c91);
                }
            });
        }

        /* renamed from: b */
        public void mo6677b(String str, View view, C21210b bVar) {
            final NormalIconNewTipPreference normalIconNewTipPreference = (NormalIconNewTipPreference) MoreTabUI.this.f214495s.mo72519a("settings_mm_cardpackage");
            final Bitmap bitmap = bVar.f59988d;
            if (bitmap != null) {
                MMHandlerThread.postToMainThread(new Runnable(this) {
                    public void run() {
                        normalIconNewTipPreference.mo101930L(bitmap);
                        normalIconNewTipPreference.mo101932N(0);
                    }
                });
            } else {
                MMHandlerThread.postToMainThread(new Runnable(this) {
                    public void run() {
                        normalIconNewTipPreference.mo101930L((Bitmap) null);
                        normalIconNewTipPreference.mo101932N(8);
                    }
                });
            }
        }

        /* renamed from: c */
        public Bitmap mo6678c(String str, View view, C21210b bVar) {
            return null;
        }
    };

    /* renamed from: W */
    public C0120a0<C2458a> f214490W = null;

    /* renamed from: X */
    public IListener<ConfigUpdatedEvent> f214491X;

    /* renamed from: Y */
    public IListener<UpgradeConfigEvent> f214492Y;

    /* renamed from: Z */
    public NewTipsXmlListener f214493Z;
    public PullDownListView.IPullDownCallback mPullDownCallback;

    /* renamed from: p0 */
    public View.OnLayoutChangeListener f214494p0;

    /* renamed from: s */
    public C47511g f214495s;
    /* access modifiers changed from: private */
    public AbsStoryGallery storyGallery = null;

    /* renamed from: t */
    public View f214496t;

    /* renamed from: u */
    public PullDownListView f214497u;

    /* renamed from: v */
    public AbsStoryMuteView f214498v = null;

    /* renamed from: w */
    public RelativeLayout f214499w = null;

    /* renamed from: x */
    public View f214500x = null;

    /* renamed from: x0 */
    public boolean f214501x0;

    /* renamed from: y */
    public C77451h f214502y = null;

    /* renamed from: y0 */
    public StoryCgiWatch f214503y0;

    /* renamed from: z */
    public View f214504z = null;

    /* renamed from: com.tencent.mm.ui.MoreTabUI$NewTipsXmlListener */
    public static class NewTipsXmlListener implements C115627l.C69942c {

        /* renamed from: a */
        public IconPreference f214526a;

        public NewTipsXmlListener(IconPreference iconPreference) {
            this.f214526a = iconPreference;
        }

        /* renamed from: a */
        public void mo96256a(C115620d dVar) {
            if (dVar != null && dVar.field_tipId == 1 && C116945b.wx0().mo175755d(1)) {
                this.f214526a.mo96250V(0);
                this.f214526a.mo101936T(8);
                IconPreference iconPreference = this.f214526a;
                iconPreference.f215054P = "";
                iconPreference.f215055Q = -1;
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.MoreTabUI$StoryCgiWatch */
    public class StoryCgiWatch implements C11385n {
        public StoryCgiWatch(MoreTabUI moreTabUI) {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        }
    }

    /* renamed from: com.tencent.mm.ui.MoreTabUI$StoryStatusMachine */
    public class StoryStatusMachine {

        /* renamed from: a */
        public int f214527a = 2;

        public StoryStatusMachine(C730921 r2) {
        }

        /* renamed from: a */
        public void mo101464a() {
            MoreTabUI moreTabUI = MoreTabUI.this;
            if (moreTabUI.f214472D) {
                if (moreTabUI.f214481M) {
                    moreTabUI.f214471C = false;
                    this.f214527a = 2;
                } else if (((C79168k) C86312j.m106911c(C79168k.class)).mo74105BS(C13781a.m13082a())) {
                    MoreTabUI.this.f214471C = true;
                    this.f214527a = 3;
                } else {
                    MoreTabUI.this.f214471C = false;
                    this.f214527a = 2;
                }
                MoreTabUI.this.f214470B = false;
            } else {
                moreTabUI.f214470B = false;
                this.f214527a = 2;
                moreTabUI.f214471C = false;
            }
            Log.m105925i("MicroMsg.MoreTabUI", "checkStoryStatus status=%s", Integer.valueOf(this.f214527a));
            mo101466c();
        }

        /* renamed from: b */
        public void mo101465b(int i) {
            Log.m105925i("MicroMsg.MoreTabUI", "forceToStatus %s", Integer.valueOf(i));
            if (i == 0) {
                MoreTabUI.this.f214470B = true;
            } else {
                MoreTabUI.this.f214470B = false;
            }
            if (i == 3) {
                MoreTabUI.this.f214471C = true;
            } else {
                MoreTabUI.this.f214471C = false;
            }
            this.f214527a = i;
            mo101466c();
        }

        /* renamed from: c */
        public void mo101466c() {
            boolean z = true;
            Log.m105925i("MicroMsg.MoreTabUI", "updateUIByStory status:%s", Integer.valueOf(this.f214527a));
            if (MoreTabUI.this.getActivity() != null) {
                ((C79168k) C86312j.m106911c(C79168k.class)).mo74122Xo(MoreTabUI.this.getActivity(), MoreTabUI.this.f214497u);
                if (this.f214527a == 3) {
                    MoreTabUI.this.f214497u.setSelector(C0966R.color.f2927a);
                    if (MoreTabUI.this.getBounceView() != null) {
                        ((NestedBounceView) MoreTabUI.this.getBounceView()).mo154638f(false);
                    }
                } else {
                    MoreTabUI.this.f214497u.setSelector(C0966R.color.ahf);
                    if (MoreTabUI.this.getBounceView() != null) {
                        ((NestedBounceView) MoreTabUI.this.getBounceView()).mo154638f(true);
                    }
                }
                int i = this.f214527a;
                if (i == 0) {
                    MoreTabUI moreTabUI = MoreTabUI.this;
                    moreTabUI.f214497u.setBackground(C74942w4.m89785b(moreTabUI.getContext(), C0966R.attr.f2895ws));
                    MoreTabUI moreTabUI2 = MoreTabUI.this;
                    moreTabUI2.f214497u.setSupportOverscroll(moreTabUI2.f214470B);
                    MoreTabUI moreTabUI3 = MoreTabUI.this;
                    moreTabUI3.f214482N = false;
                    moreTabUI3.f214478J = C76577a.m92155f(moreTabUI3.getContext(), C0966R.dimen.akh);
                    if (MoreTabUI.this.storyGallery != null) {
                        MoreTabUI moreTabUI4 = MoreTabUI.this;
                        ((RelativeLayout.LayoutParams) MoreTabUI.this.storyGallery.getLayoutParams()).topMargin = moreTabUI4.f214479K;
                        PullDownListView pullDownListView = moreTabUI4.f214497u;
                        AbsStoryGallery U = moreTabUI4.storyGallery;
                        MoreTabUI moreTabUI5 = MoreTabUI.this;
                        int i2 = moreTabUI5.f214478J;
                        int i3 = moreTabUI5.f214479K;
                        pullDownListView.f220628F = U;
                        pullDownListView.f220637P = i2;
                        pullDownListView.f220636N = i3;
                        pullDownListView.f220653j = 0;
                        pullDownListView.f220652i = 0;
                    }
                    MoreTabUI moreTabUI6 = MoreTabUI.this;
                    moreTabUI6.f214497u.setMuteView(moreTabUI6.f214498v);
                    MoreTabUI moreTabUI7 = MoreTabUI.this;
                    MoreTabUI.m86013V(moreTabUI7, moreTabUI7.f214470B);
                    MoreTabUI.this.mo101439g0(0);
                    MoreTabUI moreTabUI8 = MoreTabUI.this;
                    moreTabUI8.mo101441i0(moreTabUI8.f214470B);
                    MoreTabUI moreTabUI9 = MoreTabUI.this;
                    PullDownListView pullDownListView2 = moreTabUI9.f214497u;
                    pullDownListView2.f220648e = false;
                    pullDownListView2.f220649f = true;
                    AccountInfoPreference accountInfoPreference = moreTabUI9.f214475G;
                    if (accountInfoPreference != null) {
                        accountInfoPreference.mo100715K(moreTabUI9.f214470B, moreTabUI9.f214482N, moreTabUI9.f214471C);
                    }
                } else if (i == 1) {
                    MoreTabUI.this.f214497u.setSupportOverscroll(true);
                    MoreTabUI.this.mo101435a0();
                    MoreTabUI moreTabUI10 = MoreTabUI.this;
                    if (moreTabUI10.f214482N) {
                        moreTabUI10.f214497u.setBackground(C74942w4.m89785b(moreTabUI10.getContext(), C0966R.attr.f2896wt));
                    } else {
                        moreTabUI10.f214497u.setBackground(C74942w4.m89785b(moreTabUI10.getContext(), C0966R.attr.f2895ws));
                    }
                    if (MoreTabUI.this.storyGallery != null) {
                        MoreTabUI moreTabUI11 = MoreTabUI.this;
                        ((RelativeLayout.LayoutParams) MoreTabUI.this.storyGallery.getLayoutParams()).topMargin = moreTabUI11.f214477I;
                        PullDownListView pullDownListView3 = moreTabUI11.f214497u;
                        AbsStoryGallery U2 = moreTabUI11.storyGallery;
                        MoreTabUI moreTabUI12 = MoreTabUI.this;
                        int i4 = moreTabUI12.f214478J;
                        int i5 = moreTabUI12.f214477I;
                        pullDownListView3.f220628F = U2;
                        pullDownListView3.f220637P = i4;
                        pullDownListView3.f220636N = i5;
                        pullDownListView3.f220653j = 0;
                        pullDownListView3.f220652i = 0;
                    }
                    MoreTabUI.this.f214497u.setMuteView((View) null);
                    MoreTabUI moreTabUI13 = MoreTabUI.this;
                    MoreTabUI.m86013V(moreTabUI13, moreTabUI13.f214470B);
                    MoreTabUI.this.mo101439g0(0);
                    MoreTabUI moreTabUI14 = MoreTabUI.this;
                    moreTabUI14.mo101441i0(moreTabUI14.f214470B);
                    MoreTabUI moreTabUI15 = MoreTabUI.this;
                    AccountInfoPreference accountInfoPreference2 = moreTabUI15.f214475G;
                    if (accountInfoPreference2 != null) {
                        accountInfoPreference2.mo100715K(moreTabUI15.f214470B, moreTabUI15.f214482N, moreTabUI15.f214471C);
                    }
                    PullDownListView pullDownListView4 = MoreTabUI.this.f214497u;
                    pullDownListView4.f220648e = false;
                    pullDownListView4.f220649f = true;
                } else if (i == 2) {
                    MoreTabUI moreTabUI16 = MoreTabUI.this;
                    moreTabUI16.f214497u.setBackground(C74942w4.m89785b(moreTabUI16.getContext(), C0966R.attr.f2896wt));
                    MoreTabUI moreTabUI17 = MoreTabUI.this;
                    moreTabUI17.f214497u.setSupportOverscroll(moreTabUI17.f214470B);
                    MoreTabUI moreTabUI18 = MoreTabUI.this;
                    PullDownListView pullDownListView5 = moreTabUI18.f214497u;
                    pullDownListView5.f220648e = false;
                    pullDownListView5.f220649f = true;
                    MoreTabUI.m86013V(moreTabUI18, moreTabUI18.f214470B);
                    MoreTabUI moreTabUI19 = MoreTabUI.this;
                    if (moreTabUI19.getContext() instanceof LauncherUI) {
                        ((LauncherUI) moreTabUI19.getContext()).getHomeUI().getClass();
                    }
                    MoreTabUI moreTabUI20 = MoreTabUI.this;
                    AccountInfoPreference accountInfoPreference3 = moreTabUI20.f214475G;
                    if (accountInfoPreference3 != null) {
                        accountInfoPreference3.mo100715K(moreTabUI20.f214470B, moreTabUI20.f214482N, moreTabUI20.f214471C);
                    }
                } else if (i == 3) {
                    C77451h hVar = MoreTabUI.this.f214502y;
                    if (hVar == null || !hVar.mo107625r()) {
                        z = false;
                    }
                    MoreTabUI.this.f214497u.setSupportOverscroll(z);
                    MoreTabUI.this.f214497u.setBackground((Drawable) null);
                    MoreTabUI.this.f214497u.setMuteView((View) null);
                    MoreTabUI moreTabUI21 = MoreTabUI.this;
                    MoreTabUI.m86013V(moreTabUI21, moreTabUI21.f214471C);
                    MoreTabUI moreTabUI22 = MoreTabUI.this;
                    AccountInfoPreference accountInfoPreference4 = moreTabUI22.f214475G;
                    if (accountInfoPreference4 != null) {
                        accountInfoPreference4.mo100715K(moreTabUI22.f214470B, moreTabUI22.f214482N, moreTabUI22.f214471C);
                    }
                }
            }
        }
    }

    public MoreTabUI() {
        C40008f fVar = C40008f.f107254d;
        this.f214491X = new IListener<ConfigUpdatedEvent>(this, fVar) {
            {
                this.__eventId = 320120113;
            }

            public boolean callback(IEvent iEvent) {
                ConfigUpdatedEvent.C1000a aVar;
                ConfigUpdatedEvent configUpdatedEvent = (ConfigUpdatedEvent) iEvent;
                Class cls = C88689b.class;
                if (!(configUpdatedEvent == null || (aVar = configUpdatedEvent.f9044d) == null)) {
                    if (!C89625d.f257843i && !C77702q0.m93719b(aVar.f9045a) && configUpdatedEvent.f9044d.f9045a.equals("clicfg_full_pkg_update_default_params")) {
                        String x9 = ((C88689b) C86312j.m106911c(cls)).mo122767x9(false);
                        ((C21388a) ((C30914c) C86312j.m106911c(C30914c.class)).mo17862sM()).mo33509r(262145, false);
                        C115669n.INSTANCE.idkeyStat(1429, 33, 1, false);
                        Log.m105925i("MicroMsg.MoreTabUI", "listener clicfg_full_pkg_update_default_params, canShowReddot = %s.", Boolean.valueOf(!TextUtils.isEmpty(x9)));
                        HashMap<String, Object> gd02 = ((C88689b) C86312j.m106911c(cls)).gd0();
                        MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putBoolean("update_has_new_package", gd02 != null && !gd02.isEmpty());
                    }
                    if (!C77702q0.m93719b(configUpdatedEvent.f9044d.f9045a) && (configUpdatedEvent.f9044d.f9045a.startsWith("clicfg_mmdiff_patch_pkg_update_params") || configUpdatedEvent.f9044d.f9045a.startsWith("clicfg_tinker_patch_pkg_update_params"))) {
                        ((C88689b) C86312j.m106911c(cls)).mo122761qt(true, false, false);
                    }
                }
                return false;
            }
        };
        this.f214492Y = new IListener<UpgradeConfigEvent>(this, fVar) {
            {
                this.__eventId = -423338260;
            }

            public boolean callback(IEvent iEvent) {
                UpgradeConfigEvent.C80743a aVar;
                UpgradeConfigEvent upgradeConfigEvent = (UpgradeConfigEvent) iEvent;
                Class cls = C91298n.class;
                Class cls2 = C88689b.class;
                if (!(upgradeConfigEvent == null || (aVar = upgradeConfigEvent.f236294d) == null)) {
                    Log.m105925i("MicroMsg.MoreTabUI", "listener upgradeConfigEventIListener， event.data.configName = %s， event.data.updateClientVersionCode = %s", aVar.f236295a, Integer.valueOf(aVar.f236296b));
                    if (((C88689b) C86312j.m106911c(cls2)).mo122748eJ()) {
                        if ("mmdiff_apk_has_update_notify".equals(upgradeConfigEvent.f236294d.f236295a)) {
                            ((C88689b) C86312j.m106911c(cls2)).mo122769xu(upgradeConfigEvent.f236294d.f236296b);
                            C91298n nVar = (C91298n) C86312j.m106911c(cls);
                            int i = upgradeConfigEvent.f236294d.f236297c;
                            nVar.mo125105XF(i != 3 ? 101 : 201, i);
                        } else if ("mmdiff_clear_update_redot".equals(upgradeConfigEvent.f236294d.f236295a)) {
                            ((C88689b) C86312j.m106911c(cls2)).Z80();
                        } else if ("mmdiff_apk_has_ready".equals(upgradeConfigEvent.f236294d.f236295a)) {
                            try {
                                Log.m105924i("MicroMsg.MoreTabUI", "listener upgradeConfigEventIListener，showNotification apk install.");
                                Intent intent = new Intent();
                                intent.putExtra("notify_type_extra", "mmdiff_apk_has_ready");
                                intent.setClassName(MMApplicationContext.getContext(), "com.tencent.mm.plugin.hp.mmdiff.MMDiffInstallApkService");
                                ((C88862d) C86312j.m106911c(C88862d.class)).mo123107HK(MMApplicationContext.getContext().getString(C0966R.string.lib), MMApplicationContext.getContext().getString(C0966R.string.k7l), PendingIntent.getService(MMApplicationContext.getContext(), 0, intent, 268435456));
                            } catch (Throwable th) {
                                ShareTinkerLog.m106531e("MicroMsg.MoreTabUI", "run result service fail, exception:" + th, new Object[0]);
                            }
                            C91298n nVar2 = (C91298n) C86312j.m106911c(cls);
                            int i2 = upgradeConfigEvent.f236294d.f236297c;
                            nVar2.mo125105XF(i2 != 3 ? 102 : 202, i2);
                        } else if ("mmdiff_goto_apk_install".equals(upgradeConfigEvent.f236294d.f236295a)) {
                            Log.m105924i("MicroMsg.MoreTabUI", "upgradeConfigEventIListener, checkMMDiffBoostInstall.");
                            ((C88689b) C86312j.m106911c(cls2)).mo122759nd();
                            ((C91298n) C86312j.m106911c(cls)).mo125105XF(104, 4);
                        }
                    }
                }
                return false;
            }
        };
        this.f214494p0 = new View.OnLayoutChangeListener() {
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                int i9 = i4 - i2;
                Log.m105919d("MicroMsg.MoreTabUI", "onLayoutChange: oldHeight:%s, newHeight:%s", Integer.valueOf(i8 - i6), Integer.valueOf(i9));
                MoreTabUI moreTabUI = MoreTabUI.this;
                int i15 = MoreTabUI.f214468Q0;
                moreTabUI.mo101433Y(i9);
                int b = C63347a.m74684b(MoreTabUI.this.getContext(), view);
                MoreTabUI moreTabUI2 = MoreTabUI.this;
                if (moreTabUI2.f214487T != b && moreTabUI2.f214502y != null && moreTabUI2.f214497u != null && moreTabUI2.f214504z != null) {
                    moreTabUI2.f214487T = C63347a.m74684b(moreTabUI2.getContext(), view);
                    MoreTabUI moreTabUI3 = MoreTabUI.this;
                    moreTabUI3.f214502y.mo107624l(moreTabUI3.f214487T);
                    MoreTabUI moreTabUI4 = MoreTabUI.this;
                    int i16 = moreTabUI4.f214487T;
                    PullDownListView pullDownListView = moreTabUI4.f214497u;
                    int i17 = C63347a.m74683a(moreTabUI4.getActivity())[1];
                    pullDownListView.f220648e = true;
                    pullDownListView.f220669z = i16;
                    pullDownListView.f220649f = false;
                    pullDownListView.f220623A = i17;
                    moreTabUI4.f214497u.setTranslationListener(new PullDownListView.C74996e(i16) {

                        /* renamed from: a */
                        public final /* synthetic */ int f214511a;

                        {
                            this.f214511a = r2;
                        }

                        /* renamed from: a */
                        public void mo96754a(float f) {
                            MoreTabUI moreTabUI = MoreTabUI.this;
                            if (moreTabUI.f214472D) {
                                int i = this.f214511a;
                                float f2 = f / ((float) i);
                                if (f < 0.0f) {
                                    f2 = 0.0f;
                                }
                                if (f > ((float) i)) {
                                    f2 = 1.0f;
                                }
                                moreTabUI.f214504z.setTranslationY(f);
                                C77451h hVar = MoreTabUI.this.f214502y;
                                if (hVar != null) {
                                    hVar.mo106676v(f2, f, (float) this.f214511a);
                                }
                                AccountInfoPreference accountInfoPreference = MoreTabUI.this.f214475G;
                                if (accountInfoPreference != null) {
                                    View view = accountInfoPreference.f212367Q;
                                    if (view != null) {
                                        float f3 = (1.0f - f2) * 1.0f;
                                        C9556a aVar = new C9556a();
                                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                        aVar.mo10233c(Float.valueOf(f3));
                                        View view2 = view;
                                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/MoreTabUI$13", "onTranslationYChange", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                                        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                                        C117292a.m165359e(view2, "com/tencent/mm/ui/MoreTabUI$13", "onTranslationYChange", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                                        View view3 = MoreTabUI.this.f214475G.f212371S;
                                        if (view3 != null) {
                                            if (f3 <= 0.0f) {
                                                C9556a aVar2 = new C9556a();
                                                aVar2.mo10233c(0);
                                                View view4 = view3;
                                                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/ui/MoreTabUI$13", "onTranslationYChange", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                                C117292a.m165359e(view4, "com/tencent/mm/ui/MoreTabUI$13", "onTranslationYChange", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                            } else {
                                                C9556a aVar3 = new C9556a();
                                                aVar3.mo10233c(8);
                                                View view5 = view3;
                                                C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/ui/MoreTabUI$13", "onTranslationYChange", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                                view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                                                C117292a.m165359e(view5, "com/tencent/mm/ui/MoreTabUI$13", "onTranslationYChange", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                            }
                                        }
                                    }
                                    C77453j jVar = MoreTabUI.this.f214475G.f212373T;
                                    if (jVar != null) {
                                        jVar.mo106676v(f2, f, (float) this.f214511a);
                                    }
                                }
                            }
                        }
                    });
                }
            }
        };
        C76577a.m92151b(getContext(), 48);
        C76577a.m92151b(getContext(), 120);
        this.mPullDownCallback = new PullDownListView.IPullDownCallback() {
            /* renamed from: e */
            public void mo96596e() {
                Log.m105924i("MicroMsg.MoreTabUI", "story_cat onMuteIn");
                MoreTabUI.this.f214498v.mo98082a();
            }

            /* renamed from: i */
            public void mo96597i(int i) {
                MoreTabUI moreTabUI = MoreTabUI.this;
                if (!moreTabUI.f214472D && moreTabUI.storyGallery != null) {
                    MoreTabUI.this.storyGallery.mo98067g(i);
                }
            }

            /* renamed from: n */
            public void mo96598n() {
                MoreTabUI.this.f214498v.mo98083b();
            }

            public void onPostClose() {
                C77453j jVar;
                C117292a.m165355a("com/tencent/mm/ui/MoreTabUI$15", "com/tencent/mm/ui/MoreTabUI$com/tencent/mm/ui/widget/listview/PullDownListView$IPullDownCallback", "onPostClose", "()V", this);
                MoreTabUI moreTabUI = MoreTabUI.this;
                boolean z = true;
                if (moreTabUI.f214472D) {
                    Object[] objArr = new Object[1];
                    if (moreTabUI.f214502y != null) {
                        z = false;
                    }
                    objArr[0] = Boolean.valueOf(z);
                    Log.m105925i("MicroMsg.MoreTabUI", "status_cat onPostClose, statusBackPreview is null?:%s", objArr);
                    C77451h hVar = MoreTabUI.this.f214502y;
                    if (hVar != null) {
                        hVar.onPostClose();
                    }
                    AccountInfoPreference accountInfoPreference = MoreTabUI.this.f214475G;
                    if (!(accountInfoPreference == null || (jVar = accountInfoPreference.f212373T) == null)) {
                        jVar.onPostClose();
                    }
                    C78461f bounceView = MoreTabUI.this.getBounceView();
                    if (bounceView != null) {
                        ((NestedBounceView) bounceView).f319699n |= 2;
                    }
                } else {
                    Object[] objArr2 = new Object[1];
                    objArr2[0] = Boolean.valueOf(moreTabUI.storyGallery == null);
                    Log.m105925i("MicroMsg.MoreTabUI", "story_cat onPostClose, storyGallery is null?:%s", objArr2);
                    if (MoreTabUI.this.storyGallery != null) {
                        MoreTabUI.this.storyGallery.mo98075o(true);
                        MoreTabUI.this.storyGallery.post(new Runnable() {
                            public void run() {
                                MoreTabUI moreTabUI = MoreTabUI.this;
                                int i = MoreTabUI.f214468Q0;
                                moreTabUI.mo101443k0();
                                MoreTabUI.this.mo101439g0(0);
                                MoreTabUI moreTabUI2 = MoreTabUI.this;
                                moreTabUI2.mo101441i0(moreTabUI2.f214470B);
                                View view = MoreTabUI.this.f214500x;
                                if (view != null) {
                                    view.setTranslationY(0.0f);
                                }
                            }
                        });
                    }
                    MoreTabUI moreTabUI2 = MoreTabUI.this;
                    moreTabUI2.f214474F = false;
                    moreTabUI2.f214469A.mo101466c();
                    MoreTabUI moreTabUI3 = MoreTabUI.this;
                    if (moreTabUI3.f214483P && !moreTabUI3.f214470B) {
                        C99069d.f290431n.f194473i = System.currentTimeMillis();
                    }
                }
                MoreTabUI moreTabUI4 = MoreTabUI.this;
                AccountInfoPreference accountInfoPreference2 = moreTabUI4.f214475G;
                if (!(accountInfoPreference2 == null || moreTabUI4.f214497u == null)) {
                    accountInfoPreference2.mo100713I();
                }
                C117292a.m165361g(this, "com/tencent/mm/ui/MoreTabUI$15", "com/tencent/mm/ui/MoreTabUI$com/tencent/mm/ui/widget/listview/PullDownListView$IPullDownCallback", "onPostClose", "()V");
            }

            public void onPostOpen(boolean z) {
                C77453j jVar;
                ArrayList arrayList = new ArrayList();
                arrayList.add(Boolean.valueOf(z));
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/MoreTabUI$15", "com/tencent/mm/ui/MoreTabUI$com/tencent/mm/ui/widget/listview/PullDownListView$IPullDownCallback", "onPostOpen", "(Z)V", this, array);
                MoreTabUI moreTabUI = MoreTabUI.this;
                boolean z2 = true;
                if (moreTabUI.f214472D) {
                    Object[] objArr = new Object[1];
                    if (moreTabUI.f214502y != null) {
                        z2 = false;
                    }
                    objArr[0] = Boolean.valueOf(z2);
                    Log.m105925i("MicroMsg.MoreTabUI", "status_cat onPostOpen, statusBackPreview is null?:%s", objArr);
                    C77451h hVar = MoreTabUI.this.f214502y;
                    if (hVar != null) {
                        hVar.onPostOpen(z);
                    }
                    AccountInfoPreference accountInfoPreference = MoreTabUI.this.f214475G;
                    if (!(accountInfoPreference == null || (jVar = accountInfoPreference.f212373T) == null)) {
                        jVar.onPostOpen(z);
                    }
                    MoreTabUI.this.mo101439g0(8);
                    C78461f bounceView = MoreTabUI.this.getBounceView();
                    if (bounceView != null) {
                        ((NestedBounceView) bounceView).f319699n &= -3;
                    }
                } else {
                    Object[] objArr2 = new Object[1];
                    objArr2[0] = Boolean.valueOf(moreTabUI.storyGallery == null);
                    Log.m105925i("MicroMsg.MoreTabUI", "story_cat onPostOpen, storyGallery is null?:%s", objArr2);
                    if (MoreTabUI.this.storyGallery != null) {
                        StoryPreviewReportStruct storyPreviewReportStruct = C99069d.f290421d;
                        storyPreviewReportStruct.f266265e = 1;
                        storyPreviewReportStruct.f266281u = 1;
                        MoreTabUI.this.storyGallery.mo98076p(z, true);
                        MoreTabUI.this.mo101439g0(8);
                        MoreTabUI moreTabUI2 = MoreTabUI.this;
                        if (moreTabUI2.getContext() instanceof LauncherUI) {
                            ((LauncherUI) moreTabUI2.getContext()).getHomeUI().getClass();
                        }
                        MoreTabUI moreTabUI3 = MoreTabUI.this;
                        if (C11171e.m11046c(19)) {
                            moreTabUI3.getWindow().setFlags(201327616, 201327616);
                        } else {
                            moreTabUI3.getWindow().setFlags(1024, 1024);
                        }
                    }
                    MoreTabUI moreTabUI4 = MoreTabUI.this;
                    moreTabUI4.f214474F = true;
                    if (!moreTabUI4.f214470B && !moreTabUI4.f214482N) {
                        C85801v1 i = C86709a0.m107535s().mo121142i();
                        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_STORY_PULL_DOWN_COUNT_INT;
                        C86709a0.m107535s().mo121142i().mo119677K(aVar, Integer.valueOf(i.mo119689j(aVar, 0) + 1));
                        MoreTabUI.this.mo101435a0();
                    }
                }
                AccountInfoPreference accountInfoPreference2 = MoreTabUI.this.f214475G;
                if (accountInfoPreference2 != null) {
                    accountInfoPreference2.mo100714J();
                }
                C117292a.m165361g(this, "com/tencent/mm/ui/MoreTabUI$15", "com/tencent/mm/ui/MoreTabUI$com/tencent/mm/ui/widget/listview/PullDownListView$IPullDownCallback", "onPostOpen", "(Z)V");
            }

            public void onPreClose() {
                PullDownListView pullDownListView;
                C77453j jVar;
                MoreTabUI moreTabUI = MoreTabUI.this;
                if (moreTabUI.f214472D) {
                    boolean z = true;
                    Object[] objArr = new Object[1];
                    if (moreTabUI.f214502y != null) {
                        z = false;
                    }
                    objArr[0] = Boolean.valueOf(z);
                    Log.m105925i("MicroMsg.MoreTabUI", "status_cat onPreClose, statusBackPreview is null?:%s", objArr);
                    C77451h hVar = MoreTabUI.this.f214502y;
                    if (hVar != null) {
                        hVar.onPreClose();
                        AccountInfoPreference accountInfoPreference = MoreTabUI.this.f214475G;
                        if (!(accountInfoPreference == null || (jVar = accountInfoPreference.f212373T) == null)) {
                            jVar.onPreClose();
                        }
                    }
                } else if (moreTabUI.storyGallery != null) {
                    MoreTabUI.this.storyGallery.mo98070j();
                }
                MoreTabUI moreTabUI2 = MoreTabUI.this;
                AccountInfoPreference accountInfoPreference2 = moreTabUI2.f214475G;
                if (accountInfoPreference2 != null && (pullDownListView = moreTabUI2.f214497u) != null) {
                    accountInfoPreference2.f212368Q0 = pullDownListView.f220631I;
                }
            }

            public void onPreOpen() {
                PullDownListView pullDownListView;
                C77453j jVar;
                MoreTabUI moreTabUI = MoreTabUI.this;
                if (moreTabUI.f214472D) {
                    boolean z = true;
                    Object[] objArr = new Object[1];
                    if (moreTabUI.f214502y != null) {
                        z = false;
                    }
                    objArr[0] = Boolean.valueOf(z);
                    Log.m105925i("MicroMsg.MoreTabUI", "status_cat onPreOpen, statusBackPreview is null?:%s", objArr);
                    C77451h hVar = MoreTabUI.this.f214502y;
                    if (hVar != null) {
                        hVar.onPreOpen();
                        AccountInfoPreference accountInfoPreference = MoreTabUI.this.f214475G;
                        if (!(accountInfoPreference == null || (jVar = accountInfoPreference.f212373T) == null)) {
                            jVar.onPreOpen();
                        }
                    }
                } else {
                    if (moreTabUI.storyGallery != null) {
                        MoreTabUI.this.storyGallery.mo98071k();
                    }
                    MoreTabUI moreTabUI2 = MoreTabUI.this;
                    if (moreTabUI2.f214483P && !moreTabUI2.f214470B) {
                        C99069d dVar = C99069d.f290418a;
                        C99069d.f290431n.f194470f = System.currentTimeMillis();
                        dVar.mo138415d();
                    }
                }
                MoreTabUI moreTabUI3 = MoreTabUI.this;
                AccountInfoPreference accountInfoPreference2 = moreTabUI3.f214475G;
                if (accountInfoPreference2 != null && (pullDownListView = moreTabUI3.f214497u) != null) {
                    accountInfoPreference2.f212368Q0 = pullDownListView.f220631I;
                }
            }

            /* renamed from: q */
            public void mo96603q(int i) {
                MoreTabUI moreTabUI = MoreTabUI.this;
                if (!moreTabUI.f214472D && moreTabUI.storyGallery != null) {
                    MoreTabUI.this.storyGallery.mo98065e(i);
                }
            }

            /* renamed from: u */
            public void mo96604u(int i) {
                MoreTabUI moreTabUI = MoreTabUI.this;
                if (!moreTabUI.f214472D && moreTabUI.storyGallery != null) {
                    MoreTabUI.this.storyGallery.mo98068h(i);
                }
            }
        };
        this.f214501x0 = false;
        this.f214503y0 = new StoryCgiWatch(this);
    }

    /* renamed from: V */
    public static void m86013V(MoreTabUI moreTabUI, boolean z) {
        FragmentActivity activity;
        Window window;
        View decorView;
        moreTabUI.getClass();
        int i = C77702q0.f226484a;
        Log.m105925i("MicroMsg.MoreTabUI", "updateStatusBarCell %s stack: %s", Boolean.valueOf(z), new C77702q0.C77703a().toString());
        if (Build.VERSION.SDK_INT >= 23 && (activity = moreTabUI.getActivity()) != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility((z || C85875k4.m106211z()) ? systemUiVisibility & -8193 : systemUiVisibility | 8192);
        }
    }

    /* renamed from: B1 */
    public void mo96576B1() {
        Log.m105924i("MicroMsg.MoreTabUI", "story_cat storyUINoStory");
        PullDownListView pullDownListView = this.f214497u;
        if (pullDownListView != null && !pullDownListView.f220631I) {
            pullDownListView.mo104538n();
        }
        this.f214469A.mo101465b(2);
        AccountInfoPreference accountInfoPreference = this.f214475G;
        if (accountInfoPreference != null) {
            accountInfoPreference.mo100714J();
        }
    }

    /* renamed from: D */
    public void mo25873D() {
    }

    /* renamed from: I4 */
    public void mo96578I4() {
        Log.m105924i("MicroMsg.MoreTabUI", "story_cat storyUIBackPressed");
        PullDownListView pullDownListView = this.f214497u;
        if (pullDownListView != null && !pullDownListView.f220631I) {
            pullDownListView.mo104538n();
        }
        mo101439g0(0);
        mo101441i0(this.f214470B);
    }

    /* renamed from: L */
    public int mo25882L() {
        return C0966R.xml.f8918bc;
    }

    /* renamed from: M */
    public boolean mo25884M(C47511g gVar, Preference preference) {
        C47511g gVar2 = gVar;
        Preference preference2 = preference;
        Class cls = C60200t1.class;
        Class cls2 = C109759g.class;
        Class cls3 = C30914c.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(gVar2);
        arrayList.add(preference2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/MoreTabUI", "com/tencent/mm/ui/AbstractTabChildPreference", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", this, array);
        StringBuilder sb = new StringBuilder();
        sb.append(preference2 == null ? "null" : preference2.f121285r);
        sb.append(" item has been clicked!");
        Log.m105924i("MicroMsg.MoreTabUI", sb.toString());
        if (!C86709a0.m107522a()) {
            Log.m105928w("MicroMsg.MoreTabUI", "account has not already!");
            C117292a.m165362h(true, this, "com/tencent/mm/ui/MoreTabUI", "com/tencent/mm/ui/AbstractTabChildPreference", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z");
            return true;
        }
        boolean z = false;
        if (preference2.f121285r.equals("settings_my_address")) {
            Intent intent = new Intent(getContext(), AddressUI.class);
            intent.putExtra("Contact_GroupFilter_Type", "@biz.contact");
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/ui/MoreTabUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/ui/MoreTabUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165362h(true, this, "com/tencent/mm/ui/MoreTabUI", "com/tencent/mm/ui/AbstractTabChildPreference", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z");
            return true;
        } else if (preference2.f121285r.equals("settings_my_add_contact")) {
            C88144b.m109791i(getContext(), "subapp", ".ui.pluginapp.AddMoreFriendsUI", new Intent(), (Bundle) null);
            C117292a.m165362h(true, this, "com/tencent/mm/ui/MoreTabUI", "com/tencent/mm/ui/AbstractTabChildPreference", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z");
            return true;
        } else if (preference2.f121285r.equals("settings_mm_wallet")) {
            if (!WeChatBrands.Business.Entries.MePayment.checkAvailable(getActivity())) {
                C117292a.m165362h(true, this, "com/tencent/mm/ui/MoreTabUI", "com/tencent/mm/ui/AbstractTabChildPreference", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z");
                return true;
            }
            ((C115627l) ((C109759g) C86312j.m106911c(cls2)).V40()).mo175762a(13);
            boolean e = ((C21388a) ((C30914c) C86312j.m106911c(cls3)).mo17862sM()).mo33497e(262156, 266248);
            boolean b = ((C21388a) ((C30914c) C86312j.m106911c(cls3)).mo17862sM()).mo33494b(262156, 266248);
            C115669n nVar = C115669n.INSTANCE;
            nVar.kvStat(10958, "9");
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf((e || b) ? 1 : 0);
            nVar.mo160131h(13341, objArr);
            String uuid = UUID.randomUUID().toString();
            nVar.mo160131h(14419, uuid, 0);
            RequestEnterWalletEvent requestEnterWalletEvent = new RequestEnterWalletEvent();
            requestEnterWalletEvent.f9428d.f9429a = getContext();
            Intent intent2 = new Intent();
            intent2.putExtra("key_wallet_has_red", b);
            intent2.putExtra("key_uuid", uuid);
            requestEnterWalletEvent.f9428d.f9430b = intent2;
            requestEnterWalletEvent.publish();
            ((C21388a) ((C30914c) C86312j.m106911c(cls3)).mo17862sM()).mo33499h(262156, 266248);
            ((C21388a) ((C30914c) C86312j.m106911c(cls3)).mo17862sM()).mo33501j(C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_WALLET_MORE_TAB_STRING_SYNC, C72994y1.C72995a.NEW_BANDAGE_WATCHER_WALLET_COMMON_STRING_SYNC);
            C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_LQT_WALLET_RED_DOT_WORDING_STRING, "");
            C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_LQT_WALLET_RED_DOT_INT, -1);
            C86709a0.m107528h();
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_WALLET_MY_ENTRY_REDDOT_BOOLEAN_SYNC;
            Boolean bool = Boolean.FALSE;
            i.mo119677K(aVar2, bool);
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_ENTRY_WORDING_STRING_SYNC, "");
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_MY_ENTRY_TAB_REDDOT_BOOLEAN_SYNC, bool);
            C20362d sM = ((C30914c) C86312j.m106911c(cls3)).mo17862sM();
            C72994y1.C72995a aVar3 = C72994y1.C72995a.USERINFO_WALLET_New_MY_ENTRY_TAB_REDDOT_STRING_SYNC;
            C72994y1.C72995a aVar4 = C72994y1.C72995a.USERINFO_NEW_BANDAGE_WATCHER_PAY_ENTRANCE_STRING_SYNC;
            boolean d = ((C21388a) sM).mo33496d(aVar3, aVar4);
            if (d) {
                C86709a0.m107528h();
                long longValue = ((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_New_MY_ENTRY_REDDOT_EXPIRETIME_LONG_SYNC, 0L)).longValue();
                if (longValue > 0 && System.currentTimeMillis() > longValue) {
                    d = false;
                }
            }
            ((C21388a) ((C30914c) C86312j.m106911c(cls3)).mo17862sM()).mo33501j(aVar3, aVar4);
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_New_MY_ENTRY_WORDING_STRING_SYNC, "");
            nVar.mo160131h(14872, 6, Integer.valueOf(b ? 1 : 0), "", "", 0);
            if (d) {
                nVar.mo160131h(25075, 0, 1);
                nVar.mo160131h(25075, 1, 1);
            }
            C117292a.m165362h(true, this, "com/tencent/mm/ui/MoreTabUI", "com/tencent/mm/ui/AbstractTabChildPreference", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z");
            return true;
        } else if (preference2.f121285r.equals("settings_mm_cardpackage")) {
            if (!WeChatBrands.Business.Entries.MeCouponCard.checkAvailable(getActivity())) {
                C117292a.m165362h(true, this, "com/tencent/mm/ui/MoreTabUI", "com/tencent/mm/ui/AbstractTabChildPreference", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z");
                return true;
            }
            ((C115627l) ((C109759g) C86312j.m106911c(cls2)).V40()).mo175762a(14);
            C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_CARD_REDOT_WORDING_STRING_SYNC, "");
            new Intent().putExtra("key_from_scene", 22);
            Log.m105924i("MicroMsg.MoreTabUI", "enter to cardhome");
            GotoCardHomePageEvent gotoCardHomePageEvent = new GotoCardHomePageEvent();
            gotoCardHomePageEvent.f107606d.f107608a = getContext();
            gotoCardHomePageEvent.f107606d.f107610c = 1;
            gotoCardHomePageEvent.publish();
            C117292a.m165362h(true, this, "com/tencent/mm/ui/MoreTabUI", "com/tencent/mm/ui/AbstractTabChildPreference", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z");
            return true;
        } else if (preference2.f121285r.equals("settings_my_album")) {
            if (!C97625j3.m125812b().mo105883I()) {
                C76912y0.m92771j(getContext(), (View) null);
            } else {
                String str = (String) C97625j3.m125812b().mo105906u().mo119684e(2, (Object) null);
                Intent intent3 = new Intent(getContext(), AlbumUI.class);
                intent3.putExtra("sns_userName", str);
                intent3.putExtra("username", str);
                intent3.putExtra("story_dot", this.f214484Q);
                intent3.setFlags(536870912);
                intent3.addFlags(67108864);
                Integer num = (Integer) C97625j3.m125812b().mo105906u().mo119684e(68389, (Object) null);
                int i2 = C77702q0.f226484a;
                C97625j3.m125812b().mo105906u().mo119676J(68389, Integer.valueOf((num == null ? 0 : num.intValue()) + 1));
                C9556a aVar5 = new C9556a();
                aVar5.mo10233c(intent3);
                C117292a.m165358d(this, aVar5.mo10232b(), "com/tencent/mm/ui/MoreTabUI", "setAlbum", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar5.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/ui/MoreTabUI", "setAlbum", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                if (((NormalIconNewTipPreference) ((C73244a) this.f214495s).mo72519a("settings_my_album")).f215059S == 0) {
                    z = true;
                }
                ((C79168k) C86312j.m106911c(C79168k.class)).mo74111Ij(12, z ? "1" : "0");
            }
            ((C115627l) ((C109759g) C86312j.m106911c(cls2)).V40()).mo175762a(36);
            C117292a.m165362h(true, this, "com/tencent/mm/ui/MoreTabUI", "com/tencent/mm/ui/AbstractTabChildPreference", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z");
            return true;
        } else if (preference2.f121285r.equals("settings_my_finder_album")) {
            C115669n.INSTANCE.mo160131h(21908, 1, 1, 2);
            C64586nn1 R5 = ((C60200t1) C86312j.m106911c(cls)).Nt0().mo77246R5("FinderMyTab");
            C55718s0 G5 = ((C60200t1) C86312j.m106911c(cls)).Nt0().mo77227G5("FinderMyTab");
            if (!(R5 == null || G5 == null)) {
                ((C60165e4) C86312j.m106911c(C60165e4.class)).Lc0("12", G5, R5, 3, "", 0, 0, 0);
            }
            ((C60200t1) C86312j.m106911c(cls)).mo76836bn(getContext(), new Intent(), 13, 2);
            C117292a.m165362h(true, this, "com/tencent/mm/ui/MoreTabUI", "com/tencent/mm/ui/AbstractTabChildPreference", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z");
            return true;
        } else if (preference2.f121285r.equals("settings_mm_favorite")) {
            C115669n nVar2 = C115669n.INSTANCE;
            nVar2.kvStat(10958, "8");
            nVar2.mo160131h(14103, 0);
            ((C102712e) C86312j.m106911c(C102712e.class)).F20(getContext(), ".ui.FavoriteIndexUI", new Intent());
            ((C90110f) C86312j.m106911c(C90110f.class)).mo124152cj();
            C117292a.m165362h(true, this, "com/tencent/mm/ui/MoreTabUI", "com/tencent/mm/ui/AbstractTabChildPreference", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z");
            return true;
        } else if (preference2.f121285r.equals("settings_emoji_store")) {
            C115669n nVar3 = C115669n.INSTANCE;
            nVar3.kvStat(10958, "7");
            ((C21388a) ((C30914c) C86312j.m106911c(cls3)).mo17862sM()).mo33499h(262147, 266244);
            ((C21388a) ((C30914c) C86312j.m106911c(cls3)).mo17862sM()).mo33499h(262149, 266244);
            Intent intent4 = new Intent();
            intent4.putExtra("report_entrance_scence", 24);
            intent4.putExtra("preceding_scence", 2);
            C88144b.m109791i(getContext(), "emoji", ".ui.v2.EmojiStoreV2UI", intent4, (Bundle) null);
            nVar3.mo160131h(12065, 1);
            ((C90584e) C86312j.m106911c(C90584e.class)).bs0(C90583b.f260257a, 881);
            ((C115627l) ((C109759g) C86312j.m106911c(cls2)).V40()).mo175762a(45);
            ((C115627l) ((C109759g) C86312j.m106911c(cls2)).V40()).mo175775q("sticker");
            C117292a.m165362h(true, this, "com/tencent/mm/ui/MoreTabUI", "com/tencent/mm/ui/AbstractTabChildPreference", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z");
            return true;
        } else if (preference2.f121285r.equals("more_setting")) {
            ((C115627l) ((C109759g) C86312j.m106911c(cls2)).V40()).mo175762a(30);
            ((C115627l) ((C109759g) C86312j.m106911c(cls2)).V40()).mo175775q("setting");
            boolean e2 = ((C21388a) ((C30914c) C86312j.m106911c(cls3)).mo17862sM()).mo33497e(262145, 266242);
            ((C21388a) ((C30914c) C86312j.m106911c(cls3)).mo17862sM()).mo33499h(262145, 266242);
            ((C21388a) ((C30914c) C86312j.m106911c(cls3)).mo17862sM()).mo33499h(262157, 266261);
            ((C21388a) ((C30914c) C86312j.m106911c(cls3)).mo17862sM()).mo33499h(262158, 266264);
            ((C21388a) ((C30914c) C86312j.m106911c(cls3)).mo17862sM()).mo33500i(C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_DEVICE_PROTECT_STRING_SYNC, 266242);
            ((C21388a) ((C30914c) C86312j.m106911c(cls3)).mo17862sM()).mo33499h(262164, 266268);
            C88144b.m109791i(getContext(), "setting", ".ui.setting.SettingsUI", new Intent(), (Bundle) null);
            int intValue = ((Integer) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_SETTING_RED_DOT_WILL_SHOW_ID_INT, 0)).intValue();
            C85801v1 u = C97625j3.m125812b().mo105906u();
            C72994y1.C72995a aVar6 = C72994y1.C72995a.USERINFO_SETTING_RED_DOT_DID_SHOW_ID_INT;
            int intValue2 = ((Integer) u.mo119685f(aVar6, 0)).intValue();
            if (!e2 && intValue > intValue2) {
                C97625j3.m125812b().mo105906u().mo119677K(aVar6, Integer.valueOf(intValue));
                IconPreference iconPreference = (IconPreference) gVar2.mo72519a("more_setting");
                if (iconPreference != null) {
                    iconPreference.mo96250V(8);
                }
                ((C21388a) ((C30914c) C86312j.m106911c(cls3)).mo17862sM()).mo33499h(266260, 266241);
            }
            ((C88689b) C86312j.m106911c(C88689b.class)).mo122739OZ();
            C117292a.m165362h(true, this, "com/tencent/mm/ui/MoreTabUI", "com/tencent/mm/ui/AbstractTabChildPreference", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z");
            return true;
        } else if (preference2.f121285r.equals("more_uishow")) {
            C77407n nVar4 = new C77407n((Context) getContext(), 1, false);
            nVar4.f225771i = new C11182m0(this) {
                public void onCreateMMMenu(C76874e0 e0Var) {
                    e0Var.mo107142f(0, "LiteAppList");
                    e0Var.mo107142f(3, "weui");
                    e0Var.mo107142f(4, "KindaUI");
                }
            };
            nVar4.f225782p = new C11184p0() {
                public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                    int itemId = menuItem.getItemId();
                    if (itemId == 0) {
                        MoreTabUI moreTabUI = MoreTabUI.this;
                        int i2 = MoreTabUI.f214468Q0;
                        moreTabUI.getClass();
                        ((C14088e) C86312j.m106911c(C14088e.class)).mo13516bG(moreTabUI.getContext());
                    } else if (itemId == 1) {
                        MoreTabUI moreTabUI2 = MoreTabUI.this;
                        int i3 = MoreTabUI.f214468Q0;
                        moreTabUI2.getClass();
                        Class cls = C75651n.class;
                        Intent intent = new Intent();
                        intent.addFlags(67108864);
                        intent.setClassName(moreTabUI2.getContext(), "com.tencent.mm.plugin.finder.ui.FinderPostRouterUI");
                        if (!((C75651n) C86312j.m106911c(cls)).mo55948kk()) {
                            intent.putExtra("key_can_select_video_and_pic", true);
                        }
                        intent.putExtra("is_hide_album_footer", true);
                        intent.putExtra("show_header_view", false);
                        intent.putExtra("max_select_count", 9);
                        intent.putExtra("query_source_type", 25);
                        intent.putExtra("query_media_type", 3);
                        intent.putExtra("album_video_max_duration", ((C75651n) C86312j.m106911c(cls)).mo55943dr());
                        intent.putExtra("album_video_min_duration", ((C75651n) C86312j.m106911c(cls)).mo55946g1().f267171i);
                        intent.putExtra("key_finder_post_router", 10);
                        Activity context = moreTabUI2.getContext();
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent);
                        Activity activity = context;
                        C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/ui/MoreTabUI", "startFlutterVideoEditorChoosePic", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context.startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(activity, "com/tencent/mm/ui/MoreTabUI", "startFlutterVideoEditorChoosePic", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } else if (itemId == 2) {
                        MoreTabUI moreTabUI3 = MoreTabUI.this;
                        int i4 = MoreTabUI.f214468Q0;
                        moreTabUI3.getClass();
                    } else if (itemId == 3) {
                        MoreTabUI moreTabUI4 = MoreTabUI.this;
                        int i5 = MoreTabUI.f214468Q0;
                        moreTabUI4.getClass();
                        ((C9555a) C86312j.m106911c(C9555a.class)).mo10230Zr(moreTabUI4.getContext(), new Intent());
                    } else if (itemId == 4) {
                        MoreTabUI moreTabUI5 = MoreTabUI.this;
                        int i6 = MoreTabUI.f214468Q0;
                        moreTabUI5.getClass();
                        ((C76324c) C86312j.m106911c(C76324c.class)).startUiTest();
                    }
                }
            };
            nVar4.mo107573q();
            MMPreferenceFragment.m86269K();
            C117292a.m165362h(true, this, "com/tencent/mm/ui/MoreTabUI", "com/tencent/mm/ui/AbstractTabChildPreference", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z");
            return true;
        } else if (preference2.f121285r.equals("settings_privacy_agreements")) {
            C12215a.m11778c(getActivity(), getString(C0966R.string.g5g, LocaleUtil.getApplicationLanguage(), C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null), "setting", 0, 0), 0, true);
            C117292a.m165362h(true, this, "com/tencent/mm/ui/MoreTabUI", "com/tencent/mm/ui/AbstractTabChildPreference", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z");
            return true;
        } else {
            C117292a.m165362h(false, this, "com/tencent/mm/ui/MoreTabUI", "com/tencent/mm/ui/AbstractTabChildPreference", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z");
            return false;
        }
    }

    /* renamed from: N */
    public boolean mo25886N(C47511g gVar, Preference preference, View view) {
        if (!C86709a0.m107522a()) {
            Log.m105928w("MicroMsg.MoreTabUI", "account has not already!");
            return true;
        }
        try {
            if (WeChatEnvironment.isMonkeyEnv() || WeChatEnvironment.isCoolassistEnv() || WeChatEnvironment.hasDebugger() || BuildInfo.IS_FLAVOR_RED) {
                if (Util.nullAsNil(preference.f121285r).equals("settings_emoji_store")) {
                    mo101442j0(true);
                    return true;
                } else if (Util.nullAsNil(preference.f121285r).equals("more_setting")) {
                    mo101442j0(false);
                    return true;
                }
            }
        } catch (ActivityNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: O */
    public void mo25888O(Bundle bundle) {
        boolean z = true;
        Log.m105925i("MicroMsg.MoreTabUI", "onTabCreate:  %s", Integer.valueOf(hashCode()));
        Configuration configuration = getResources().getConfiguration();
        this.f214481M = !C63347a.m74685c(getContext());
        int i = configuration.screenLayout;
        if ((i & 3) == 0 || (i & 16) == 0) {
            z = false;
        }
        this.f214485R = z;
        this.f214495s = this.f215101d;
        this.f214496t = getContentView();
        C76860a.m92657c(getContext());
        this.f214503y0.getClass();
        this.f214498v = ((C102775d) C86312j.m106911c(C102775d.class)).Eg0().mo108965a(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C76577a.m92155f(getContext(), C0966R.dimen.akg), C76577a.m92155f(getContext(), C0966R.dimen.akg));
        layoutParams.gravity = 83;
        ((ViewGroup) getContext().findViewById(C0966R.C0970id.hqu).getParent()).addView(this.f214498v, 0, layoutParams);
        PullDownListView pullDownListView = this.f214497u;
        pullDownListView.f220667y = this.mPullDownCallback;
        pullDownListView.setPadding(pullDownListView.getPaddingLeft(), this.f214497u.getPaddingTop(), this.f214497u.getPaddingRight(), this.f214500x.getHeight());
        if (this.f214499w != null) {
            Log.m105918d("MicroMsg.MoreTabUI", "dancy test add view !");
            mo101432X();
        }
    }

    /* renamed from: P */
    public void mo25889P() {
        Log.m105925i("MicroMsg.MoreTabUI", "onTabDestroy:  %s", Integer.valueOf(hashCode()));
        AbsStoryGallery absStoryGallery = this.storyGallery;
        if (absStoryGallery != null) {
            absStoryGallery.mo98066f();
        }
        AccountInfoPreference accountInfoPreference = this.f214475G;
        if (accountInfoPreference != null && accountInfoPreference.f212370R0) {
            ((C102775d) C86312j.m106911c(C102775d.class)).Eg0().mo108967c(accountInfoPreference.f212381Z);
        }
        this.f214503y0.getClass();
    }

    /* renamed from: Q */
    public void mo25890Q() {
        Log.m105919d("MicroMsg.MoreTabUI", "onTabPause %s", Integer.valueOf(hashCode()));
        ((C21388a) ((C30914c) C86312j.m106911c(C30914c.class)).mo17862sM()).mo33504m(this.f214488U);
        C97625j3.m125812b().mo105906u().remove(this);
        AbsStoryGallery absStoryGallery = this.storyGallery;
        if (absStoryGallery != null) {
            absStoryGallery.mo98069i();
        }
        PullDownListView pullDownListView = this.f214497u;
        if (pullDownListView != null) {
            boolean z = pullDownListView.f220631I;
            if (!z && !this.f214470B) {
                pullDownListView.postDelayed(new Runnable() {
                    public void run() {
                        MoreTabUI.this.f214497u.mo104538n();
                    }
                }, 200);
            } else if (z && pullDownListView.getTranslationY() != 0.0f) {
                this.f214497u.setTranslationY(0.0f);
            }
        }
        AccountInfoPreference accountInfoPreference = this.f214475G;
        if (accountInfoPreference != null) {
            accountInfoPreference.mo100714J();
        }
        mo101434Z(false);
        NewTipsXmlListener newTipsXmlListener = this.f214493Z;
        if (newTipsXmlListener != null) {
            newTipsXmlListener.f214526a = null;
            this.f214493Z = null;
        }
    }

    /* renamed from: R */
    public void mo25891R() {
        Log.m105925i("MicroMsg.MoreTabUI", "onTabResume:  %s", Integer.valueOf(hashCode()));
        C47511g gVar = this.f214495s;
        if (gVar instanceof C73244a) {
            C73244a aVar = (C73244a) gVar;
            if (aVar.f215137x == 0) {
                aVar.f215137x = System.currentTimeMillis();
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f214495s = this.f215101d;
        mo101436d0();
        C97625j3.m125812b().mo105906u().add(this);
        ((C21388a) ((C30914c) C86312j.m106911c(C30914c.class)).mo17862sM()).mo33493a(this.f214488U);
        mo101444l0();
        IconPreference iconPreference = (IconPreference) ((C73244a) this.f214495s).mo72519a("settings_my_address");
        if (iconPreference != null) {
            int Ow = C75743h.vx0().mo101166Ow();
            if (Ow > 0) {
                iconPreference.mo101936T(0);
                iconPreference.f215054P = "" + Ow;
                iconPreference.f215055Q = C0966R.C0969drawable.ake;
            } else {
                iconPreference.mo101936T(8);
                iconPreference.f215054P = "";
                iconPreference.f215055Q = -1;
            }
        }
        mo101447o0();
        Class cls = C76243a5.class;
        if (((C60200t1) C86312j.m106911c(C60200t1.class)).mo76885uf().mo8922a()) {
            C115669n.INSTANCE.mo160131h(21908, 1, 1, 1);
            ((C73244a) this.f214495s).mo72529n("settings_my_finder_album", false);
            NormalIconTipPreference normalIconTipPreference = (NormalIconTipPreference) ((C73244a) this.f214495s).mo72519a("settings_my_finder_album");
            if (C77702q0.m93719b(C75592q0.m90778h())) {
                normalIconTipPreference.f121258m1 = getString(C0966R.string.iux);
                normalIconTipPreference.mo69919b0();
            } else {
                normalIconTipPreference.f121258m1 = "";
                normalIconTipPreference.mo69919b0();
            }
            if (this.f214490W == null) {
                this.f214490W = new C0120a0<C2458a>() {
                    public void onChanged(Object obj) {
                        C2458a aVar = (C2458a) obj;
                        Class cls = C60200t1.class;
                        NormalIconTipPreference normalIconTipPreference = (NormalIconTipPreference) ((C73244a) MoreTabUI.this.f214495s).mo72519a("settings_my_finder_album");
                        if (aVar != null) {
                            Log.m105925i("MicroMsg.MoreTabUI", "[onChanged] result=%s", aVar);
                            if (aVar.f12908a) {
                                C64586nn1 nn12 = aVar.f12909b;
                                if (nn12 == null || !TextUtils.isEmpty(nn12.f184504f)) {
                                    normalIconTipPreference.mo101939Y(aVar.f12909b.f184504f, -1, -7566196);
                                    normalIconTipPreference.mo101937U(0);
                                } else {
                                    normalIconTipPreference.mo101937U(8);
                                }
                                normalIconTipPreference.mo101940Z(true);
                                normalIconTipPreference.f121258m1 = "";
                                normalIconTipPreference.mo69919b0();
                                C64586nn1 R5 = ((C60200t1) C86312j.m106911c(cls)).Nt0().mo77246R5("FinderMyTab");
                                C55718s0 G5 = ((C60200t1) C86312j.m106911c(cls)).Nt0().mo77227G5("FinderMyTab");
                                if (R5 != null && G5 != null) {
                                    ((C60165e4) C86312j.m106911c(C60165e4.class)).Lc0("12", G5, R5, 1, "", 0, 0, 0);
                                    return;
                                }
                                return;
                            }
                            normalIconTipPreference.mo101940Z(false);
                            normalIconTipPreference.mo101937U(8);
                            return;
                        }
                        normalIconTipPreference.mo101940Z(false);
                        normalIconTipPreference.mo101937U(8);
                    }
                };
                ((C76243a5) C86312j.m106911c(cls)).mo13207Gc(this, this.f214490W);
            }
            ((C76243a5) C86312j.m106911c(cls)).b80("FinderMyTab", C75592q0.m90778h());
        } else {
            ((C73244a) this.f214495s).mo72529n("settings_my_finder_album", true);
        }
        mo101446n0();
        mo101448p0();
        C88144b.m109788f("favorite");
        ((C73244a) this.f214495s).mo72529n("settings_mm_favorite", false);
        mo101450s0();
        mo101451t0();
        mo101445m0();
        if ((WeChatEnvironment.isMonkeyEnv() || WeChatEnvironment.isCoolassistEnv()) && C86312j.m106916h(C9555a.class)) {
            ((C73244a) this.f214495s).mo72529n("more_uishow", false);
        } else {
            ((C73244a) this.f214495s).mo72529n("more_uishow", true);
        }
        Preference a = ((C73244a) this.f214495s).mo72519a("settings_privacy_agreements");
        if (C76850a.m92639k((String) C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null))) {
            String string = getString(C0966R.string.hmo);
            Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(string);
            newSpannable.setSpan(new ForegroundColorSpan(getResources().getColor(C0966R.color.a1d)), newSpannable.length() - string.length(), newSpannable.length(), 33);
            a.mo69924H(newSpannable);
            ((C73244a) this.f214495s).mo72529n("settings_privacy_agreements", false);
        } else {
            ((C73244a) this.f214495s).mo72529n("settings_privacy_agreements", true);
        }
        thisActivity().supportInvalidateOptionsMenu();
        ((C73244a) this.f214495s).notifyDataSetChanged();
        final View findViewById = findViewById(C0966R.C0970id.g3q);
        if (!(findViewById == null || findViewById.getVisibility() == 8)) {
            new MMHandler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    View view = findViewById;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/MoreTabUI$16", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/ui/MoreTabUI$16", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.startAnimation(AnimationUtils.loadAnimation(MoreTabUI.this.getContext(), C0966R.C0968anim.f2394bx));
                }
            });
        }
        PullDownListView pullDownListView = this.f214497u;
        if (pullDownListView != null && pullDownListView.f220631I) {
            mo101439g0(0);
            Log.m105924i("MicroMsg.MoreTabUI", "onTabResume force set actionbar visible!!");
        }
        AbsStoryGallery absStoryGallery = this.storyGallery;
        if (absStoryGallery != null) {
            absStoryGallery.mo98072l();
            this.storyGallery.mo98063c();
        }
        mo101449r0();
        AccountInfoPreference accountInfoPreference = this.f214475G;
        if (accountInfoPreference != null) {
            accountInfoPreference.mo100713I();
        }
        Log.m105925i("MicroMsg.MoreTabUI", "[onTabResume] cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: S */
    public void mo25892S() {
        AbsStoryGallery absStoryGallery = this.storyGallery;
        if (absStoryGallery != null) {
            absStoryGallery.mo98073m();
        }
    }

    /* renamed from: T */
    public void mo25893T() {
        AbsStoryGallery absStoryGallery = this.storyGallery;
        if (absStoryGallery != null) {
            absStoryGallery.mo98074n();
        }
    }

    /* renamed from: V1 */
    public void mo96586V1() {
        Log.m105924i("MicroMsg.MoreTabUI", "story_cat storyUIHasStory");
        PullDownListView pullDownListView = this.f214497u;
        if (pullDownListView != null && pullDownListView.f220631I && this.f214483P) {
            if (this.f214481M) {
                this.f214469A.mo101465b(2);
            } else {
                this.f214469A.mo101465b(0);
            }
        }
        IconPreference iconPreference = (IconPreference) this.f214495s.mo72519a("settings_my_album");
        if (iconPreference == null) {
            return;
        }
        if (C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_STORY_NEED_DISPLAY_ALBUM_GUIDE_BOOLEAN_SYNC, true)) {
            this.f214484Q = true;
            iconPreference.mo96250V(0);
            return;
        }
        this.f214484Q = false;
        iconPreference.mo96250V(8);
    }

    /* renamed from: X */
    public final void mo101432X() {
        if (!this.f214473E) {
            this.f214473E = true;
            if (this.f214472D) {
                View view = new View(getContext());
                this.f214504z = view;
                this.f214499w.addView(view, 0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f214504z.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = -1;
                layoutParams.topMargin = C75044y4.m89990b(getContext()).x;
                this.f214504z.setBackgroundColor(getResources().getColor(C0966R.color.f2927a));
                C74783i3.m89537a(getContext());
                C77451h z6 = ((C79168k) C86312j.m106911c(C79168k.class)).mo74140z6(getContext(), new Runnable() {
                    public void run() {
                        PullDownListView pullDownListView = MoreTabUI.this.f214497u;
                        if (pullDownListView != null && !pullDownListView.f220631I) {
                            pullDownListView.mo104539o();
                        }
                    }
                }, false);
                this.f214502y = z6;
                this.f214499w.addView(z6.getView(), 0);
                this.f214502y.mo107620b(this);
                this.f214502y.mo72650h(C13781a.m13082a());
            } else {
                AbsStoryGallery d = ((C102775d) C86312j.m106911c(C102775d.class)).Eg0().mo108968d(getContext(), C79005m.C79006a.SelfTabGallery, (String) null);
                this.storyGallery = d;
                if (d != null) {
                    d.mo98062b();
                    this.f214479K = -(C75044y4.m89990b(getContext()).y / 10);
                    this.f214478J = this.f214482N ? C76577a.m92155f(getContext(), C0966R.dimen.aki) : C76577a.m92155f(getContext(), C0966R.dimen.akh);
                    this.f214477I = -C76577a.m92151b(getContext(), 330);
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, C75044y4.m89990b(getContext()).y);
                    layoutParams2.topMargin = this.f214479K;
                    layoutParams2.bottomMargin = -C75044y4.m89991c(getContext());
                    this.f214499w.addView(this.storyGallery, 0, layoutParams2);
                    PullDownListView pullDownListView = this.f214497u;
                    AbsStoryGallery absStoryGallery = this.storyGallery;
                    int i = this.f214478J;
                    int i2 = this.f214479K;
                    pullDownListView.f220628F = absStoryGallery;
                    pullDownListView.f220637P = i;
                    pullDownListView.f220636N = i2;
                    pullDownListView.f220653j = 0;
                    pullDownListView.f220652i = 0;
                    pullDownListView.setNavigationBarHeight(C75044y4.m89991c(getActivity()));
                    this.f214497u.setTranslationListener((PullDownListView.C74996e) null);
                    this.storyGallery.setDataSeed(C75592q0.m90789s());
                    this.storyGallery.mo98061a(this.f214497u);
                    this.storyGallery.setStoryBrowseUIListener(this);
                }
            }
            this.f214469A.mo101464a();
        }
    }

    /* renamed from: Y */
    public final void mo101433Y(int i) {
        try {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f214504z.getLayoutParams();
            if (layoutParams.topMargin != i) {
                layoutParams.topMargin = i;
                this.f214504z.setLayoutParams(layoutParams);
            }
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.MoreTabUI", th, "adjustStatusBgPosition", new Object[0]);
        }
    }

    /* renamed from: Y1 */
    public void mo96587Y1() {
        Log.m105924i("MicroMsg.MoreTabUI", "statusUIHasStatus");
        PullDownListView pullDownListView = this.f214497u;
        if (pullDownListView != null && pullDownListView.f220631I && this.f214483P) {
            if (this.f214481M) {
                this.f214469A.mo101465b(2);
            } else {
                this.f214469A.mo101465b(3);
            }
        }
    }

    /* renamed from: Z */
    public final void mo101434Z(boolean z) {
        if (getActivity() != null) {
            if (this.f214476H == null) {
                View findViewById = findViewById(C0966R.C0970id.f5383do);
                if (findViewById != null) {
                    this.f214476H = findViewById.findViewById(C0966R.C0970id.f5380dl);
                }
                boolean z2 = true;
                Object[] objArr = new Object[1];
                if (this.f214476H == null) {
                    z2 = false;
                }
                objArr[0] = Boolean.valueOf(z2);
                Log.m105925i("MicroMsg.MoreTabUI", "checkActionBarClick: findActionBar %s", objArr);
            }
            View view = this.f214476H;
            if (view == null) {
                return;
            }
            if (!z || this.f214472D) {
                view.setOnClickListener((View.OnClickListener) null);
            } else {
                view.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(view);
                        Object[] array = arrayList.toArray();
                        arrayList.clear();
                        C117292a.m165356b("com/tencent/mm/ui/MoreTabUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                        Log.m105924i("MicroMsg.MoreTabUI", "onClick: mActionBarRoot");
                        MoreTabUI moreTabUI = MoreTabUI.this;
                        if (moreTabUI.f214481M) {
                            C76912y0.makeText((Context) moreTabUI.getContext(), (CharSequence) MoreTabUI.this.getResources().getString(C0966R.string.f361421jr3), 0).show();
                        } else {
                            PullDownListView pullDownListView = moreTabUI.f214497u;
                            if (pullDownListView != null && pullDownListView.f220631I && moreTabUI.f214472D) {
                                pullDownListView.mo104547p();
                            }
                        }
                        C117292a.m165361g(this, "com/tencent/mm/ui/MoreTabUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                });
            }
        }
    }

    /* renamed from: a0 */
    public final void mo101435a0() {
        if (!this.f214482N && C86709a0.m107522a()) {
            int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_STORY_PULL_DOWN_COUNT_INT, 0);
            boolean g = C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_STORY_CAPTURE_FIRST_BOOLEAN_SYNC, false);
            Log.m105925i("MicroMsg.MoreTabUI", "checkSmallHead: %s", Integer.valueOf(j));
            boolean z = this.f214470B;
            if (z) {
                return;
            }
            if (g || j >= 1) {
                this.f214482N = true;
                AccountInfoPreference accountInfoPreference = this.f214475G;
                if (accountInfoPreference != null) {
                    accountInfoPreference.mo100715K(z, true, this.f214471C);
                }
                this.f214478J = this.f214482N ? C76577a.m92155f(getContext(), C0966R.dimen.aki) : C76577a.m92155f(getContext(), C0966R.dimen.akh);
            }
        }
    }

    /* renamed from: d */
    public void mo25899d() {
        Log.m105918d("MicroMsg.MoreTabUI", "onTabSwitchIn");
        this.f214483P = true;
        mo101436d0();
        if (getContext() != null) {
            Configuration configuration = getResources().getConfiguration();
            this.f214481M = !C63347a.m74685c(getContext());
            int i = configuration.screenLayout;
            this.f214485R = ((i & 3) == 0 || (i & 16) == 0) ? false : true;
        }
        PullDownListView pullDownListView = this.f214497u;
        if (pullDownListView != null) {
            pullDownListView.getClass();
            C85975v4.m106306c("MicroMsg.PullDownListView", "onResume", new Object[0]);
            pullDownListView.f220659r = true;
            PullDownListView pullDownListView2 = this.f214497u;
            if (!pullDownListView2.f220631I || pullDownListView2.getTranslationY() == 0.0f) {
                PullDownListView pullDownListView3 = this.f214497u;
                if (!pullDownListView3.f220631I) {
                    pullDownListView3.mo104538n();
                }
            } else {
                this.f214497u.setTranslationY(0.0f);
            }
        }
        AbsStoryGallery absStoryGallery = this.storyGallery;
        if (absStoryGallery != null) {
            absStoryGallery.mo98063c();
        }
        if (this.f214501x0) {
            try {
                C78315f0 f0Var = (C78315f0) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(getContext(), 9, C78315f0.class);
                if (f0Var != null) {
                    f0Var.f229428d = ((C47904x) C86312j.m106911c(C47904x.class)).mo72667bk();
                }
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.MoreTabUI", th, "[handleTabSwitchOutForStatus]err", new Object[0]);
            }
            mo101449r0();
            C77451h hVar = this.f214502y;
            if (hVar != null) {
                hVar.mo107621d();
            }
        }
        this.f214501x0 = false;
        ((C77288i) C86312j.m106911c(C77288i.class)).mo107439vw();
        mo101434Z(true);
        long currentTimeMillis = System.currentTimeMillis();
        C99069d dVar = C99069d.f290418a;
        StoryProfileTabExposeStruct storyProfileTabExposeStruct = C99069d.f290431n;
        storyProfileTabExposeStruct.f194473i = currentTimeMillis;
        storyProfileTabExposeStruct.f194468d = System.currentTimeMillis();
        if (!(getActivity() == null || getActivity().getWindow() == null)) {
            getActivity().getWindow().setSoftInputMode(34);
        }
        ((C88689b) C86312j.m106911c(C88689b.class)).mo122743Yo();
    }

    /* renamed from: d0 */
    public final void mo101436d0() {
        if (getActivity() != null) {
            boolean f = C77448f0.m93394f();
            if (!f && getBounceView() != null) {
                getBounceView().setBounceEnabled(false);
            }
            if (f != this.f214472D) {
                mo101437e0(f);
            }
        }
    }

    /* renamed from: e0 */
    public final void mo101437e0(boolean z) {
        this.f214472D = z;
        AbsStoryGallery absStoryGallery = this.storyGallery;
        if (absStoryGallery != null) {
            this.f214499w.removeView(absStoryGallery);
            this.storyGallery.mo98066f();
            PullDownListView pullDownListView = this.f214497u;
            pullDownListView.f220628F = null;
            pullDownListView.f220637P = 0;
            pullDownListView.f220636N = 0;
            pullDownListView.f220653j = 0;
            pullDownListView.f220652i = 0;
            this.storyGallery = null;
        }
        if (this.f214502y != null) {
            this.f214499w.removeView(this.f214504z);
            this.f214499w.removeView(this.f214502y.getView());
            this.f214502y.mo72647c();
            this.f214502y = null;
        }
        this.f214473E = false;
        mo101432X();
        mo101435a0();
        if (this.f214475G != null) {
            mo101444l0();
        }
    }

    /* renamed from: e1 */
    public void mo96588e1() {
        Log.m105924i("MicroMsg.MoreTabUI", "status statusUINoStatus");
        this.f214497u.setSupportOverscroll(false);
        PullDownListView pullDownListView = this.f214497u;
        if (pullDownListView != null && !pullDownListView.f220631I) {
            pullDownListView.mo104538n();
        }
        this.f214469A.mo101465b(2);
        AccountInfoPreference accountInfoPreference = this.f214475G;
        if (accountInfoPreference != null) {
            accountInfoPreference.mo100714J();
        }
    }

    /* renamed from: f0 */
    public final AccountInfoPreference mo101438f0() {
        if (this.f214475G == null) {
            this.f214475G = (AccountInfoPreference) this.f215101d.mo72519a("more_tab_setting_personal_info");
        }
        return this.f214475G;
    }

    /* renamed from: g */
    public void mo25903g() {
        Log.m105918d("MicroMsg.MoreTabUI", "onTabSwitchOut");
        this.f214483P = false;
        PullDownListView pullDownListView = this.f214497u;
        if (pullDownListView != null) {
            pullDownListView.getClass();
            C85975v4.m106306c("MicroMsg.PullDownListView", "onPause", new Object[0]);
            pullDownListView.f220659r = false;
            PullDownListView pullDownListView2 = this.f214497u;
            if (!pullDownListView2.f220631I) {
                pullDownListView2.mo104538n();
            }
        }
        C77451h hVar = this.f214502y;
        if (hVar != null) {
            hVar.mo107622g();
        }
        AbsStoryMuteView absStoryMuteView = this.f214498v;
        if (absStoryMuteView != null) {
            absStoryMuteView.setVisibility(8);
        }
        mo101439g0(0);
        new StoryVideoViewDetachEvent().publish();
        mo101434Z(false);
        C99069d.f290418a.mo138415d();
        if (!(getActivity() == null || getActivity().getWindow() == null)) {
            getActivity().getWindow().setSoftInputMode(50);
        }
        this.f214501x0 = true;
        ((C47904x) C86312j.m106911c(C47904x.class)).mo72663Tr();
        ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175775q("setting");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0013  */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101439g0(int r12) {
        /*
            r11 = this;
            androidx.fragment.app.FragmentActivity r0 = r11.getActivity()
            if (r0 == 0) goto L_0x000e
            r0 = 2131296436(0x7f0900b4, float:1.8210789E38)
            android.view.View r0 = r11.findViewById(r0)     // Catch:{ all -> 0x000e }
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            java.lang.String r9 = "MicroMsg.MoreTabUI"
            if (r0 == 0) goto L_0x0062
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r10.mo10233c(r1)
            java.lang.Object[] r2 = r10.mo10232b()
            java.lang.String r3 = "com/tencent/mm/ui/MoreTabUI"
            java.lang.String r4 = "setActionbarContainer"
            java.lang.String r5 = "(I)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r1 = r0
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            r8 = 0
            java.lang.Object r1 = r10.mo10231a(r8)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r2 = "com/tencent/mm/ui/MoreTabUI"
            java.lang.String r3 = "setActionbarContainer"
            java.lang.String r4 = "(I)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r1 = r0
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r0[r8] = r12
            java.lang.String r12 = "setActionbarContainer type:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r12, r0)
            goto L_0x0067
        L_0x0062:
            java.lang.String r12 = "setActionbarContainer is null!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r12)
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.MoreTabUI.mo101439g0(int):void");
    }

    /* renamed from: h0 */
    public final void mo101440h0(NormalIconNewTipPreference normalIconNewTipPreference) {
        normalIconNewTipPreference.mo96250V(0);
        normalIconNewTipPreference.mo101936T(8);
        normalIconNewTipPreference.f215054P = "";
        normalIconNewTipPreference.f215055Q = -1;
        normalIconNewTipPreference.mo64136k(C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT, true);
    }

    /* renamed from: i0 */
    public final void mo101441i0(boolean z) {
        PullDownListView pullDownListView;
        if ((getContext() instanceof LauncherUI) && (pullDownListView = this.f214497u) != null && pullDownListView.f220631I) {
            ((LauncherUI) getContext()).getHomeUI().getClass();
        }
    }

    /* renamed from: j0 */
    public final boolean mo101442j0(boolean z) {
        C33028c cVar = C33028c.INSTANCE;
        C33028c.C33029a aVar = C33028c.C33029a.AppStart;
        ((HashMap) cVar.f89692d).put(aVar, Long.valueOf(SystemClock.elapsedRealtime()));
        C33028c.C33029a aVar2 = C33028c.C33029a.StartUp;
        ((HashMap) cVar.f89692d).put(aVar2, Long.valueOf(SystemClock.elapsedRealtime()));
        Intent intent = new Intent();
        intent.putExtra("preceding_scence", 2);
        intent.putExtra("isNativeView", z);
        C88144b.m109791i(getContext(), XWalkEnvironment.MODULE_APPBRAND, ".functions.emojistore.LFEmojiStoreContainerActivity", intent, (Bundle) null);
        return true;
    }

    /* renamed from: k0 */
    public final void mo101443k0() {
        if (C11171e.m11046c(19)) {
            getWindow().clearFlags(201327616);
        } else {
            getWindow().clearFlags(1024);
        }
    }

    /* renamed from: l0 */
    public final void mo101444l0() {
        ((C73244a) this.f214495s).mo72529n("more_tab_setting_personal_info", false);
        this.f214475G = (AccountInfoPreference) this.f215101d.mo72519a("more_tab_setting_personal_info");
        String c = C75592q0.m90773c();
        if (C77702q0.m93719b(c)) {
            String s = C75592q0.m90789s();
            if (C72996z1.m85802I4(s)) {
                this.f214475G.f212363L = null;
            } else {
                this.f214475G.f212363L = s;
            }
        } else {
            this.f214475G.f212363L = c;
        }
        this.f214475G.f212362K = C75592q0.m90789s();
        String m = C75592q0.m90783m();
        if (C77702q0.m93719b(m)) {
            m = C75592q0.m90772b();
        }
        this.f214475G.f212361J = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(getContext(), m);
        this.f214475G.mo100715K(this.f214470B, this.f214482N, this.f214471C);
        this.f214475G.f212374T0 = new View.OnClickListener() {
            public void onClick(View view) {
                PullDownListView pullDownListView;
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/MoreTabUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                MoreTabUI moreTabUI = MoreTabUI.this;
                if (moreTabUI.f214472D) {
                    C117292a.m165361g(this, "com/tencent/mm/ui/MoreTabUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                if (moreTabUI.storyGallery != null) {
                    MoreTabUI moreTabUI2 = MoreTabUI.this;
                    if (moreTabUI2.f214470B && (pullDownListView = moreTabUI2.f214497u) != null && pullDownListView.f220631I) {
                        moreTabUI2.storyGallery.mo98077q();
                    }
                }
                MoreTabUI moreTabUI3 = MoreTabUI.this;
                if (moreTabUI3.f214481M) {
                    C76912y0.makeText((Context) moreTabUI3.getContext(), (CharSequence) MoreTabUI.this.getResources().getString(C0966R.string.f361421jr3), 0).show();
                } else {
                    PullDownListView pullDownListView2 = moreTabUI3.f214497u;
                    if (pullDownListView2 != null && moreTabUI3.f214472D) {
                        pullDownListView2.mo104547p();
                    }
                }
                C117292a.m165361g(this, "com/tencent/mm/ui/MoreTabUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        };
        ((AccountInfoPreference) ((C73244a) this.f214495s).mo72519a("more_tab_setting_personal_info")).getClass();
        if (this.f214504z != null && mo101438f0() != null) {
            View view = mo101438f0().f212369R;
            if (!(view == null || view.getMeasuredHeight() == 0)) {
                mo101433Y(view.getMeasuredHeight());
            }
            AccountInfoPreference f0 = mo101438f0();
            View.OnLayoutChangeListener onLayoutChangeListener = this.f214494p0;
            f0.f212372S0 = onLayoutChangeListener;
            View view2 = f0.f212369R;
            if (view2 != null && onLayoutChangeListener != null) {
                view2.addOnLayoutChangeListener(onLayoutChangeListener);
            }
        }
    }

    /* renamed from: m0 */
    public final void mo101445m0() {
        C115631n nVar = C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE;
        Class cls = C30914c.class;
        C76982e eVar = (C76982e) C86312j.m106911c(C76982e.class);
        if (eVar == null || (!eVar.mo59841yc() && !eVar.mo59840r9())) {
            this.f214495s.mo72529n("settings_mm_cardpackage", true);
            return;
        }
        C88144b.m109788f("card");
        eVar.mo59836A6();
        String P8 = eVar.mo59839P8();
        this.f214495s.mo72529n("settings_mm_cardpackage", false);
        NormalIconNewTipPreference normalIconNewTipPreference = (NormalIconNewTipPreference) this.f214495s.mo72519a("settings_mm_cardpackage");
        if (normalIconNewTipPreference != null) {
            boolean b = ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33494b(262152, 266256);
            boolean e = ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33497e(262152, 266256);
            boolean f = ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33498f(C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_NEW_CARD_REDDOT_WORDING_STRING_SYNC, C72994y1.C72995a.NEW_BANDAGE_WATCHER_SETTING_CARD_ENTRY_REDDOT_WORDING_STRING_SYNC);
            boolean f2 = ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33498f(C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_NEW_CARD_ICON_STRING_SYNC, C72994y1.C72995a.NEW_BANDAGE_WATCHER_SETTING_CARD_ENTRY_ICON_STRING_SYNC);
            String str = (String) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_CARD_REDOT_ICON_URL_STRING_SYNC, "");
            normalIconNewTipPreference.mo69923G(C0966R.string.itt);
            C115669n.INSTANCE.mo160131h(16322, 1);
            normalIconNewTipPreference.mo96254e0(this.f214495s);
            ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175770k(normalIconNewTipPreference);
            normalIconNewTipPreference.f201750p1 = this.f214489V;
            normalIconNewTipPreference.mo96252c0();
            if (!normalIconNewTipPreference.mo64138m(e || (f2 && !TextUtils.isEmpty(str)) || b || f)) {
                if (e) {
                    normalIconNewTipPreference.mo101936T(0);
                    normalIconNewTipPreference.f215054P = getString(C0966R.string.f360088a12);
                    normalIconNewTipPreference.f215055Q = C0966R.C0969drawable.ake;
                    normalIconNewTipPreference.mo96250V(8);
                    normalIconNewTipPreference.mo7741E((CharSequence) null);
                    normalIconNewTipPreference.mo101930L((Bitmap) null);
                    normalIconNewTipPreference.mo101932N(8);
                    normalIconNewTipPreference.mo101938W("", -1);
                    normalIconNewTipPreference.mo101937U(8);
                    normalIconNewTipPreference.mo64136k(C115631n.MMNEWTIPS_SHOWTYPE_NEW, true);
                    return;
                }
                if (!f2 || TextUtils.isEmpty(str)) {
                    normalIconNewTipPreference.mo101930L((Bitmap) null);
                    normalIconNewTipPreference.mo101932N(8);
                } else {
                    int dimensionPixelOffset = getResources().getDimensionPixelOffset(C0966R.dimen.f4216wh);
                    C20937c.C20939b bVar = new C20937c.C20939b();
                    bVar.f59351g = C112760b.m154195C();
                    bVar.f59346b = true;
                    bVar.f59364t = true;
                    bVar.f59345a = true;
                    bVar.f59355k = dimensionPixelOffset;
                    bVar.f59354j = dimensionPixelOffset;
                    C20828a.m22825b().mo32520i(str, normalIconNewTipPreference.f215051L, bVar.mo32666a(), this.f214489V);
                    normalIconNewTipPreference.mo64136k(C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT_ICON, true);
                }
                if (b) {
                    normalIconNewTipPreference.mo96250V(0);
                    normalIconNewTipPreference.mo64136k(C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT, true);
                } else {
                    normalIconNewTipPreference.mo96250V(8);
                }
                if (f) {
                    normalIconNewTipPreference.f215054P = "";
                    normalIconNewTipPreference.f215055Q = -1;
                    normalIconNewTipPreference.mo101936T(8);
                    if (f2) {
                        normalIconNewTipPreference.mo7741E((CharSequence) null);
                        if (!C77702q0.m93719b(P8)) {
                            normalIconNewTipPreference.mo101939Y(P8, -1, getResources().getColor(C0966R.color.f3563xt));
                            normalIconNewTipPreference.mo101937U(0);
                            normalIconNewTipPreference.mo64136k(nVar, true);
                            return;
                        }
                        normalIconNewTipPreference.mo101938W("", -1);
                        normalIconNewTipPreference.mo101937U(8);
                        return;
                    }
                    normalIconNewTipPreference.mo101938W("", -1);
                    normalIconNewTipPreference.mo101937U(8);
                    if (!C77702q0.m93719b(P8)) {
                        normalIconNewTipPreference.mo7741E(P8);
                        normalIconNewTipPreference.mo64136k(nVar, true);
                        return;
                    }
                    normalIconNewTipPreference.mo7741E((CharSequence) null);
                    return;
                }
                normalIconNewTipPreference.mo101937U(8);
                normalIconNewTipPreference.mo101936T(8);
                normalIconNewTipPreference.mo7741E((CharSequence) null);
            }
        }
    }

    /* renamed from: n0 */
    public final void mo101446n0() {
        Class cls = C30914c.class;
        if (((C10432i) C86312j.m106911c(C10432i.class)).mo10750e()) {
            this.f214495s.mo72529n("settings_emoji_store", true);
            return;
        }
        this.f214495s.mo72529n("settings_emoji_store", false);
        boolean e = ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33497e(262147, 266244);
        boolean e2 = ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33497e(262149, 266244);
        final IconPreference iconPreference = (IconPreference) this.f214495s.mo72519a("settings_emoji_store");
        if (iconPreference != null) {
            if (e) {
                iconPreference.mo101936T(0);
                iconPreference.f215054P = getString(C0966R.string.f360088a12);
                iconPreference.f215055Q = C0966R.C0969drawable.ake;
            } else if (e2) {
                iconPreference.mo101936T(0);
                iconPreference.f215054P = getString(C0966R.string.f8017zc);
                iconPreference.f215055Q = C0966R.C0969drawable.ake;
            } else {
                iconPreference.mo101936T(8);
                iconPreference.f215054P = "";
                iconPreference.f215055Q = -1;
            }
            if (e2 || e) {
                C20828a.m22825b().mo32524m((String) C97625j3.m125812b().mo105906u().mo119684e(229633, (Object) null), iconPreference.f215051L, new C21070h(this) {
                    /* renamed from: a */
                    public void mo6676a(String str, View view) {
                    }

                    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
                        r1 = r3.f59988d;
                     */
                    /* renamed from: b */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public void mo6677b(java.lang.String r1, android.view.View r2, jc0.C21210b r3) {
                        /*
                            r0 = this;
                            int r1 = r3.f59985a
                            if (r1 != 0) goto L_0x0011
                            android.graphics.Bitmap r1 = r3.f59988d
                            if (r1 == 0) goto L_0x0011
                            com.tencent.mm.ui.MoreTabUI$11$1 r2 = new com.tencent.mm.ui.MoreTabUI$11$1
                            r2.<init>(r1)
                            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)
                            goto L_0x0019
                        L_0x0011:
                            com.tencent.mm.ui.MoreTabUI$11$2 r1 = new com.tencent.mm.ui.MoreTabUI$11$2
                            r1.<init>()
                            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r1)
                        L_0x0019:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.MoreTabUI.C7309311.mo6677b(java.lang.String, android.view.View, jc0.b):void");
                    }

                    /* renamed from: c */
                    public Bitmap mo6678c(String str, View view, C21210b bVar) {
                        return null;
                    }
                });
            } else {
                iconPreference.mo101932N(8);
            }
            Class cls2 = C109759g.class;
            if (C30777t2.f82756d.Cx0()) {
                ((C115627l) ((C109759g) C86312j.m106911c(cls2)).V40()).mo175768i("140001001_1");
                ((C115627l) ((C109759g) C86312j.m106911c(cls2)).V40()).mo175770k((NormalIconNewTipPreference) this.f214495s.mo72519a("settings_emoji_store"));
            }
        }
    }

    public boolean noActionBar() {
        return true;
    }

    /* renamed from: o0 */
    public final void mo101447o0() {
        this.f214495s.mo72529n("settings_my_album", false);
        NormalIconNewTipPreference normalIconNewTipPreference = (NormalIconNewTipPreference) this.f214495s.mo72519a("settings_my_album");
        boolean z = true;
        if (!C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_STORY_NEED_DISPLAY_ALBUM_GUIDE_BOOLEAN_SYNC, true) || !this.f214484Q) {
            z = false;
        }
        normalIconNewTipPreference.mo96254e0(this.f214495s);
        ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175770k(normalIconNewTipPreference);
        normalIconNewTipPreference.mo96252c0();
        if (!normalIconNewTipPreference.mo64138m(z)) {
            if (z) {
                normalIconNewTipPreference.mo96250V(0);
                return;
            }
            this.f214484Q = false;
            normalIconNewTipPreference.mo96250V(8);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        Log.m105924i("MicroMsg.MoreTabUI", "onActivityCreated");
        super.onActivityCreated(bundle);
        C73244a aVar = this.f215101d;
        this.f214495s = aVar;
        aVar.mo72529n("more_setting", true);
        this.f214495s.mo72529n("settings_emoji_store", true);
        this.f214495s.mo72529n("settings_mm_wallet", true);
        this.f214495s.mo72529n("settings_mm_cardpackage", true);
        this.f214495s.mo72529n("settings_mm_favorite", true);
        this.f214495s.mo72529n("settings_my_album", true);
        this.f214495s.mo72529n("settings_my_finder_album", true);
        this.f214495s.mo72529n("settings_my_address", true);
        this.f214495s.mo72529n("more_tab_setting_personal_info", true);
        this.f214495s.mo72529n("more_uishow", true);
        this.f214495s.mo72529n("settings_privacy_agreements", true);
        this.f214500x = getView().getRootView().findViewById(C0966R.C0970id.f358508fj3);
        this.f214499w = (RelativeLayout) findViewById(C0966R.C0970id.i1g);
        PullDownListView pullDownListView = (PullDownListView) this.f215102e;
        this.f214497u = pullDownListView;
        pullDownListView.setTabView(this.f214500x);
        this.f214497u.setBackground(C74942w4.m89785b(getContext(), C0966R.attr.f2895ws));
        this.f214497u.setOnScrollListener(new AbsListView.OnScrollListener(this) {
            public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(absListView);
                arrayList.add(Integer.valueOf(i));
                arrayList.add(Integer.valueOf(i2));
                arrayList.add(Integer.valueOf(i3));
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/MoreTabUI$5", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
                C117292a.m165361g(this, "com/tencent/mm/ui/MoreTabUI$5", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
            }

            public void onScrollStateChanged(AbsListView absListView, int i) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(absListView);
                arrayList.add(Integer.valueOf(i));
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/MoreTabUI$5", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
                C117292a.m165361g(this, "com/tencent/mm/ui/MoreTabUI$5", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
            }
        });
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Object[] objArr = new Object[4];
        boolean z = false;
        objArr[0] = Boolean.valueOf(this.f214472D);
        objArr[1] = Integer.valueOf(configuration.orientation);
        objArr[2] = Boolean.valueOf(configuration.orientation == 2);
        objArr[3] = Boolean.valueOf(!C63347a.m74685c(getContext()));
        Log.m105919d("MicroMsg.MoreTabUI", "onConfigurationChanged mIsTextStatusOpen:%s orientation:%s isLandScape:%s mIsLandscape2:%s", objArr);
        if (this.f214472D) {
            boolean z2 = !C63347a.m74685c(getContext());
            this.f214481M = z2;
            if (z2) {
                PullDownListView pullDownListView = this.f214497u;
                if (pullDownListView != null) {
                    if (!pullDownListView.f220631I) {
                        pullDownListView.mo104539o();
                        mo101437e0(C77448f0.m93394f());
                    }
                    this.f214469A.mo101465b(2);
                }
            } else {
                mo101437e0(C77448f0.m93394f());
                if (this.f214497u != null) {
                    this.f214469A.mo101464a();
                }
            }
            View view = this.f214504z;
            if (view != null) {
                if (this.f214481M) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/MoreTabUI", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/ui/MoreTabUI", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(0);
                    View view3 = view;
                    C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/ui/MoreTabUI", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/ui/MoreTabUI", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            mo101449r0();
            return;
        }
        int i = configuration.orientation;
        if (i == 1) {
            this.f214481M = false;
            if (this.f214497u != null) {
                this.f214469A.mo101464a();
            }
        } else if (i == 2) {
            this.f214481M = true;
            PullDownListView pullDownListView2 = this.f214497u;
            if (pullDownListView2 != null) {
                if (!pullDownListView2.f220631I) {
                    pullDownListView2.mo104538n();
                }
                this.f214469A.mo101465b(2);
            }
        }
        int i2 = configuration.screenLayout;
        if (!((i2 & 3) == 0 || (i2 & 16) == 0)) {
            z = true;
        }
        if (z != this.f214485R) {
            this.f214485R = z;
            AbsStoryGallery absStoryGallery = this.storyGallery;
            if (absStoryGallery != null && this.f214499w != null && this.f214497u != null) {
                absStoryGallery.mo98066f();
                this.f214499w.removeView(this.storyGallery);
                mo101432X();
                this.storyGallery.mo98072l();
                PullDownListView pullDownListView3 = this.f214497u;
                boolean z3 = pullDownListView3.f220631I;
                if (!z3) {
                    pullDownListView3.postDelayed(new Runnable() {
                        public void run() {
                            MoreTabUI.this.f214497u.mo104538n();
                        }
                    }, 200);
                } else if (z3 && pullDownListView3.getTranslationY() != 0.0f) {
                    this.f214497u.setTranslationY(0.0f);
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z = true;
        Log.m105925i("MicroMsg.MoreTabUI", "onCreate:  %s", Integer.valueOf(hashCode()));
        if (!C97625j3.m125811a() || C86718e.m107551r()) {
            Log.m105921e("MicroMsg.MoreTabUI", "Create MoreTabUI when accready:%b ishold:%b", Boolean.valueOf(C97625j3.m125811a()), Boolean.valueOf(C86718e.m107551r()));
            return;
        }
        this.f214472D = C77448f0.m93394f();
        mo101435a0();
        mo101434Z(false);
        Class cls = C78315f0.class;
        Class cls2 = C77049b.class;
        try {
            Activity context = getContext();
            if (context == null) {
                Object[] objArr = new Object[1];
                if (getActivity() == null) {
                    z = false;
                }
                objArr[0] = Boolean.valueOf(z);
                Log.m105921e("MicroMsg.MoreTabUI", "context is null : getActivity valid =%s", objArr);
            } else {
                ((C77049b) C86312j.m106911c(cls2)).mo72352Rp(context, new C45418c(cls, 9, true));
                C78315f0 f0Var = (C78315f0) ((C77049b) C86312j.m106911c(cls2)).Wi0(getContext(), 9, cls);
                if (f0Var != null) {
                    f0Var.f229428d = ((C47904x) C86312j.m106911c(C47904x.class)).mo72667bk();
                }
                Object[] objArr2 = new Object[1];
                if (f0Var == null) {
                    z = false;
                }
                objArr2[0] = Boolean.valueOf(z);
                Log.m105925i("MicroMsg.MoreTabUI", "initStatusReportData : data valid = %s", objArr2);
            }
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.MoreTabUI", th, "[initStatusReportData]err", new Object[0]);
        }
        if (getBounceView() != null) {
            getBounceView().setStart2EndBgColor(getResources().getColor(C0966R.color.f2929c));
        }
        this.f214491X.alive();
        this.f214492Y.alive();
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105925i("MicroMsg.MoreTabUI", "onDestroy:  %s", Integer.valueOf(hashCode()));
        if (this.f214490W != null) {
            ((C76243a5) C86312j.m106911c(C76243a5.class)).mo13218RK(this.f214490W);
        }
        this.f214491X.dead();
        this.f214492Y.dead();
        ((C47904x) C86312j.m106911c(C47904x.class)).mo72663Tr();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r1 = r6.storyGallery;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r7, android.view.KeyEvent r8) {
        /*
            r6 = this;
            r0 = 0
            r1 = 4
            if (r7 != r1) goto L_0x0013
            int r1 = r8.getAction()
            if (r1 != 0) goto L_0x0013
            com.tencent.mm.plugin.story.api.AbsStoryGallery r1 = r6.storyGallery
            if (r1 == 0) goto L_0x0013
            boolean r1 = r1.mo98064d()
            goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            r3[r0] = r4
            java.lang.String r4 = "MicroMsg.MoreTabUI"
            java.lang.String r5 = "onBackPressed: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r5, r3)
            if (r1 != 0) goto L_0x002c
            boolean r7 = super.onKeyDown(r7, r8)
            if (r7 == 0) goto L_0x002d
        L_0x002c:
            r0 = 1
        L_0x002d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.MoreTabUI.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        int i2;
        int i3 = C77702q0.f226484a;
        if (obj != null) {
            if (obj instanceof Integer) {
                i2 = ((Integer) obj).intValue();
            } else if (obj instanceof Long) {
                i2 = ((Long) obj).intValue();
            }
            Log.m105919d("MicroMsg.MoreTabUI", "onNotifyChange event:%d obj:%d stg:%s", Integer.valueOf(i), Integer.valueOf(i2), mStorageEx);
            if (mStorageEx == C97625j3.m125812b().mo105906u() || i2 <= 0) {
                Log.m105921e("MicroMsg.MoreTabUI", "onNotifyChange error obj:%d stg:%s", Integer.valueOf(i2), mStorageEx);
            } else if (204817 == i2 || 204820 == i2) {
                mo101450s0();
                return;
            } else if (40 == i2) {
                mo101451t0();
                return;
            } else if ("208899".equals(Integer.valueOf(i))) {
                mo101446n0();
                return;
            } else {
                return;
            }
        }
        i2 = 0;
        Log.m105919d("MicroMsg.MoreTabUI", "onNotifyChange event:%d obj:%d stg:%s", Integer.valueOf(i), Integer.valueOf(i2), mStorageEx);
        if (mStorageEx == C97625j3.m125812b().mo105906u()) {
        }
        Log.m105921e("MicroMsg.MoreTabUI", "onNotifyChange error obj:%d stg:%s", Integer.valueOf(i2), mStorageEx);
    }

    public void onPause() {
        super.onPause();
        Log.m105925i("MicroMsg.MoreTabUI", "onPause:  %s", Integer.valueOf(hashCode()));
        C88654b bVar = this.f214486S;
        if (bVar != null) {
            bVar.mo123097b(true);
        }
        if (this.f214483P) {
            C99069d.f290418a.mo138415d();
        }
        C77451h hVar = this.f214502y;
        if (hVar != null) {
            hVar.mo72649m();
        }
    }

    public void onResume() {
        super.onResume();
        Log.m105925i("MicroMsg.MoreTabUI", "onResume:  %s", Integer.valueOf(hashCode()));
        mo101435a0();
        if (this.f214483P) {
            long currentTimeMillis = System.currentTimeMillis();
            C99069d dVar = C99069d.f290418a;
            C99069d.f290431n.f194473i = currentTimeMillis;
        }
    }

    /* renamed from: p0 */
    public final void mo101448p0() {
        Class cls = C76846i.class;
        Class cls2 = C30914c.class;
        this.f214495s.mo72529n("more_setting", false);
        NormalIconNewTipPreference normalIconNewTipPreference = (NormalIconNewTipPreference) this.f214495s.mo72519a("more_setting");
        if (normalIconNewTipPreference != null) {
            normalIconNewTipPreference.mo101934R(8);
            ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175770k(normalIconNewTipPreference);
            normalIconNewTipPreference.mo96254e0(this.f214495s);
            normalIconNewTipPreference.mo96252c0();
            boolean e = ((C21388a) ((C30914c) C86312j.m106911c(cls2)).mo17862sM()).mo33497e(262145, 266242);
            boolean z = ((C76846i) C86312j.m106911c(cls)).mo59628HQ() || ((C76846i) C86312j.m106911c(cls)).mo59630iY() || ((Integer) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_SETTING_RED_DOT_WILL_SHOW_ID_INT, 0)).intValue() > ((Integer) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_SETTING_RED_DOT_DID_SHOW_ID_INT, 0)).intValue();
            boolean b = ((C21388a) ((C30914c) C86312j.m106911c(cls2)).mo17862sM()).mo33494b(262157, 266261);
            boolean b2 = ((C21388a) ((C30914c) C86312j.m106911c(cls2)).mo17862sM()).mo33494b(262164, 266268);
            boolean b3 = ((C21388a) ((C30914c) C86312j.m106911c(cls2)).mo17862sM()).mo33494b(262158, 266264);
            boolean c = ((C21388a) ((C30914c) C86312j.m106911c(cls2)).mo17862sM()).mo33495c(C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_DEVICE_PROTECT_STRING_SYNC, 266242);
            boolean z2 = (Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("VoiceprintEntry"), 0) == 1 ? ((Boolean) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_VOICEPRINT_MORE_TAB_DOT_SHOW_BOOLEAN, Boolean.FALSE)).booleanValue() : false) && ((C97625j3.m125812b().mo105906u().mo119688i(40, 0) & 131072) == 0);
            C115620d jo = C116945b.vx0().mo182002jo(1);
            boolean z3 = jo != null && jo.field_isExit && C116945b.wx0().mo175755d(1);
            boolean CT = ((C88689b) C86312j.m106911c(C88689b.class)).mo122732CT();
            boolean z4 = e || z || b || b2 || b3 || c || z2;
            if (!z4 && jo != null && !jo.field_isExit) {
                this.f214493Z = new NewTipsXmlListener(normalIconNewTipPreference);
                C116945b.yx0().f346855e = this.f214493Z;
            }
            if (!normalIconNewTipPreference.mo64138m(z4 || z3 || CT)) {
                normalIconNewTipPreference.mo96250V(8);
                if (e) {
                    mo101440h0(normalIconNewTipPreference);
                    return;
                }
                normalIconNewTipPreference.mo101936T(8);
                normalIconNewTipPreference.f215054P = "";
                normalIconNewTipPreference.f215055Q = -1;
                if (CT) {
                    mo101440h0(normalIconNewTipPreference);
                    return;
                }
                normalIconNewTipPreference.mo96250V(8);
                if (z) {
                    mo101440h0(normalIconNewTipPreference);
                    return;
                }
                normalIconNewTipPreference.mo96250V(8);
                if (b) {
                    mo101440h0(normalIconNewTipPreference);
                    return;
                }
                normalIconNewTipPreference.mo96250V(8);
                if (b2) {
                    mo101440h0(normalIconNewTipPreference);
                    return;
                }
                normalIconNewTipPreference.mo96250V(8);
                if (b3) {
                    mo101440h0(normalIconNewTipPreference);
                } else if (c) {
                    mo101440h0(normalIconNewTipPreference);
                } else {
                    normalIconNewTipPreference.mo96250V(8);
                    if (z2) {
                        Log.m105924i("MicroMsg.MoreTabUI", "show voiceprint dot");
                        mo101440h0(normalIconNewTipPreference);
                        return;
                    }
                    normalIconNewTipPreference.mo96250V(8);
                    if (z3) {
                        mo101440h0(normalIconNewTipPreference);
                    }
                }
            }
        }
    }

    /* renamed from: r */
    public void mo25918r() {
    }

    /* renamed from: r0 */
    public final void mo101449r0() {
        C77453j jVar;
        AccountInfoPreference accountInfoPreference = this.f214475G;
        if (!(accountInfoPreference == null || (jVar = accountInfoPreference.f212373T) == null)) {
            jVar.mo72650h(C13781a.m13082a());
        }
        C77451h hVar = this.f214502y;
        if (hVar != null) {
            hVar.mo72650h(C13781a.m13082a());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x0431 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0432  */
    /* renamed from: s0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101450s0() {
        /*
            r34 = this;
            r0 = r34
            com.tencent.mm.plugin.newtips.model.n r1 = com.tencent.p014mm.plugin.newtips.model.C115631n.MMNEWTIPS_SHOWTYPE_COUNTER
            com.tencent.mm.plugin.newtips.model.n r2 = com.tencent.p014mm.plugin.newtips.model.C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE
            com.tencent.mm.plugin.newtips.model.n r3 = com.tencent.p014mm.plugin.newtips.model.C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT
            java.lang.Class<h81.h> r4 = h81.C32735h.class
            java.lang.Class<ct.c> r5 = p327ct.C30914c.class
            eb0.c r6 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r6 = r6.mo105906u()
            r7 = 204820(0x32014, float:2.87014E-40)
            r8 = 0
            java.lang.Object r6 = r6.mo119684e(r7, r8)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r7 = sf0.C77702q0.f226484a
            r7 = 0
            if (r6 != 0) goto L_0x0025
            r6 = 0
            goto L_0x0029
        L_0x0025:
            int r6 = r6.intValue()
        L_0x0029:
            eb0.c r9 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r9 = r9.mo105906u()
            r10 = 204817(0x32011, float:2.8701E-40)
            java.lang.Object r8 = r9.mo119684e(r10, r8)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 != 0) goto L_0x003e
            r8 = 0
            goto L_0x0042
        L_0x003e:
            int r8 = r8.intValue()
        L_0x0042:
            int r6 = r6 + r8
            di3.d r8 = di3.C86312j.m106911c(r5)
            ct.c r8 = (p327ct.C30914c) r8
            ct.d r8 = r8.mo17862sM()
            l20.a r8 = (l20.C21388a) r8
            r9 = 266248(0x41008, float:3.73093E-40)
            r10 = 262156(0x4000c, float:3.67359E-40)
            boolean r8 = r8.mo33497e(r10, r9)
            di3.d r11 = di3.C86312j.m106911c(r5)
            ct.c r11 = (p327ct.C30914c) r11
            ct.d r11 = r11.mo17862sM()
            l20.a r11 = (l20.C21388a) r11
            boolean r9 = r11.mo33494b(r10, r9)
            di3.d r11 = di3.C86312j.m106911c(r5)
            ct.c r11 = (p327ct.C30914c) r11
            ct.d r11 = r11.mo17862sM()
            com.tencent.mm.storage.y1$a r12 = com.tencent.p014mm.storage.C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_WALLET_MORE_TAB_STRING_SYNC
            com.tencent.mm.storage.y1$a r13 = com.tencent.p014mm.storage.C72994y1.C72995a.NEW_BANDAGE_WATCHER_WALLET_COMMON_STRING_SYNC
            l20.a r11 = (l20.C21388a) r11
            boolean r11 = r11.mo33496d(r12, r13)
            eb0.c r12 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r12 = r12.mo105906u()
            com.tencent.mm.storage.y1$a r13 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_MORE_TAB_REDDOT_WORDING_STRING_SYNC
            java.lang.String r14 = ""
            java.lang.Object r12 = r12.mo119685f(r13, r14)
            java.lang.String r12 = (java.lang.String) r12
            pj3.g r13 = r0.f214495s
            com.tencent.mm.ui.base.preference.a r13 = (com.tencent.p014mm.p136ui.base.preference.C73244a) r13
            java.lang.String r15 = "settings_mm_wallet"
            com.tencent.mm.ui.base.preference.Preference r13 = r13.mo72519a(r15)
            com.tencent.mm.plugin.newtips.NormalIconNewTipPreference r13 = (com.tencent.p014mm.plugin.newtips.NormalIconNewTipPreference) r13
            if (r13 != 0) goto L_0x009e
            return
        L_0x009e:
            f40.C86709a0.m107528h()
            f40.o r15 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r15 = r15.mo121142i()
            com.tencent.mm.storage.y1$a r10 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_REGION_TYPE_INT_SYNC
            r17 = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            java.lang.Object r8 = r15.mo119685f(r10, r8)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            f40.C86709a0.m107528h()
            f40.o r10 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r10 = r10.mo121142i()
            com.tencent.mm.storage.y1$a r15 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_ENTRY_REDDOT_WALLET_REGION_INT_SYNC
            r18 = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            java.lang.Object r9 = r10.mo119685f(r15, r9)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r10 = 1
            java.lang.Object[] r15 = new java.lang.Object[r10]
            java.lang.Integer r19 = java.lang.Integer.valueOf(r8)
            r15[r7] = r19
            java.lang.String r7 = "MicroMsg.MoreTabUI"
            java.lang.String r10 = "currentWalletRegion: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r10, r15)
            if (r8 == 0) goto L_0x0122
            r15 = 1
            if (r8 != r15) goto L_0x00ee
            goto L_0x0122
        L_0x00ee:
            di3.d r4 = di3.C86312j.m106911c(r4)
            h81.h r4 = (h81.C32735h) r4
            h81.h$c r10 = h81.C32735h.C32737c.clicfg_android_more_tab_new_name_oversea_config
            r23 = r1
            r1 = 0
            boolean r4 = r4.mo58784wf(r10, r1)
            java.lang.Object[] r10 = new java.lang.Object[r15]
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r4)
            r10[r1] = r15
            java.lang.String r1 = " oversea wallet open new name ：%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r1, r10)
            if (r4 == 0) goto L_0x0117
            r1 = 2131836081(0x7f113cb1, float:1.9305319E38)
            java.lang.String r1 = r0.getString(r1)
            r13.mo69924H(r1)
            goto L_0x0156
        L_0x0117:
            r1 = 2131836080(0x7f113cb0, float:1.9305317E38)
            java.lang.String r1 = r0.getString(r1)
            r13.mo69924H(r1)
            goto L_0x0156
        L_0x0122:
            r23 = r1
            di3.d r1 = di3.C86312j.m106911c(r4)
            h81.h r1 = (h81.C32735h) r1
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_android_more_tab_new_name_cn_config
            r10 = 0
            boolean r1 = r1.mo58784wf(r4, r10)
            r4 = 1
            java.lang.Object[] r15 = new java.lang.Object[r4]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            r15[r10] = r4
            java.lang.String r4 = " cn wallet open new name ：%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r4, r15)
            if (r1 == 0) goto L_0x014c
            r1 = 2131836081(0x7f113cb1, float:1.9305319E38)
            java.lang.String r1 = r0.getString(r1)
            r13.mo69924H(r1)
            goto L_0x0156
        L_0x014c:
            r1 = 2131836080(0x7f113cb0, float:1.9305317E38)
            java.lang.String r1 = r0.getString(r1)
            r13.mo69924H(r1)
        L_0x0156:
            if (r8 == 0) goto L_0x0188
            r4 = 1
            if (r8 == r4) goto L_0x0188
            f40.C86709a0.m107528h()
            f40.o r10 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r10 = r10.mo121142i()
            com.tencent.mm.storage.y1$a r15 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_ENTRY_REDDOT_WALLET_REGION_TYPE_INT_SYNC
            r17 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            java.lang.Object r1 = r10.mo119685f(r15, r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r8 == r9) goto L_0x017b
            goto L_0x0185
        L_0x017b:
            if (r1 != r4) goto L_0x017f
            r8 = 1
            goto L_0x0186
        L_0x017f:
            r4 = 2
            if (r1 != r4) goto L_0x0185
            r8 = 0
            r9 = 1
            goto L_0x018c
        L_0x0185:
            r8 = 0
        L_0x0186:
            r9 = 0
            goto L_0x018c
        L_0x0188:
            r8 = r17
            r9 = r18
        L_0x018c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "isShowNew : "
            r1.append(r4)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "isShowDot : "
            r1.append(r4)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r1)
            pj3.g r1 = r0.f214495s
            r13.mo96254e0(r1)
            java.lang.Class<nv.g> r1 = p626nv.C109759g.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            nv.g r1 = (p626nv.C109759g) r1
            nv.e r1 = r1.V40()
            com.tencent.mm.plugin.newtips.model.l r1 = (com.tencent.p014mm.plugin.newtips.model.C115627l) r1
            r1.mo175770k(r13)
            r13.mo96252c0()
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r1 = r1.mo105906u()
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_LQT_WALLET_RED_DOT_WORDING_STRING
            java.lang.Object r1 = r1.mo119685f(r4, r14)
            java.lang.String r1 = (java.lang.String) r1
            eb0.c r4 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r4 = r4.mo105906u()
            com.tencent.mm.storage.y1$a r10 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_LQT_WALLET_RED_DOT_INT
            r15 = -1
            r17 = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            java.lang.Object r1 = r4.mo119685f(r10, r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r24 = 0
            if (r8 != 0) goto L_0x020e
            if (r9 == 0) goto L_0x01ff
            goto L_0x020e
        L_0x01ff:
            r31 = r1
            r33 = r3
            r28 = r8
            r15 = r9
            r32 = r11
            r29 = r12
            r30 = r13
            goto L_0x02b8
        L_0x020e:
            eb0.c r22 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r4 = r22.mo105906u()
            com.tencent.mm.storage.y1$a r15 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_ENTRY_REDDOT_PUSH_DATE_LONG_SYNC
            r26 = -1
            java.lang.Long r10 = java.lang.Long.valueOf(r26)
            java.lang.Object r4 = r4.mo119685f(r15, r10)
            java.lang.Long r4 = (java.lang.Long) r4
            r10 = r8
            r15 = r9
            long r8 = r4.longValue()
            java.lang.Class<lc3.b> r4 = lc3.C10485b.class
            k40.a r4 = f40.C86709a0.m107533q(r4)
            lc3.b r4 = (lc3.C10485b) r4
            pj.f r4 = r4.vh0()
            r28 = r10
            java.lang.String r10 = "PayWalletRedDotExpire"
            java.lang.String r4 = r4.mo107405c(r10)
            if (r4 != 0) goto L_0x0241
            goto L_0x0245
        L_0x0241:
            long r26 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x0249 }
        L_0x0245:
            r10 = r3
            r3 = r26
            goto L_0x024b
        L_0x0249:
            goto L_0x0245
        L_0x024b:
            r26 = 86400000(0x5265c00, double:4.2687272E-316)
            long r26 = r26 * r3
            r29 = r12
            r30 = r13
            long r12 = java.lang.System.currentTimeMillis()
            r31 = r1
            double r0 = (double) r12
            r33 = r10
            r32 = r11
            double r10 = (double) r8
            double r0 = r0 - r10
            r10 = 4725570615333879808(0x4194997000000000, double:8.64E7)
            double r0 = r0 / r10
            r10 = 5
            java.lang.Object[] r11 = new java.lang.Object[r10]
            java.lang.Long r10 = java.lang.Long.valueOf(r8)
            r19 = 0
            r11[r19] = r10
            java.lang.Long r10 = java.lang.Long.valueOf(r3)
            r20 = 1
            r11[r20] = r10
            java.lang.Long r10 = java.lang.Long.valueOf(r26)
            r21 = 2
            r11[r21] = r10
            java.lang.Long r10 = java.lang.Long.valueOf(r12)
            r12 = 3
            r11[r12] = r10
            java.lang.Double r10 = java.lang.Double.valueOf(r0)
            r12 = 4
            r11[r12] = r10
            java.lang.String r10 = "pushTick: %s, expireTime: %s, expireTick: %s, currentTick: %s, passDay: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r10, r11)
            int r10 = (r8 > r24 ? 1 : (r8 == r24 ? 0 : -1))
            if (r10 <= 0) goto L_0x02b8
            int r8 = (r3 > r24 ? 1 : (r3 == r24 ? 0 : -1))
            if (r8 <= 0) goto L_0x02b8
            double r3 = (double) r3
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 < 0) goto L_0x02b8
            di3.d r0 = di3.C86312j.m106911c(r5)
            ct.c r0 = (p327ct.C30914c) r0
            ct.d r0 = r0.mo17862sM()
            l20.a r0 = (l20.C21388a) r0
            r1 = 262156(0x4000c, float:3.67359E-40)
            r3 = 0
            r0.mo33509r(r1, r3)
            r15 = 0
            r28 = 0
        L_0x02b8:
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_MY_ENTRY_REDDOT_BOOLEAN_SYNC
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            java.lang.Object r0 = r0.mo119685f(r1, r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            f40.C86709a0.m107528h()
            f40.o r4 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r4 = r4.mo121142i()
            com.tencent.mm.storage.y1$a r8 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_MY_ENTRY_REDDOT_EXPIRETIME_LONG_SYNC
            java.lang.Long r9 = java.lang.Long.valueOf(r24)
            java.lang.Object r4 = r4.mo119685f(r8, r9)
            java.lang.Long r4 = (java.lang.Long) r4
            long r9 = r4.longValue()
            java.lang.String r4 = "walletMyEntryRedDot expire, ignore redDot"
            if (r0 == 0) goto L_0x0321
            int r11 = (r9 > r24 ? 1 : (r9 == r24 ? 0 : -1))
            if (r11 <= 0) goto L_0x0321
            long r11 = java.lang.System.currentTimeMillis()
            int r13 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r13 <= 0) goto L_0x0321
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r0.mo119677K(r1, r3)
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            java.lang.Long r1 = java.lang.Long.valueOf(r24)
            r0.mo119677K(r8, r1)
            r0 = 0
        L_0x0321:
            r0 = r0 | r15
            f40.C86709a0.m107528h()
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_ENTRY_WORDING_STRING_SYNC
            java.lang.Object r1 = r1.mo119685f(r3, r14)
            java.lang.String r1 = (java.lang.String) r1
            r3 = 3
            java.lang.Object[] r8 = new java.lang.Object[r3]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r28)
            r9 = 0
            r8[r9] = r3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            r9 = 1
            r8[r9] = r3
            r3 = 2
            r8[r3] = r1
            java.lang.String r3 = "after check, isShowNew: %s, isShowDot: %s, walletEntryWording: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r3, r8)
            di3.d r8 = di3.C86312j.m106911c(r5)
            ct.c r8 = (p327ct.C30914c) r8
            ct.d r8 = r8.mo17862sM()
            com.tencent.mm.storage.y1$a r9 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_New_MY_ENTRY_TAB_REDDOT_STRING_SYNC
            com.tencent.mm.storage.y1$a r10 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_NEW_BANDAGE_WATCHER_PAY_ENTRANCE_STRING_SYNC
            l20.a r8 = (l20.C21388a) r8
            boolean r8 = r8.mo33496d(r9, r10)
            f40.C86709a0.m107528h()
            f40.o r11 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r11 = r11.mo121142i()
            com.tencent.mm.storage.y1$a r12 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_New_MY_ENTRY_REDDOT_EXPIRETIME_LONG_SYNC
            java.lang.Long r13 = java.lang.Long.valueOf(r24)
            java.lang.Object r11 = r11.mo119685f(r12, r13)
            java.lang.Long r11 = (java.lang.Long) r11
            long r15 = r11.longValue()
            if (r8 == 0) goto L_0x03b0
            int r11 = (r15 > r24 ? 1 : (r15 == r24 ? 0 : -1))
            if (r11 <= 0) goto L_0x03b0
            long r26 = java.lang.System.currentTimeMillis()
            int r11 = (r26 > r15 ? 1 : (r26 == r15 ? 0 : -1))
            if (r11 <= 0) goto L_0x03b0
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)
            di3.d r4 = di3.C86312j.m106911c(r5)
            ct.c r4 = (p327ct.C30914c) r4
            ct.d r4 = r4.mo17862sM()
            l20.a r4 = (l20.C21388a) r4
            r4.mo33501j(r9, r10)
            f40.C86709a0.m107528h()
            f40.o r4 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r4 = r4.mo121142i()
            java.lang.Long r5 = java.lang.Long.valueOf(r24)
            r4.mo119677K(r12, r5)
            r8 = 0
        L_0x03b0:
            r0 = r0 | r8
            f40.C86709a0.m107528h()
            f40.o r4 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r4 = r4.mo121142i()
            com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_New_MY_ENTRY_WORDING_STRING_SYNC
            java.lang.Object r4 = r4.mo119685f(r5, r14)
            java.lang.String r4 = (java.lang.String) r4
            r5 = 3
            java.lang.Object[] r9 = new java.lang.Object[r5]
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r28)
            r10 = 0
            r9[r10] = r5
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            r11 = 1
            r9[r11] = r5
            r5 = 2
            r9[r5] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r3, r9)
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r9 = 14872(0x3a18, float:2.084E-41)
            r12 = 5
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r13 = 6
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12[r10] = r13
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r12[r11] = r10
            r12[r5] = r14
            r5 = 3
            r12[r5] = r14
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            r10 = 4
            r12[r10] = r5
            r3.mo160131h(r9, r12)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = "bankcardDot : "
            r5.append(r9)
            r9 = r32
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r5)
            if (r9 != 0) goto L_0x0426
            if (r28 != 0) goto L_0x0426
            if (r6 > 0) goto L_0x0426
            if (r0 != 0) goto L_0x0426
            r5 = r31
            r7 = 1
            if (r5 != r7) goto L_0x0422
            goto L_0x0428
        L_0x0422:
            r13 = r30
            r7 = 0
            goto L_0x042b
        L_0x0426:
            r5 = r31
        L_0x0428:
            r13 = r30
            r7 = 1
        L_0x042b:
            boolean r7 = r13.mo64138m(r7)
            if (r7 == 0) goto L_0x0432
            return
        L_0x0432:
            r7 = r34
            if (r8 == 0) goto L_0x0452
            boolean r8 = r7.f214480L
            if (r8 != 0) goto L_0x0452
            r8 = 25075(0x61f3, float:3.5138E-41)
            r10 = 2
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r11 = 1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r15 = 0
            r10[r15] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r15)
            r10[r11] = r12
            r3.mo160131h(r8, r10)
            r7.f214480L = r11
        L_0x0452:
            r3 = 8
            if (r9 == 0) goto L_0x0488
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r29)
            if (r5 != 0) goto L_0x0475
            r8 = 0
            r13.mo101937U(r8)
            r5 = -7566196(0xffffffffff8c8c8c, float:NaN)
            r12 = r29
            r6 = -1
            r13.mo101939Y(r12, r6, r5)
            r9 = 1
            r13.mo101940Z(r9)
            r13.mo96250V(r3)
            r13.mo64136k(r2, r9)
            goto L_0x0549
        L_0x0475:
            r6 = -1
            r8 = 0
            r9 = 1
            r13.mo101938W(r14, r6)
            r13.mo101937U(r3)
            r13.mo96250V(r8)
            r10 = r33
            r13.mo64136k(r10, r9)
            goto L_0x0549
        L_0x0488:
            r10 = r33
            r8 = 0
            r9 = 1
            if (r28 == 0) goto L_0x04a9
            r13.mo101936T(r8)
            r2 = 2131821611(0x7f11042b, float:1.927597E38)
            java.lang.String r2 = r7.getString(r2)
            r5 = 2131234251(0x7f080dcb, float:1.8084662E38)
            r13.f215054P = r2
            r13.f215055Q = r5
            r13.mo96250V(r3)
            com.tencent.mm.plugin.newtips.model.n r2 = com.tencent.p014mm.plugin.newtips.model.C115631n.MMNEWTIPS_SHOWTYPE_NEW
            r13.mo64136k(r2, r9)
            goto L_0x0549
        L_0x04a9:
            r8 = 99
            if (r6 <= r8) goto L_0x04cf
            r8 = 0
            r13.mo101936T(r8)
            r2 = 2131837607(0x7f1142a7, float:1.9308414E38)
            java.lang.String r2 = r7.getString(r2)
            android.app.Activity r5 = r34.getContext()
            int r5 = com.tencent.p014mm.p136ui.tools.C45081s1.m49933b(r5, r6)
            r13.f215054P = r2
            r13.f215055Q = r5
            r13.mo96250V(r3)
            r9 = r23
            r2 = 1
            r13.mo64136k(r9, r2)
            goto L_0x0549
        L_0x04cf:
            r9 = r23
            r8 = 0
            if (r6 <= 0) goto L_0x04fa
            r13.mo101936T(r8)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            android.app.Activity r5 = r34.getContext()
            int r5 = com.tencent.p014mm.p136ui.tools.C45081s1.m49933b(r5, r6)
            r13.f215054P = r2
            r13.f215055Q = r5
            r13.mo96250V(r3)
            r6 = 1
            r13.mo64136k(r9, r6)
            goto L_0x0549
        L_0x04fa:
            r6 = 1
            if (r0 == 0) goto L_0x050d
            r13.f215054P = r14
            r8 = -1
            r13.f215055Q = r8
            r13.mo101936T(r3)
            r9 = 0
            r13.mo96250V(r9)
            r13.mo64136k(r10, r6)
            goto L_0x0549
        L_0x050d:
            r8 = -1
            r9 = 0
            if (r5 != r6) goto L_0x0536
            r13.f215054P = r14
            r13.f215055Q = r8
            r13.mo101936T(r3)
            r13.mo101937U(r9)
            r13.mo101940Z(r6)
            boolean r5 = sf0.C77702q0.m93719b(r17)
            if (r5 != 0) goto L_0x052f
            java.lang.String r5 = "#888888"
            int r5 = android.graphics.Color.parseColor(r5)
            r9 = r17
            r13.mo101939Y(r9, r8, r5)
        L_0x052f:
            r13.mo101934R(r3)
            r13.mo64136k(r2, r6)
            goto L_0x0549
        L_0x0536:
            r13.f215054P = r14
            r13.f215055Q = r8
            r13.mo101936T(r3)
            r13.mo96250V(r3)
            r13.mo101937U(r3)
            r13.mo101938W(r14, r8)
            r13.mo96252c0()
        L_0x0549:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r2 != 0) goto L_0x0550
            r1 = r4
        L_0x0550:
            boolean r2 = sf0.C77702q0.m93719b(r1)
            if (r2 != 0) goto L_0x055c
            if (r0 == 0) goto L_0x055c
            r13.mo7741E(r1)
            goto L_0x055f
        L_0x055c:
            r13.mo7741E(r14)
        L_0x055f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.MoreTabUI.mo101450s0():void");
    }

    public boolean supportNavigationSwipeBack() {
        return false;
    }

    /* renamed from: t */
    public void mo25922t() {
    }

    /* renamed from: t0 */
    public final void mo101451t0() {
        boolean I = C75592q0.m90761I();
        Log.m105918d("MicroMsg.MoreTabUI", "wallet status: is open" + I);
        boolean f = this.f214495s.mo72522f("settings_mm_wallet");
        this.f214495s.mo72529n("settings_mm_wallet", I ^ true);
        if (!f && I) {
            this.f214486S = ((C47315c) C86312j.m106911c(C47315c.class)).mo72369tr(new C79064a(true, true, 300, (View) null, 0, "settings_mm_wallet", (MMFragmentActivity) thisActivity(), false, 0, C0966R.C0970id.i1g));
        }
        this.f215101d.notifyDataSetChanged();
        int i = C118231b.f353395e;
        if (!Util.isEqual(i, -1)) {
            boolean z = (i & 32768) != 0;
            Log.m105925i("MicroMsg.MoreTabUI", "wallet status entrance idkey[isOpen:%s, isOpenCurScene:%s]", Boolean.valueOf(I), Boolean.valueOf(z));
            if (I == z) {
                return;
            }
            if (I) {
                C117407d.INSTANCE.idkeyStat(1056, 1, 1, false);
            } else {
                C117407d.INSTANCE.idkeyStat(1056, 0, 1, false);
            }
        }
    }
}
