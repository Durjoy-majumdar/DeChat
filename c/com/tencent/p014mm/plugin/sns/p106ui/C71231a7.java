package com.tencent.p014mm.plugin.sns.p106ui;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.view.DragEvent;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72930u1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.sns.ui.a7 */
public class C71231a7 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsUIAction f206173d;

    /* renamed from: com.tencent.mm.plugin.sns.ui.a7$a */
    public class C71232a implements View.OnDragListener {
        public C71232a() {
        }

        public boolean onDrag(View view, DragEvent dragEvent) {
            boolean z;
            String str;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(dragEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsUIAction$13$1", "android/view/View$OnDragListener", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z", this, array);
            SnsMethodCalculate.markStartTimeMs("onDrag", "com.tencent.mm.plugin.sns.ui.SnsUIAction$13$1");
            int action = dragEvent.getAction();
            if (!(action == 1 || action == 2)) {
                if (action == 3) {
                    Log.m105924i("MicroMsg.SnsActivity", "ACTION_DROP");
                    ClipData clipData = dragEvent.getClipData();
                    if (clipData != null) {
                        int itemCount = clipData.getItemCount();
                        ArrayList arrayList2 = new ArrayList();
                        for (int i = 0; i < itemCount; i++) {
                            ClipData.Item itemAt = clipData.getItemAt(i);
                            if (itemAt == null) {
                                Log.m105920e("MicroMsg.SnsActivity", "item == null");
                            } else if (itemAt.getIntent() != null) {
                                Activity a = SnsUIAction.m122371a(C71231a7.this.f206173d);
                                Intent intent = itemAt.getIntent();
                                C9556a aVar = new C9556a();
                                aVar.mo10233c(intent);
                                Activity activity = a;
                                C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsUIAction$13$1", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                a.startActivity((Intent) aVar.mo10231a(0));
                                C117292a.m165359e(activity, "com/tencent/mm/plugin/sns/ui/SnsUIAction$13$1", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            } else if (itemAt.getUri() != null) {
                                C72930u1 u1Var = new C72930u1(SnsUIAction.m122371a(C71231a7.this.f206173d), itemAt.getUri());
                                int i2 = u1Var.f212554b;
                                if (i2 == 0 || (str = u1Var.f212553a) == null) {
                                    Log.m105920e("MicroMsg.SnsActivity", "get file path failed");
                                } else if (i2 == 3) {
                                    arrayList2.add(str);
                                }
                            }
                        }
                        if (arrayList2.size() < 0) {
                            Log.m105920e("MicroMsg.SnsActivity", "no image file available");
                            SnsMethodCalculate.markEndTimeMs("onDrag", "com.tencent.mm.plugin.sns.ui.SnsUIAction$13$1");
                            C117292a.m165362h(true, this, "com/tencent/mm/plugin/sns/ui/SnsUIAction$13$1", "android/view/View$OnDragListener", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z");
                            return true;
                        }
                        Intent intent2 = new Intent(SnsUIAction.m122371a(C71231a7.this.f206173d), SnsUploadUI.class);
                        intent2.putExtra("KSnsPostManu", true);
                        intent2.putExtra("KTouchCameraTime", Util.nowSecond());
                        intent2.putStringArrayListExtra("sns_kemdia_path_list", arrayList2);
                        intent2.setAction("android.intent.action.SEND");
                        intent2.addCategory("android.intent.category.DEFAULT");
                        intent2.addFlags(268435456);
                        intent2.putExtra("android.intent.extra.TEXT", "");
                        intent2.putExtra("Ksnsupload_empty_img", true);
                        SnsUIAction snsUIAction = C71231a7.this.f206173d;
                        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
                        boolean z2 = snsUIAction.f278847W;
                        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
                        if (z2) {
                            intent2.putExtra("Ksnsupload_source", 11);
                        }
                        intent2.setType("image/*");
                        Activity a2 = SnsUIAction.m122371a(C71231a7.this.f206173d);
                        C9556a aVar2 = new C9556a();
                        aVar2.mo10233c(intent2);
                        Activity activity2 = a2;
                        C117292a.m165358d(activity2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsUIAction$13$1", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        a2.startActivity((Intent) aVar2.mo10231a(0));
                        C117292a.m165359e(activity2, "com/tencent/mm/plugin/sns/ui/SnsUIAction$13$1", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                    z = true;
                    SnsMethodCalculate.markEndTimeMs("onDrag", "com.tencent.mm.plugin.sns.ui.SnsUIAction$13$1");
                    C117292a.m165362h(z, this, "com/tencent/mm/plugin/sns/ui/SnsUIAction$13$1", "android/view/View$OnDragListener", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z");
                    return z;
                } else if (!(action == 4 || action == 5)) {
                    Log.m105920e("MicroMsg.SnsActivity", "Unknown action type received by OnDragListener.");
                    z = false;
                    SnsMethodCalculate.markEndTimeMs("onDrag", "com.tencent.mm.plugin.sns.ui.SnsUIAction$13$1");
                    C117292a.m165362h(z, this, "com/tencent/mm/plugin/sns/ui/SnsUIAction$13$1", "android/view/View$OnDragListener", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z");
                    return z;
                }
            }
            Log.m105925i("MicroMsg.SnsActivity", "ACTION: [%s]", Integer.valueOf(action));
            z = true;
            SnsMethodCalculate.markEndTimeMs("onDrag", "com.tencent.mm.plugin.sns.ui.SnsUIAction$13$1");
            C117292a.m165362h(z, this, "com/tencent/mm/plugin/sns/ui/SnsUIAction$13$1", "android/view/View$OnDragListener", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z");
            return z;
        }
    }

    public C71231a7(SnsUIAction snsUIAction) {
        this.f206173d = snsUIAction;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUIAction$13");
        C71232a aVar = new C71232a();
        SnsHeader snsHeader = this.f206173d.f278860p;
        if (snsHeader != null) {
            snsHeader.setOnDragListener(aVar);
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUIAction$13");
    }
}
