package com.tencent.p014mm.plugin.fav.p047ui;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.C112919c0;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import mc1.C99830c;
import mc1.C99841k;
import mc1.C99843l;
import mc1.C99844m;
import mc1.C99845n;
import p385u2.C111105a;
import p525fr.C59312c;
import p525fr.C59313e;
import p525fr.C97951d;
import p640ox.C77049b;
import pb1.C100702d1;
import pb1.C100755z;
import pc1.C100774c;
import te3.C101825od0;
import uo3.C78253a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/fav/ui/FavFinderFilterUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "Lfr/e;", "<init>", "()V", "ui-fav_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.fav.ui.FavFinderFilterUI */
public final class FavFinderFilterUI extends MMSecDataActivity implements C59313e {

    /* renamed from: o */
    public static final /* synthetic */ int f269710o = 0;

    /* renamed from: d */
    public Animation f269711d;

    /* renamed from: e */
    public Animation f269712e;

    /* renamed from: f */
    public C97951d f269713f;

    /* renamed from: g */
    public String f269714g;

    /* renamed from: h */
    public int f269715h = -1;

    /* renamed from: i */
    public float f269716i;

    /* renamed from: j */
    public float f269717j;

    /* renamed from: n */
    public int f269718n = -1;

    /* renamed from: H7 */
    public final C99830c mo128270H7() {
        C39818r rVar = C39818r.f106831a;
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        C39622i0 a = rVar.mo62444c(context).mo75002a(C99830c.class);
        C87412m.m108593f(a, "UICProvider.of(context).…inderDataUIC::class.java)");
        return (C99830c) a;
    }

    /* renamed from: I5 */
    public void mo84412I5(int i, int i2) {
        Log.m105924i("MicroMsg.FavFinderFilterUI", "[onItemSelectStateChang] position = " + i + ", type = " + i2);
        if (!mo128271I7().f292545d) {
            Log.m105924i("MicroMsg.FavFinderFilterUI", "[onItemSelectStateChang] not in more state, maybe finder fragment bug");
            return;
        }
        if (i2 == 111) {
            mo128270H7().mo139187g3(i);
        } else {
            C99830c H7 = mo128270H7();
            C100755z b = C93666k0.f270444c.mo128591a().mo128589b(i);
            Log.m105924i("MicroMsg.FavFinderFilterUI", "[unSelectFavItemInfo] position = " + i);
            if (b == null) {
                Log.m105924i("MicroMsg.FavFinderFilterUI", "[unSelectFavItemInfo] favItemInfo = null");
            } else if (H7.f292530d.contains(b)) {
                H7.f292530d.remove(b);
                H7.f292531e.remove(Integer.valueOf(i));
            } else {
                Log.m105924i("MicroMsg.FavFinderFilterUI", "[unSelectFavItemInfo] error, select second time of same favItemInfo = " + b.field_localId);
            }
        }
        if (((ArrayList) mo128270H7().mo139186f3()).isEmpty()) {
            C100774c cVar = mo128271I7().f292546e;
            if (cVar != null) {
                cVar.mo140208a(false);
            } else {
                C87412m.m108603p("mMoreFooter");
                throw null;
            }
        } else {
            C100774c cVar2 = mo128271I7().f292546e;
            if (cVar2 != null) {
                cVar2.mo140208a(true);
            } else {
                C87412m.m108603p("mMoreFooter");
                throw null;
            }
        }
    }

    /* renamed from: I7 */
    public final C99841k mo128271I7() {
        C39818r rVar = C39818r.f106831a;
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        C39622i0 a = rVar.mo62444c(context).mo75002a(C99841k.class);
        C87412m.m108593f(a, "UICProvider.of(context).…inderMenuUIC::class.java)");
        return (C99841k) a;
    }

    /* renamed from: J7 */
    public final C99845n mo128272J7() {
        C39818r rVar = C39818r.f106831a;
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        C39622i0 a = rVar.mo62444c(context).mo75002a(C99845n.class);
        C87412m.m108593f(a, "UICProvider.of(context).…derReportUIC::class.java)");
        return (C99845n) a;
    }

