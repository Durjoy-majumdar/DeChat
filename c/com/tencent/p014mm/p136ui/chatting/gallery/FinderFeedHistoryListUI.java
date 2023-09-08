package com.tencent.p014mm.p136ui.chatting.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.C112919c0;
import androidx.fragment.app.Fragment;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelvoiceaddr.p878ui.C114760b;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.chatting.presenter.C57687g;
import com.tencent.p014mm.p136ui.chatting.presenter.C73797e;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import dk3.C58319b;
import dk3.C75412a;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import kotlin.Metadata;
import p385u2.C111105a;
import p525fr.C59311b;
import p525fr.C59312c;
import p716uu.C52617d;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C64658qj1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/ui/chatting/gallery/FinderFeedHistoryListUI;", "Lcom/tencent/mm/ui/MMActivity;", "Ldk3/b;", "<init>", "()V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.chatting.gallery.FinderFeedHistoryListUI */
public final class FinderFeedHistoryListUI extends MMActivity implements C58319b {

    /* renamed from: i */
    public static final /* synthetic */ int f216356i = 0;

    /* renamed from: d */
    public C75412a f216357d;

    /* renamed from: e */
    public String f216358e = "";

    /* renamed from: f */
    public C59311b f216359f;

    /* renamed from: g */
    public String f216360g = "";

    /* renamed from: h */
    public final C13601g f216361h = C36568h.m40985a(C73693b.f216363d);

    /* renamed from: com.tencent.mm.ui.chatting.gallery.FinderFeedHistoryListUI$a */
    public static final class C73692a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedHistoryListUI f216362d;

        public C73692a(FinderFeedHistoryListUI finderFeedHistoryListUI) {
            this.f216362d = finderFeedHistoryListUI;
        }

        public final void run() {
            FinderFeedHistoryListUI finderFeedHistoryListUI = this.f216362d;
            int i = FinderFeedHistoryListUI.f216356i;
            finderFeedHistoryListUI.mo102734H7().mo153849a();
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.gallery.FinderFeedHistoryListUI$b */
    public static final class C73693b extends C87413o implements C32224a<C114760b> {

        /* renamed from: d */
        public static final C73693b f216363d = new C73693b();

        public C73693b() {
            super(0);
        }

        public Object invoke() {
            return new C114760b();
        }
    }

    /* renamed from: H7 */
    public final C114760b mo102734H7() {
        return (C114760b) ((C36570n) this.f216361h).getValue();
    }

    /* renamed from: J2 */
    public void mo83070J2(String str) {
        C87412m.m108594g(str, SearchIntents.EXTRA_QUERY);
        this.f216360g = str;
    }

    /* renamed from: f */
    public void mo83071f(boolean z) {
        C59311b bVar = this.f216359f;
        if (bVar != null) {
            bVar.mo79135z();
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f7159bw;
    }

    public void onBackPressed() {
        super.onBackPressed();
        finish();
        overridePendingTransition(0, 0);
    }

    public void onCreate(Bundle bundle) {
        String c;
        Fragment c2;
        super.onCreate(bundle);
        Transition inflateTransition = TransitionInflater.from(this).inflateTransition(17760258);
        View decorView = getWindow().getDecorView();
        C87412m.m108593f(decorView, "window.decorView");
        inflateTransition.excludeTarget(decorView.findViewById(C0966R.C0970id.f5383do), true);
        inflateTransition.excludeTarget(16908335, true);
        getWindow().setEnterTransition(inflateTransition);
        Intent intent = getIntent();
        C87412m.m108593f(intent, "intent");
        String stringExtra = intent.getStringExtra("kintent_talker");
        String str = "";
        if (stringExtra == null) {
            stringExtra = str;
        }
        this.f216358e = stringExtra;
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        C57687g gVar = new C57687g(context, this.f216358e);
        gVar.f165106h = this;
        mo82061t5(gVar);
        setActionbarColor(C111105a.m151500b(getContext(), C0966R.color.a7_));
        hideActionbarLine();
        getIntent().getBooleanExtra("detail_user_dismiss", false);
        mo102734H7().mo153851c(false);
        C114760b H7 = mo102734H7();
        C75412a aVar = this.f216357d;
        C52617d.C52618a d = aVar != null ? aVar.mo82047d() : null;
        H7.f344100u = d;
        H7.f319122j = d;
        mo102734H7().f344097r = false;
        C59311b dq = ((C59312c) C86312j.m106911c(C59312c.class)).mo78739dq(this.f216358e);
        this.f216359f = dq;
        if (!(dq == null || (c2 = dq.mo79133c()) == null)) {
            C112919c0 beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.mo165200l(C0966R.C0970id.f358080ok3, c2);
            beginTransaction.mo165164f();
        }
        C75412a aVar2 = this.f216357d;
        if (!(aVar2 == null || (c = aVar2.mo82046c()) == null)) {
            str = c;
        }
        setMMTitle(str);
        gVar.mo82050g(true);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        String str;
        C87412m.m108594g(menu, "menu");
        mo102734H7().mo23882j(this, menu);
        C114760b H7 = mo102734H7();
        C75412a aVar = this.f216357d;
        if (aVar == null || (str = aVar.mo82048e()) == null) {
            str = "";
        }
        if (H7.f319121i != null && !Util.isNullOrNil(str)) {
            H7.f319121i.setSelectedTag(str);
        }
        getContentView().postDelayed(new C73692a(this), 200);
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        C75412a aVar = this.f216357d;
        if (aVar != null) {
            aVar.onDetach();
        }
    }

    public void onFinish() {
        finish();
        overridePendingTransition(0, 0);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "event");
        if (keyEvent.getAction() != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        finish();
        overridePendingTransition(0, 0);
        return true;
    }

    public void onKeyboardStateChanged() {
        super.onKeyboardStateChanged();
        if (keyboardState() == 2) {
            mo102734H7().mo153849a();
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        C87412m.m108594g(menu, "menu");
        mo102734H7().mo153858m(this, menu);
        return true;
    }

    /* renamed from: q2 */
    public void mo83073q2(boolean z, List<? extends C64658qj1> list) {
        C87412m.m108594g(list, "dataList");
        C59311b bVar = this.f216359f;
        if (bVar != null) {
            bVar.mo79134n();
        }
        C59311b bVar2 = this.f216359f;
        if (bVar2 != null) {
            bVar2.mo79132I(this.f216360g, list);
        }
    }

    /* renamed from: t5 */
    public void mo82061t5(C73797e eVar) {
        this.f216357d = (C75412a) eVar;
    }
}
