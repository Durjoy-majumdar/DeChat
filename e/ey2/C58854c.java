package ey2;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import ay2.C67121f;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import ey2.C75665a;
import gc0.C20828a;
import gy3.C87412m;
import ic0.C98661k;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import vx2.C15029q;
import vx2.C78493o;

/* renamed from: ey2.c */
public abstract class C58854c {

    /* renamed from: a */
    public final C58855a f168482a;

    /* renamed from: ey2.c$a */
    public interface C58855a {
        void removeItem(int i);
    }

    /* renamed from: ey2.c$b */
    public static final class C58856b implements C98661k {

        /* renamed from: a */
        public final /* synthetic */ int f168483a;

        /* renamed from: b */
        public final /* synthetic */ MultiTaskInfo f168484b;

        /* renamed from: c */
        public final /* synthetic */ C75665a.C58851b f168485c;

        /* renamed from: d */
        public final /* synthetic */ C58854c f168486d;

        /* renamed from: ey2.c$b$a */
        public static final class C58857a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bitmap f168487d;

            /* renamed from: e */
            public final /* synthetic */ C75665a.C58851b f168488e;

            /* renamed from: f */
            public final /* synthetic */ MultiTaskInfo f168489f;

            /* renamed from: g */
            public final /* synthetic */ C58854c f168490g;

            public C58857a(Bitmap bitmap, C75665a.C58851b bVar, MultiTaskInfo multiTaskInfo, C58854c cVar) {
                this.f168487d = bitmap;
                this.f168488e = bVar;
                this.f168489f = multiTaskInfo;
                this.f168490g = cVar;
            }

            public final void run() {
                Bitmap bitmap = this.f168487d;
                if (bitmap != null) {
                    this.f168488e.f168472A.setImageBitmap(bitmap);
                    return;
                }
                Log.m105924i("MicroMsg.TaskBarSectionOtherViewBaseHelper", "loadFallbackImage[bitmap is null] " + this.f168489f.field_id);
                this.f168490g.mo75504c(this.f168488e);
            }
        }

        public C58856b(int i, MultiTaskInfo multiTaskInfo, C75665a.C58851b bVar, C58854c cVar) {
            this.f168483a = i;
            this.f168484b = multiTaskInfo;
            this.f168485c = bVar;
            this.f168486d = cVar;
        }

        /* renamed from: a */
        public final void mo6935a(String str, View view, Bitmap bitmap, Object[] objArr) {
            Log.m105924i("MicroMsg.TaskBarSectionOtherViewBaseHelper", "load snapshots done " + this.f168483a + ' ' + this.f168484b.field_id + ' ' + bitmap);
            C75665a.C58851b bVar = this.f168485c;
            bVar.f168472A.post(new C58857a(bitmap, bVar, this.f168484b, this.f168486d));
        }
    }

    /* renamed from: ey2.c$c */
    public static final class C58858c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C58854c f168491d;

        /* renamed from: e */
        public final /* synthetic */ C75665a.C58851b f168492e;

        public C58858c(C58854c cVar, C75665a.C58851b bVar) {
            this.f168491d = cVar;
            this.f168492e = bVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherViewBaseHelper$onBindViewHolder$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f168491d.f168482a.removeItem(this.f168492e.mo17363j());
            C117292a.m165361g(this, "com/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherViewBaseHelper$onBindViewHolder$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C58854c(C58855a aVar) {
        C87412m.m108594g(aVar, "callback");
        this.f168482a = aVar;
    }

    /* renamed from: a */
    public abstract int mo75502a(MultiTaskInfo multiTaskInfo);

    /* renamed from: b */
    public abstract String mo75503b(MultiTaskInfo multiTaskInfo);

    /* renamed from: c */
    public void mo75504c(C75665a.C58851b bVar) {
        C87412m.m108594g(bVar, "viewHolder");
    }

    /* renamed from: d */
    public void mo75505d(int i, C75665a.C58851b bVar, C67121f fVar) {
        int i2 = i;
        C75665a.C58851b bVar2 = bVar;
        C67121f fVar2 = fVar;
        C87412m.m108594g(bVar2, "viewHolder");
        C87412m.m108594g(fVar2, "viewModel");
        MultiTaskInfo multiTaskInfo = (MultiTaskInfo) ((ArrayList) fVar2.f192729d).get(i2);
        Log.m105924i("MicroMsg.TaskBarSectionOtherViewBaseHelper", "onBind " + i2 + ' ' + multiTaskInfo.mo80305m2().f183752e + ' ' + multiTaskInfo.field_type + ' ' + multiTaskInfo.field_id);
        bVar2.f168474C.setText(mo75503b(multiTaskInfo));
        View view = bVar2.f168476E;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherViewBaseHelper", "onBindViewHolder", "(ILcom/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherView$BaseViewHolder;Lcom/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherViewBaseHelper", "onBindViewHolder", "(ILcom/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherView$BaseViewHolder;Lcom/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view3 = bVar2.f168477F;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherViewBaseHelper", "onBindViewHolder", "(ILcom/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherView$BaseViewHolder;Lcom/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherViewBaseHelper", "onBindViewHolder", "(ILcom/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherView$BaseViewHolder;Lcom/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        bVar2.f168478G.setVisibility(8);
        bVar2.f168479z.setVisibility(0);
        bVar2.f168479z.setImageResource(mo75502a(multiTaskInfo));
        bVar2.f168472A.setImageDrawable((Drawable) null);
        bVar2.f168472A.setBackground((Drawable) null);
        if (C67121f.f192724e.mo55826b(multiTaskInfo.field_type)) {
            String str = multiTaskInfo.field_id;
            C87412m.m108593f(str, "multiTaskInfo.field_id");
            StringBuilder sb = new StringBuilder();
            String str2 = C15029q.f41166a;
            sb.append(C15029q.f41166a);
            sb.append(str);
            String sb4 = sb.toString();
            if (C86013q1.m106450k(sb4)) {
                Log.m105924i("MicroMsg.TaskBarSectionOtherViewBaseHelper", "load snapshots " + multiTaskInfo.field_id + ' ' + sb4);
                C20828a.m22825b().mo32521j(sb4, bVar2.f168472A, C78493o.f229929b, new C58856b(i2, multiTaskInfo, bVar2, this));
            } else {
                Log.m105924i("MicroMsg.TaskBarSectionOtherViewBaseHelper", "loadFallbackImage[file not exist] " + multiTaskInfo.field_id);
                mo75504c(bVar2);
            }
        } else {
            Log.m105924i("MicroMsg.TaskBarSectionOtherViewBaseHelper", "loadFallbackImage[disabled] " + multiTaskInfo.field_id);
            mo75504c(bVar2);
        }
        bVar2.f168475D.setOnClickListener(new C58858c(this, bVar2));
    }
}
