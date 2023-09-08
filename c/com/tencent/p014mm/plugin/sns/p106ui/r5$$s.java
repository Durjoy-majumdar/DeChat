package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.SnsUserUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;
import os2.C100417r0;

/* renamed from: com.tencent.mm.plugin.sns.ui.r5$$s */
public abstract class r5$$s {

    /* renamed from: a */
    public View.OnClickListener f281124a = new C96199a();

    /* renamed from: b */
    public View.OnClickListener f281125b = new C96200b();

    /* renamed from: c */
    public View.OnClickListener f281126c = new C96201c();

    /* renamed from: d */
    public View.OnClickListener f281127d = new C96202d();

    /* renamed from: e */
    public View.OnClickListener f281128e = new C96203e();

    /* renamed from: f */
    public View.OnClickListener f281129f = new C96204f();

    /* renamed from: g */
    public View.OnClickListener f281130g = new C96206h();

    /* renamed from: h */
    public View.OnLongClickListener f281131h = new C96205g();

    /* renamed from: i */
    public C96207i f281132i = new C96207i();

    /* renamed from: com.tencent.mm.plugin.sns.ui.r5$$s$a */
    public class C96199a implements View.OnClickListener {
        public C96199a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSelfAdapter$SnsEventListeners$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$SnsEventListeners$1");
            if (view.getTag() == null) {
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$SnsEventListeners$1");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter$SnsEventListeners$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            r5$$s.this.f281132i = (C96207i) view.getTag();
            r5$$s r5__s = r5$$s.this;
            C96207i iVar = r5__s.f281132i;
            r5__s.mo133118b(iVar.f281142b, iVar.f281141a);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$SnsEventListeners$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter$SnsEventListeners$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.r5$$s$b */
    public class C96200b implements View.OnClickListener {
        public C96200b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSelfAdapter$SnsEventListeners$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$SnsEventListeners$2");
            if (view.getTag() == null) {
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$SnsEventListeners$2");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter$SnsEventListeners$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            r5$$s.this.f281132i = (C96207i) view.getTag();
            r5$$s r5__s = r5$$s.this;
            C96207i iVar = r5__s.f281132i;
            r5__s.mo133118b(iVar.f281142b, iVar.f281141a + 1);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$SnsEventListeners$2");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter$SnsEventListeners$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.r5$$s$c */
    public class C96201c implements View.OnClickListener {
        public C96201c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSelfAdapter$SnsEventListeners$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$SnsEventListeners$3");
            if (view.getTag() == null) {
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$SnsEventListeners$3");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter$SnsEventListeners$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            r5$$s.this.f281132i = (C96207i) view.getTag();
            r5$$s r5__s = r5$$s.this;
            C96207i iVar = r5__s.f281132i;
            r5__s.mo133118b(iVar.f281142b, iVar.f281141a + 2);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$SnsEventListeners$3");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter$SnsEventListeners$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.r5$$s$d */
    public class C96202d implements View.OnClickListener {
        public C96202d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSelfAdapter$SnsEventListeners$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$SnsEventListeners$4");
            if (view.getTag() == null) {
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$SnsEventListeners$4");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter$SnsEventListeners$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            Log.m105918d("MicroMsg.SnsphotoAdapter", "sign click");
            r5$$s.this.f281132i = (C96207i) view.getTag();
            r5$$s r5__s = r5$$s.this;
            C96207i iVar = r5__s.f281132i;
            r5__s.mo133120c(iVar.f281142b, iVar.f281141a + 2);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$SnsEventListeners$4");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter$SnsEventListeners$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.r5$$s$e */
    public class C96203e implements View.OnClickListener {
        public C96203e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSelfAdapter$SnsEventListeners$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$SnsEventListeners$5");
            if (view.getTag() == null) {
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$SnsEventListeners$5");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter$SnsEventListeners$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            Log.m105918d("MicroMsg.SnsphotoAdapter", "sign click");
            r5$$s.this.f281132i = (C96207i) view.getTag();
            r5$$s r5__s = r5$$s.this;
            C96207i iVar = r5__s.f281132i;
            int i = iVar.f281142b;
            int i2 = iVar.f281141a;
            SnsUserUI.C95700q qVar = (SnsUserUI.C95700q) r5__s;
            qVar.getClass();
            SnsMethodCalculate.markStartTimeMs("onHBClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
            SnsInfo LL = C94866e1.Yx0().mo139800LL(i);
            if (LL == null) {
                SnsMethodCalculate.markEndTimeMs("onHBClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
            } else {
                SnsUserUI.m122458H7(SnsUserUI.this).f281040J = i;
                Intent intent = new Intent();
                intent.setClass(SnsUserUI.this, SnsCommentDetailUI.class);
                intent.putExtra("INTENT_TALKER", LL.getUserName());
                intent.putExtra("INTENT_NEED_RPT_FEED", true);
                intent.putExtra("INTENT_SNS_LOCAL_ID", C100417r0.m131420i("sns_table_", (long) i));
                SnsUserUI.this.startActivityForResult(intent, 12);
                SnsReportHelper.f275506m0.mo131371d(LL);
                SnsMethodCalculate.markEndTimeMs("onHBClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$SnsEventListeners$5");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter$SnsEventListeners$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.r5$$s$f */
    public class C96204f implements View.OnClickListener {
        public C96204f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSelfAdapter$SnsEventListeners$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$SnsEventListeners$6");
            if (view.getTag() == null) {
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$SnsEventListeners$6");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter$SnsEventListeners$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            Log.m105918d("MicroMsg.SnsphotoAdapter", "snssight click");
            r5$$s.this.f281132i = (C96207i) view.getTag();
            r5$$s r5__s = r5$$s.this;
            C96207i iVar = r5__s.f281132i;
            r5__s.mo133120c(iVar.f281142b, iVar.f281141a + 2);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$SnsEventListeners$6");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter$SnsEventListeners$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.r5$$s$g */
    public class C96205g implements View.OnLongClickListener {
        public C96205g() {
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSelfAdapter$SnsEventListeners$7", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            SnsMethodCalculate.markStartTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$SnsEventListeners$7");
            if (view.getTag() == null) {
                SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$SnsEventListeners$7");
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter$SnsEventListeners$7", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return true;
            }
            Log.m105918d("MicroMsg.SnsphotoAdapter", "snsFailPhoto long click");
            r5$$s.this.f281132i = (C96207i) view.getTag();
            r5$$s r5__s = r5$$s.this;
            C96207i iVar = r5__s.f281132i;
            int i = iVar.f281142b;
            int i2 = iVar.f281141a;
            SnsUserUI.C95700q qVar = (SnsUserUI.C95700q) r5__s;
            qVar.getClass();
            SnsMethodCalculate.markStartTimeMs("onFailLongClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
            Log.m105919d("MicroMsg.SnsUserUI", "onFailLongClick localId:%s position:%s", Integer.valueOf(i), Integer.valueOf(i2));
            SnsInfo LL = C94866e1.Yx0().mo139800LL(i);
            if (LL != null && LL.isInValid() && LL.isDieItem()) {
                SnsUserUI snsUserUI = SnsUserUI.this;
                int i3 = SnsUserUI.f278981R;
                SnsMethodCalculate.markStartTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                snsUserUI.getClass();
                SnsMethodCalculate.markStartTimeMs("showDeleteDialog", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                C76879j.m92739j(snsUserUI, C0966R.string.f7946x3, C0966R.string.a3h, C0966R.string.a18, C0966R.string.f7926wf, new C96276w7(snsUserUI, i), new C43161x7(snsUserUI));
                SnsMethodCalculate.markEndTimeMs("showDeleteDialog", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                SnsMethodCalculate.markEndTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            }
            SnsMethodCalculate.markEndTimeMs("onFailLongClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
            SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$SnsEventListeners$7");
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter$SnsEventListeners$7", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.r5$$s$h */
    public class C96206h implements View.OnClickListener {
        public C96206h() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSelfAdapter$SnsEventListeners$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$SnsEventListeners$8");
            if (view.getTag() == null) {
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$SnsEventListeners$8");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter$SnsEventListeners$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            Log.m105918d("MicroMsg.SnsphotoAdapter", "desc count click");
            if (view.getTag() instanceof C96207i) {
                r5$$s.this.f281132i = (C96207i) view.getTag();
                r5$$s r5__s = r5$$s.this;
                C96207i iVar = r5__s.f281132i;
                r5__s.mo133119a(iVar.f281142b, iVar.f281141a);
            } else {
                Log.m105920e("MicroMsg.SnsphotoAdapter", "tag !instanceof ClickInfo");
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$SnsEventListeners$8");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter$SnsEventListeners$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.r5$$s$i */
    public static class C96207i {

        /* renamed from: a */
        public int f281141a;

        /* renamed from: b */
        public int f281142b;
    }

    /* renamed from: a */
    public abstract void mo133119a(int i, int i2);

    /* renamed from: b */
    public abstract void mo133118b(int i, int i2);

    /* renamed from: c */
    public abstract void mo133120c(int i, int i2);
}
