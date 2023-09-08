package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.pluginsdk.p133ui.emoji.RTChattingEmojiView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.e1 */
public final class C73975e1 extends C74023i.C74026c {

    /* renamed from: g */
    public static Map<String, WeakReference<C73975e1>> f217091g = new HashMap();

    /* renamed from: b */
    public RTChattingEmojiView f217092b;

    /* renamed from: c */
    public ImageView f217093c;

    /* renamed from: d */
    public ProgressBar f217094d;

    /* renamed from: e */
    public ImageView f217095e;

    /* renamed from: f */
    public TextView f217096f;

    /* renamed from: a */
    public C74023i.C74026c mo103040a(View view, boolean z) {
        super.create(view);
        this.timeTV = (TextView) view.findViewById(C0966R.C0970id.b8z);
        this.f217092b = (RTChattingEmojiView) view.findViewById(C0966R.C0970id.b4c);
        this.checkBox = (CheckBox) view.findViewById(C0966R.C0970id.b46);
        this.maskView = view.findViewById(C0966R.C0970id.b7h);
        this.f217094d = (ProgressBar) view.findViewById(C0966R.C0970id.b4k);
        this.f217095e = (ImageView) view.findViewById(C0966R.C0970id.b8w);
        this.f217096f = (TextView) view.findViewById(C0966R.C0970id.b8p);
        if (!z) {
            this.uploadingPB = (ProgressBar) view.findViewById(C0966R.C0970id.f359466l14);
            this.stateIV = (ImageView) view.findViewById(C0966R.C0970id.b8v);
            this.f217093c = (ImageView) view.findViewById(C0966R.C0970id.b8x);
        }
        this.userTV = (TextView) view.findViewById(C0966R.C0970id.b9_);
        return this;
    }

    public View getMainContainerView() {
        return this.f217092b;
    }
}
