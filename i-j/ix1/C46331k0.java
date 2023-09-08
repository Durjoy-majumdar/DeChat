package ix1;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import ax1.C39639c;
import ax1.C39641d;
import com.tencent.p014mm.plugin.game.autogen.chatroom.JumpInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.TplBlock;
import com.tencent.p014mm.plugin.game.chatroom.view.C4442t;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import yw1.C53601h;

/* renamed from: ix1.k0 */
public final class C46331k0 {

    /* renamed from: a */
    public final List<String> f124824a = new ArrayList();

    /* renamed from: ix1.k0$a */
    public static final class C46332a extends C4442t {

        /* renamed from: f */
        public final /* synthetic */ C46319f0 f124825f;

        /* renamed from: g */
        public final /* synthetic */ boolean f124826g;

        /* renamed from: h */
        public final /* synthetic */ Context f124827h;

        /* renamed from: i */
        public final /* synthetic */ C46329j0 f124828i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46332a(C46319f0 f0Var, boolean z, Context context, C46329j0 j0Var) {
            super(1, f0Var);
            this.f124825f = f0Var;
            this.f124826g = z;
            this.f124827h = context;
            this.f124828i = j0Var;
        }

        /* renamed from: a */
        public void mo1118a(View view) {
            long j;
            C87412m.m108594g(view, "widget");
            if (!this.f124826g) {
                int h = C53601h.m60129h(this.f124827h, this.f124825f.f124797c);
                if (h == 1) {
                    j = 6;
                } else if (h == 2) {
                    j = 7;
                } else if (h == 3) {
                    j = 28;
                } else {
                    return;
                }
                C46329j0 j0Var = this.f124828i;
                if (j0Var != null) {
                    j0Var.mo71724b(j);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo71728a(Context context, List<? extends TplBlock> list, boolean z, C46329j0 j0Var) {
        boolean z2;
        Context context2 = context;
        C46329j0 j0Var2 = j0Var;
        Class cls = C39639c.class;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(list, "tplBlockList");
        if (!Util.isNullOrNil((List) list)) {
            LinkedList<C46319f0> linkedList = new LinkedList<>();
            StringBuffer stringBuffer = new StringBuffer();
            Iterator<? extends TplBlock> it = list.iterator();
            while (true) {
                z2 = true;
                if (!it.hasNext()) {
                    break;
                }
                TplBlock tplBlock = (TplBlock) it.next();
                String str = tplBlock.username;
                if (str != null) {
                    ((ArrayList) this.f124824a).add(str);
                }
                int i = tplBlock.type;
                if (i == 0) {
                    String str2 = tplBlock.content;
                    if (str2 != null) {
                        stringBuffer.append(str2);
                    }
                } else if (i != 1) {
                    if (i == 2) {
                        String str3 = tplBlock.username;
                        if (str3 != null) {
                            C39641d X3 = ((C39639c) C86312j.m106911c(cls)).mo62193X3(str3);
                            if (X3 != null) {
                                stringBuffer.append(X3.getNickName());
                            } else {
                                stringBuffer.append(tplBlock.content);
                            }
                        } else {
                            stringBuffer.append(tplBlock.content);
                        }
                    }
                } else if (tplBlock.content != null) {
                    C46319f0 f0Var = new C46319f0(0, 0, (JumpInfo) null, (String) null, false, 31, (C8480h) null);
                    f0Var.f124795a = stringBuffer.length();
                    f0Var.f124796b = stringBuffer.length() + tplBlock.content.length();
                    f0Var.f124797c = tplBlock.jump_info;
                    f0Var.f124798d = tplBlock.username;
                    f0Var.f124799e = tplBlock.can_be_at;
                    linkedList.add(f0Var);
                    stringBuffer.append(tplBlock.content);
                }
            }
            if (stringBuffer.length() != 0) {
                z2 = false;
            }
            if (!z2) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(stringBuffer);
                for (C46319f0 f0Var2 : linkedList) {
                    spannableStringBuilder.setSpan(new C46332a(f0Var2, z, context2, j0Var2), f0Var2.f124795a, f0Var2.f124796b, 33);
                }
                if (j0Var2 != null) {
                    j0Var2.mo71723a(spannableStringBuilder);
                }
                ((C39639c) C86312j.m106911c(cls)).mo62191Ah(this.f124824a, (C39639c.C39640a) null);
            }
        }
    }
}
