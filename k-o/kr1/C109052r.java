package kr1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import iy3.C60641c;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kr1.C109034a;
import lh2.C109344g0;
import qh2.C101198e;

/* renamed from: kr1.r */
public final class C109052r implements C109344g0, C109034a.C109035a {

    /* renamed from: d */
    public final ViewGroup f326593d;

    /* renamed from: e */
    public final C101198e f326594e;

    /* renamed from: f */
    public final View f326595f;

    /* renamed from: g */
    public final TextView f326596g;

    /* renamed from: h */
    public final View f326597h;

    /* renamed from: i */
    public final TextView f326598i;

    /* renamed from: j */
    public AudioCacheInfo f326599j;

    /* renamed from: n */
    public boolean f326600n = true;

    /* renamed from: kr1.r$a */
    public static final class C109053a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C109052r f326601d;

        public C109053a(C109052r rVar) {
            this.f326601d = rVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/video/plugin/RecordAudioPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C109052r rVar = this.f326601d;
            if (rVar.f326600n) {
                C101198e.C62622a.m73576a(rVar.f326594e, C101198e.C101199b.EDIT_SHOW_ADD_MUSIC, (Bundle) null, 2, (Object) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/video/plugin/RecordAudioPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C109052r(ViewGroup viewGroup, C101198e eVar) {
        C87412m.m108594g(viewGroup, "layout");
        C87412m.m108594g(eVar, "status");
        this.f326593d = viewGroup;
        this.f326594e = eVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.ih4);
        C87412m.m108593f(findViewById, "layout.findViewById(R.id.record_add_music)");
        this.f326595f = findViewById;
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.ih6);
        C87412m.m108593f(findViewById2, "layout.findViewById(R.id.record_add_music_icon)");
        WeImageView weImageView = (WeImageView) findViewById2;
        View findViewById3 = viewGroup.findViewById(C0966R.C0970id.ih8);
        C87412m.m108593f(findViewById3, "layout.findViewById(R.id.record_add_music_text)");
        TextView textView = (TextView) findViewById3;
        this.f326596g = textView;
        View findViewById4 = viewGroup.findViewById(C0966R.C0970id.ih7);
        C87412m.m108593f(findViewById4, "layout.findViewById(R.id…cord_add_music_indicator)");
        this.f326597h = findViewById4;
        View findViewById5 = viewGroup.findViewById(C0966R.C0970id.ih5);
        C87412m.m108593f(findViewById5, "layout.findViewById(R.id…ecord_add_music_duration)");
        this.f326598i = (TextView) findViewById5;
        findViewById.setOnClickListener(new C109053a(this));
        textView.setSelected(true);
        mo160176d(false);
    }

    /* renamed from: a */
    public void mo160160a() {
    }

    /* renamed from: b */
    public void mo160161b() {
    }

    /* renamed from: c */
    public final void mo160175c(long j) {
        if (this.f326599j != null) {
            this.f326598i.setVisibility(0);
            this.f326598i.setText(this.f326593d.getContext().getString(C0966R.string.ema, new Object[]{Integer.valueOf(C60641c.m70921b(((float) j) / 1000.0f))}));
            return;
        }
        this.f326598i.setVisibility(8);
    }

    /* renamed from: d */
    public final void mo160176d(boolean z) {
        if (this.f326600n != z) {
            this.f326600n = z;
            View view = this.f326597h;
            int i = z ? 0 : 4;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/video/plugin/RecordAudioPlugin", "enableAddMusic", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/video/plugin/RecordAudioPlugin", "enableAddMusic", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: e */
    public boolean mo78564e() {
        return false;
    }

    /* renamed from: f */
    public final void mo160177f() {
        AudioCacheInfo audioCacheInfo = this.f326599j;
        if (audioCacheInfo == null) {
            this.f326596g.setText(C76577a.m92166q(this.f326593d.getContext(), C0966R.string.emb));
            mo160175c(60000);
        } else {
            TextView textView = this.f326596g;
            String str = null;
            ArrayList<String> arrayList = audioCacheInfo != null ? audioCacheInfo.f163816h : null;
            if (arrayList == null || arrayList.isEmpty()) {
                AudioCacheInfo audioCacheInfo2 = this.f326599j;
                if (audioCacheInfo2 != null) {
                    str = audioCacheInfo2.f163825t;
                }
            } else {
                AudioCacheInfo audioCacheInfo3 = this.f326599j;
                String listToString = Util.listToString(audioCacheInfo3 != null ? audioCacheInfo3.f163816h : null, ",");
                StringBuilder sb = new StringBuilder();
                AudioCacheInfo audioCacheInfo4 = this.f326599j;
                if (audioCacheInfo4 != null) {
                    str = audioCacheInfo4.f163825t;
                }
                sb.append(str);
                sb.append(" - ");
                sb.append(listToString);
                str = sb.toString();
            }
            textView.setText(str);
        }
        this.f326596g.requestLayout();
    }

    public String name() {
        return C109052r.class.getName();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttach() {
    }

    public void onDetach() {
    }

    public void onPause() {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C109344g0.C61280a.m71860a(this, i, strArr, iArr);
    }

    public void onResume() {
    }

    public void release() {
    }

    public void reset() {
    }

    public void setVisibility(int i) {
        View view = this.f326595f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/video/plugin/RecordAudioPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/video/plugin/RecordAudioPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (i == 0) {
            mo160177f();
        }
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}