    /* renamed from: W */
    public void mo84413W(View view, int i) {
        C87412m.m108594g(view, "view");
        Log.m105924i("MicroMsg.FavFinderFilterUI", "[onItemLongClick] position = " + i + ", rawX = " + this.f269716i + ", rawY = " + this.f269717j);
        int[] iArr = {(int) this.f269716i, (int) this.f269717j};
        this.f269715h = i;
        C99841k I7 = mo128271I7();
        int i2 = this.f269715h;
        C78253a aVar = new C78253a(I7.getContext(), view);
        C100755z c3 = I7.mo139192d3().mo139183c3(i2);
        if (c3 != null) {
            C99843l lVar = new C99843l(c3);
            I7.f292548g = i2;
            aVar.mo108272g(view, i2, 0, lVar, new C99844m(I7), iArr[0], iArr[1]);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            Log.m105920e("MicroMsg.FavFinderFilterUI", "[dispatchTouchEvent] motion event null");
        } else if (motionEvent.getAction() == 0) {
            this.f269716i = motionEvent.getRawX();
            this.f269717j = motionEvent.getRawY();
            Log.m105924i("MicroMsg.FavFinderFilterUI", "[dispatchTouchEvent] ACTION_DOWN, mRawX = " + this.f269716i + ", mRawY = " + this.f269717j);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e7 */
    public boolean mo84414e7(int i) {
        boolean z = false;
        mo128272J7().mo139196c3(2, false);
        if (!(this.f269718n == 1) || mo128271I7().f292545d) {
            Log.m105924i("MicroMsg.FavFinderFilterUI", "[onItemClick] position = " + i + ", un filter click");
            return false;
        }
        Log.m105924i("MicroMsg.FavFinderFilterUI", "[onItemClick] position = " + i + ", filter click");
        C100755z c3 = mo128270H7().mo139183c3(i);
        if (c3 != null) {
            String str = this.f269714g;
            if (str != null) {
                if (str.length() == 0) {
                    z = true;
                }
                if (z) {
                    Log.m105920e("MicroMsg.FavFinderFilterUI", "[showTransmitDialog] toUser empty, return");
                } else {
                    C100702d1 d1Var = (C100702d1) C86312j.m106911c(C100702d1.class);
                    AppCompatActivity context = getContext();
                    String str2 = this.f269714g;
                    if (str2 != null) {
                        d1Var.mo123900yk(context, str2, c3, C0966R.string.a2s, true, new C93601g0(this, c3));
                    } else {
                        C87412m.m108603p("toUser");
                        throw null;
                    }
                }
            } else {
                C87412m.m108603p("toUser");
                throw null;
            }
        }
        return true;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d3w;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C97951d dVar = this.f269713f;
        if (dVar != null) {
            dVar.mo79142p(i, i2, intent);
        } else {
            C87412m.m108603p("mGlobalFavFragment");
            throw null;
        }
    }

    public void onBackPressed() {
        if (mo128271I7().f292545d) {
            C97951d dVar = this.f269713f;
            if (dVar != null) {
                dVar.mo79143q();
                mo128271I7().mo139191c3();
                return;
            }
            C87412m.m108603p("mGlobalFavFragment");
            throw null;
        }
        finish();
    }

    public void onCreate(Bundle bundle) {
        View view;
        super.onCreate(bundle);
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2448da);
        C87412m.m108593f(loadAnimation, "loadAnimation(context, R.anim.panel_fade_in)");
        this.f269711d = loadAnimation;
        Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2449db);
        C87412m.m108593f(loadAnimation2, "loadAnimation(context, R.anim.panel_fade_out)");
        this.f269712e = loadAnimation2;
        Transition inflateTransition = TransitionInflater.from(this).inflateTransition(17760258);
        View decorView = getWindow().getDecorView();
        C87412m.m108593f(decorView, "window.decorView");
        inflateTransition.excludeTarget(decorView.findViewById(C0966R.C0970id.f5383do), true);
        inflateTransition.excludeTarget(16908335, true);
        getWindow().setEnterTransition(inflateTransition);
        this.f269718n = getIntent().getIntExtra("key_enter_fav_search_from", -1);
        this.f269714g = String.valueOf(getIntent().getStringExtra("key_to_user"));
        StringBuilder sb = new StringBuilder();
        sb.append("[FavFinderFilterUI] from = ");
        sb.append(this.f269718n);
        sb.append(", toUser = ");
        String str = this.f269714g;
        if (str != null) {
            sb.append(str);
            Log.m105924i("MicroMsg.FavFinderFilterUI", sb.toString());
            this.f269713f = ((C59312c) C86312j.m106911c(C59312c.class)).Ou0();
            mo128271I7().f292547f = new C93590e0(this);
            setMMTitle((int) C0966R.string.n6o);
            setActionbarColor(C111105a.m151500b(getContext(), C0966R.color.a7_));
            setBackBtn(new C93593f0(this));
            int d3 = mo128270H7().mo139184d3();
            Log.m105924i("MicroMsg.FavFinderFilterUI", "[initContentView] data size = " + d3);
            if (d3 == 0) {
                View findViewById = findViewById(C0966R.C0970id.j5k);
                View findViewById2 = findViewById(C0966R.C0970id.eek);
                if (findViewById.getVisibility() != 0) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = findViewById;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/fav/ui/FavFinderFilterUI", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/fav/ui/FavFinderFilterUI", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    Animation animation = this.f269711d;
                    if (animation != null) {
                        findViewById.startAnimation(animation);
                    } else {
                        C87412m.m108603p("mFadeIn");
                        throw null;
                    }
                }
                if (8 != findViewById2.getVisibility()) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view3 = findViewById2;
                    C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/fav/ui/FavFinderFilterUI", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/fav/ui/FavFinderFilterUI", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    Animation animation2 = this.f269712e;
                    if (animation2 != null) {
                        findViewById2.startAnimation(animation2);
                    } else {
                        C87412m.m108603p("mFadeOut");
                        throw null;
                    }
                }
            } else {
                View findViewById3 = findViewById(C0966R.C0970id.j5k);
                View findViewById4 = findViewById(C0966R.C0970id.eek);
                if (8 != findViewById3.getVisibility()) {
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar3.mo10233c(8);
                    View view4 = findViewById3;
                    view = findViewById4;
                    C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/fav/ui/FavFinderFilterUI", "showFinderDataFragment", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/fav/ui/FavFinderFilterUI", "showFinderDataFragment", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    Animation animation3 = this.f269712e;
                    if (animation3 != null) {
                        findViewById3.startAnimation(animation3);
                    } else {
                        C87412m.m108603p("mFadeOut");
                        throw null;
                    }
                } else {
                    view = findViewById4;
                }
                if (view.getVisibility() != 0) {
                    C9556a aVar4 = new C9556a();
                    ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                    aVar4.mo10233c(0);
                    C117292a.m165358d(view, aVar4.mo10232b(), "com/tencent/mm/plugin/fav/ui/FavFinderFilterUI", "showFinderDataFragment", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view5 = view;
                    view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view5, "com/tencent/mm/plugin/fav/ui/FavFinderFilterUI", "showFinderDataFragment", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    Animation animation4 = this.f269711d;
                    if (animation4 != null) {
                        view5.startAnimation(animation4);
                    } else {
                        C87412m.m108603p("mFadeIn");
                        throw null;
                    }
                }
                C112919c0 beginTransaction = getSupportFragmentManager().beginTransaction();
                C87412m.m108593f(beginTransaction, "manager.beginTransaction()");
                C97951d dVar = this.f269713f;
                if (dVar != null) {
                    beginTransaction.mo165200l(C0966R.C0970id.eek, dVar.mo79140c());
                    C97951d dVar2 = this.f269713f;
                    if (dVar2 != null) {
                        dVar2.mo79141o(this);
                        beginTransaction.mo165162d();
                        return;
                    }
                    C87412m.m108603p("mGlobalFavFragment");
                    throw null;
                }
                C87412m.m108603p("mGlobalFavFragment");
                throw null;
            }
        } else {
            C87412m.m108603p("toUser");
            throw null;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C87412m.m108594g(menu, "menu");
        MenuItem add = menu.add(0, 10, 0, C0966R.string.k3j);
        add.setIcon(C74933u4.m89768e(getContext(), C0966R.raw.actionbar_icon_dark_search, C111105a.m151500b(getContext(), C0966R.color.FG_0)));
        add.setShowAsAction(2);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        byte[] bArr;
        C87412m.m108594g(menuItem, "item");
        if (menuItem.getItemId() != 10) {
            return super.onOptionsItemSelected(menuItem);
        }
        Intent intent = new Intent();
        intent.putExtra("key_enter_fav_search_from", 0);
        intent.putExtra("key_preset_search_type", 20);
        intent.putExtra("key_search_type", 0);
        C101825od0 od02 = (C101825od0) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(this, 17, C101825od0.class);
        if (od02 != null) {
            try {
                bArr = od02.toByteArray();
            } catch (IOException unused) {
            }
        } else {
            bArr = null;
        }
        intent.putExtra("ReportKey.CommonReportObjKey", bArr);
        C93745z1.m118448e(getContext(), false, intent);
        return true;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C99841k.class);
        hashSet.add(C99830c.class);
        hashSet.add(C99845n.class);
    }
}
