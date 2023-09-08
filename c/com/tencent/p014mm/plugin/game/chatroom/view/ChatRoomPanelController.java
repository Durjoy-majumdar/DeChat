package com.tencent.p014mm.plugin.game.chatroom.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40308d;
import com.tencent.p014mm.p136ui.base.MMFlipper;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomPanel;
import com.tencent.p014mm.plugin.game.autogen.chatroom.Panel;
import com.tencent.p014mm.sdk.platformtools.Util;
import dx1.C45485a;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import qo3.C101218e0;
import rx3.C13598b0;
import sx3.C64197v;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB%\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u000e"}, mo182094d2 = {"Lcom/tencent/mm/plugin/game/chatroom/view/ChatRoomPanelController;", "Landroid/widget/LinearLayout;", "", "pageCount", "Lrx3/b0;", "setDotView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "game-chatroom_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.game.chatroom.view.ChatRoomPanelController */
public final class ChatRoomPanelController extends LinearLayout {

    /* renamed from: d */
    public long f112426d;

    /* renamed from: e */
    public long f112427e;

    /* renamed from: f */
    public C101218e0 f112428f;

    /* renamed from: g */
    public C45485a f112429g = C45485a.m50450a(LayoutInflater.from(getContext()), this, true);

    /* renamed from: h */
    public ChatroomPanel f112430h;

    /* renamed from: i */
    public int f112431i;

    /* renamed from: j */
    public final HashMap<Integer, Boolean> f112432j = new HashMap<>();

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.ChatRoomPanelController$a */
    public static final class C41757a implements MMFlipper.C73165c {

        /* renamed from: a */
        public final /* synthetic */ ChatRoomPanelController f112433a;

