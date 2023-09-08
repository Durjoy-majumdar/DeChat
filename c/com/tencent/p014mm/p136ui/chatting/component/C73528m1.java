package com.tencent.p014mm.p136ui.chatting.component;

import android.content.ClipData;
import android.content.Intent;
import android.view.DragEvent;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.transmit.SelectNoSupportUI;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72930u1;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75592q0;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import p270xi.C91212b;
import zj3.C79339b;
import zj3.C79359g1;
import zj3.C79379r;
import zj3.C79384u0;
import zj3.C79386v0;
import zj3.C79387w;
import zj3.C79394z0;

@C91212b(exportInterface = C79379r.class)
/* renamed from: com.tencent.mm.ui.chatting.component.m1 */
public class C73528m1 extends C73412a implements C79379r {

    /* renamed from: com.tencent.mm.ui.chatting.component.m1$a */
    public class C73529a implements Runnable {

        /* renamed from: com.tencent.mm.ui.chatting.component.m1$a$a */
        public class C73530a implements View.OnDragListener {
            public C73530a() {
            }

            public boolean onDrag(View view, DragEvent dragEvent) {
                String str;
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                arrayList.add(dragEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/chatting/component/DragDropComponent$1$1", "android/view/View$OnDragListener", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z", this, array);
                boolean z = false;
                try {
                    int action = dragEvent.getAction();
                    if (action == 1) {
                        Log.m105924i("MicroMsg.ChattingUI.DragDropComponent", "ACTION_DRAG_STARTED");
                    } else if (action == 2) {
                        Log.m105924i("MicroMsg.ChattingUI.DragDropComponent", "ACTION_DRAG_LOCATION");
                    } else if (action == 3) {
                        Log.m105924i("MicroMsg.ChattingUI.DragDropComponent", "ACTION_DROP");
                        ClipData clipData = dragEvent.getClipData();
                        if (clipData != null) {
                            int itemCount = clipData.getItemCount();
                            if (itemCount > 9) {
                                Intent intent = new Intent();
                                intent.setClass(C73528m1.this.f215752d.mo91565f(), SelectNoSupportUI.class);
                                intent.putExtra("sharePictureTo", "friend");
                                intent.addFlags(268435456).addFlags(67108864);
                                C67391b bVar = C73528m1.this.f215752d;
                                C9556a aVar = new C9556a();
                                aVar.mo10233c(intent);
                                C117292a.m165358d(bVar, aVar.mo10232b(), "com/tencent/mm/ui/chatting/component/DragDropComponent$1$1", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                bVar.mo91556Q((Intent) aVar.mo10231a(0));
                                C117292a.m165359e(bVar, "com/tencent/mm/ui/chatting/component/DragDropComponent$1$1", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                C117292a.m165362h(true, this, "com/tencent/mm/ui/chatting/component/DragDropComponent$1$1", "android/view/View$OnDragListener", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z");
                                return true;
                            }
                            for (int i = 0; i < itemCount; i++) {
                                ClipData.Item itemAt = clipData.getItemAt(i);
                                if (itemAt == null) {
                                    Log.m105920e("MicroMsg.ChattingUI.DragDropComponent", "item == null");
                                } else if (itemAt.getUri() != null) {
                                    C72930u1 u1Var = new C72930u1(C73528m1.this.f215752d.mo91565f(), itemAt.getUri());
                                    int i2 = u1Var.f212554b;
                                    if (i2 == 0 || (str = u1Var.f212553a) == null) {
                                        Log.m105920e("MicroMsg.ChattingUI.DragDropComponent", "get file path failed");
                                    } else if (i2 == 3) {
                                        ((C79386v0) C73528m1.this.f215752d.f193278b.mo102812a(C79386v0.class)).mo102588T0(C75592q0.m90771a(str, C73528m1.this.f215752d.mo91577r(), true) ? 1 : 0, 0, 0, str);
                                    } else if (i2 != 4) {
                                        ((C79339b) C73528m1.this.f215752d.f193278b.mo102812a(C79339b.class)).mo102383b1(u1Var);
                                    } else {
                                        Intent intent2 = new Intent();
                                        intent2.setData(itemAt.getUri());
                                        ((C79359g1) C73528m1.this.f215752d.f193278b.mo102812a(C79359g1.class)).mo102711o2(intent2, C73528m1.this.f215752d.mo91577r());
                                    }
                                } else if (itemAt.getText() != null && itemAt.getText().length() > 0) {
                                    ((C79394z0) C73528m1.this.f215752d.f193278b.mo102812a(C79394z0.class)).mo102660r0(itemAt.getText().toString());
                                }
                            }
                        }
                    } else if (action == 4) {
                        Log.m105924i("MicroMsg.ChattingUI.DragDropComponent", "ACTION_DRAG_ENDED");
                    } else if (action != 5) {
                        Log.m105920e("MicroMsg.ChattingUI.DragDropComponent", "Unknown action type received by OnDragListener.");
                        C117292a.m165362h(z, this, "com/tencent/mm/ui/chatting/component/DragDropComponent$1$1", "android/view/View$OnDragListener", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z");
                        return z;
                    } else {
                        Log.m105924i("MicroMsg.ChattingUI.DragDropComponent", "ACTION_DRAG_ENTERED");
                    }
                    z = true;
                    C117292a.m165362h(z, this, "com/tencent/mm/ui/chatting/component/DragDropComponent$1$1", "android/view/View$OnDragListener", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z");
                    return z;
                } catch (Throwable th) {
                    Log.printErrStackTrace("MicroMsg.ChattingUI.DragDropComponent", th, "initDragDropEvent", new Object[0]);
                    C117292a.m165362h(false, this, "com/tencent/mm/ui/chatting/component/DragDropComponent$1$1", "android/view/View$OnDragListener", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z");
                    return false;
                }
            }
        }

        public C73529a() {
        }

        public void run() {
            C73530a aVar = new C73530a();
            if (C73528m1.this.f215752d.mo91570k() != null) {
                C73528m1.this.f215752d.mo91570k().setOnDragListener(aVar);
            }
            ChatFooter k1 = ((C79387w) C73528m1.this.f215752d.f193278b.mo102812a(C79387w.class)).mo102193k1();
            if (k1 != null) {
                k1.setOnDragListener(aVar);
                k1.setEditTextOnDragListener(aVar);
            }
        }
    }

    /* renamed from: O4 */
    public void mo26162O4() {
        mo102494f1();
    }

    /* renamed from: X3 */
    public void mo102493X3() {
        if (this.f215752d.mo91570k() != null) {
            this.f215752d.mo91570k().setOnDragListener((View.OnDragListener) null);
        }
        ChatFooter k1 = ((C79387w) this.f215752d.f193278b.mo102812a(C79387w.class)).mo102193k1();
        if (k1 != null) {
            k1.setOnDragListener((View.OnDragListener) null);
            k1.setEditTextOnDragListener((View.OnDragListener) null);
        }
    }

    /* renamed from: f1 */
    public void mo102494f1() {
        Class cls = C79384u0.class;
        boolean x2 = ((C79384u0) this.f215752d.f193278b.mo102812a(cls)).mo102513x2();
        boolean Y = ((C79384u0) this.f215752d.f193278b.mo102812a(cls)).mo102509Y();
        if (!x2 && !Y) {
            new C73529a().run();
        }
    }

    /* renamed from: u5 */
    public void mo26170u5() {
        mo102493X3();
    }
}
