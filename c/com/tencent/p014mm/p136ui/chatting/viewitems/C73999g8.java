package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.VoipEvent;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import uj3.C78208e;
import zj3.C79368l;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.g8 */
public final class C73999g8 extends C74023i.C74026c {

    /* renamed from: b */
    public TextView f217123b;

    /* renamed from: c */
    public View f217124c = null;

    /* renamed from: b */
    public static void m87823b(C73999g8 g8Var, C72963f4 f4Var, boolean z, C78208e eVar, C67391b bVar, C73989f8 f8Var, View.OnLongClickListener onLongClickListener) {
        if (g8Var != null) {
            ImageView imageView = g8Var.stateIV;
            boolean z2 = false;
            if (imageView != null) {
                imageView.setVisibility(f4Var.getStatus() == 6 ? 8 : 0);
            }
            g8Var.clickArea.setTag(new C74243t8(f4Var, bVar.mo91583x(), g8Var, (String) null));
            g8Var.clickArea.setOnClickListener(f8Var);
            g8Var.clickArea.setOnLongClickListener(onLongClickListener);
            g8Var.clickArea.setOnTouchListener(((C79368l) bVar.f193278b.mo102812a(C79368l.class)).mo108189Z4());
            String str = f4Var.f230724G;
            if (!Util.isNullOrNil(str)) {
                g8Var.f217123b.setText(str);
            } else if (z) {
                g8Var.f217123b.setText(C0966R.string.kew);
            } else {
                g8Var.f217123b.setText(C0966R.string.kex);
            }
            if (g8Var.f217124c != null && f4Var.getContent() != null) {
                String content = f4Var.getContent();
                int i = C72963f4.f212661I1;
                if (!content.equals("voip_content_voice")) {
                    String content2 = f4Var.getContent();
                    VoipEvent voipEvent = new VoipEvent();
                    VoipEvent.C67818a aVar = voipEvent.f194019d;
                    aVar.f194022b = 1;
                    aVar.f194021a = content2;
                    voipEvent.publish();
                    if (!(voipEvent.f194020e.f194027a == 3)) {
                        if (!f4Var.getContent().equals("voip_content_video")) {
                            String content3 = f4Var.getContent();
                            VoipEvent voipEvent2 = new VoipEvent();
                            VoipEvent.C67818a aVar2 = voipEvent2.f194019d;
                            aVar2.f194022b = 1;
                            aVar2.f194021a = content3;
                            voipEvent2.publish();
                            if (voipEvent2.f194020e.f194027a == 2) {
                                z2 = true;
                            }
                            if (!z2) {
                                return;
                            }
                        }
                        if (z) {
                            View view = g8Var.f217124c;
                            Drawable drawable = bVar.mo91565f().getDrawable(C0966R.raw.voip_videocall);
                            C74933u4.m89769f(drawable, bVar.mo91565f().getResources().getColor(C0966R.color.FG_0));
                            view.setBackground(drawable);
                            return;
                        }
                        g8Var.f217124c.setBackgroundResource(C0966R.raw.voip_videocall_to);
                        return;
                    }
                }
                if (z) {
                    View view2 = g8Var.f217124c;
                    Drawable drawable2 = bVar.mo91565f().getDrawable(C0966R.raw.voip_voicecall);
                    C74933u4.m89769f(drawable2, bVar.mo91565f().getResources().getColor(C0966R.color.FG_0));
                    view2.setBackground(drawable2);
                    return;
                }
                g8Var.f217124c.setBackgroundResource(C0966R.raw.voip_voicecall);
            }
        }
    }

    /* renamed from: a */
    public C74023i.C74026c mo103051a(View view, boolean z) {
        super.create(view);
        this.timeTV = (TextView) view.findViewById(C0966R.C0970id.b8z);
        this.f217123b = (TextView) view.findViewById(C0966R.C0970id.b_0);
        this.clickArea = view.findViewById(C0966R.C0970id.b47);
        this.f217124c = view.findViewById(C0966R.C0970id.b9z);
        this.stateIV = (ImageView) view.findViewById(C0966R.C0970id.b8v);
        this.checkBox = (CheckBox) view.findViewById(C0966R.C0970id.b46);
        this.maskView = view.findViewById(C0966R.C0970id.b7h);
        return this;
    }
}
