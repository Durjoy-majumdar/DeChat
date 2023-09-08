package com.tencent.p014mm.plugin.sns.p106ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.model.C94853e;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import de3.C75360c0;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C9556a;
import kg3.C76577a;
import nj3.C76879j;
import os2.C100420w;
import os2.C100421x;
import p196ln.C76705f;
import p214om.C11502f;
import p629ny.C76979h;
import te3.m64;
import wc3.C15141z;
import zh3.C91753f;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI */
public class SnsStrangerCommentDetailUI extends MMActivity implements C94853e.C94861h {

    /* renamed from: y */
    public static final /* synthetic */ int f278516y = 0;

    /* renamed from: d */
    public ListView f278517d;

    /* renamed from: e */
    public SnsCommentFooter f278518e;

    /* renamed from: f */
    public View f278519f;

    /* renamed from: g */
    public LinearLayout f278520g;

    /* renamed from: h */
    public List<View> f278521h;

    /* renamed from: i */
    public ImageView f278522i;

    /* renamed from: j */
    public TextView f278523j;

    /* renamed from: n */
    public long f278524n;

    /* renamed from: o */
    public SnsInfo f278525o;

    /* renamed from: p */
    public C96227t4 f278526p;

    /* renamed from: q */
    public C95618e f278527q;

    /* renamed from: r */
    public String f278528r;

    /* renamed from: s */
    public boolean f278529s = false;

    /* renamed from: t */
    public int f278530t = -1;

    /* renamed from: u */
    public boolean f278531u = false;

    /* renamed from: v */
    public int f278532v;

    /* renamed from: w */
    public C72996z1 f278533w;

