package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import p432f.C116798a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0005&'()*J\u0010\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0014\u0010\r\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0010\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011R$\u0010\u001a\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010!\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0011\u0010%\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006+"}, mo182094d2 = {"Lcom/tencent/mm/pluginsdk/ui/tools/DropdownListView;", "Landroid/widget/LinearLayout;", "Landroid/widget/AdapterView$OnItemClickListener;", "Lcom/tencent/mm/pluginsdk/ui/tools/DropdownListView$c;", "listener", "Lrx3/b0;", "setListener", "Lf/a;", "color", "setColor", "", "Lcom/tencent/mm/pluginsdk/ui/tools/DropdownListView$b;", "items", "setItems", "Lcom/tencent/mm/pluginsdk/ui/tools/DropdownListView$e;", "onItemStateChanged", "setOnItemStateChanged", "Lcom/tencent/mm/pluginsdk/ui/tools/DropdownListView$d;", "onFolderAlbumDialogDismiss", "setFolderAlbumDialogDismiss", "j", "Lcom/tencent/mm/pluginsdk/ui/tools/DropdownListView$e;", "getMOnItemStateChanged", "()Lcom/tencent/mm/pluginsdk/ui/tools/DropdownListView$e;", "setMOnItemStateChanged", "(Lcom/tencent/mm/pluginsdk/ui/tools/DropdownListView$e;)V", "mOnItemStateChanged", "n", "Lcom/tencent/mm/pluginsdk/ui/tools/DropdownListView$d;", "getMOnFolderAlbumDialogDismiss", "()Lcom/tencent/mm/pluginsdk/ui/tools/DropdownListView$d;", "setMOnFolderAlbumDialogDismiss", "(Lcom/tencent/mm/pluginsdk/ui/tools/DropdownListView$d;)V", "mOnFolderAlbumDialogDismiss", "", "getSelectedItemName", "()Ljava/lang/String;", "selectedItemName", "a", "b", "c", "d", "e", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.pluginsdk.ui.tools.DropdownListView */
public final class DropdownListView extends LinearLayout implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public C72902c f212473d;

    /* renamed from: e */
    public FrameLayout f212474e;

    /* renamed from: f */
    public ListView f212475f;

    /* renamed from: g */
    public C72899a f212476g;

    /* renamed from: h */
    public boolean f212477h;

    /* renamed from: i */
    public boolean f212478i;

    /* renamed from: j */
    public C72904e f212479j;

    /* renamed from: n */
    public C72903d f212480n;

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.DropdownListView$a */
    public static final class C72899a extends BaseAdapter {

        /* renamed from: d */
        public final Context f212481d;

        /* renamed from: e */
        public List<C72901b> f212482e = new ArrayList();

        /* renamed from: f */
        public String f212483f = "";

        /* renamed from: com.tencent.mm.pluginsdk.ui.tools.DropdownListView$a$a */
        public static final class C72900a {

            /* renamed from: a */
            public WeImageView f212484a;

            /* renamed from: b */
            public TextView f212485b;

            /* renamed from: c */
            public ImageView f212486c;

            /* renamed from: d */
            public View f212487d;
        }

        public C72899a(Context context) {
            C87412m.m108594g(context, "mContext");
            this.f212481d = context;
        }

        public int getCount() {
            return this.f212482e.size();
        }

        public Object getItem(int i) {
            return this.f212482e.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: com.tencent.mm.pluginsdk.ui.tools.DropdownListView$a$a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r23, android.view.View r24, android.view.ViewGroup r25) {
            /*
                r22 = this;
                r0 = r22
                r1 = r23
                r2 = r25
                java.lang.String r3 = "parent"
                gy3.C87412m.m108594g(r2, r3)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "duanyi test getView:"
                r3.append(r4)
                r3.append(r1)
                java.lang.String r3 = r3.toString()
                java.lang.String r4 = "MicroMsg.DropdownListAdapter"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
                java.util.List<com.tencent.mm.pluginsdk.ui.tools.DropdownListView$b> r3 = r0.f212482e
                java.lang.Object r3 = r3.get(r1)
                com.tencent.mm.pluginsdk.ui.tools.DropdownListView$b r3 = (com.tencent.p014mm.pluginsdk.p133ui.tools.DropdownListView.C72901b) r3
                r4 = 0
                if (r24 != 0) goto L_0x006d
                android.content.Context r5 = r0.f212481d
                android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
                r6 = 2131494072(0x7f0c04b8, float:1.8611642E38)
                android.view.View r2 = r5.inflate(r6, r2, r4)
                com.tencent.mm.pluginsdk.ui.tools.DropdownListView$a$a r5 = new com.tencent.mm.pluginsdk.ui.tools.DropdownListView$a$a
                r5.<init>()
                r6 = 2131306613(0x7f092875, float:1.823143E38)
                android.view.View r6 = r2.findViewById(r6)
                com.tencent.mm.ui.widget.imageview.WeImageView r6 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r6
                r5.f212484a = r6
                r6 = 2131306649(0x7f092899, float:1.8231503E38)
                android.view.View r6 = r2.findViewById(r6)
                android.widget.TextView r6 = (android.widget.TextView) r6
                r5.f212485b = r6
                r6 = 2131313135(0x7f0941ef, float:1.8244658E38)
                android.view.View r6 = r2.findViewById(r6)
                android.widget.ImageView r6 = (android.widget.ImageView) r6
                r5.f212486c = r6
                r6 = 2131306632(0x7f092888, float:1.8231469E38)
                android.view.View r6 = r2.findViewById(r6)
                r5.f212487d = r6
                r2.setTag(r5)
                goto L_0x007b
            L_0x006d:
                java.lang.Object r2 = r24.getTag()
                java.lang.String r5 = "null cannot be cast to non-null type com.tencent.mm.pluginsdk.ui.tools.DropdownListView.DropdownListAdapter.ViewHolder"
                gy3.C87412m.m108592e(r2, r5)
                r5 = r2
                com.tencent.mm.pluginsdk.ui.tools.DropdownListView$a$a r5 = (com.tencent.p014mm.pluginsdk.p133ui.tools.DropdownListView.C72899a.C72900a) r5
                r2 = r24
            L_0x007b:
                java.lang.String r6 = r0.f212483f
                java.lang.String r7 = r3.f212488a
                boolean r6 = gy3.C87412m.m108589b(r6, r7)
                if (r6 == 0) goto L_0x008e
                android.widget.ImageView r6 = r5.f212486c
                gy3.C87412m.m108591d(r6)
                r6.setVisibility(r4)
                goto L_0x0097
            L_0x008e:
                android.widget.ImageView r6 = r5.f212486c
                gy3.C87412m.m108591d(r6)
                r7 = 4
                r6.setVisibility(r7)
            L_0x0097:
                int r6 = r22.getCount()
                int r6 = r6 + -1
                if (r1 >= r6) goto L_0x00e5
                android.view.View r1 = r5.f212487d
                gy3.C87412m.m108591d(r1)
                k20.a r6 = new k20.a
                r6.<init>()
                java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
                java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
                r6.mo10233c(r7)
                java.lang.Object[] r8 = r6.mo10232b()
                java.lang.String r9 = "com/tencent/mm/pluginsdk/ui/tools/DropdownListView$DropdownListAdapter"
                java.lang.String r10 = "getView"
                java.lang.String r11 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                r7 = r1
                j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
                java.lang.Object r6 = r6.mo10231a(r4)
                java.lang.Integer r6 = (java.lang.Integer) r6
                int r6 = r6.intValue()
                r1.setVisibility(r6)
                java.lang.String r8 = "com/tencent/mm/pluginsdk/ui/tools/DropdownListView$DropdownListAdapter"
                java.lang.String r9 = "getView"
                java.lang.String r10 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r11 = "android/view/View_EXEC_"
                java.lang.String r12 = "setVisibility"
                java.lang.String r13 = "(I)V"
                j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
                goto L_0x012c
            L_0x00e5:
                android.view.View r1 = r5.f212487d
                gy3.C87412m.m108591d(r1)
                r6 = 8
                k20.a r7 = new k20.a
                r7.<init>()
                java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r7.mo10233c(r6)
                java.lang.Object[] r15 = r7.mo10232b()
                java.lang.String r16 = "com/tencent/mm/pluginsdk/ui/tools/DropdownListView$DropdownListAdapter"
                java.lang.String r17 = "getView"
                java.lang.String r18 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r19 = "android/view/View_EXEC_"
                java.lang.String r20 = "setVisibility"
                java.lang.String r21 = "(I)V"
                r14 = r1
                j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
                java.lang.Object r6 = r7.mo10231a(r4)
                java.lang.Integer r6 = (java.lang.Integer) r6
                int r6 = r6.intValue()
                r1.setVisibility(r6)
                java.lang.String r15 = "com/tencent/mm/pluginsdk/ui/tools/DropdownListView$DropdownListAdapter"
                java.lang.String r16 = "getView"
                java.lang.String r17 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r18 = "android/view/View_EXEC_"
                java.lang.String r19 = "setVisibility"
                java.lang.String r20 = "(I)V"
                j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            L_0x012c:
                com.tencent.mm.ui.widget.imageview.WeImageView r1 = r5.f212484a
                gy3.C87412m.m108591d(r1)
                android.content.Context r6 = r0.f212481d
                android.content.res.Resources r6 = r6.getResources()
                int r7 = r3.f212489b
                android.graphics.drawable.Drawable r6 = r6.getDrawable(r7)
                r1.setImageDrawable(r6)
                com.tencent.mm.ui.widget.imageview.WeImageView r1 = r5.f212484a
                gy3.C87412m.m108591d(r1)
                android.content.Context r6 = r0.f212481d
                android.content.res.Resources r6 = r6.getResources()
                int r7 = r3.f212490c
                int r6 = r6.getColor(r7)
                r1.setIconColor(r6)
                android.widget.TextView r1 = r5.f212485b
                gy3.C87412m.m108591d(r1)
                r1.setVisibility(r4)
                android.widget.TextView r1 = r5.f212485b
                gy3.C87412m.m108591d(r1)
                java.lang.String r3 = r3.f212488a
                r1.setText(r3)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.tools.DropdownListView.C72899a.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.DropdownListView$b */
    public static final class C72901b {

        /* renamed from: a */
        public String f212488a;

        /* renamed from: b */
        public int f212489b;

        /* renamed from: c */
        public int f212490c;

        /* renamed from: d */
        public int f212491d;

        public C72901b(String str, int i, int i2, int i3) {
            C87412m.m108594g(str, "name");
            this.f212488a = str;
            this.f212489b = i;
            this.f212490c = i2;
            this.f212491d = i3;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.DropdownListView$c */
    public interface C72902c {
        /* renamed from: a */
        void mo100774a(C72901b bVar);
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.DropdownListView$d */
    public interface C72903d {
        /* renamed from: a */
        void mo100775a();
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.DropdownListView$e */
    public interface C72904e {
        /* renamed from: a */
        void mo100776a(boolean z);
    }

    public DropdownListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, (C8480h) null);
    }

    public DropdownListView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, (C8480h) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DropdownListView(Context context, AttributeSet attributeSet, int i, int i2, int i3, C8480h hVar) {
        super(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
        setOrientation(1);
        this.f212474e = new FrameLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        FrameLayout frameLayout = this.f212474e;
        C87412m.m108591d(frameLayout);
        frameLayout.setVisibility(8);
        addView(this.f212474e, layoutParams);
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        frameLayout2.setBackgroundColor(getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_3));
        frameLayout2.setOnClickListener(new C72926t(this));
        FrameLayout frameLayout3 = this.f212474e;
        C87412m.m108591d(frameLayout3);
        frameLayout3.addView(frameLayout2, layoutParams2);
        RoundedCornerFrameLayout roundedCornerFrameLayout = new RoundedCornerFrameLayout(getContext());
        roundedCornerFrameLayout.mo153905b(0.0f, 0.0f, (float) C74942w4.m89784a(getContext(), 8), (float) C74942w4.m89784a(getContext(), 8));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 48;
        FrameLayout frameLayout4 = this.f212474e;
        C87412m.m108591d(frameLayout4);
        frameLayout4.addView(roundedCornerFrameLayout, layoutParams3);
        ListView listView = new ListView(getContext());
        this.f212475f = listView;
        listView.setCacheColorHint(0);
        ListView listView2 = this.f212475f;
        C87412m.m108591d(listView2);
        listView2.setOnItemClickListener(this);
        roundedCornerFrameLayout.addView(this.f212475f, new RelativeLayout.LayoutParams(-1, -2));
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        this.f212476g = new C72899a(context2);
        ListView listView3 = this.f212475f;
        C87412m.m108591d(listView3);
        listView3.setAdapter(this.f212476g);
    }

    /* renamed from: a */
    public final void mo100757a() {
        if (!this.f212477h) {
            Log.m105928w("MicroMsg.DropdownListView", "want to close, but it was closed");
        } else if (this.f212478i) {
            Log.m105918d("MicroMsg.DropdownListView", "want to close, but it is in animation");
        } else {
            FrameLayout frameLayout = this.f212474e;
            C87412m.m108591d(frameLayout);
            frameLayout.setVisibility(8);
            this.f212477h = false;
            C72904e eVar = this.f212479j;
            if (eVar != null) {
                C87412m.m108591d(eVar);
                eVar.mo100776a(false);
            }
        }
    }

    /* renamed from: b */
    public final void mo100758b() {
        boolean z = this.f212477h;
        boolean z2 = !z;
        if (z == z2) {
            Log.m105919d("MicroMsg.DropdownListView", "want to expand, but same status, expanded %B", Boolean.valueOf(z));
        } else if (this.f212478i) {
            Log.m105919d("MicroMsg.DropdownListView", "want to expand[%B], but now in animation", Boolean.valueOf(z2));
        } else if (z) {
            this.f212478i = true;
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2472dw);
            loadAnimation.setAnimationListener(new C72931v(this));
            ListView listView = this.f212475f;
            C87412m.m108591d(listView);
            listView.startAnimation(loadAnimation);
        } else {
            this.f212478i = true;
            FrameLayout frameLayout = this.f212474e;
            C87412m.m108591d(frameLayout);
            frameLayout.setVisibility(0);
            Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2468ds);
            loadAnimation2.setAnimationListener(new C72929u(this));
            ListView listView2 = this.f212475f;
            C87412m.m108591d(listView2);
            listView2.startAnimation(loadAnimation2);
        }
    }

    public final C72903d getMOnFolderAlbumDialogDismiss() {
        return this.f212480n;
    }

    public final C72904e getMOnItemStateChanged() {
        return this.f212479j;
    }

    public final String getSelectedItemName() {
        C72899a aVar = this.f212476g;
        C87412m.m108591d(aVar);
        String str = aVar.f212483f;
        C87412m.m108591d(str);
        return str;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/tools/DropdownListView", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        C87412m.m108594g(view, "view");
        C72899a aVar = this.f212476g;
        C87412m.m108591d(aVar);
        C72901b bVar = aVar.f212482e.get(i);
        if (bVar == null) {
            Log.m105918d("MicroMsg.DropdownListView", "get item failed:" + i);
            C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/DropdownListView", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        C72902c cVar = this.f212473d;
        if (cVar != null) {
            cVar.mo100774a(bVar);
        }
        C72899a aVar2 = this.f212476g;
        C87412m.m108591d(aVar2);
        String nullAs = Util.nullAs(bVar.f212488a, "");
        C87412m.m108593f(nullAs, "nullAs(itemName, \"\")");
        aVar2.f212483f = nullAs;
        C72899a aVar3 = this.f212476g;
        C87412m.m108591d(aVar3);
        aVar3.notifyDataSetChanged();
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/DropdownListView", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    public final void setColor(C116798a aVar) {
        C87412m.m108594g(aVar, "color");
    }

    public final void setFolderAlbumDialogDismiss(C72903d dVar) {
        this.f212480n = dVar;
    }

    public final void setItems(List<C72901b> list) {
        C87412m.m108594g(list, "items");
        C72899a aVar = this.f212476g;
        C87412m.m108591d(aVar);
        aVar.f212482e = list;
        String nullAs = Util.nullAs(list.isEmpty() ? "" : list.get(0).f212488a, "");
        C87412m.m108593f(nullAs, "nullAs(itemName, \"\")");
        aVar.f212483f = nullAs;
    }

    public final void setListener(C72902c cVar) {
        this.f212473d = cVar;
    }

    public final void setMOnFolderAlbumDialogDismiss(C72903d dVar) {
        this.f212480n = dVar;
    }

    public final void setMOnItemStateChanged(C72904e eVar) {
        this.f212479j = eVar;
    }

    public final void setOnItemStateChanged(C72904e eVar) {
        this.f212479j = eVar;
    }
}
