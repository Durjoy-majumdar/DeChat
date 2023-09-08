package com.tencent.p014mm.p136ui.chatting.component.biz;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.ServiceAcctMuteOpStruct;
import com.tencent.p014mm.p136ui.conversation.C74695j1;
import com.tencent.p014mm.storage.C72976h2;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C45628s0;
import java.util.List;
import p196ln.C76705f;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.chatting.component.biz.f */
public class C73439f extends C74695j1 {

    /* renamed from: a */
    public final /* synthetic */ String f215813a;

    /* renamed from: b */
    public final /* synthetic */ C73446n f215814b;

    /* renamed from: com.tencent.mm.ui.chatting.component.biz.f$a */
    public class C73440a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ List f215815d;

        public C73440a(C73439f fVar, List list) {
            this.f215815d = list;
        }

        public void run() {
            long j = 0;
            for (int i = 0; i < this.f215815d.size(); i++) {
                C72976h2 h2Var = (C72976h2) this.f215815d.get(i);
                if (h2Var != null && !C45628s0.m50770e(h2Var.getUsername()) && !C45628s0.m50747L(h2Var.getUsername())) {
                    j += (long) h2Var.mo108786G2();
                }
            }
            ServiceAcctMuteOpStruct serviceAcctMuteOpStruct = new ServiceAcctMuteOpStruct();
            serviceAcctMuteOpStruct.f194379d = 1;
            serviceAcctMuteOpStruct.f194380e = C31543z5.m39451a();
            serviceAcctMuteOpStruct.f194381f = j;
            serviceAcctMuteOpStruct.mo86054n();
        }
    }

    public C73439f(BizComponent bizComponent, String str, C73446n nVar) {
        this.f215813a = str;
        this.f215814b = nVar;
    }

    /* renamed from: a */
    public void mo102389a(List<? extends C72976h2> list) {
        ImageView imageView;
        if (list != null) {
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                C72976h2 h2Var = (C72976h2) list.get(i2);
                if (!h2Var.getUsername().equals(this.f215813a) && !C45628s0.m50770e(h2Var.getUsername())) {
                    i++;
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    break;
                                }
                                imageView = (ImageView) this.f215814b.f215822f.findViewById(C0966R.C0970id.mnc);
                            } else {
                                imageView = (ImageView) this.f215814b.f215822f.findViewById(C0966R.C0970id.mh_);
                            }
                        } else {
                            imageView = (ImageView) this.f215814b.f215822f.findViewById(C0966R.C0970id.f357517mh0);
                        }
                    } else {
                        imageView = (ImageView) this.f215814b.f215822f.findViewById(C0966R.C0970id.mau);
                    }
                    if (imageView != null && (imageView.getParent() instanceof ViewGroup)) {
                        ((ViewGroup) imageView.getParent()).setVisibility(0);
                        imageView.setBackground((Drawable) null);
                        imageView.setClickable(false);
                        imageView.setLongClickable(false);
                        ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(imageView, h2Var.getUsername());
                    }
                }
            }
            ((C119157j) C119157j.f356862d).mo183884o(new C73440a(this, list));
        }
    }
}
