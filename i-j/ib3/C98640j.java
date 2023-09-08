package ib3;

import ab3.C91984b;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bb3.C92221d;
import cb3.C92392c;
import cb3.C92393d;
import cb3.C92400k;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fav.p047ui.C93693r;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.view.MediaGroupItemCoverView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32224a;
import gb3.C98096c;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import rx3.C13601g;
import rx3.C36568h;
import sx3.C64197v;
import ud3.C102000f;
import xa3.C102587c;
import xa3.C102590f;
import xa3.C102595k;
import xa3.C102599o;
import xa3.C102600p;

/* renamed from: ib3.j */
public final class C98640j extends C98648o {

    /* renamed from: V */
    public final C13601g f289209V = C36568h.m40985a(new C98643c(this));

    /* renamed from: W */
    public final LinkedList<C98642b> f289210W = new LinkedList<>();

    /* renamed from: X */
    public final LinkedList<C98641a> f289211X = new LinkedList<>();

    /* renamed from: ib3.j$a */
    public final class C98641a {

        /* renamed from: a */
        public final WXRTEditText f289212a;

        public C98641a(C98640j jVar, LinearLayout linearLayout, int i) {
            C87412m.m108594g(linearLayout, "intervalLayout");
            WXRTEditText wXRTEditText = (WXRTEditText) linearLayout.findViewById(C0966R.C0970id.f357583di3);
            wXRTEditText.setEditTextType(2);
            wXRTEditText.f283163R0 = i;
            jVar.f289192z.mo134911i(wXRTEditText);
            wXRTEditText.f283150F = jVar;
            this.f289212a = wXRTEditText;
        }
    }

    /* renamed from: ib3.j$b */
    public final class C98642b {

        /* renamed from: a */
        public final ImageView f289213a;

        /* renamed from: b */
        public final View f289214b;

        /* renamed from: c */
        public final View f289215c;

        /* renamed from: d */
        public final View f289216d;

        /* renamed from: e */
        public final View f289217e;

        /* renamed from: f */
        public WXRTEditText f289218f;

        /* renamed from: g */
        public WXRTEditText f289219g;

        /* renamed from: h */
        public boolean f289220h;

        /* renamed from: i */
        public final /* synthetic */ C98640j f289221i;

        public C98642b(C98640j jVar, ImageView imageView, View view) {
            C87412m.m108594g(imageView, "subItemImg");
            C87412m.m108594g(view, "subItemView");
            this.f289221i = jVar;
            this.f289213a = imageView;
            this.f289214b = view;
            this.f289215c = view.findViewById(C0966R.C0970id.ngn);
            this.f289216d = view.findViewById(C0966R.C0970id.ngo);
            this.f289217e = view.findViewById(C0966R.C0970id.ngq);
        }

        /* renamed from: a */
        public final WXRTEditText mo138070a() {
            WXRTEditText wXRTEditText = this.f289219g;
            if (wXRTEditText != null) {
                return wXRTEditText;
            }
            C87412m.m108603p("btnNext");
            throw null;
        }

        /* renamed from: b */
        public final void mo138071b(boolean z) {
            int i = z ? 0 : 8;
            View view = this.f289216d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteMediaGroupItemHolder$SubItemHolder", "showMask", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteMediaGroupItemHolder$SubItemHolder", "showMask", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: ib3.j$c */
    public static final class C98643c extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ C98640j f289222d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98643c(C98640j jVar) {
            super(0);
            this.f289222d = jVar;
        }

        public Object invoke() {
            return (LinearLayout) this.f289222d.f44854d.findViewById(C0966R.C0970id.nfs);
        }
    }

