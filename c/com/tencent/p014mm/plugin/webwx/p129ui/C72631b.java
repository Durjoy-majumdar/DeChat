package com.tencent.p014mm.plugin.webwx.p129ui;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.webwx.p129ui.C72632c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import e62.C75554c;
import eb0.C75592q0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import p645pj.C77091b;

/* renamed from: com.tencent.mm.plugin.webwx.ui.b */
public final class C72631b extends RecyclerView.C16613e<C72632c> {

    /* renamed from: d */
    public final ArrayList<C75554c.C75555b> f211304d;

    /* renamed from: e */
    public int f211305e;

    /* renamed from: f */
    public final C72632c.C72633a f211306f;

    public C72631b(ArrayList<C75554c.C75555b> arrayList, int i, C72632c.C72633a aVar) {
        C87412m.m108594g(arrayList, "onlineInfoList");
        this.f211304d = arrayList;
        this.f211305e = i;
        this.f211306f = aVar;
    }

    public int getItemCount() {
        return this.f211304d.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        int i2 = i;
        C72632c cVar = (C72632c) zVar;
        C87412m.m108594g(cVar, "viewHolder");
        C75554c.C75555b bVar = this.f211304d.get(i2);
        C87412m.m108593f(bVar, "onlineInfoList[position]");
        C75554c.C75555b bVar2 = bVar;
        boolean z = this.f211305e == i2;
        if (bVar2.f182221n != 6 || Util.isNullOrNil(bVar2.f221968v)) {
            cVar.f211311E.setVisibility(8);
        } else {
            cVar.f211311E.setVisibility(0);
            cVar.f211311E.setOnClickListener(new C72634d(bVar2, cVar));
        }
        if (!C77091b.m93034p() || bVar2.f221971y) {
            View view = cVar.f211316J;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "fillContent", "(Lcom/tencent/mm/plugin/messenger/extdevice/NetSceneGetOnlineInfo$LocalOnlineInfo;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "fillContent", "(Lcom/tencent/mm/plugin/messenger/extdevice/NetSceneGetOnlineInfo$LocalOnlineInfo;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            cVar.f211333x0 = false;
        } else {
            boolean M = C75592q0.m90765M();
            cVar.f211333x0 = M;
            cVar.mo100078z(M);
            cVar.f211317K.setOnClickListener(new C72635e(cVar, bVar2));
        }
        cVar.f211313G.setVisibility(z ? 0 : 8);
        cVar.f211312F.setRotation(z ? 270.0f : 90.0f);
        cVar.f211308B.setOnClickListener(new C72638f(bVar2, z, cVar, i2));
        Log.m105924i("MicroMsg.LoginDeviceAdapter", bVar2.f182221n + ", need hide lock bt : " + bVar2.f221970x + ", isLock:" + cVar.f211334y0 + ", isWebWXLocked:" + bVar2.f221959A);
        if (!bVar2.f221970x) {
            cVar.f211319M.setVisibility(0);
            Animator loadAnimator = AnimatorInflater.loadAnimator(cVar.f211335z, C0966R.animator.f2549f);
            loadAnimator.setTarget(cVar.f211323R);
            Animator loadAnimator2 = AnimatorInflater.loadAnimator(cVar.f211335z, C0966R.animator.f2550g);
            loadAnimator2.setTarget(cVar.f211323R);
            loadAnimator2.addListener(new C72639g(cVar));
            cVar.f211332p0 = loadAnimator2;
            boolean z2 = bVar2.f221959A;
            cVar.f211334y0 = z2;
            cVar.mo100076B(z2);
            cVar.f211320N.setOnClickListener(new C72640h(cVar, bVar2, loadAnimator));
        } else {
            cVar.f211319M.setVisibility(8);
        }
        Log.m105924i("MicroMsg.LoginDeviceAdapter", bVar2.f182221n + ", need hide file bt:" + bVar2.f221972z);
        if (!bVar2.f221972z) {
            cVar.f211324S.setVisibility(0);
            cVar.f211325T.setOnClickListener(new C72642i(cVar, bVar2));
        } else {
            cVar.f211324S.setVisibility(8);
        }
        if (cVar.f211316J.getVisibility() == 0 && cVar.f211319M.getVisibility() == 0 && cVar.f211324S.getVisibility() == 0) {
            View view3 = cVar.f211330Y;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view5 = cVar.f211331Z;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (cVar.f211316J.getVisibility() == 8 && cVar.f211319M.getVisibility() == 8 && cVar.f211324S.getVisibility() == 8) {
            View view7 = cVar.f211330Y;
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar4.mo10233c(8);
            View view8 = view7;
            C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view9 = cVar.f211331Z;
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(8);
            View view10 = view9;
            C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view10, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (cVar.f211316J.getVisibility() == 8 && cVar.f211319M.getVisibility() == 0 && cVar.f211324S.getVisibility() == 0) {
            View view11 = cVar.f211330Y;
            C9556a aVar6 = new C9556a();
            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
            aVar6.mo10233c(8);
            View view12 = view11;
            C117292a.m165358d(view12, aVar6.mo10232b(), "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view12, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view13 = cVar.f211331Z;
            C9556a aVar7 = new C9556a();
            aVar7.mo10233c(0);
            View view14 = view13;
            C117292a.m165358d(view14, aVar7.mo10232b(), "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view13.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
            C117292a.m165359e(view14, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (cVar.f211316J.getVisibility() == 0 && cVar.f211319M.getVisibility() == 8 && cVar.f211324S.getVisibility() == 0) {
            View view15 = cVar.f211330Y;
            C9556a aVar8 = new C9556a();
            ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
            aVar8.mo10233c(8);
            View view16 = view15;
            C117292a.m165358d(view16, aVar8.mo10232b(), "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view15.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
            C117292a.m165359e(view16, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view17 = cVar.f211331Z;
            C9556a aVar9 = new C9556a();
            aVar9.mo10233c(0);
            View view18 = view17;
            C117292a.m165358d(view18, aVar9.mo10232b(), "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view17.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
            C117292a.m165359e(view18, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (cVar.f211316J.getVisibility() == 0 && cVar.f211319M.getVisibility() == 0 && cVar.f211324S.getVisibility() == 8) {
            View view19 = cVar.f211330Y;
            C9556a aVar10 = new C9556a();
            ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
            aVar10.mo10233c(0);
            View view20 = view19;
            C117292a.m165358d(view20, aVar10.mo10232b(), "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view19.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
            C117292a.m165359e(view20, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view21 = cVar.f211331Z;
            C9556a aVar11 = new C9556a();
            aVar11.mo10233c(8);
            View view22 = view21;
            C117292a.m165358d(view22, aVar11.mo10232b(), "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view21.setVisibility(((Integer) aVar11.mo10231a(0)).intValue());
            C117292a.m165359e(view22, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (cVar.f211316J.getVisibility() == 0 && cVar.f211319M.getVisibility() == 8 && cVar.f211324S.getVisibility() == 8) {
            View view23 = cVar.f211330Y;
            C9556a aVar12 = new C9556a();
            ThreadLocal<C9556a> threadLocal7 = C60958c.f173611a;
            aVar12.mo10233c(8);
            View view24 = view23;
            C117292a.m165358d(view24, aVar12.mo10232b(), "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view23.setVisibility(((Integer) aVar12.mo10231a(0)).intValue());
            C117292a.m165359e(view24, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view25 = cVar.f211331Z;
            C9556a aVar13 = new C9556a();
            aVar13.mo10233c(8);
            View view26 = view25;
            C117292a.m165358d(view26, aVar13.mo10232b(), "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view25.setVisibility(((Integer) aVar13.mo10231a(0)).intValue());
            C117292a.m165359e(view26, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (cVar.f211316J.getVisibility() == 8 && cVar.f211319M.getVisibility() == 0 && cVar.f211324S.getVisibility() == 8) {
            View view27 = cVar.f211330Y;
            C9556a aVar14 = new C9556a();
            ThreadLocal<C9556a> threadLocal8 = C60958c.f173611a;
            aVar14.mo10233c(8);
            View view28 = view27;
            C117292a.m165358d(view28, aVar14.mo10232b(), "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view27.setVisibility(((Integer) aVar14.mo10231a(0)).intValue());
            C117292a.m165359e(view28, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view29 = cVar.f211331Z;
            C9556a aVar15 = new C9556a();
            aVar15.mo10233c(8);
            View view30 = view29;
            C117292a.m165358d(view30, aVar15.mo10232b(), "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view29.setVisibility(((Integer) aVar15.mo10231a(0)).intValue());
            C117292a.m165359e(view30, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (cVar.f211316J.getVisibility() == 8 && cVar.f211319M.getVisibility() == 8 && cVar.f211324S.getVisibility() == 0) {
            View view31 = cVar.f211330Y;
            C9556a aVar16 = new C9556a();
            ThreadLocal<C9556a> threadLocal9 = C60958c.f173611a;
            aVar16.mo10233c(8);
            View view32 = view31;
            C117292a.m165358d(view32, aVar16.mo10232b(), "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view31.setVisibility(((Integer) aVar16.mo10231a(0)).intValue());
            C117292a.m165359e(view32, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view33 = cVar.f211331Z;
            C9556a aVar17 = new C9556a();
            aVar17.mo10233c(8);
            View view34 = view33;
            C117292a.m165358d(view34, aVar17.mo10232b(), "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view33.setVisibility(((Integer) aVar17.mo10231a(0)).intValue());
            C117292a.m165359e(view34, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "updateCenterArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (bVar2.f221960B) {
            cVar.f211328W.setVisibility(0);
            cVar.f211329X.setChecked(bVar2.f221961C);
            cVar.f211328W.setOnClickListener(new C72643j(bVar2, cVar));
        } else {
            cVar.f211328W.setVisibility(8);
        }
        if (cVar.f211316J.getVisibility() == 8 && cVar.f211319M.getVisibility() == 8 && cVar.f211324S.getVisibility() == 8) {
            cVar.f211314H.setVisibility(8);
            View view35 = cVar.f211315I;
            C9556a aVar18 = new C9556a();
            ThreadLocal<C9556a> threadLocal10 = C60958c.f173611a;
            aVar18.mo10233c(8);
            View view36 = view35;
            C117292a.m165358d(view36, aVar18.mo10232b(), "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "fillContent", "(Lcom/tencent/mm/plugin/messenger/extdevice/NetSceneGetOnlineInfo$LocalOnlineInfo;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view35.setVisibility(((Integer) aVar18.mo10231a(0)).intValue());
            C117292a.m165359e(view36, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "fillContent", "(Lcom/tencent/mm/plugin/messenger/extdevice/NetSceneGetOnlineInfo$LocalOnlineInfo;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            cVar.f211314H.setVisibility(0);
            View view37 = cVar.f211315I;
            C9556a aVar19 = new C9556a();
            ThreadLocal<C9556a> threadLocal11 = C60958c.f173611a;
            aVar19.mo10233c(0);
            View view38 = view37;
            C117292a.m165358d(view38, aVar19.mo10232b(), "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "fillContent", "(Lcom/tencent/mm/plugin/messenger/extdevice/NetSceneGetOnlineInfo$LocalOnlineInfo;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view37.setVisibility(((Integer) aVar19.mo10231a(0)).intValue());
            C117292a.m165359e(view38, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder", "fillContent", "(Lcom/tencent/mm/plugin/messenger/extdevice/NetSceneGetOnlineInfo$LocalOnlineInfo;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (!Util.isNullOrNil(bVar2.f221967u)) {
            cVar.f211327V.setText(bVar2.f221967u);
        }
        cVar.f211326U.setOnClickListener(new C72646k(bVar2, cVar));
        cVar.mo100077C(bVar2);
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "viewGroup");
        Context context = viewGroup.getContext();
        C87412m.m108593f(context, "viewGroup.context");
        View inflate = C85868k2.m106137b(viewGroup.getContext()).inflate(C0966R.C0971layout.b8c, viewGroup, false);
        C87412m.m108593f(inflate, "getInflater(viewGroup.co…e_item, viewGroup, false)");
        return new C72632c(context, inflate, this.f211306f);
    }
}