        public C41757a(ChatRoomPanelController chatRoomPanelController) {
            this.f112433a = chatRoomPanelController;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0017, code lost:
            r1 = r0.f112433a;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo65479a(int r1, int r2, boolean r3) {
            /*
                r0 = this;
                com.tencent.mm.plugin.game.chatroom.view.ChatRoomPanelController r1 = r0.f112433a
                dx1.a r1 = r1.f112429g
                com.tencent.mm.ui.base.MMDotView r1 = r1.f123111a
                r1.setSelectedDot(r2)
                com.tencent.mm.plugin.game.chatroom.view.ChatRoomPanelController r1 = r0.f112433a
                java.util.HashMap<java.lang.Integer, java.lang.Boolean> r1 = r1.f112432j
                java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                java.lang.Object r1 = r1.get(r3)
                if (r1 != 0) goto L_0x0020
                com.tencent.mm.plugin.game.chatroom.view.ChatRoomPanelController r1 = r0.f112433a
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomPanel r3 = r1.f112430h
                if (r3 == 0) goto L_0x0020
                r1.mo65477a(r2, r3)
            L_0x0020:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.chatroom.view.ChatRoomPanelController.C41757a.mo65479a(int, int, boolean):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.ChatRoomPanelController$b */
    public static final class C41758b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ChatRoomPanelController f112434d;

        public C41758b(ChatRoomPanelController chatRoomPanelController) {
            this.f112434d = chatRoomPanelController;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/view/ChatRoomPanelController$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C101218e0 e0Var = this.f112434d.f112428f;
            if (e0Var != null) {
                e0Var.mo140680z();
            }
            this.f112434d.f112428f = null;
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomPanelController$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.ChatRoomPanelController$c */
    public static final class C41759c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ChatRoomPanelController f112435d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41759c(ChatRoomPanelController chatRoomPanelController) {
            super(0);
            this.f112435d = chatRoomPanelController;
        }

        public Object invoke() {
            C101218e0 e0Var = this.f112435d.f112428f;
            if (e0Var != null) {
                e0Var.mo140680z();
            }
            return C13598b0.f38549a;
        }
    }

    public ChatRoomPanelController(Context context, long j, long j2) {
        super(context, (AttributeSet) null);
        this.f112429g.f123112b.setOnScreenChangedListener(new C41757a(this));
        this.f112429g.f123113c.setOnClickListener(new C41758b(this));
        this.f112429g.f123111a.setDarkStyle(true);
        this.f112426d = j;
        this.f112427e = j2;
    }

    private final void setDotView(int i) {
        if (i < 2) {
            this.f112429g.f123111a.setVisibility(8);
            return;
        }
        this.f112429g.f123111a.setVisibility(0);
        this.f112429g.f123111a.setDotCount(i);
    }

    /* renamed from: a */
    public final void mo65477a(int i, ChatroomPanel chatroomPanel) {
        this.f112432j.put(Integer.valueOf(i), Boolean.TRUE);
        int i2 = i * 8;
        int i3 = (i + 1) * 8;
        if (chatroomPanel.panel_list.size() <= i3) {
            i3 = chatroomPanel.panel_list.size();
        }
        List<Panel> subList = chatroomPanel.panel_list.subList(i2, i3);
        C87412m.m108593f(subList, "panelInfo.panel_list.subList(start, end)");
        int i4 = 0;
        for (T next : subList) {
            int i5 = i4 + 1;
            if (i4 >= 0) {
                C40308d.C40309a aVar = C40308d.f108375a;
                long j = (long) ((i * 4 * 2) + i5);
                long j2 = this.f112426d;
                long j3 = this.f112427e;
                String str = ((Panel) next).desc;
                if (str == null) {
                    str = "";
                }
                aVar.mo62993c(j, 1, j2, j3, str);
                i4 = i5;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
    }

    /* renamed from: b */
    public final void mo65478b(ChatroomPanel chatroomPanel) {
        if (chatroomPanel != null && !Util.isNullOrNil((List) chatroomPanel.panel_list)) {
            this.f112430h = chatroomPanel;
            C101218e0 e0Var = new C101218e0(getContext(), 0, 0, true, true);
            this.f112428f = e0Var;
            if (!e0Var.mo140661h()) {
                int size = ((chatroomPanel.panel_list.size() - 1) / 8) + 1;
                this.f112431i = size;
                setDotView(size);
                int i = this.f112431i;
                int i2 = 0;
                while (i2 < i) {
                    View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.ck5, this.f112429g.f123112b, false);
                    PanelGridView panelGridView = (PanelGridView) inflate.findViewById(C0966R.C0970id.lvx);
                    long j = this.f112426d;
                    long j2 = this.f112427e;
                    panelGridView.f112626C1 = j;
                    panelGridView.f112627D1 = j2;
                    this.f112429g.f123112b.addView(inflate, new LinearLayout.LayoutParams(-1, -2));
                    int i3 = i2 * 8;
                    int i4 = i2 + 1;
                    int i5 = i4 * 8;
                    if (chatroomPanel.panel_list.size() <= i5) {
                        i5 = chatroomPanel.panel_list.size();
                    }
                    panelGridView.setData(chatroomPanel.panel_list.subList(i3, i5));
                    if (i2 == 0) {
                        mo65477a(0, chatroomPanel);
                    }
                    panelGridView.f112628E1 = new C41759c(this);
                    i2 = i4;
                }
                e0Var.mo140664k(this, 0, 0);
                e0Var.mo140655A();
            }
        }
    }

    public ChatRoomPanelController(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f112429g.f123112b.setOnScreenChangedListener(new C41757a(this));
        this.f112429g.f123113c.setOnClickListener(new C41758b(this));
        this.f112429g.f123111a.setDarkStyle(true);
    }

    public ChatRoomPanelController(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f112429g.f123112b.setOnScreenChangedListener(new C41757a(this));
        this.f112429g.f123113c.setOnClickListener(new C41758b(this));
        this.f112429g.f123111a.setDarkStyle(true);
    }
}