    public C98640j(View view, C96679b bVar, C92221d dVar) {
        super(view, bVar, dVar);
        C76577a.m92157h(view.getContext(), C0966R.dimen.f3766df);
        for (int i = 0; i < 3; i++) {
            View inflate = LayoutInflater.from(this.f44854d.getContext()).inflate(C0966R.C0971layout.d0c, mo138066F(), false);
            ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.ngp);
            C87412m.m108593f(imageView, "subItemImg");
            C98642b bVar2 = new C98642b(this, imageView, inflate);
            this.f289210W.add(bVar2);
            LinearLayout linearLayout = this.f289246N;
            MediaGroupItemCoverView mediaGroupItemCoverView = linearLayout instanceof MediaGroupItemCoverView ? (MediaGroupItemCoverView) linearLayout : null;
            if (mediaGroupItemCoverView != null) {
                View view2 = bVar2.f289215c;
                C87412m.m108593f(view2, "subItemHolder.subCoverView");
                if (!mediaGroupItemCoverView.f23919d.contains(view2)) {
                    mediaGroupItemCoverView.f23919d.add(view2);
                }
            }
            mo138066F().addView(inflate);
            if (i != 2) {
                View inflate2 = LayoutInflater.from(this.f44854d.getContext()).inflate(C0966R.C0971layout.d0a, mo138066F(), false);
                C87412m.m108592e(inflate2, "null cannot be cast to non-null type android.widget.LinearLayout");
                LinearLayout linearLayout2 = (LinearLayout) inflate2;
                mo138066F().addView(linearLayout2);
                LinkedList<C98641a> linkedList = this.f289211X;
                linkedList.add(new C98641a(this, linearLayout2, linkedList.size() + 1));
            }
            int i2 = 0;
            for (T next : this.f289210W) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    C98642b bVar3 = (C98642b) next;
                    WXRTEditText wXRTEditText = i2 == 0 ? this.f289235C : this.f289211X.get(i2 - 1).f289212a;
                    WXRTEditText wXRTEditText2 = i2 == this.f289210W.size() + -1 ? this.f289236D : this.f289211X.get(i2).f289212a;
                    C87412m.m108593f(wXRTEditText, "subBtnPre");
                    C87412m.m108593f(wXRTEditText2, "subBtnNext");
                    bVar3.getClass();
                    bVar3.f289218f = wXRTEditText;
                    bVar3.f289219g = wXRTEditText2;
                    i2 = i3;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
        this.f289236D.f283163R0 = this.f289211X.size() + 1;
    }

    /* renamed from: D */
    public C92392c mo138064D(View view) {
        return mo138068H();
    }

    /* renamed from: E */
    public void mo138065E(C102587c cVar) {
        boolean z = true;
        if (cVar == null || !cVar.f302071b) {
            z = false;
        }
        if (!z) {
            super.mo138065E(cVar);
        } else if (!mo138069I()) {
            super.mo138065E(cVar);
            mo138069I();
        }
    }

    /* renamed from: F */
    public final LinearLayout mo138066F() {
        Object value = this.f289209V.getValue();
        C87412m.m108593f(value, "<get-layoutMediaGroup>(...)");
        return (LinearLayout) value;
    }

    /* renamed from: G */
    public final C92392c mo138067G(int i) {
        if (i == 0) {
            WXRTEditText wXRTEditText = this.f289235C;
            View view = this.f289210W.get(0).f289215c;
            C92392c cVar = new C92392c();
            cVar.f264396d = wXRTEditText;
            cVar.f264397e = i;
            cVar.f264398f = view;
            return cVar;
        } else if (i == this.f289211X.size() + 1) {
            WXRTEditText wXRTEditText2 = this.f289236D;
            LinkedList<C98642b> linkedList = this.f289210W;
            View view2 = linkedList.get(linkedList.size() - 1).f289215c;
            C92392c cVar2 = new C92392c();
            cVar2.f264396d = wXRTEditText2;
            cVar2.f264397e = i;
            cVar2.f264398f = view2;
            return cVar2;
        } else {
            int i2 = i - 1;
            WXRTEditText wXRTEditText3 = this.f289211X.get(i2).f289212a;
            View view3 = this.f289210W.get(i2).f289215c;
            C92392c cVar3 = new C92392c();
            cVar3.f264396d = wXRTEditText3;
            cVar3.f264397e = i;
            cVar3.f264398f = view3;
            return cVar3;
        }
    }

    /* renamed from: H */
    public final C92392c mo138068H() {
        C92400k h = C92400k.m116191h();
        if (h.mo126386m() == 0) {
            return null;
        }
        int posInDataList = this.f289235C.getPosInDataList();
        C92393d l = h.mo126385l();
        if (l.f264399a == posInDataList && l.f264401c == posInDataList) {
            return mo138067G(l.f264402d);
        }
        return null;
    }

    /* renamed from: I */
    public final boolean mo138069I() {
        boolean z = false;
        for (int size = this.f289210W.size() - 1; -1 < size; size--) {
            C98642b bVar = this.f289210W.get(size);
            C87412m.m108593f(bVar, "subItemHolderList[i]");
            C98642b bVar2 = bVar;
            if (bVar2.mo138070a().isFocused()) {
                if (bVar2.f289220h) {
                    return true;
                }
                z = true;
            } else if (z && bVar2.f289220h) {
                bVar2.mo138070a().requestFocus();
                return true;
            }
        }
        return false;
    }

    /* renamed from: y */
    public int mo138058y() {
        return 7;
    }

