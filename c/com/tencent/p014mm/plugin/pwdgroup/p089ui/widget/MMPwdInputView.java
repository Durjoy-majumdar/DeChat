package com.tencent.p014mm.plugin.pwdgroup.p089ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.pwdgroup.p089ui.FacingCreateChatRoomAllInOneUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WCWebUpdater;
import ff2.C8019b;

/* renamed from: com.tencent.mm.plugin.pwdgroup.ui.widget.MMPwdInputView */
public class MMPwdInputView extends LinearLayout {

    /* renamed from: d */
    public StringBuilder f53297d;

    /* renamed from: e */
    public boolean f53298e;

    /* renamed from: f */
    public int f53299f;

    /* renamed from: g */
    public ImageView f53300g;

    /* renamed from: h */
    public ImageView f53301h;

    /* renamed from: i */
    public ImageView f53302i;

    /* renamed from: j */
    public ImageView f53303j;

    /* renamed from: n */
    public C18975a f53304n;

    /* renamed from: com.tencent.mm.plugin.pwdgroup.ui.widget.MMPwdInputView$b */
    public enum C5025b {
    }

    /* renamed from: com.tencent.mm.plugin.pwdgroup.ui.widget.MMPwdInputView$a */
    public interface C18975a {
    }

    public MMPwdInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    /* renamed from: a */
    public final void mo24159a() {
        StringBuilder sb = this.f53297d;
        if (sb != null) {
            this.f53299f = sb.length();
        } else {
            this.f53299f = 0;
        }
        if (this.f53299f >= 4) {
            this.f53298e = true;
        } else {
            this.f53298e = false;
        }
        C18975a aVar = this.f53304n;
        if (aVar != null) {
            boolean z = this.f53298e;
            String sb4 = this.f53297d.toString();
            FacingCreateChatRoomAllInOneUI.C18964i iVar = (FacingCreateChatRoomAllInOneUI.C18964i) aVar;
            iVar.getClass();
            Log.m105919d("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "cpan[onFinishInput] %b %s", Boolean.valueOf(z), sb4);
            FacingCreateChatRoomAllInOneUI facingCreateChatRoomAllInOneUI = FacingCreateChatRoomAllInOneUI.this;
            facingCreateChatRoomAllInOneUI.f53224j = sb4;
            if (z) {
                facingCreateChatRoomAllInOneUI.f53220f = true;
                FacingCreateChatRoomAllInOneUI.m20010I7(facingCreateChatRoomAllInOneUI);
            }
        }
    }

    /* renamed from: b */
    public void mo24160b() {
        int i = this.f53299f;
        if (i > 0) {
            this.f53297d.delete(0, i);
        }
        mo24159a();
        mo24161c();
    }

    /* renamed from: c */
    public final void mo24161c() {
        for (int i = 0; i < 4; i++) {
            String str = "";
            if (this.f53299f > i) {
                str = this.f53297d.toString().charAt(i) + str;
            }
            if (i == 0) {
                mo24162d(this.f53300g, str);
                ((C8019b) C39818r.f106831a.mo62443b(getContext()).mo75002a(C8019b.class)).setValue("title_num_1", str);
                Log.m105924i("MicroMsg.Facing.MMPwdInputView", "1, number = " + str);
            } else if (i == 1) {
                mo24162d(this.f53301h, str);
                ((C8019b) C39818r.f106831a.mo62443b(getContext()).mo75002a(C8019b.class)).setValue("title_num_2", str);
                Log.m105924i("MicroMsg.Facing.MMPwdInputView", "2, number = " + str);
            } else if (i == 2) {
                mo24162d(this.f53302i, str);
                ((C8019b) C39818r.f106831a.mo62443b(getContext()).mo75002a(C8019b.class)).setValue("title_num_3", str);
                Log.m105924i("MicroMsg.Facing.MMPwdInputView", "3, number = " + str);
            } else if (i == 3) {
                mo24162d(this.f53303j, str);
                ((C8019b) C39818r.f106831a.mo62443b(getContext()).mo75002a(C8019b.class)).setValue("title_num_4", str);
                Log.m105924i("MicroMsg.Facing.MMPwdInputView", "4, number = " + str);
            }
        }
    }

    /* renamed from: d */
    public final void mo24162d(ImageView imageView, String str) {
        if (imageView != null) {
            if (str.equals("0")) {
                imageView.setImageResource(C0966R.C0969drawable.bum);
            } else if (str.equals("1")) {
                imageView.setImageResource(C0966R.C0969drawable.bun);
            } else if (str.equals("2")) {
                imageView.setImageResource(C0966R.C0969drawable.buo);
            } else if (str.equals("3")) {
                imageView.setImageResource(C0966R.C0969drawable.bup);
            } else if (str.equals(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL)) {
                imageView.setImageResource(C0966R.C0969drawable.buq);
            } else if (str.equals(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY)) {
                imageView.setImageResource(C0966R.C0969drawable.bur);
            } else if (str.equals(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN)) {
                imageView.setImageResource(C0966R.C0969drawable.bus);
            } else if (str.equals("7")) {
                imageView.setImageResource(C0966R.C0969drawable.but);
            } else if (str.equals("8")) {
                imageView.setImageResource(C0966R.C0969drawable.buu);
            } else if (str.equals("9")) {
                imageView.setImageResource(C0966R.C0969drawable.buv);
            } else {
                imageView.setImageResource(C0966R.C0969drawable.buw);
            }
        }
    }

    public void setNumberStyle(C5025b bVar) {
    }

    public void setNumberWidth(int i) {
        ImageView imageView = this.f53300g;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = i;
            this.f53300g.setLayoutParams(layoutParams);
            this.f53301h.setLayoutParams(layoutParams);
            this.f53302i.setLayoutParams(layoutParams);
            this.f53303j.setLayoutParams(layoutParams);
        }
    }

    public void setOnFinishInputListener(C18975a aVar) {
        this.f53304n = aVar;
    }

    public MMPwdInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f53297d = new StringBuilder();
        this.f53298e = false;
        View inflate = View.inflate(getContext(), C0966R.C0971layout.bot, (ViewGroup) null);
        this.f53300g = (ImageView) inflate.findViewById(C0966R.C0970id.e_4);
        this.f53301h = (ImageView) inflate.findViewById(C0966R.C0970id.j79);
        this.f53302i = (ImageView) inflate.findViewById(C0966R.C0970id.kj8);
        this.f53303j = (ImageView) inflate.findViewById(C0966R.C0970id.eeh);
        this.f53300g.setImageResource(C0966R.C0969drawable.buw);
        this.f53301h.setImageResource(C0966R.C0969drawable.buw);
        this.f53302i.setImageResource(C0966R.C0969drawable.buw);
        this.f53303j.setImageResource(C0966R.C0969drawable.buw);
        addView(inflate);
    }
}
