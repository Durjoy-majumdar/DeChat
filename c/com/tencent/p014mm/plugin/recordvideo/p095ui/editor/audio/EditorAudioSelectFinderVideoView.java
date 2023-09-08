package com.tencent.p014mm.plugin.recordvideo.p095ui.editor.audio;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import f40.C86709a0;
import gy3.C87412m;
import hi2.C76198a;
import java.util.ArrayList;
import java.util.LinkedList;
import kotlin.Metadata;
import p385u2.C111105a;
import rx3.C13601g;
import rx3.C36568h;
import sx3.C110818d0;
import te3.C64726td1;
import te3.C64770ve1;
import zh2.C112628i;
import zh2.C112629j;
import zh2.C112630k;
import zh2.C112631l;
import zh2.C112632m;
import zh2.C112633n;
import zh2.C112634o;
import zh2.C112635q;
import zh2.C112636r;
import zh2.C112637s;
import zh2.C112638t;
import zh2.C112639u;
import zh2.C112640v;
import zh2.C112641w;
import zh2.C16211p;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u00016B\u001d\b\u0016\u0012\b\u0010.\u001a\u0004\u0018\u00010-\u0012\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b1\u00102B%\b\u0016\u0012\b\u0010.\u001a\u0004\u0018\u00010-\u0012\b\u00100\u001a\u0004\u0018\u00010/\u0012\u0006\u00104\u001a\u000203¢\u0006\u0004\b1\u00105J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R#\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR#\u0010\u0011\u001a\n \u0007*\u0004\u0018\u00010\r0\r8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u0010R#\u0010\u0014\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0013\u0010\u000bR#\u0010\u0017\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0016\u0010\u000bR#\u0010\u001a\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0019\u0010\u000bR#\u0010\u001f\u001a\n \u0007*\u0004\u0018\u00010\u001b0\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\t\u001a\u0004\b\u001d\u0010\u001eR#\u0010$\u001a\n \u0007*\u0004\u0018\u00010 0 8BX\u0002¢\u0006\f\n\u0004\b!\u0010\t\u001a\u0004\b\"\u0010#R$\u0010,\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u00067"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioSelectFinderVideoView;", "Landroid/widget/RelativeLayout;", "", "isShow", "Lrx3/b0;", "setShow", "Landroid/view/View;", "kotlin.jvm.PlatformType", "e", "Lrx3/g;", "getCancelBtn", "()Landroid/view/View;", "cancelBtn", "Landroid/widget/Button;", "f", "getFinishBtn", "()Landroid/widget/Button;", "finishBtn", "g", "getClickCloseArea", "clickCloseArea", "h", "getFinderLikeTab", "finderLikeTab", "i", "getFinderFavTab", "finderFavTab", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioFinderLikeFragment;", "j", "getFinderLikeFragment", "()Lcom/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioFinderLikeFragment;", "finderLikeFragment", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioFinderFavFragment;", "n", "getFinderFavFragment", "()Lcom/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioFinderFavFragment;", "finderFavFragment", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioSelectFinderVideoView$a;", "p", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioSelectFinderVideoView$a;", "getCallback", "()Lcom/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioSelectFinderVideoView$a;", "setCallback", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioSelectFinderVideoView$a;)V", "callback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.audio.EditorAudioSelectFinderVideoView */
public final class EditorAudioSelectFinderVideoView extends RelativeLayout {

    /* renamed from: q */
    public static final /* synthetic */ int f315687q = 0;

    /* renamed from: d */
    public final int f315688d;

    /* renamed from: e */
    public final C13601g f315689e = C36568h.m40985a(new C112635q(this));

    /* renamed from: f */
    public final C13601g f315690f = C36568h.m40985a(new C112641w(this));

    /* renamed from: g */
    public final C13601g f315691g = C36568h.m40985a(new C112636r(this));

