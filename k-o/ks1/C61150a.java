package ks1;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import di3.C86312j;
import er1.C58784w3;
import er1.C7888v2;
import fe1.C58960c;
import fe1.C58969q;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import p1081gi.C98121d;
import p166hy.C60227q0;
import te3.C52192z0;

/* renamed from: ks1.a */
public final class C61150a {

    /* renamed from: a */
    public ImageView f174088a;

    /* renamed from: b */
    public TextView f174089b;

    /* renamed from: c */
    public TextView f174090c;

    /* renamed from: d */
    public LinearLayout f174091d;

    /* renamed from: e */
    public FrameLayout f174092e;

    /* renamed from: f */
    public final Context f174093f;

    /* renamed from: g */
    public FinderObject f174094g;

    /* renamed from: ks1.a$a */
    public static final class C61151a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C61150a f174095d;

        public C61151a(C61150a aVar) {
            this.f174095d = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0034, code lost:
            r3 = r3.contact;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r9) {
            /*
                r8 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r9)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/finder/view/snscover/FinderDetailLoader$1"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r8
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                ks1.a r9 = r8.f174095d
                android.content.Context r0 = r9.f174093f
                java.lang.String r1 = "context"
                gy3.C87412m.m108593f(r0, r1)
                java.lang.Class<ht1.t1> r1 = ht1.C60200t1.class
                com.tencent.mm.protocal.protobuf.FinderObject r2 = r9.f174094g
                if (r2 == 0) goto L_0x00ac
                android.content.Intent r2 = new android.content.Intent
                r2.<init>()
                com.tencent.mm.protocal.protobuf.FinderObject r3 = r9.f174094g
                r4 = 0
                if (r3 == 0) goto L_0x003b
                com.tencent.mm.protocal.protobuf.FinderContact r3 = r3.contact
                if (r3 == 0) goto L_0x003b
                java.lang.String r3 = r3.username
                goto L_0x003c
            L_0x003b:
                r3 = r4
            L_0x003c:
                zc1.b r5 = zc1.C66785b.f191882e
                java.lang.String r5 = r5.mo90662O5()
                boolean r3 = gy3.C87412m.m108589b(r3, r5)
                com.tencent.mm.protocal.protobuf.FinderObject r5 = r9.f174094g
                if (r5 == 0) goto L_0x0051
                com.tencent.mm.protocal.protobuf.FinderContact r5 = r5.contact
                if (r5 == 0) goto L_0x0051
                java.lang.String r5 = r5.username
                goto L_0x0052
            L_0x0051:
                r5 = r4
            L_0x0052:
                java.lang.String r6 = "finder_username"
                r2.putExtra(r6, r5)
                com.tencent.mm.protocal.protobuf.FinderObject r5 = r9.f174094g
                r6 = 0
                if (r5 == 0) goto L_0x006a
                com.tencent.mm.protocal.protobuf.FinderContact r5 = r5.contact
                if (r5 == 0) goto L_0x006a
                te3.cg r5 = fe1.C58960c.m68829a(r5, r6)
                if (r5 == 0) goto L_0x006a
                java.lang.String r5 = r5.f182468d
                if (r5 != 0) goto L_0x006c
            L_0x006a:
                java.lang.String r5 = ""
            L_0x006c:
                java.lang.String r7 = "key_biz_username"
                r2.putExtra(r7, r5)
                r5 = 2
                r7 = 20
                if (r3 == 0) goto L_0x0080
                di3.d r9 = di3.C86312j.m106911c(r1)
                ht1.t1 r9 = (ht1.C60200t1) r9
                r9.mo76836bn(r0, r2, r7, r5)
                goto L_0x00ac
            L_0x0080:
                com.tencent.mm.protocal.protobuf.FinderObject r9 = r9.f174094g
                if (r9 == 0) goto L_0x008a
                er1.w3 r3 = er1.C58784w3.f168295a
                com.tencent.mm.protocal.protobuf.FinderJumpInfo r4 = r3.mo83934h0(r9)
            L_0x008a:
                if (r4 == 0) goto L_0x0098
                er1.w3 r9 = er1.C58784w3.f168295a
                java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
                boolean r9 = r9.mo83929f1(r0, r4, r3)
                if (r9 != 0) goto L_0x00ac
            L_0x0098:
                di3.d r9 = di3.C86312j.m106911c(r1)
                ht1.t1 r9 = (ht1.C60200t1) r9
                r3 = 32
                r9.mo76842e7(r7, r5, r3, r2)
                di3.d r9 = di3.C86312j.m106911c(r1)
                ht1.t1 r9 = (ht1.C60200t1) r9
                r9.mo76819V1(r0, r2)
            L_0x00ac:
                java.lang.String r9 = "com/tencent/mm/plugin/finder/view/snscover/FinderDetailLoader$1"
                java.lang.String r0 = "android/view/View$OnClickListener"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r8, r9, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ks1.C61150a.C61151a.onClick(android.view.View):void");
        }
    }

    /* renamed from: ks1.a$b */
    public static final class C61152b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C61150a f174096d;

        public C61152b(C61150a aVar) {
            this.f174096d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/snscover/FinderDetailLoader$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C61150a aVar = this.f174096d;
            Context context = aVar.f174093f;
            C87412m.m108593f(context, "context");
            aVar.getClass();
            Class cls = C60200t1.class;
            Intent intent = new Intent();
            FinderObject finderObject = aVar.f174094g;
            intent.putExtra("feed_object_id", finderObject != null ? Long.valueOf(finderObject.f164794id) : null);
            FinderObject finderObject2 = aVar.f174094g;
            intent.putExtra("feed_object_nonceId", finderObject2 != null ? finderObject2.objectNonceId : null);
            intent.putExtra("key_need_related_list", false);
            FinderObject finderObject3 = aVar.f174094g;
            if (finderObject3 != null) {
                C7888v2.C7889a aVar2 = C7888v2.f26513a;
                intent.putExtra("KEY_AUTHORIZATION_CONTENT", C68070l.C68072b.m80420s(aVar2.mo9008f(aVar2.mo9010h(FinderItem.Companion.mo79056a(finderObject3, 0), false)), (String) null, (C98121d) null));
            }
            ((C60200t1) C86312j.m106911c(cls)).mo76842e7(20, 2, 25, intent);
            ((C60200t1) C86312j.m106911c(cls)).mo76864nr(context, intent);
            ((C60227q0) C86312j.m106911c(C60227q0.class)).mo85220oJ(4);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/snscover/FinderDetailLoader$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C61150a(ImageView imageView, TextView textView, TextView textView2, LinearLayout linearLayout, FrameLayout frameLayout) {
        C87412m.m108594g(imageView, "avatarView");
        C87412m.m108594g(textView, "authorNameView");
        C87412m.m108594g(textView2, "finderDesc");
        C87412m.m108594g(linearLayout, "avatarFl");
        C87412m.m108594g(frameLayout, "jumpFinderViewFl");
        this.f174088a = imageView;
        this.f174089b = textView;
        this.f174090c = textView2;
        this.f174091d = linearLayout;
        this.f174092e = frameLayout;
        Context context = imageView.getContext();
        this.f174093f = context;
        this.f174091d.setOnClickListener(new C61151a(this));
        this.f174092e.setOnClickListener(new C61152b(this));
        this.f174092e.setContentDescription(C76577a.m92166q(context, C0966R.string.nfx));
    }

    /* renamed from: a */
    public final void mo86091a(FinderObject finderObject) {
        String str;
        this.f174094g = finderObject;
        if (finderObject != null) {
            this.f174092e.setVisibility(0);
            FinderContact finderContact = finderObject.contact;
            C58969q qVar = null;
            if (finderContact != null) {
                qVar = C58960c.m68834f(finderContact, (C58969q) null, false, 3, (Object) null);
            }
            this.f174089b.post(new C61153b(finderObject, qVar, this));
            this.f174090c.post(new C61154c(this, finderObject));
            C52192z0 j0 = C58784w3.f168295a.mo83940j0(finderObject);
            if (j0 == null || (str = j0.f145601e) == null) {
                str = qVar != null ? qVar.getAvatarUrl() : "";
            }
            this.f174088a.post(new C61155d(str, this));
        }
    }
}