    /* renamed from: z */
    public void mo138059z(C102587c cVar, int i, int i2) {
        List<WXRTEditText> list;
        C102587c cVar2 = cVar;
        int i3 = i;
        if (!(cVar2 == null || (list = cVar2.f302076g) == null)) {
            ((LinkedList) list).clear();
        }
        for (C98641a aVar : this.f289211X) {
            aVar.f289212a.setPosInDataList(i3);
            if (cVar2 != null) {
                ((LinkedList) cVar2.f302076g).add(aVar.f289212a);
            }
        }
        for (C98642b bVar : this.f289210W) {
            bVar.f289220h = false;
            View view = bVar.f289217e;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteMediaGroupItemHolder$SubItemHolder", "clear", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteMediaGroupItemHolder$SubItemHolder", "clear", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            bVar.f289213a.setImageDrawable((Drawable) null);
            bVar.f289213a.setOnClickListener(new C98646m(bVar));
            bVar.f289213a.setOnLongClickListener((View.OnLongClickListener) null);
            bVar.mo138070a().setProcessClickListener(new C98647n(bVar));
        }
        C102600p pVar = cVar2 instanceof C102600p ? (C102600p) cVar2 : null;
        if (pVar != null) {
            int i4 = 0;
            for (T next : pVar.f302102s) {
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    C102587c cVar3 = (C102587c) next;
                    C98642b bVar2 = this.f289210W.get(i4);
                    C87412m.m108593f(bVar2, "subItemHolderList[index]");
                    C98642b bVar3 = bVar2;
                    C87412m.m108594g(cVar3, "item");
                    Log.m105919d("NoteMediaGroupItemHolder", "bind item, pos:%s offset:%s type:%d id:%s", Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(cVar3.mo142212c()), ((C102599o) cVar3).f302098o);
                    if (cVar3 instanceof C102590f) {
                        C102590f fVar = (C102590f) cVar3;
                        String str = fVar.f302101r;
                        String str2 = fVar.f302104s;
                        if (!C86013q1.m106450k(str)) {
                            str = C86013q1.m106450k(str2) ? str2 : null;
                        }
                        if (bVar3.f289221i.f289192z.f283197m == 3) {
                            if (!C86013q1.m106450k(str2)) {
                                str2 = str;
                            }
                            str = str2;
                        }
                        bVar3.f289213a.setImageBitmap(Util.isNullOrNil(str) ? null : C98096c.m126711f(str, (String) null));
                    } else if (cVar3 instanceof C102595k) {
                        C102595k kVar = (C102595k) cVar3;
                        Bitmap f = C98096c.m126711f(kVar.f302084s, (String) null);
                        if (f == null && C86013q1.m106450k(kVar.f302101r) && (f = C93693r.m118401b(kVar.f302101r)) != null) {
                            try {
                                if (C86013q1.m106450k(kVar.f302084s)) {
                                    C86013q1.m106447h(kVar.f302084s);
                                }
                                C102000f.m134325a(f, 60, Bitmap.CompressFormat.JPEG, kVar.f302084s, false);
                            } catch (Exception unused) {
                            }
                        }
                        bVar3.f289213a.setImageBitmap(f);
                        View view3 = bVar3.f289217e;
                        C9556a aVar3 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar3.mo10233c(0);
                        View view4 = view3;
                        C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteMediaGroupItemHolder$SubItemHolder", "bindItemForVideoData", "(Lcom/tencent/mm/plugin/wenote/model/datamodel/VideoDataItem;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view4, "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteMediaGroupItemHolder$SubItemHolder", "bindItemForVideoData", "(Lcom/tencent/mm/plugin/wenote/model/datamodel/VideoDataItem;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    bVar3.mo138070a().setProcessClickListener((C91984b) null);
                    bVar3.f289213a.setOnClickListener(new C98644k(bVar3.f289221i, i3, i4, cVar3));
                    bVar3.f289213a.setOnLongClickListener(new C98645l(i4, i3));
                    bVar3.f289220h = true;
                    i4 = i5;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            pVar.f302103t = this;
            super.mo138059z(pVar, i3, i2);
            if (pVar.f302078i) {
                int i6 = 0;
                for (T next2 : this.f289210W) {
                    int i7 = i6 + 1;
                    if (i6 >= 0) {
                        ((C98642b) next2).mo138071b(C92400k.m116191h().mo126385l().f264402d - 1 == i6);
                        i6 = i7;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                return;
            }
            for (C98642b b : this.f289210W) {
                b.mo138071b(false);
            }
        }
    }
}
