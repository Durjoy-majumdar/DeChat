package com.tencent.p014mm.p136ui.widget.dialog;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import qo3.C77392d0;
import yo3.C79142a;

/* renamed from: com.tencent.mm.ui.widget.dialog.MMFilterDialog */
public class MMFilterDialog extends LinearLayout {

    /* renamed from: A */
    public int f220550A = 0;

    /* renamed from: B */
    public List<C74986g.C74987a> f220551B = new ArrayList();

    /* renamed from: C */
    public List<C74986g.C74987a> f220552C = new ArrayList();

    /* renamed from: D */
    public List<C74986g.C74987a> f220553D = new ArrayList();

    /* renamed from: E */
    public Animation f220554E;

    /* renamed from: F */
    public Animation f220555F;

    /* renamed from: G */
    public int f220556G;

    /* renamed from: d */
    public Context f220557d;

    /* renamed from: e */
    public LinearLayout f220558e;

    /* renamed from: f */
    public LinearLayout f220559f;

    /* renamed from: g */
    public LinearLayout f220560g;

    /* renamed from: h */
    public TextView f220561h;

    /* renamed from: i */
    public TextView f220562i;

    /* renamed from: j */
    public TextView f220563j;

    /* renamed from: n */
    public ImageView f220564n;

    /* renamed from: o */
    public ImageView f220565o;

    /* renamed from: p */
    public ImageView f220566p;

    /* renamed from: q */
    public View f220567q;

    /* renamed from: r */
    public LinearLayout f220568r;

    /* renamed from: s */
    public RecyclerView f220569s;

    /* renamed from: t */
    public C74986g f220570t;

    /* renamed from: u */
    public C74985f f220571u;

    /* renamed from: v */
    public C74985f f220572v;

    /* renamed from: w */
    public C74985f f220573w;

    /* renamed from: x */
    public CharSequence f220574x;

    /* renamed from: y */
    public CharSequence f220575y;

    /* renamed from: z */
    public CharSequence f220576z;

