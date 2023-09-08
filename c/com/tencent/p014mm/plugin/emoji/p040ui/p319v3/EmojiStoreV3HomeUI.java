package com.tencent.p014mm.plugin.emoji.p040ui.p319v3;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragment;
import com.tencent.p014mm.p136ui.base.CustomViewPager;
import com.tencent.p014mm.plugin.emoji.model.C41051m;
import com.tencent.p014mm.plugin.emoji.p040ui.p041v2.EmojiStoreV2BaseFragment;
import com.tencent.p014mm.plugin.emoji.p040ui.p041v2.EmojiStoreV2PersonFragment;
import com.tencent.p014mm.plugin.newtips.model.C115619a;
import com.tencent.p014mm.plugin.newtips.model.C115627l;
import com.tencent.p014mm.plugin.newtips.model.C115631n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import ky2.C10432i;
import l20.C21388a;
import lc3.C10485b;
import n61.C11133r;
import n61.C11134t;
import n61.C34742p;
import n61.C47161o;
import n61.C47162q;
import n61.C47163s;
import p327ct.C30914c;
import p626nv.C109759g;
import p626nv.C47300f;
import sx3.C64197v;
import te3.tg4;
import zp3.C79406f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "EmojiStoreEmptyFragment", "a", "b", "c", "plugin-emoji_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeUI */
public final class EmojiStoreV3HomeUI extends MMActivity {

    /* renamed from: v */
    public static final /* synthetic */ int f110655v = 0;

    /* renamed from: d */
    public ImageView f110656d;

    /* renamed from: e */
    public ImageView f110657e;

    /* renamed from: f */
    public ImageView f110658f;

    /* renamed from: g */
    public int f110659g = -1;

    /* renamed from: h */
    public int f110660h;

    /* renamed from: i */
    public boolean f110661i;

    /* renamed from: j */
    public final HashMap<Integer, MMFragment> f110662j = new HashMap<>();

    /* renamed from: n */
    public TabLayout f110663n;

    /* renamed from: o */
    public CustomViewPager f110664o;

    /* renamed from: p */
    public List<C41075a> f110665p;

    /* renamed from: q */
    public C47161o f110666q;

    /* renamed from: r */
    public boolean f110667r = true;

    /* renamed from: s */
    public C41076b f110668s;

    /* renamed from: t */
    public final C32226l<Integer, MMFragment> f110669t = new C41077d(this);

