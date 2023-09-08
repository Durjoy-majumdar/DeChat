package ah3;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.C103422m;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85978w1;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72837v1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.search.data.SimilarEmojiQueryModel;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86312j;
import en3.C75628g;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import i61.C98602h;
import p171il.C98711d;
import p171il.C98744t;
import p248ug.C78160t0;
import rx3.C13598b0;
import wg3.C102442a;
import wg3.C102443b;
import wg3.C102444c;
import yg3.C102859a;
import yg3.C102860c;
import yg3.C102861d;
import z51.C39315g;

/* renamed from: ah3.b */
public final class C92002b extends C103422m {

    /* renamed from: f */
    public Context f263384f;

    /* renamed from: g */
    public SimilarEmojiQueryModel f263385g;

    /* renamed from: h */
    public C32224a<C13598b0> f263386h;

    /* renamed from: i */
    public C75628g f263387i;

    /* renamed from: j */
    public C92003c f263388j = new C92003c(new C85978w1(this.f263384f, C0966R.style.f8435id), this);

    /* renamed from: n */
    public boolean f263389n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92002b(Context context, SimilarEmojiQueryModel similarEmojiQueryModel, C32224a<C13598b0> aVar) {
        super(context, C0966R.style.f8426i2);
        C87412m.m108594g(context, "mContext");
        C87412m.m108594g(similarEmojiQueryModel, "model");
        C87412m.m108594g(aVar, "dismiss");
        this.f263384f = context;
        this.f263385g = similarEmojiQueryModel;
        this.f263386h = aVar;
        mo143460C(1);
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        this.f263387i = new C75628g(context2);
        C92003c cVar = this.f263388j;
        SimilarEmojiQueryModel similarEmojiQueryModel2 = this.f263385g;
        cVar.getClass();
        C87412m.m108594g(similarEmojiQueryModel2, "model");
        cVar.f263394h = similarEmojiQueryModel2.f283918o;
        if (similarEmojiQueryModel2.mo135501a()) {
            EmojiInfo G = ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo137999G(similarEmojiQueryModel2.f283911e);
            C92001a aVar2 = cVar.f263392f;
            C87412m.m108593f(G, "head");
            aVar2.mo125854u2(G);
        } else {
            C92001a aVar3 = cVar.f263392f;
            aVar3.getClass();
            aVar3.mo125855y(new EmojiInfo());
        }
        C92001a aVar4 = cVar.f263392f;
        aVar4.f263381g = false;
        aVar4.mo125850d3();
        cVar.f263392f.notifyDataSetChanged();
        C98744t tVar = cVar.f263392f.f289521f;
        C87412m.m108592e(tVar, "null cannot be cast to non-null type com.tencent.mm.search.logic.SimilarEmojiPanelClickListener");
        ((C102860c) tVar).f303617f = similarEmojiQueryModel2;
        C98744t tVar2 = cVar.f263392f.f289521f;
        C87412m.m108592e(tVar2, "null cannot be cast to non-null type com.tencent.mm.emoji.panel.adapter.EmojiPanelClickListener");
        ((C98711d) tVar2).f289454b = similarEmojiQueryModel2.f283919p;
        C102442a aVar5 = cVar.f263391e;
        C92005d dVar = new C92005d(cVar, similarEmojiQueryModel2);
        C102444c cVar2 = (C102444c) aVar5;
        cVar2.getClass();
        Log.m105924i("MicroMsg.SimilarEmoji", "do net request:[" + similarEmojiQueryModel2 + ']');
        cVar2.f301694d = dVar;
        C102443b bVar = new C102443b(similarEmojiQueryModel2);
        cVar2.f301695e = System.currentTimeMillis();
        C86709a0.m107529k().f251779b.mo123460f(bVar);
    }

    public void dismiss() {
        Log.m105924i("MicroMsg.SimilarEmoji", "dialog dismiss");
        super.dismiss();
        this.f263386h.invoke();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "ev");
        boolean z = false;
        if (motionEvent.getActionMasked() == 0) {
            this.f263389n = false;
        }
        this.f263387i.mo105977b(motionEvent);
        C75628g gVar = this.f263387i;
        int i = gVar.f222179h;
        if (!(i == 1 || i == 2)) {
            z = gVar.mo105976a(motionEvent);
        }
        if (!z) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (!this.f263389n) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setAction(3);
            super.dispatchTouchEvent(obtain);
            obtain.recycle();
            this.f263389n = true;
        }
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f263388j);
        Log.m105924i("MicroMsg.SimilarEmoji", "dialog onCreate " + this.f263385g);
        C72837v1 v1Var = this.f263385g.f283919p;
        if (v1Var != null) {
            C102859a.f303616a = null;
            int i = ChatFooterPanel.f211589f;
            C102861d dVar = new C102861d(1);
            C102859a.f303616a = dVar;
            dVar.f289454b = v1Var;
        }
    }

    public void onStop() {
        Log.m105924i("MicroMsg.SimilarEmoji", "dialog onStop");
        super.onStop();
        C102444c cVar = (C102444c) this.f263388j.f263391e;
        cVar.f301694d = null;
        C86709a0.m107529k().f251779b.mo123470p(3793, cVar);
        C86709a0.m107529k().f251779b.mo123457c(3793);
        C102861d dVar = C102859a.f303616a;
        if (dVar != null) {
            dVar.f289454b = null;
        }
        C102859a.f303616a = null;
    }

    public void setContentView(View view) {
        C87412m.m108594g(view, "view");
        Window window = getWindow();
        boolean z = false;
        if (this.f263384f.getResources().getConfiguration().orientation == 2) {
            C87412m.m108591d(window);
            window.setGravity(5);
            window.setWindowAnimations(C0966R.style.f8722sr);
        } else {
            C87412m.m108591d(window);
            window.setGravity(80);
            window.setWindowAnimations(C0966R.style.f8365fv);
        }
        window.getDecorView().setPadding(0, 0, 0, 0);
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (this.f263384f.getResources().getConfiguration().orientation == 2) {
            z = true;
        }
        if (z) {
            attributes.width = -2;
            attributes.height = -1;
        } else {
            attributes.width = -1;
            attributes.height = -2;
        }
        window.setAttributes(attributes);
        setContentView(view, new ViewGroup.LayoutParams(-1, C78160t0.m94370a(getContext()) + (getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3758d_) * 1)));
        Window window2 = getWindow();
        C87412m.m108591d(window2);
        window2.setLayout(-1, -2);
    }
}