    /* renamed from: h */
    public final C13601g f315692h = C36568h.m40985a(new C112640v(this));

    /* renamed from: i */
    public final C13601g f315693i = C36568h.m40985a(new C112638t(this));

    /* renamed from: j */
    public final C13601g f315694j = C36568h.m40985a(new C112639u(this));

    /* renamed from: n */
    public final C13601g f315695n = C36568h.m40985a(new C112637s(this));

    /* renamed from: o */
    public AudioCacheInfo f315696o;

    /* renamed from: p */
    public C106054a f315697p;

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.audio.EditorAudioSelectFinderVideoView$a */
    public interface C106054a {
        /* renamed from: a */
        void mo151525a(AudioCacheInfo audioCacheInfo);

        /* renamed from: b */
        void mo151526b(AudioCacheInfo audioCacheInfo);

        /* renamed from: c */
        void mo151527c();
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.audio.EditorAudioSelectFinderVideoView$b */
    public static final class C106055b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ EditorAudioSelectFinderVideoView f315698d;

        public C106055b(EditorAudioSelectFinderVideoView editorAudioSelectFinderVideoView) {
            this.f315698d = editorAudioSelectFinderVideoView;
        }

        public final void run() {
            this.f315698d.setVisibility(8);
        }
    }

    public EditorAudioSelectFinderVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.c6j, this, true);
        int i = C75044y4.m89990b(getContext()).y;
        this.f315688d = i;
        setTranslationY((float) i);
        getCancelBtn().setOnClickListener(new C112628i(this));
        getClickCloseArea().setOnClickListener(new C112629j(this));
        getFinishBtn().setOnClickListener(new C112630k(this));
        C76198a aVar = C76198a.f223232a;
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        float a = aVar.mo106461a(context2, 17.0f);
        View cancelBtn = getCancelBtn();
        Button button = null;
        TextView textView = cancelBtn instanceof TextView ? (TextView) cancelBtn : null;
        if (textView != null) {
            textView.setTextSize(1, a);
        }
        View cancelBtn2 = getCancelBtn();
        C87412m.m108593f(cancelBtn2, "cancelBtn");
        aVar.mo106462b(cancelBtn2);
        Button finishBtn = getFinishBtn();
        button = finishBtn instanceof TextView ? finishBtn : button;
        if (button != null) {
            button.setTextSize(1, a);
        }
        Button finishBtn2 = getFinishBtn();
        C87412m.m108593f(finishBtn2, "finishBtn");
        aVar.mo106462b(finishBtn2);
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.kpd);
        textView2.setTextSize(1, a);
        aVar.mo106462b(textView2);
        getFinderLikeFragment().setOnFinderVideoSelectListener(new C112631l(this));
        getFinderFavFragment().setOnFinderVideoSelectListener(new C112632m(this));
        getFinderLikeTab().setOnClickListener(new C112633n(this));
        getFinderFavTab().setOnClickListener(new C112634o(this));
        View finderLikeTab = getFinderLikeTab();
        C87412m.m108593f(finderLikeTab, "finderLikeTab");
        mo151521g(finderLikeTab);
        setOnClickListener(C16211p.f43426d);
    }

    /* renamed from: d */
    public static final void m142624d(EditorAudioSelectFinderVideoView editorAudioSelectFinderVideoView, FinderObject finderObject, int i) {
        String str;
        editorAudioSelectFinderVideoView.getClass();
        FinderObjectDesc finderObjectDesc = finderObject.objectDesc;
        if (finderObjectDesc != null) {
            LinkedList<FinderMedia> linkedList = finderObjectDesc.media;
            C87412m.m108593f(linkedList, "objectDesc.media");
            FinderMedia finderMedia = (FinderMedia) C110818d0.m150916N(linkedList);
            if (finderMedia != null) {
                AudioCacheInfo audioCacheInfo = new AudioCacheInfo();
                String str2 = finderObject.nickname + "的视频原声";
                long j = 60000;
                int i2 = finderMedia.mediaType;
                boolean z = true;
                String str3 = "";
                if (i2 == 4) {
                    str = finderMedia.url + finderMedia.url_token;
                    j = (long) (finderMedia.videoDuration * 1000);
                    audioCacheInfo.f163831z = true;
                } else {
                    if (i2 == 2) {
                        C64770ve1 ve12 = finderObjectDesc.feedBgmInfo;
                        if ((ve12 != null ? ve12.f185873d : null) != null) {
                            C87412m.m108591d(ve12);
                            C64726td1 td12 = ve12.f185873d;
                            C87412m.m108591d(td12);
                            str2 = td12.f185536f;
                            if (str2 == null) {
                                str2 = str3;
                            }
                            str = td12.f185539i;
                            if (str == null) {
                                str = str3;
                            }
                        }
                    }
                    Log.m105920e("MicroMsg.EditorAudioSelectFinderVideoView", "select finderObject invalid!");
                    return;
                }
                String str4 = C86709a0.m107535s().f251806d + "finder/video/" + MD5Util.getMD5String(str);
                audioCacheInfo.f163813e = (int) finderObject.f164794id;
                audioCacheInfo.f163814f = str;
                audioCacheInfo.f163821p = i;
                C87412m.m108594g(str2, "<set-?>");
                audioCacheInfo.f163825t = str2;
                audioCacheInfo.f163822q = (int) j;
                audioCacheInfo.f163823r = false;
                ArrayList<AudioCacheInfo.C57170c> arrayList = audioCacheInfo.f163815g;
                if (arrayList != null) {
                    arrayList.clear();
                }
                audioCacheInfo.f163817i = str4;
                String str5 = finderMedia.decodeKey;
                if (str5 != null) {
                    str3 = str5;
                }
                audioCacheInfo.f163826u = str3;
                audioCacheInfo.f163830y = finderObject;
                String str6 = finderMedia.coverUrl;
                if (!(str6 == null || str6.length() == 0)) {
                    z = false;
                }
                if (!z) {
                    String str7 = finderMedia.coverUrl + finderMedia.cover_url_token;
                    C87412m.m108594g(str7, "<set-?>");
                    audioCacheInfo.f163827v = str7;
                } else {
                    String str8 = finderMedia.thumbUrl + finderMedia.thumb_url_token;
                    C87412m.m108594g(str8, "<set-?>");
                    audioCacheInfo.f163827v = str8;
                }
                editorAudioSelectFinderVideoView.f315696o = audioCacheInfo;
                C106054a aVar = editorAudioSelectFinderVideoView.f315697p;
                if (aVar != null) {
                    aVar.mo151526b(audioCacheInfo);
                }
            }
        }
    }

    private final View getCancelBtn() {
        return (View) this.f315689e.getValue();
    }

    private final View getClickCloseArea() {
        return (View) this.f315691g.getValue();
    }

    /* access modifiers changed from: private */
    public final EditorAudioFinderFavFragment getFinderFavFragment() {
        return (EditorAudioFinderFavFragment) this.f315695n.getValue();
    }

    private final View getFinderFavTab() {
        return (View) this.f315693i.getValue();
    }

    /* access modifiers changed from: private */
    public final EditorAudioFinderLikeFragment getFinderLikeFragment() {
        return (EditorAudioFinderLikeFragment) this.f315694j.getValue();
    }

    private final View getFinderLikeTab() {
        return (View) this.f315692h.getValue();
    }

    /* access modifiers changed from: private */
    public final Button getFinishBtn() {
        return (Button) this.f315690f.getValue();
    }

    /* renamed from: e */
    public final void mo151519e() {
        EditorAudioFinderLikeFragment finderLikeFragment = getFinderLikeFragment();
        finderLikeFragment.getClass();
        C86709a0.m107524d().mo123470p(3965, finderLikeFragment);
        EditorAudioFinderFavFragment finderFavFragment = getFinderFavFragment();
        finderFavFragment.getClass();
        C86709a0.m107524d().mo123470p(3966, finderFavFragment);
    }

    /* renamed from: f */
    public final void mo151520f(Integer num, Integer num2, String str) {
        Button finishBtn = getFinishBtn();
        if (!(num == null || num.intValue() == 0)) {
            finishBtn.setBackgroundResource(num.intValue());
        }
        if (!(num2 == null || num2.intValue() == 0)) {
            finishBtn.setTextColor(C111105a.m151500b(finishBtn.getContext(), num2.intValue()));
        }
        if (str != null) {
            finishBtn.setText(str);
        }
    }

    /* renamed from: g */
    public final void mo151521g(View view) {
        if (C87412m.m108589b(getFinderLikeTab(), view)) {
            getFinderLikeTab().setSelected(true);
            getFinderFavTab().setSelected(false);
            getFinderLikeFragment().setVisibility(0);
            getFinderFavFragment().setVisibility(8);
            return;
        }
        getFinderLikeTab().setSelected(false);
        getFinderFavTab().setSelected(true);
        getFinderLikeFragment().setVisibility(8);
        getFinderFavFragment().setVisibility(0);
    }

    public final C106054a getCallback() {
        return this.f315697p;
    }

    public final void setCallback(C106054a aVar) {
        this.f315697p = aVar;
    }

    public final void setShow(boolean z) {
        if (z) {
            this.f315696o = null;
            getFinishBtn().setEnabled(false);
            getFinderLikeFragment().mo6012e();
            getFinderFavFragment().mo6012e();
            View finderLikeTab = getFinderLikeTab();
            C87412m.m108593f(finderLikeTab, "finderLikeTab");
            mo151521g(finderLikeTab);
            setVisibility(0);
            animate().translationY(0.0f).start();
            return;
        }
        animate().translationY((float) this.f315688d).withEndAction(new C106055b(this)).start();
    }

    public EditorAudioSelectFinderVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.c6j, this, true);
        int i2 = C75044y4.m89990b(getContext()).y;
        this.f315688d = i2;
        setTranslationY((float) i2);
        getCancelBtn().setOnClickListener(new C112628i(this));
        getClickCloseArea().setOnClickListener(new C112629j(this));
        getFinishBtn().setOnClickListener(new C112630k(this));
        C76198a aVar = C76198a.f223232a;
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        float a = aVar.mo106461a(context2, 17.0f);
        View cancelBtn = getCancelBtn();
        Button button = null;
        TextView textView = cancelBtn instanceof TextView ? (TextView) cancelBtn : null;
        if (textView != null) {
            textView.setTextSize(1, a);
        }
        View cancelBtn2 = getCancelBtn();
        C87412m.m108593f(cancelBtn2, "cancelBtn");
        aVar.mo106462b(cancelBtn2);
        Button finishBtn = getFinishBtn();
        button = finishBtn instanceof TextView ? finishBtn : button;
        if (button != null) {
            button.setTextSize(1, a);
        }
        Button finishBtn2 = getFinishBtn();
        C87412m.m108593f(finishBtn2, "finishBtn");
        aVar.mo106462b(finishBtn2);
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.kpd);
        textView2.setTextSize(1, a);
        aVar.mo106462b(textView2);
        getFinderLikeFragment().setOnFinderVideoSelectListener(new C112631l(this));
        getFinderFavFragment().setOnFinderVideoSelectListener(new C112632m(this));
        getFinderLikeTab().setOnClickListener(new C112633n(this));
        getFinderFavTab().setOnClickListener(new C112634o(this));
        View finderLikeTab = getFinderLikeTab();
        C87412m.m108593f(finderLikeTab, "finderLikeTab");
        mo151521g(finderLikeTab);
        setOnClickListener(C16211p.f43426d);
    }
}