    /* renamed from: u */
    public final ViewPager.OnPageChangeListener f110670u = new C41078e(this);

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeUI$c */
    public static final class C29873c implements Runnable {
        public void run() {
            Class cls = C30914c.class;
            ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33509r(262147, false);
            ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33509r(262149, false);
            ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33499h(262147, 266244);
            ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33499h(262149, 266244);
            C85801v1 i = C86709a0.m107535s().mo121142i();
            Boolean bool = Boolean.FALSE;
            i.mo119676J(208899, bool);
            C86709a0.m107535s().mo121142i().mo119676J(208913, bool);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeUI$EmojiStoreEmptyFragment;", "Lcom/tencent/mm/ui/MMFragment;", "<init>", "()V", "plugin-emoji_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeUI$EmojiStoreEmptyFragment */
    public static final class EmojiStoreEmptyFragment extends MMFragment {
        public int getLayoutId() {
            return -1;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeUI$a */
    public static final class C41075a {

        /* renamed from: a */
        public final String f110671a;

        /* renamed from: b */
        public TabLayout.C55061f f110672b;

        /* renamed from: c */
        public View f110673c;

        /* renamed from: d */
        public EmojiStoreV3TabView f110674d;

        /* renamed from: e */
        public View f110675e;

        public C41075a(String str) {
            C87412m.m108594g(str, "wording");
            this.f110671a = str;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeUI$b */
    public static final class C41076b implements C115619a {

        /* renamed from: d */
        public final View f110676d;

        public C41076b(View view) {
            C87412m.m108594g(view, "view");
            this.f110676d = view;
        }

        /* renamed from: e */
        public View mo64133e() {
            return this.f110676d;
        }

        /* renamed from: f */
        public boolean mo25956f(boolean z) {
            if (z) {
                View view = this.f110676d;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeUI$StickersNewTipsView", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeUI$StickersNewTipsView", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return true;
            }
            View view3 = this.f110676d;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeUI$StickersNewTipsView", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeUI$StickersNewTipsView", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return true;
        }

        /* renamed from: g */
        public boolean mo25958g(boolean z, tg4 tg4) {
            C87412m.m108594g(tg4, "tipsInfo");
            return false;
        }

        public String getPath() {
            return "stickernavright";
        }

        /* renamed from: h */
        public boolean mo25960h(boolean z) {
            return false;
        }

        /* renamed from: i */
        public boolean mo25962i(boolean z, tg4 tg4) {
            C87412m.m108594g(tg4, "tipsInfo");
            return false;
        }

        /* renamed from: j */
        public boolean mo64135j(boolean z, tg4 tg4) {
            C87412m.m108594g(tg4, "tipsInfo");
            return false;
        }

        /* renamed from: k */
        public void mo64136k(C115631n nVar, boolean z) {
            C87412m.m108594g(nVar, "showType");
            ((C47300f) C86312j.m106911c(C47300f.class)).mo72342m2(this, nVar, z);
        }

        /* renamed from: l */
        public boolean mo64137l() {
            return false;
        }

        /* renamed from: m */
        public boolean mo64138m(boolean z) {
            return ((C47300f) C86312j.m106911c(C47300f.class)).mo72340I0(z, this);
        }

        /* renamed from: n */
        public boolean mo64139n(boolean z, tg4 tg4) {
            C87412m.m108594g(tg4, "tipsInfo");
            return false;
        }

        /* renamed from: o */
        public void mo64140o(boolean z, C115631n nVar) {
            C87412m.m108594g(nVar, "showType");
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeUI$d */
    public static final class C41077d extends C87413o implements C32226l<Integer, MMFragment> {

        /* renamed from: d */
        public final /* synthetic */ EmojiStoreV3HomeUI f110677d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41077d(EmojiStoreV3HomeUI emojiStoreV3HomeUI) {
            super(1);
            this.f110677d = emojiStoreV3HomeUI;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            if (this.f110677d.f110662j.containsKey(Integer.valueOf(intValue))) {
                MMFragment mMFragment = this.f110677d.f110662j.get(Integer.valueOf(intValue));
                return mMFragment == null ? this.f110677d.mo64150H7(intValue) : mMFragment;
            }
            MMFragment H7 = this.f110677d.mo64150H7(intValue);
            this.f110677d.f110662j.put(Integer.valueOf(intValue), H7);
            return H7;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeUI$e */
    public static final class C41078e implements ViewPager.OnPageChangeListener {

        /* renamed from: d */
        public final /* synthetic */ EmojiStoreV3HomeUI f110678d;

        public C41078e(EmojiStoreV3HomeUI emojiStoreV3HomeUI) {
            this.f110678d = emojiStoreV3HomeUI;
        }

        public void onPageScrollStateChanged(int i) {
            Log.m105919d("MicroMsg.EmojiStoreV3HomeUI", "onPageScrollStateChanged state:%d", Integer.valueOf(i));
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
            C41075a aVar;
            EmojiStoreV3TabView emojiStoreV3TabView;
            ImageView imageView;
            TabLayout.C55061f k;
            int i2 = 0;
            Log.m105919d("MicroMsg.EmojiStoreV3HomeUI", "onPageSelected :%d", Integer.valueOf(i));
            EmojiStoreV3HomeUI emojiStoreV3HomeUI = this.f110678d;
            emojiStoreV3HomeUI.f110660h = i;
            TabLayout tabLayout = emojiStoreV3HomeUI.f110663n;
            if (!(tabLayout == null || (k = tabLayout.mo146907k(i)) == null)) {
                k.mo76121b();
            }
            EmojiStoreV3HomeUI emojiStoreV3HomeUI2 = this.f110678d;
            if (emojiStoreV3HomeUI2.f110660h == 1 && !emojiStoreV3HomeUI2.f110661i) {
                C115669n.INSTANCE.mo160131h(12090, new Object[0]);
                EmojiStoreV3HomeUI emojiStoreV3HomeUI3 = this.f110678d;
                emojiStoreV3HomeUI3.getClass();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_EMOJI_STORE_NEW_ORIGINAL_BOOLEAN, Boolean.FALSE);
                if (emojiStoreV3HomeUI3.f110667r && emojiStoreV3HomeUI3.f110663n != null) {
                    List<C41075a> list = emojiStoreV3HomeUI3.f110665p;
                    if (list != null) {
                        i2 = ((ArrayList) list).size();
                    }
                    if (i2 > 1) {
                        Log.m105924i("MicroMsg.EmojiStoreV3HomeUI", "cleanPersonPoint");
                        List<C41075a> list2 = emojiStoreV3HomeUI3.f110665p;
                        if (!(list2 == null || (aVar = (C41075a) ((ArrayList) list2).get(1)) == null || (emojiStoreV3TabView = aVar.f110674d) == null || (imageView = emojiStoreV3TabView.f110682g) == null)) {
                            imageView.setVisibility(4);
                        }
                    }
                }
                this.f110678d.f110661i = true;
            }
        }
    }

    /* renamed from: H7 */
    public final MMFragment mo64150H7(int i) {
        MMFragment mMFragment;
        if (i == 0) {
            Fragment instantiate = Fragment.instantiate(this, EmojiStoreV3HomeMainFragment.class.getName(), (Bundle) null);
            C87412m.m108592e(instantiate, "null cannot be cast to non-null type com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment");
            mMFragment = (EmojiStoreV3HomeBaseFragment) instantiate;
        } else if (i != 1) {
            Log.m105928w("MicroMsg.EmojiStoreV3HomeUI", "create fragment failed.");
            mMFragment = new EmojiStoreEmptyFragment();
        } else {
            Fragment instantiate2 = Fragment.instantiate(this, EmojiStoreV2PersonFragment.class.getName(), (Bundle) null);
            C87412m.m108592e(instantiate2, "null cannot be cast to non-null type com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment");
            mMFragment = (EmojiStoreV2BaseFragment) instantiate2;
        }
        Log.m105919d("MicroMsg.EmojiStoreV3HomeUI", "create fragment index:%d", Integer.valueOf(i));
        mMFragment.setParent(this);
        return mMFragment;
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ckf;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Log.m105918d("MicroMsg.EmojiStoreV3HomeUI", "onActivityResult . requestCode:" + i + "  resultCode:" + i2);
        C47161o oVar = this.f110666q;
        if (oVar != null) {
            MMFragment invoke = oVar.f126695e.invoke(Integer.valueOf(this.f110660h));
            if (invoke != null) {
                invoke.onActivityResult(i, i2, intent);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        C41075a aVar;
        EmojiStoreV3TabView emojiStoreV3TabView;
        ImageView imageView;
        TabLayout.C55061f k;
        C41075a aVar2;
        EmojiStoreV3TabView emojiStoreV3TabView2;
        TabLayout tabLayout;
        View view;
        View view2;
        Class cls = C10432i.class;
        super.onCreate(bundle);
        long currentTimeMillis = System.currentTimeMillis();
        if (((C10432i) C86312j.m106911c(cls)).mo10750e()) {
            Log.m105924i("MicroMsg.EmojiStoreV3HomeUI", "exit in teen mode");
            ((C10432i) C86312j.m106911c(cls)).mo10755m4(this);
            finish();
            return;
        }
        this.f110659g = getIntent().getIntExtra("download_entrance_scene", -1);
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("ShowPersonalEmotion");
        int i = 0;
        Log.m105925i("MicroMsg.EmojiStoreV3HomeUI", "get dynamic config value:%s", c);
        boolean z = !Util.isNullOrNil(c) && Util.safeParseInt(c) == 1;
        this.f110667r = z;
        if (z) {
            this.f110660h = getIntent().getIntExtra("emoji_tab", 0);
        }
        CustomViewPager customViewPager = (CustomViewPager) findViewById(C0966R.C0970id.lym);
        this.f110664o = customViewPager;
        if (customViewPager != null) {
            customViewPager.setOffscreenPageLimit(0);
            this.f110666q = new C47161o(this, this.f110660h, this.f110670u, customViewPager, this.f110667r, this.f110669t);
        }
        this.f110656d = (ImageView) findViewById(C0966R.C0970id.aij);
        this.f110657e = (ImageView) findViewById(C0966R.C0970id.f5471g1);
        this.f110658f = (ImageView) findViewById(C0966R.C0970id.f5427eu);
        ImageView imageView2 = this.f110657e;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new C11133r(this));
        }
        ImageView imageView3 = this.f110656d;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new C47163s(this));
        }
        ImageView imageView4 = this.f110658f;
        if (imageView4 != null) {
            imageView4.setOnClickListener(new C11134t(this));
        }
        ImageView imageView5 = (ImageView) findViewById(C0966R.C0970id.m2h);
        if (imageView5 != null) {
            this.f110668s = new C41076b(imageView5);
            ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175770k(this.f110668s);
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91104o();
        }
        TabLayout tabLayout2 = (TabLayout) findViewById(C0966R.C0970id.kci);
        this.f110663n = tabLayout2;
        if (tabLayout2 != null) {
            tabLayout2.setVisibility(0);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : this.f110667r ? C64197v.m75539h(getContext().getResources().getString(C0966R.string.c8s), getContext().getResources().getString(C0966R.string.f360374c91)) : C64197v.m75539h(getContext().getResources().getString(C0966R.string.c_3))) {
            C87412m.m108593f(str, LocaleUtil.ITALIAN);
            arrayList.add(new C41075a(str));
        }
        this.f110665p = arrayList;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C41075a aVar3 = (C41075a) it.next();
            TabLayout tabLayout3 = this.f110663n;
            View view3 = null;
            TabLayout.C55061f l = tabLayout3 != null ? tabLayout3.mo146908l() : null;
            aVar3.f110672b = l;
            if (l != null) {
                l.mo76122c(C0966R.C0971layout.cke);
            }
            TabLayout.C55061f fVar = aVar3.f110672b;
            if (!(fVar == null || (view2 = fVar.f154605f) == null)) {
                EmojiStoreV3TabView emojiStoreV3TabView3 = (EmojiStoreV3TabView) view2.findViewById(C0966R.C0970id.kyb);
                aVar3.f110674d = emojiStoreV3TabView3;
                if (emojiStoreV3TabView3 != null) {
                    emojiStoreV3TabView3.setTitleText(aVar3.f110671a);
                }
                EmojiStoreV3TabView emojiStoreV3TabView4 = aVar3.f110674d;
                if (emojiStoreV3TabView4 != null) {
                    emojiStoreV3TabView4.setTitleTextSize((float) C79406f.m96347a(getContext(), 15.0f));
                }
                EmojiStoreV3TabView emojiStoreV3TabView5 = aVar3.f110674d;
                if (emojiStoreV3TabView5 != null) {
                    emojiStoreV3TabView5.setTitleTextColor(getContext().getResources().getColor(C0966R.color.FG_1));
                }
                EmojiStoreV3TabView emojiStoreV3TabView6 = aVar3.f110674d;
                if (emojiStoreV3TabView6 != null) {
                    TextView textView = emojiStoreV3TabView6.f110681f;
                    C85875k4.m106191k0(textView != null ? textView.getPaint() : null);
                }
                List<C41075a> list = this.f110665p;
                if ((list != null ? ((ArrayList) list).size() : 0) > 1) {
                    aVar3.f110675e = view2.findViewById(C0966R.C0970id.kcx);
                }
            }
            TabLayout.C55061f fVar2 = aVar3.f110672b;
            if (!(fVar2 == null || (view = fVar2.f154605f) == null)) {
                view3 = view.findViewById(C0966R.C0970id.lyj);
            }
            aVar3.f110673c = view3;
            if (view3 != null) {
                view3.setPadding((int) getContext().getResources().getDimension(C0966R.dimen.av8), view3.getPaddingTop(), (int) getContext().getResources().getDimension(C0966R.dimen.av8), view3.getPaddingBottom());
            }
            TabLayout.C55061f fVar3 = aVar3.f110672b;
            if (!(fVar3 == null || (tabLayout = this.f110663n) == null)) {
                tabLayout.mo146889d(fVar3, false);
            }
        }
        TabLayout tabLayout4 = this.f110663n;
        if (tabLayout4 != null) {
            tabLayout4.mo146882a(new C47162q(this));
        }
        List<C41075a> list2 = this.f110665p;
        if (!(list2 == null || (aVar2 = (C41075a) ((ArrayList) list2).get(0)) == null || (emojiStoreV3TabView2 = aVar2.f110674d) == null)) {
            if (!Util.isNullOrNil(C41051m.m44498a().f110537e)) {
                String str2 = C41051m.m44498a().f110537e;
                C87412m.m108593f(str2, "getInstance().mainTabWording");
                emojiStoreV3TabView2.setTitleText(str2);
            } else if (C41051m.m44498a().f110536d) {
                emojiStoreV3TabView2.setTitleText((int) C0966R.string.c8t);
            } else {
                emojiStoreV3TabView2.setTitleText((int) C0966R.string.c8s);
            }
            if (!this.f110667r) {
                emojiStoreV3TabView2.setTitleText((int) C0966R.string.c_3);
            }
        }
        TabLayout tabLayout5 = this.f110663n;
        if (!(tabLayout5 == null || (k = tabLayout5.mo146907k(0)) == null)) {
            k.mo76121b();
        }
        C86709a0.m107525e().postToWorker(new C29873c());
        if (this.f110667r && this.f110663n != null) {
            List<C41075a> list3 = this.f110665p;
            if ((list3 != null ? ((ArrayList) list3).size() : 0) > 1) {
                Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_EMOJI_STORE_NEW_ORIGINAL_BOOLEAN, Boolean.FALSE);
                C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Boolean");
                boolean booleanValue = ((Boolean) f).booleanValue();
                Log.m105924i("MicroMsg.EmojiStoreV3HomeUI", "updatePersonPoint: " + booleanValue);
                List<C41075a> list4 = this.f110665p;
                if (!(list4 == null || (aVar = (C41075a) ((ArrayList) list4).get(1)) == null || (emojiStoreV3TabView = aVar.f110674d) == null || (imageView = emojiStoreV3TabView.f110682g) == null)) {
                    if (!booleanValue) {
                        i = 4;
                    }
                    imageView.setVisibility(i);
                }
            }
        }
        C115669n nVar = C115669n.INSTANCE;
        nVar.idkeyStat(406, 0, 1, false);
        nVar.idkeyStat(406, 2, System.currentTimeMillis() - currentTimeMillis, false);
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.EmojiStoreV3HomeUI", "onDestroy");
        super.onDestroy();
        if (this.f110668s != null) {
            ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175776r(this.f110668s);
            this.f110668s = null;
        }
    }

    public void onResume() {
        super.onResume();
        Log.m105918d("MicroMsg.EmojiStoreV3HomeUI", "onResume");
        Looper.myQueue().addIdleHandler(C34742p.f93401d);
    }

    public void setRequestedOrientation(int i) {
        super.setRequestedOrientation(1);
    }
}