    /* renamed from: x */
    public MStorage.IOnStorageChange f278534x = new C95616d();

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$a */
    public class C5449a implements View.OnClickListener {
        public C5449a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsStrangerCommentDetailUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$1");
            ListView H7 = SnsStrangerCommentDetailUI.m122241H7(SnsStrangerCommentDetailUI.this);
            C9556a aVar = new C9556a();
            aVar.mo10233c(H7);
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsStrangerCommentDetailUI$1", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            BackwardSupportUtil.SmoothScrollFactory.scrollToTop((ListView) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mm/plugin/sns/ui/SnsStrangerCommentDetailUI$1", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsStrangerCommentDetailUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$b */
    public class C5450b implements MenuItem.OnMenuItemClickListener {
        public C5450b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$2");
            SnsStrangerCommentDetailUI.this.finish();
            SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$2");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$c */
    public class C57386c implements MenuItem.OnMenuItemClickListener {
        public C57386c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$3");
            SnsStrangerCommentDetailUI snsStrangerCommentDetailUI = SnsStrangerCommentDetailUI.this;
            int i = SnsStrangerCommentDetailUI.f278516y;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
            snsStrangerCommentDetailUI.getClass();
            SnsMethodCalculate.markStartTimeMs("showMenuDialog", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
            String[] strArr = new String[1];
            C72996z1 z1Var = snsStrangerCommentDetailUI.f278533w;
            if (z1Var == null) {
                snsStrangerCommentDetailUI.f278533w = new C72996z1();
                SnsMethodCalculate.markEndTimeMs("showMenuDialog", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
            } else {
                if (!z1Var.mo62927s3()) {
                    C45628s0.m50773f0(snsStrangerCommentDetailUI.f278533w);
                }
                if (snsStrangerCommentDetailUI.f278533w.mo62920o3()) {
                    strArr[0] = snsStrangerCommentDetailUI.getString(C0966R.string.bon);
                } else {
                    strArr[0] = snsStrangerCommentDetailUI.getString(C0966R.string.boi);
                }
                C76879j.m92737h(snsStrangerCommentDetailUI, "", strArr, "", false, new C57395c6(snsStrangerCommentDetailUI));
                SnsMethodCalculate.markEndTimeMs("showMenuDialog", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
            }
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
            SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$3");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$d */
    public class C95616d implements MStorage.IOnStorageChange {

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$d$a */
        public class C95617a implements Runnable {
            public C95617a() {
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$5$1");
                Log.m105926v("MicroMsg.SnsStrangerCommentDetailUI", "comment notify");
                SnsStrangerCommentDetailUI snsStrangerCommentDetailUI = SnsStrangerCommentDetailUI.this;
                int i = SnsStrangerCommentDetailUI.f278516y;
                SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
                C95618e eVar = snsStrangerCommentDetailUI.f278527q;
                SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
                eVar.mo7991f();
                SnsStrangerCommentDetailUI snsStrangerCommentDetailUI2 = SnsStrangerCommentDetailUI.this;
                SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
                boolean z = snsStrangerCommentDetailUI2.f278531u;
                SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
                if (z) {
                    SnsStrangerCommentDetailUI snsStrangerCommentDetailUI3 = SnsStrangerCommentDetailUI.this;
                    SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
                    snsStrangerCommentDetailUI3.f278531u = false;
                    SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
                    SnsStrangerCommentDetailUI snsStrangerCommentDetailUI4 = SnsStrangerCommentDetailUI.this;
                    snsStrangerCommentDetailUI4.getClass();
                    SnsMethodCalculate.markStartTimeMs("scrollToLast", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
                    C94866e1.ly0().postDelayed(new C95760d6(snsStrangerCommentDetailUI4), 10);
                    SnsMethodCalculate.markEndTimeMs("scrollToLast", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$5$1");
            }
        }

        public C95616d() {
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            SnsMethodCalculate.markStartTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$5");
            C94866e1.ly0().post(new C95617a());
            SnsMethodCalculate.markEndTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$5");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$e */
    public class C95618e extends C6975i1<C100420w> {

        /* renamed from: r */
        public static final /* synthetic */ int f278537r = 0;

        /* renamed from: o */
        public View.OnClickListener f278538o = new C57387a();

        /* renamed from: p */
        public Activity f278539p;

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$e$a */
        public class C57387a implements View.OnClickListener {
            public C57387a() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsStrangerCommentDetailUI$CommentListAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter$1");
                String str = (String) view.getTag();
                Log.m105918d("MicroMsg.SnsStrangerCommentDetailUI", "onCommentClick:" + str);
                Intent intent = new Intent();
                intent.putExtra("Contact_User", str);
                C15141z yM = ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM();
                C95618e eVar = C95618e.this;
                int i = C95618e.f278537r;
                SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
                Activity activity = eVar.f278539p;
                SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
                ((C67654r1) yM).mo93174g(intent, activity);
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter$1");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsStrangerCommentDetailUI$CommentListAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$e$b */
        public class C57388b extends C75360c0 {
            public C57388b(Context context, Object obj, C75360c0.C75361a aVar) {
                super(context, obj, aVar);
            }

            public void onClick(View view) {
                SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter$2");
                Intent intent = new Intent();
                intent.putExtra("Contact_User", view.getTag().toString());
                C15141z yM = ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM();
                C95618e eVar = C95618e.this;
                int i = C95618e.f278537r;
                SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
                Activity activity = eVar.f278539p;
                SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
                ((C67654r1) yM).mo93174g(intent, activity);
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter$2");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$e$c */
        public class C95619c {

            /* renamed from: a */
            public ImageView f278541a;

            /* renamed from: b */
            public TextView f278542b;

            /* renamed from: c */
            public TextView f278543c;

            /* renamed from: d */
            public TextView f278544d;

            /* renamed from: e */
            public TextView f278545e;

            /* renamed from: f */
            public ImageView f278546f;

            public C95619c(C95618e eVar) {
            }
        }

        public C95618e(Activity activity) {
            super(activity, new C100420w());
            this.f278539p = activity;
        }

        /* renamed from: d */
        public Object mo1330d(Object obj, Cursor cursor) {
            SnsMethodCalculate.markStartTimeMs("convertFrom", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
            C100420w wVar = (C100420w) obj;
            SnsMethodCalculate.markStartTimeMs("convertFrom", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
            if (wVar == null) {
                wVar = new C100420w();
            }
            wVar.convertFrom(cursor);
            SnsMethodCalculate.markEndTimeMs("convertFrom", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
            SnsMethodCalculate.markEndTimeMs("convertFrom", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
            return wVar;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            C95619c cVar;
            int i2;
            Class cls = C76979h.class;
            SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
            if (view == null) {
                cVar = new C95619c(this);
                view2 = View.inflate(this.f278539p, C0966R.C0971layout.c4e, (ViewGroup) null);
                cVar.f278541a = (ImageView) view2.findViewById(C0966R.C0970id.js6);
                cVar.f278544d = (TextView) view2.findViewById(C0966R.C0970id.js_);
                cVar.f278542b = (TextView) view2.findViewById(C0966R.C0970id.jsd);
                cVar.f278545e = (TextView) view2.findViewById(C0966R.C0970id.jse);
                cVar.f278543c = (TextView) view2.findViewById(C0966R.C0970id.jsf);
                cVar.f278546f = (ImageView) view2.findViewById(C0966R.C0970id.jsa);
                view2.setTag(cVar);
            } else {
                cVar = (C95619c) view.getTag();
                view2 = view;
            }
            C100420w wVar = (C100420w) getItem(i);
            try {
                m64 m64 = (m64) new m64().parseFrom(wVar.field_curActionBuf);
                ((C76705f) C86312j.m106911c(C76705f.class)).mo106841jW(cVar.f278541a, m64.f298773d, true);
                cVar.f278541a.setTag(m64.f298773d);
                cVar.f278541a.setOnClickListener(this.f278538o);
                String str = m64.f298775f;
                if (str == null) {
                    str = ((C100420w) this.f24695d).field_talker;
                }
                cVar.f278542b.setTag(m64.f298773d);
                SpannableString yp02 = ((C76979h) C86312j.m106911c(cls)).yp0(this.f278539p, str, cVar.f278542b.getTextSize());
                yp02.setSpan(new C57388b(this.f278539p, m64.f298773d, (C75360c0.C75361a) null), 0, str.length(), 33);
                cVar.f278542b.setText(yp02, TextView.BufferType.SPANNABLE);
                cVar.f278542b.setOnTouchListener(new C71253l1());
                if (wVar.field_type == 3) {
                    cVar.f278544d.setVisibility(0);
                    cVar.f278546f.setVisibility(8);
                    Log.m105926v("MicroMsg.SnsStrangerCommentDetailUI", "source:" + m64.f298778i + "  time:" + m64.f298779j + " timeFormatted:" + C96315x6.m123538d(this.f278539p, ((long) m64.f298779j) * 1000));
                    TextView textView = cVar.f278544d;
                    StringBuilder sb = new StringBuilder();
                    sb.append(m64.f298780n);
                    sb.append(" ");
                    textView.setText(sb.toString());
                    ((C76979h) C86312j.m106911c(cls)).mo107079pD(cVar.f278544d, 2);
                    i2 = 0;
                    try {
                        cVar.f278544d.setVisibility(0);
                    } catch (Exception e) {
                        e = e;
                    }
                } else {
                    cVar.f278544d.setVisibility(8);
                    i2 = 0;
                    cVar.f278546f.setVisibility(0);
                }
                if (C75592q0.m90789s().equals(m64.f298773d)) {
                    cVar.f278545e.setVisibility(8);
                } else {
                    i2 = 0;
                    cVar.f278545e.setVisibility(0);
                    mo132908s(cVar.f278545e, m64.f298778i);
                }
                TextView textView2 = cVar.f278543c;
                textView2.setText("" + C96315x6.m123538d(this.f278539p, ((long) m64.f298779j) * 1000));
            } catch (Exception e2) {
                e = e2;
                i2 = 0;
                Log.printErrStackTrace("MicroMsg.SnsStrangerCommentDetailUI", e, "", new Object[i2]);
                SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
                return view2;
            }
            SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
            return view2;
        }

        /* renamed from: l */
        public void mo1332l() {
            SnsMethodCalculate.markStartTimeMs("initCursor", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
            mo1333o();
            SnsMethodCalculate.markEndTimeMs("initCursor", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
        }

        /* renamed from: o */
        public void mo1333o() {
            SnsMethodCalculate.markStartTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
            C100421x Tx0 = C94866e1.Tx0();
            SnsStrangerCommentDetailUI snsStrangerCommentDetailUI = SnsStrangerCommentDetailUI.this;
            int i = SnsStrangerCommentDetailUI.f278516y;
            SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
            String str = snsStrangerCommentDetailUI.f278528r;
            SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
            SnsStrangerCommentDetailUI snsStrangerCommentDetailUI2 = SnsStrangerCommentDetailUI.this;
            SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
            long j = snsStrangerCommentDetailUI2.f278524n;
            SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
            Tx0.getClass();
            SnsMethodCalculate.markStartTimeMs("getStrangerCursor", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
            StringBuilder sb = new StringBuilder();
            Tx0.mo139889Ow();
            sb.append("select *, rowid from SnsComment");
            sb.append(" where talker = ");
            sb.append(C91753f.m115264e(str));
            sb.append(" and  snsID = ");
            sb.append(j);
            sb.append(" and ( type = ");
            sb.append(3);
            sb.append(" or type = ");
            sb.append(5);
            sb.append(" )");
            String sb4 = sb.toString();
            Log.m105926v("MicroMsg.SnsCommentStorage", "comment sql:" + sb4);
            Cursor rawQuery = Tx0.f294191d.rawQuery(sb4, (String[]) null);
            SnsMethodCalculate.markEndTimeMs("getStrangerCursor", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
            mo7998r(rawQuery);
            SnsMethodCalculate.markEndTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
        }

        /* renamed from: s */
        public final void mo132908s(TextView textView, int i) {
            SnsMethodCalculate.markStartTimeMs("setSource", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
            if (i != 18) {
                switch (i) {
                    case 22:
                    case 23:
                    case 24:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                        textView.setText(SnsStrangerCommentDetailUI.this.getString(C0966R.string.jco));
                        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, C76577a.m92158i(this.f278539p, C0966R.C0969drawable.bjf), (Drawable) null);
                        break;
                    case 25:
                        textView.setText(SnsStrangerCommentDetailUI.this.getString(C0966R.string.jcl));
                        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, C76577a.m92158i(this.f278539p, C0966R.C0969drawable.bjb), (Drawable) null);
                        break;
                    case 30:
                        textView.setText(SnsStrangerCommentDetailUI.this.getString(C0966R.string.jcn));
                        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, C76577a.m92158i(this.f278539p, C0966R.C0969drawable.bjc), (Drawable) null);
                        break;
                    default:
                        textView.setText(SnsStrangerCommentDetailUI.this.getString(C0966R.string.jcp));
                        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, C76577a.m92158i(this.f278539p, C0966R.C0969drawable.bje), (Drawable) null);
                        break;
                }
            } else {
                textView.setText(SnsStrangerCommentDetailUI.this.getString(C0966R.string.jcm));
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, C76577a.m92158i(this.f278539p, C0966R.C0969drawable.bjd), (Drawable) null);
            }
            SnsMethodCalculate.markEndTimeMs("setSource", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
        }
    }

    /* renamed from: H7 */
    public static /* synthetic */ ListView m122241H7(SnsStrangerCommentDetailUI snsStrangerCommentDetailUI) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        ListView listView = snsStrangerCommentDetailUI.f278517d;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        return listView;
    }

    /* renamed from: I7 */
    public static /* synthetic */ C72996z1 m122242I7(SnsStrangerCommentDetailUI snsStrangerCommentDetailUI) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        C72996z1 z1Var = snsStrangerCommentDetailUI.f278533w;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        return z1Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00f9, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x010f  */
    /* renamed from: J7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo132905J7() {
        /*
            r22 = this;
            r0 = r22
            java.lang.String r1 = "initAlbumList"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            android.widget.LinearLayout r3 = r0.f278520g
            r3.removeAllViews()
            r3 = 4
            float r3 = (float) r3
            int r3 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.BitmapFactory.fromDPToPix(r0, r3)
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r0.f278525o
            com.tencent.mm.protocal.protobuf.TimeLineObject r4 = r4.getTimeLine()
            te3.j00 r4 = r4.ContentObj
            java.util.LinkedList<te3.kv2> r4 = r4.f298427h
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r0.f278521h = r5
            r5 = 0
            r6 = 0
        L_0x0027:
            int r7 = r4.size()
            if (r6 >= r7) goto L_0x011c
            com.tencent.mm.ui.MMImageView r7 = new com.tencent.mm.ui.MMImageView
            r7.<init>(r0)
            r7.setPadding(r3, r3, r3, r3)
            android.widget.LinearLayout r8 = r0.f278520g
            android.view.ViewGroup$LayoutParams r9 = new android.view.ViewGroup$LayoutParams
            r10 = -2
            r9.<init>(r10, r10)
            r8.addView(r7, r9)
            com.tencent.mm.plugin.sns.model.o r10 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            com.tencent.mm.plugin.sns.storage.SnsInfo r8 = r0.f278525o
            java.lang.String r12 = r8.getSnsId()
            java.lang.Object r8 = r4.get(r6)
            r9 = r8
            te3.kv2 r9 = (te3.C101804kv2) r9
            int r17 = r22.hashCode()
            com.tencent.mm.storage.o3 r8 = com.tencent.p014mm.storage.C96983o3.f284139k
            r10.getClass()
            java.lang.String r15 = "getSnsGrid"
            java.lang.String r14 = "com.tencent.mm.plugin.sns.model.LazyerImageLoader2"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r14)
            if (r9 == 0) goto L_0x00c6
            java.lang.String r11 = r9.f298689d
            if (r11 == 0) goto L_0x00c6
            java.lang.String r13 = ""
            boolean r11 = r11.equals(r13)
            if (r11 == 0) goto L_0x0070
            goto L_0x00c6
        L_0x0070:
            r7.setDrawingCacheEnabled(r5)
            java.lang.String r11 = r9.f298689d
            java.lang.String r13 = vr2.C102236a0.m134780y(r5, r11)
            r18 = 0
            r11 = r10
            r19 = r13
            r13 = r9
            r20 = r14
            r14 = r19
            r21 = r15
            r15 = r8
            r16 = r18
            r11.mo131088H(r12, r13, r14, r15, r16)
            r11 = 1
            r12 = -1
            r14 = r8
            r8 = r10
            r15 = r9
            r9 = r7
            r13 = r10
            r10 = r19
            r5 = r13
            r13 = r17
            r8.mo131128l0(r9, r10, r11, r12, r13)
            java.lang.String r8 = r15.f298689d
            r9 = r19
            com.tencent.mm.memory.n r13 = r5.mo131121i(r9, r8)
            boolean r8 = vr2.C102236a0.m134742f(r13)
            if (r8 != 0) goto L_0x00b4
            r8 = 0
            r5.mo131084D(r8, r15, r14)
            r8 = r20
            r5 = r21
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r8)
            goto L_0x00cb
        L_0x00b4:
            r8 = r20
            r5 = r21
            java.lang.String r9 = r15.f298689d
            ks2.C99181f.m129208m(r9)
            java.lang.String r9 = r15.f298689d
            ks2.C99181f.m129209o(r9)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r8)
            goto L_0x00cc
        L_0x00c6:
            r8 = r14
            r5 = r15
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r8)
        L_0x00cb:
            r13 = 0
        L_0x00cc:
            r8 = 0
            r13.f266822h = r8
            android.graphics.Bitmap r5 = r13.f266818d
            if (r5 != 0) goto L_0x010f
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r0.f278525o
            int r5 = r5.field_type
            java.lang.String r9 = "setDefaultImg"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r2)
            r10 = 42
            r11 = 2131755119(0x7f10006f, float:1.9141108E38)
            if (r5 == r10) goto L_0x0103
            switch(r5) {
                case 1: goto L_0x00fb;
                case 2: goto L_0x00f5;
                case 3: goto L_0x00e7;
                case 4: goto L_0x0103;
                case 5: goto L_0x00f1;
                case 6: goto L_0x00ed;
                case 7: goto L_0x00fb;
                case 8: goto L_0x00e8;
                default: goto L_0x00e7;
            }
        L_0x00e7:
            goto L_0x00ff
        L_0x00e8:
            r5 = 0
            r7.setImageDrawable(r5)
            goto L_0x00f9
        L_0x00ed:
            r5 = 2131755088(0x7f100050, float:1.9141045E38)
            goto L_0x0106
        L_0x00f1:
            r5 = 2131755116(0x7f10006c, float:1.9141102E38)
            goto L_0x0106
        L_0x00f5:
            r5 = 0
            r7.setImageDrawable(r5)
        L_0x00f9:
            r5 = 0
            goto L_0x0106
        L_0x00fb:
            r5 = 2131230947(0x7f0800e3, float:1.8077961E38)
            goto L_0x0106
        L_0x00ff:
            r5 = 2131755119(0x7f10006f, float:1.9141108E38)
            goto L_0x0106
        L_0x0103:
            r5 = 2131755090(0x7f100052, float:1.914105E38)
        L_0x0106:
            if (r5 == 0) goto L_0x010b
            r7.setImageResource(r5)
        L_0x010b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r2)
            goto L_0x0112
        L_0x010f:
            r7.setImageBitmap(r5)
        L_0x0112:
            java.util.List<android.view.View> r5 = r0.f278521h
            r5.add(r7)
            int r6 = r6 + 1
            r5 = 0
            goto L_0x0027
        L_0x011c:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsStrangerCommentDetailUI.mo132905J7():void");
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        return C0966R.C0971layout.c2h;
    }

    public void initView() {
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        this.f278517d = (ListView) findViewById(C0966R.C0970id.f5702m_);
        this.f278518e = (SnsCommentFooter) findViewById(C0966R.C0970id.bjo);
        this.f278519f = View.inflate(this, C0966R.C0971layout.c4d, (ViewGroup) null);
        SnsMethodCalculate.markStartTimeMs("initHeader", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        this.f278520g = (LinearLayout) this.f278519f.findViewById(C0966R.C0970id.f5734n6);
        this.f278522i = (ImageView) this.f278519f.findViewById(C0966R.C0970id.f5678lm);
        this.f278523j = (TextView) this.f278519f.findViewById(C0966R.C0970id.f5741nc);
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106841jW(this.f278522i, this.f278525o.getUserName(), true);
        String displayName = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(this.f278525o.getUserName());
        this.f278523j.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this, displayName, this.f278523j.getTextSize()));
        this.f278522i.setContentDescription(String.format(getResources().getString(C0966R.string.j3b), new Object[]{displayName}));
        mo132905J7();
        SnsMethodCalculate.markStartTimeMs("setImageClick", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        for (int i = 0; i < ((ArrayList) this.f278521h).size(); i++) {
            C96235u4 u4Var = new C96235u4();
            u4Var.f281206a = this.f278525o.getLocalid();
            u4Var.f281207b = i;
            List<View> list = this.f278521h;
            u4Var.f281209d = list;
            ((View) ((ArrayList) list).get(i)).setTag(u4Var);
            ((View) ((ArrayList) this.f278521h).get(i)).setOnClickListener(new C95769e6(this));
        }
        SnsMethodCalculate.markEndTimeMs("setImageClick", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        SnsMethodCalculate.markEndTimeMs("initHeader", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        SnsMethodCalculate.markStartTimeMs("initCommentList", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        this.f278517d.addHeaderView(this.f278519f);
        this.f278527q = new C95618e(this);
        this.f278517d.post(new C95782f6(this));
        this.f278517d.setAdapter(this.f278527q);
        this.f278517d.setOnScrollListener(new C5477g6(this));
        SnsMethodCalculate.markEndTimeMs("initCommentList", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        SnsMethodCalculate.markStartTimeMs("initFooter", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        this.f278518e.setAfterEditAction(new C95714a6(this));
        this.f278518e.mo132720z();
        this.f278518e.setOnCommentSendImp(new C95744b6(this));
        SnsCommentFooter snsCommentFooter = this.f278518e;
        snsCommentFooter.setCommentHint(getString(C0966R.string.jgh) + this.f278528r + getString(C0966R.string.jan));
        SnsMethodCalculate.markEndTimeMs("initFooter", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        setToTop(new C5449a());
        setBackBtn(new C5450b());
        addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new C57386c());
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        Log.m105924i("MicroMsg.SnsStrangerCommentDetailUI", "onAcvityResult requestCode:" + i);
        if (i2 != -1) {
            SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
            return;
        }
        if (i == 1 && i2 == -1) {
            Cursor managedQuery = managedQuery(intent.getData(), (String[]) null, (String) null, (String[]) null, (String) null);
            if (managedQuery.moveToFirst()) {
                String string = managedQuery.getString(managedQuery.getColumnIndexOrThrow("_id"));
                Intent intent2 = new Intent("android.intent.action.EDIT", Uri.parse("content://com.android.contacts/contacts/" + string));
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent2);
                C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsStrangerCommentDetailUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/plugin/sns/ui/SnsStrangerCommentDetailUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.jbh);
        this.f278524n = getIntent().getLongExtra("INTENT_SNSID", 0);
        this.f278528r = getIntent().getStringExtra("INTENT_TALKER");
        this.f278525o = C94866e1.Yx0().mo139806SE(this.f278524n);
        this.f278532v = getIntent().getIntExtra("INTENT_SOURCE", -1);
        C86709a0.m107528h();
        this.f278533w = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f278528r);
        if (this.f278525o == null || this.f278528r == null) {
            finish();
            SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
            return;
        }
        this.f278526p = new C96227t4(this);
        C94866e1.Tx0().add(this.f278534x);
        initView();
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        C94866e1.Tx0().remove(this.f278534x);
        C94866e1.Fx0().mo131089I(this);
        C95618e eVar = this.f278527q;
        if (eVar != null) {
            eVar.mo5580b();
        }
        super.onDestroy();
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
    }

    public void onImageFinish(String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
    }

    public void onPause() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        C94866e1.Vx0().mo130997v(this);
        super.onPause();
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        C94866e1.Vx0().mo130978c(this);
        super.onResume();
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
    }

    public void onSetbg() {
        SnsMethodCalculate.markStartTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        SnsMethodCalculate.markEndTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
    }

    public void onSightFinish(String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
    }

    public void onThumbFinish(String str) {
        SnsMethodCalculate.markStartTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        mo132905J7();
        SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
    }
}