    /* renamed from: com.tencent.mm.ui.widget.dialog.MMFilterDialog$a */
    public class C74980a implements AdapterView.OnItemClickListener {
        public C74980a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/dialog/MMFilterDialog$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            MMFilterDialog mMFilterDialog = MMFilterDialog.this;
            C74985f fVar = mMFilterDialog.f220571u;
            if (fVar != null && mMFilterDialog.f220550A == 1) {
                fVar.mo31857a(i);
            }
            MMFilterDialog mMFilterDialog2 = MMFilterDialog.this;
            C74985f fVar2 = mMFilterDialog2.f220572v;
            if (fVar2 != null && mMFilterDialog2.f220550A == 2) {
                fVar2.mo31857a(i);
            }
            MMFilterDialog mMFilterDialog3 = MMFilterDialog.this;
            C74985f fVar3 = mMFilterDialog3.f220573w;
            if (fVar3 != null && mMFilterDialog3.f220550A == 3) {
                fVar3.mo31857a(i);
            }
            MMFilterDialog.m89909a(MMFilterDialog.this);
            C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/MMFilterDialog$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.dialog.MMFilterDialog$b */
    public class C74981b implements View.OnClickListener {
        public C74981b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/dialog/MMFilterDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (MMFilterDialog.this.f220568r.getVisibility() == 0) {
                MMFilterDialog mMFilterDialog = MMFilterDialog.this;
                if (mMFilterDialog.f220550A == 1) {
                    MMFilterDialog.m89909a(mMFilterDialog);
                    MMFilterDialog.m89910b(MMFilterDialog.this, false);
                } else {
                    MMFilterDialog.m89910b(mMFilterDialog, false);
                    MMFilterDialog mMFilterDialog2 = MMFilterDialog.this;
                    mMFilterDialog2.f220550A = 1;
                    mMFilterDialog2.mo104490f(1);
                    MMFilterDialog.m89910b(MMFilterDialog.this, true);
                }
            } else {
                MMFilterDialog mMFilterDialog3 = MMFilterDialog.this;
                mMFilterDialog3.f220550A = 1;
                MMFilterDialog.m89911c(mMFilterDialog3, 1);
                MMFilterDialog.m89910b(MMFilterDialog.this, true);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/MMFilterDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.dialog.MMFilterDialog$c */
    public class C74982c implements View.OnClickListener {
        public C74982c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/dialog/MMFilterDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (MMFilterDialog.this.f220568r.getVisibility() == 0) {
                MMFilterDialog mMFilterDialog = MMFilterDialog.this;
                if (mMFilterDialog.f220550A == 2) {
                    MMFilterDialog.m89909a(mMFilterDialog);
                    MMFilterDialog.m89910b(MMFilterDialog.this, false);
                } else {
                    MMFilterDialog.m89910b(mMFilterDialog, false);
                    MMFilterDialog mMFilterDialog2 = MMFilterDialog.this;
                    mMFilterDialog2.f220550A = 2;
                    mMFilterDialog2.mo104490f(2);
                    MMFilterDialog.m89910b(MMFilterDialog.this, true);
                }
            } else {
                MMFilterDialog mMFilterDialog3 = MMFilterDialog.this;
                mMFilterDialog3.f220550A = 2;
                MMFilterDialog.m89911c(mMFilterDialog3, 2);
                MMFilterDialog.m89910b(MMFilterDialog.this, true);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/MMFilterDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.dialog.MMFilterDialog$d */
    public class C74983d implements View.OnClickListener {
        public C74983d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/dialog/MMFilterDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (MMFilterDialog.this.f220568r.getVisibility() == 0) {
                MMFilterDialog mMFilterDialog = MMFilterDialog.this;
                if (mMFilterDialog.f220550A == 3) {
                    MMFilterDialog.m89909a(mMFilterDialog);
                    MMFilterDialog.m89910b(MMFilterDialog.this, false);
                } else {
                    MMFilterDialog.m89910b(mMFilterDialog, false);
                    MMFilterDialog mMFilterDialog2 = MMFilterDialog.this;
                    mMFilterDialog2.f220550A = 3;
                    mMFilterDialog2.mo104490f(3);
                    MMFilterDialog.m89910b(MMFilterDialog.this, true);
                }
            } else {
                MMFilterDialog mMFilterDialog3 = MMFilterDialog.this;
                mMFilterDialog3.f220550A = 3;
                MMFilterDialog.m89911c(mMFilterDialog3, 3);
                MMFilterDialog.m89910b(MMFilterDialog.this, true);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/MMFilterDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.dialog.MMFilterDialog$e */
    public class C74984e implements View.OnClickListener {
        public C74984e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/dialog/MMFilterDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            MMFilterDialog.m89909a(MMFilterDialog.this);
            C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/MMFilterDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.dialog.MMFilterDialog$f */
    public interface C74985f {
        /* renamed from: a */
        void mo31857a(int i);
    }

    public MMFilterDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo104488d(context, attributeSet);
    }

    /* renamed from: a */
    public static void m89909a(MMFilterDialog mMFilterDialog) {
        if (mMFilterDialog.f220568r.getVisibility() == 0) {
            View view = mMFilterDialog.f220567q;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/widget/dialog/MMFilterDialog", "foldPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/widget/dialog/MMFilterDialog", "foldPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mMFilterDialog.f220555F.setAnimationListener(new C77392d0(mMFilterDialog));
            mMFilterDialog.f220568r.startAnimation(mMFilterDialog.f220555F);
        }
    }

    /* renamed from: b */
    public static void m89910b(MMFilterDialog mMFilterDialog, boolean z) {
        int i = 270;
        int i2 = z ? 90 : 270;
        if (!z) {
            i = 90;
        }
        int i3 = mMFilterDialog.f220550A;
        if (i3 == 1) {
            ObjectAnimator.ofFloat(mMFilterDialog.f220564n, "rotation", new float[]{(float) i2, (float) i}).setDuration(200).start();
        } else if (i3 == 2) {
            ObjectAnimator.ofFloat(mMFilterDialog.f220565o, "rotation", new float[]{(float) i2, (float) i}).setDuration(200).start();
        } else if (i3 == 3) {
            ObjectAnimator.ofFloat(mMFilterDialog.f220566p, "rotation", new float[]{(float) i2, (float) i}).setDuration(200).start();
        }
    }

    /* renamed from: c */
    public static void m89911c(MMFilterDialog mMFilterDialog, int i) {
        if (mMFilterDialog.f220568r.getVisibility() != 0) {
            mMFilterDialog.f220568r.setVisibility(0);
            mMFilterDialog.f220568r.startAnimation(mMFilterDialog.f220554E);
            mMFilterDialog.mo104490f(i);
            if (mMFilterDialog.f220567q.getVisibility() != 0) {
                View view = mMFilterDialog.f220567q;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/widget/dialog/MMFilterDialog", "expandPanel", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/ui/widget/dialog/MMFilterDialog", "expandPanel", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mMFilterDialog.f220567q.startAnimation(AnimationUtils.loadAnimation(mMFilterDialog.getContext(), C0966R.C0968anim.f2393bw));
            }
        }
    }

    private void setTitleMedium(Paint paint) {
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(0.8f);
    }

    /* renamed from: d */
    public final void mo104488d(Context context, AttributeSet attributeSet) {
        this.f220557d = context;
        View.inflate(getContext(), C0966R.C0971layout.ctq, this);
        if (attributeSet != null) {
            this.f220556G = context.obtainStyledAttributes(attributeSet, C79142a.f232407f).getInteger(0, 1);
        }
        this.f220558e = (LinearLayout) findViewById(C0966R.C0970id.mwe);
        this.f220561h = (TextView) findViewById(C0966R.C0970id.mwf);
        this.f220564n = (ImageView) findViewById(C0966R.C0970id.fq6);
        this.f220559f = (LinearLayout) findViewById(C0966R.C0970id.mwj);
        this.f220562i = (TextView) findViewById(C0966R.C0970id.mwk);
        this.f220565o = (ImageView) findViewById(C0966R.C0970id.ivl);
        this.f220560g = (LinearLayout) findViewById(C0966R.C0970id.mwh);
        this.f220563j = (TextView) findViewById(C0966R.C0970id.mwi);
        this.f220566p = (ImageView) findViewById(C0966R.C0970id.g3i);
        if (this.f220556G > 1) {
            this.f220559f.setVisibility(0);
        }
        if (this.f220556G > 2) {
            this.f220560g.setVisibility(0);
        }
        this.f220567q = findViewById(C0966R.C0970id.a3a);
        this.f220568r = (LinearLayout) findViewById(C0966R.C0970id.c6v);
        RecyclerView recyclerView = (RecyclerView) findViewById(C0966R.C0970id.mue);
        this.f220569s = recyclerView;
        recyclerView.setHasFixedSize(true);
        this.f220569s.setLayoutManager(new LinearLayoutManager(this.f220557d));
        C74986g gVar = new C74986g();
        this.f220570t = gVar;
        gVar.f220586h = new C74980a();
        this.f220569s.setAdapter(gVar);
        this.f220570t.notifyDataSetChanged();
        this.f220554E = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2468ds);
        this.f220555F = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2472dw);
        this.f220558e.setOnClickListener(new C74981b());
        this.f220559f.setOnClickListener(new C74982c());
        this.f220560g.setOnClickListener(new C74983d());
        this.f220567q.setOnClickListener(new C74984e());
    }

    /* renamed from: e */
    public void mo104489e() {
        this.f220561h.setText(this.f220574x);
        setTitleMedium(this.f220561h.getPaint());
        this.f220562i.setText(this.f220575y);
        setTitleMedium(this.f220562i.getPaint());
        this.f220563j.setText(this.f220576z);
        setTitleMedium(this.f220563j.getPaint());
    }

    /* renamed from: f */
    public final void mo104490f(int i) {
        if (i == 1) {
            C74986g gVar = this.f220570t;
            List<C74986g.C74987a> list = this.f220551B;
            ((ArrayList) gVar.f220582d).clear();
            ((ArrayList) gVar.f220582d).addAll(list);
            this.f220570t.f220585g = this.f220561h;
        } else if (i == 2) {
            C74986g gVar2 = this.f220570t;
            List<C74986g.C74987a> list2 = this.f220552C;
            ((ArrayList) gVar2.f220582d).clear();
            ((ArrayList) gVar2.f220582d).addAll(list2);
            this.f220570t.f220585g = this.f220562i;
        } else if (i == 3) {
            C74986g gVar3 = this.f220570t;
            List<C74986g.C74987a> list3 = this.f220553D;
            ((ArrayList) gVar3.f220582d).clear();
            ((ArrayList) gVar3.f220582d).addAll(list3);
            this.f220570t.f220585g = this.f220563j;
        }
        this.f220570t.notifyDataSetChanged();
    }

    public void setFirstTabSelectListener(C74985f fVar) {
        this.f220571u = fVar;
    }

    public void setSecondTabSelectListener(C74985f fVar) {
        this.f220572v = fVar;
    }

    public void setThirdTabSelectListener(C74985f fVar) {
        this.f220573w = fVar;
    }

    /* renamed from: com.tencent.mm.ui.widget.dialog.MMFilterDialog$g */
    public static class C74986g extends RecyclerView.C16613e<C74988b> {

        /* renamed from: d */
        public List<C74987a> f220582d = new ArrayList();

        /* renamed from: e */
        public ImageView f220583e = null;

        /* renamed from: f */
        public int f220584f = 0;

        /* renamed from: g */
        public TextView f220585g;

        /* renamed from: h */
        public AdapterView.OnItemClickListener f220586h;

        /* renamed from: com.tencent.mm.ui.widget.dialog.MMFilterDialog$g$b */
        public class C74988b extends RecyclerView.C16631z implements View.OnClickListener {

            /* renamed from: A */
            public TextView f220590A;

            /* renamed from: B */
            public ImageView f220591B;

            /* renamed from: z */
            public TextView f220592z;

            public C74988b(C74986g gVar, View view) {
                super(view);
                this.f220592z = (TextView) view.findViewById(C0966R.C0970id.fbd);
                this.f220590A = (TextView) view.findViewById(C0966R.C0970id.faa);
                this.f220591B = (ImageView) view.findViewById(C0966R.C0970id.ja6);
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/widget/dialog/MMFilterDialog$RecycleViewAdapter$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/MMFilterDialog$RecycleViewAdapter$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public int getItemCount() {
            return ((ArrayList) this.f220582d).size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C74988b bVar = (C74988b) zVar;
            C74987a aVar = (C74987a) ((ArrayList) this.f220582d).get(i);
            bVar.f220592z.setText(aVar.f220587a);
            if (aVar.f220588b != null) {
                bVar.f220590A.setVisibility(0);
                bVar.f220590A.setText(aVar.f220588b);
            } else {
                bVar.f220590A.setVisibility(8);
            }
            if (aVar.f220589c) {
                bVar.f220591B.setVisibility(0);
                this.f220583e = bVar.f220591B;
                this.f220584f = i;
            } else {
                bVar.f220591B.setVisibility(8);
            }
            bVar.f44854d.setOnClickListener(new C74989a(this, bVar));
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C74988b(this, LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.ctr, viewGroup, false));
        }

        /* renamed from: com.tencent.mm.ui.widget.dialog.MMFilterDialog$g$a */
        public static class C74987a {

            /* renamed from: a */
            public String f220587a;

            /* renamed from: b */
            public String f220588b;

            /* renamed from: c */
            public boolean f220589c;

            public C74987a(String str, boolean z) {
                this.f220588b = null;
                this.f220587a = str;
                this.f220589c = z;
            }

            public C74987a(String str, String str2, boolean z) {
                this.f220587a = str;
                this.f220588b = str2;
                this.f220589c = z;
            }
        }
    }

    public MMFilterDialog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo104488d(context, attributeSet);
    }
}
