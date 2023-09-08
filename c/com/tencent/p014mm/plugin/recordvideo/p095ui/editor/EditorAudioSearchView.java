package com.tencent.p014mm.plugin.recordvideo.p095ui.editor;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bp3.C104160f;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.VideoBGMSearchStruct;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import hp3.C87581a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import jh2.C108745d;
import jh2.C60861g;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import nr3.C89059e;
import ob0.C89132b;
import p396x6.C23023u;
import rx3.C13598b0;
import sx3.C64197v;
import te3.C64653qc;
import te3.C64839xt2;
import th2.C110992d;
import xh2.C112151a;
import yh2.C112458c;
import yh2.C66647d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001)B\u0019\b\u0016\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&B!\b\u0016\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010'\u001a\u00020\u0006¢\u0006\u0004\b%\u0010(J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bJ\u0017\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010 \u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006*"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView;", "Landroid/widget/RelativeLayout;", "", "visible", "Lrx3/b0;", "setImeVisibility", "", "scene", "setScene", "isShow", "setShow", "Lx6/u;", "player", "setMusicPlayer", "position", "setSelection", "(Ljava/lang/Integer;)V", "", "B", "J", "getMRelatedRecId", "()J", "setMRelatedRecId", "(J)V", "mRelatedRecId", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView$a;", "C", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView$a;", "getCallback", "()Lcom/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView$a;", "setCallback", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView$a;)V", "callback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "style", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioSearchView */
public final class EditorAudioSearchView extends RelativeLayout {

    /* renamed from: H */
    public static final /* synthetic */ int f315481H = 0;

    /* renamed from: A */
    public long f315482A;

    /* renamed from: B */
    public long f315483B;

    /* renamed from: C */
    public C105997a f315484C;

    /* renamed from: D */
    public int f315485D = 0;

    /* renamed from: E */
    public C60861g f315486E;

    /* renamed from: F */
    public final C112458c f315487F = new C112458c(this);

    /* renamed from: G */
    public final Runnable f315488G = new C66647d(this);

    /* renamed from: d */
    public final String f315489d = "MicroMsg.EditorAudioSearchView";

    /* renamed from: e */
    public int f315490e;

    /* renamed from: f */
    public View f315491f;

    /* renamed from: g */
    public View f315492g;

    /* renamed from: h */
    public View f315493h;

    /* renamed from: i */
    public TextView f315494i;

    /* renamed from: j */
    public TextView f315495j;

    /* renamed from: n */
    public EditText f315496n;

    /* renamed from: o */
    public Button f315497o;

    /* renamed from: p */
    public RecyclerView f315498p;

    /* renamed from: q */
    public TextView f315499q;

    /* renamed from: r */
    public LinearLayout f315500r;

    /* renamed from: s */
    public ImageView f315501s;

    /* renamed from: t */
    public ImageView f315502t;

    /* renamed from: u */
    public C112151a f315503u;

    /* renamed from: v */
    public long f315504v;

    /* renamed from: w */
    public int f315505w;

    /* renamed from: x */
    public int f315506x = -1;

    /* renamed from: y */
    public String f315507y;

    /* renamed from: z */
    public AudioCacheInfo f315508z;

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioSearchView$c */
    public static final class C57171c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ EditorAudioSearchView f163835d;

        public C57171c(EditorAudioSearchView editorAudioSearchView) {
            this.f163835d = editorAudioSearchView;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
            if ((r8.length() == 0) == false) goto L_0x0037;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r8) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView$init$1"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioSearchView r8 = r7.f163835d
                android.widget.EditText r8 = r8.f315496n
                r0 = 1
                r1 = 0
                if (r8 == 0) goto L_0x0036
                android.text.Editable r8 = r8.getText()
                if (r8 == 0) goto L_0x0036
                int r8 = r8.length()
                if (r8 != 0) goto L_0x0032
                r8 = 1
                goto L_0x0033
            L_0x0032:
                r8 = 0
            L_0x0033:
                if (r8 != 0) goto L_0x0036
                goto L_0x0037
            L_0x0036:
                r0 = 0
            L_0x0037:
                if (r0 == 0) goto L_0x0044
                com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioSearchView r8 = r7.f163835d
                android.widget.EditText r8 = r8.f315496n
                if (r8 != 0) goto L_0x0040
                goto L_0x0044
            L_0x0040:
                r0 = 0
                r8.setText(r0)
            L_0x0044:
                java.lang.String r8 = "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView$init$1"
                java.lang.String r0 = "android/view/View$OnClickListener"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r7, r8, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorAudioSearchView.C57171c.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioSearchView$d */
    public static final class C57172d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ EditorAudioSearchView f163836d;

        public C57172d(EditorAudioSearchView editorAudioSearchView) {
            this.f163836d = editorAudioSearchView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView$init$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            EditorAudioSearchView editorAudioSearchView = this.f163836d;
            int i = EditorAudioSearchView.f315481H;
            editorAudioSearchView.mo151357b();
            C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView$init$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioSearchView$g */
    public static final class C57173g implements TextWatcher {

        /* renamed from: d */
        public final /* synthetic */ EditorAudioSearchView f163837d;

        public C57173g(EditorAudioSearchView editorAudioSearchView) {
            this.f163837d = editorAudioSearchView;
        }

        public void afterTextChanged(Editable editable) {
            boolean z = false;
            if ((editable != null ? editable.length() : 0) > 0) {
                ImageView imageView = this.f163837d.f315501s;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                this.f163837d.f315507y = editable != null ? editable.toString() : null;
                if (!Util.isNullOrNil(this.f163837d.f315507y)) {
                    if (((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_music_search_direct_search_enabel, C104160f.RepairerConfig_Maas_DirectSearchEnable_Int, 1) == 1) {
                        z = true;
                    }
                    Log.m105924i("MicroMsg.XConfigUtil", "enableDirectSearch: " + z);
                    if (z) {
                        this.f163837d.mo151360e();
                        return;
                    }
                    return;
                }
                return;
            }
            ImageView imageView2 = this.f163837d.f315501s;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioSearchView$j */
    public static final class C57174j implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ EditorAudioSearchView f163838d;

        public C57174j(EditorAudioSearchView editorAudioSearchView) {
            this.f163838d = editorAudioSearchView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView$init$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            EditText editText = this.f163838d.f315496n;
            if (editText != null) {
                editText.clearFocus();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView$init$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioSearchView$a */
    public interface C105997a {
        /* renamed from: a */
        void mo151373a();

        /* renamed from: b */
        void mo151374b(AudioCacheInfo audioCacheInfo);

        /* renamed from: c */
        void mo151375c(AudioCacheInfo audioCacheInfo);

        /* renamed from: d */
        void mo151376d();
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioSearchView$b */
    public static final class C105998b<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ EditorAudioSearchView f315509a;

        /* renamed from: b */
        public final /* synthetic */ boolean f315510b;

        public C105998b(EditorAudioSearchView editorAudioSearchView, boolean z) {
            this.f315509a = editorAudioSearchView;
            this.f315510b = z;
        }

        public Object call(Object obj) {
            AudioCacheInfo audioCacheInfo;
            boolean z;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            int i = cVar.f256793a;
            int i2 = cVar.f256794b;
            String str = cVar.f256795c;
            Log.m105924i(this.f315509a.f315489d, "LogStory: SearchdMusic callback " + i + ' ' + i2 + ", " + str);
            if (i == 0 && i2 == 0) {
                C64653qc qcVar = (C64653qc) cVar.f256796d;
                EditorAudioSearchView editorAudioSearchView = this.f315509a;
                editorAudioSearchView.f315504v = qcVar.f184994d;
                editorAudioSearchView.f315505w++;
                LinkedList<C64839xt2> linkedList = qcVar.f184995e;
                C87412m.m108593f(linkedList, "audioList");
                boolean z2 = this.f315510b;
                ArrayList arrayList = new ArrayList();
                int i3 = 0;
                for (T next : linkedList) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        AudioCacheInfo a = AudioCacheInfo.f163811A.mo80747a((C64839xt2) next, 3);
                        a.f163821p = 4;
                        a.f163828w = 0;
                        a.f163829x = editorAudioSearchView.f315483B;
                        arrayList.add(a);
                        i3 = i4;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                if (linkedList.size() == 10) {
                    AudioCacheInfo audioCacheInfo2 = new AudioCacheInfo();
                    audioCacheInfo2.f163820o = 5;
                    arrayList.add(audioCacheInfo2);
                }
                if (!linkedList.isEmpty() || editorAudioSearchView.f315505w != 1) {
                    LinearLayout linearLayout = editorAudioSearchView.f315500r;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(8);
                    }
                    RecyclerView recyclerView = editorAudioSearchView.f315498p;
                    if (recyclerView != null) {
                        recyclerView.setVisibility(0);
                    }
                    TextView textView = editorAudioSearchView.f315499q;
                    if (textView != null) {
                        textView.setVisibility(8);
                    }
                    if (z2) {
                        C112151a aVar = editorAudioSearchView.f315503u;
                        if (aVar != null) {
                            int size = aVar.f335823d.size();
                            ArrayList<AudioCacheInfo> arrayList2 = aVar.f335823d;
                            ListIterator<AudioCacheInfo> listIterator = arrayList2.listIterator(arrayList2.size());
                            while (true) {
                                if (!listIterator.hasPrevious()) {
                                    audioCacheInfo = null;
                                    break;
                                }
                                audioCacheInfo = listIterator.previous();
                                int i5 = audioCacheInfo.f163820o;
                                if (i5 == 4 || i5 == 5 || i5 == 2) {
                                    z = true;
                                    continue;
                                } else {
                                    z = false;
                                    continue;
                                }
                                if (z) {
                                    break;
                                }
                            }
                            AudioCacheInfo audioCacheInfo3 = audioCacheInfo;
                            if (audioCacheInfo3 != null) {
                                aVar.f335823d.remove(audioCacheInfo3);
                            }
                            int size2 = aVar.f335823d.size();
                            if (size == size2) {
                                aVar.f335823d.addAll(arrayList);
                                aVar.notifyItemRangeInserted(size, arrayList.size());
                            } else {
                                aVar.f335823d.addAll(arrayList);
                                aVar.notifyItemChanged(size2);
                                aVar.notifyItemRangeInserted(size, arrayList.size() - 1);
                            }
                        }
                    } else {
                        C112151a aVar2 = editorAudioSearchView.f315503u;
                        if (aVar2 != null) {
                            aVar2.mo163965g5(arrayList);
                        }
                    }
                } else {
                    LinearLayout linearLayout2 = editorAudioSearchView.f315500r;
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(8);
                    }
                    RecyclerView recyclerView2 = editorAudioSearchView.f315498p;
                    if (recyclerView2 != null) {
                        recyclerView2.setVisibility(8);
                    }
                    TextView textView2 = editorAudioSearchView.f315499q;
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                    }
                }
                VideoBGMSearchStruct videoBGMSearchStruct = C108745d.f325634j;
                EditorAudioSearchView editorAudioSearchView2 = this.f315509a;
                videoBGMSearchStruct.f310343h = editorAudioSearchView2.f315504v;
                videoBGMSearchStruct.f310339d = videoBGMSearchStruct.mo86045b("QueryContent", editorAudioSearchView2.f315507y, true);
                Log.m105924i(this.f315509a.f315489d, "get audio list " + qcVar);
            } else {
                EditorAudioSearchView editorAudioSearchView3 = this.f315509a;
                if (editorAudioSearchView3.f315505w == 0) {
                    LinearLayout linearLayout3 = editorAudioSearchView3.f315500r;
                    if (linearLayout3 != null) {
                        linearLayout3.setVisibility(8);
                    }
                    RecyclerView recyclerView3 = editorAudioSearchView3.f315498p;
                    if (recyclerView3 != null) {
                        recyclerView3.setVisibility(8);
                    }
                    TextView textView3 = editorAudioSearchView3.f315499q;
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                    }
                }
            }
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioSearchView$e */
    public static final class C105999e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ EditorAudioSearchView f315511d;

        public C105999e(EditorAudioSearchView editorAudioSearchView) {
            this.f315511d = editorAudioSearchView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView$init$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            EditorAudioSearchView editorAudioSearchView = this.f315511d;
            C112151a aVar = editorAudioSearchView.f315503u;
            if (aVar != null) {
                int i = editorAudioSearchView.f315506x;
                if (i == -1 || i >= aVar.getItemCount()) {
                    C105997a callback = editorAudioSearchView.getCallback();
                    if (callback != null) {
                        callback.mo151374b((AudioCacheInfo) null);
                    }
                    editorAudioSearchView.mo151361f();
                    C108745d.C108746a aVar2 = C108745d.f325632h;
                    C108745d.f325634j.f310340e = 1;
                    aVar2.mo159769a();
                } else {
                    C105997a callback2 = editorAudioSearchView.getCallback();
                    if (callback2 != null) {
                        callback2.mo151374b(aVar.mo163962F4(editorAudioSearchView.f315506x));
                    }
                    editorAudioSearchView.mo151361f();
                    C108745d.C108746a aVar3 = C108745d.f325632h;
                    C108745d.f325634j.f310340e = 0;
                    aVar3.mo159769a();
                }
                editorAudioSearchView.mo151362g();
            }
            EditText editText = this.f315511d.f315496n;
            if (editText != null) {
                editText.clearFocus();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView$init$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioSearchView$f */
    public static final class C106000f implements View.OnFocusChangeListener {

        /* renamed from: d */
        public final /* synthetic */ EditorAudioSearchView f315512d;

        public C106000f(EditorAudioSearchView editorAudioSearchView) {
            this.f315512d = editorAudioSearchView;
        }

        public final void onFocusChange(View view, boolean z) {
            this.f315512d.setImeVisibility(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioSearchView$h */
    public static final class C106001h implements TextView.OnEditorActionListener {

        /* renamed from: d */
        public final /* synthetic */ EditorAudioSearchView f315513d;

        public C106001h(EditorAudioSearchView editorAudioSearchView) {
            this.f315513d = editorAudioSearchView;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (3 != i) {
                return false;
            }
            String str = this.f315513d.f315507y;
            String str2 = null;
            if (str != null) {
                CharSequence text = textView.getText();
                if (!Util.isEqual(str, text != null ? text.toString() : null)) {
                    this.f315513d.mo151361f();
                    C108745d.C108746a aVar = C108745d.f325632h;
                    C108745d.f325634j.f310340e = 2;
                    aVar.mo159769a();
                    C108745d.f325634j.f310344i = this.f315513d.getMRelatedRecId();
                }
            }
            EditorAudioSearchView editorAudioSearchView = this.f315513d;
            CharSequence text2 = textView.getText();
            if (text2 != null) {
                str2 = text2.toString();
            }
            editorAudioSearchView.f315507y = str2;
            if (Util.isNullOrNil(this.f315513d.f315507y)) {
                return false;
            }
            this.f315513d.mo151360e();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioSearchView$i */
    public static final class C106002i extends C87413o implements C32227p<Integer, AudioCacheInfo, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EditorAudioSearchView f315514d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106002i(EditorAudioSearchView editorAudioSearchView) {
            super(2);
            this.f315514d = editorAudioSearchView;
        }

        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            C87412m.m108594g((AudioCacheInfo) obj2, "info");
            C112151a aVar = this.f315514d.f315503u;
            boolean z = false;
            if (aVar != null && intValue == aVar.getItemCount()) {
                z = true;
            }
            if (!z) {
                this.f315514d.mo151365h(intValue);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioSearchView$k */
    public static final class C106003k implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ EditorAudioSearchView f315515d;

        public C106003k(EditorAudioSearchView editorAudioSearchView) {
            this.f315515d = editorAudioSearchView;
        }

        public final void run() {
            this.f315515d.setVisibility(8);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditorAudioSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        mo151359d();
    }

    /* access modifiers changed from: private */
    public final void setImeVisibility(boolean z) {
        if (z) {
            post(this.f315488G);
            return;
        }
        removeCallbacks(this.f315488G);
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    /* renamed from: b */
    public final void mo151357b() {
        mo151361f();
        C108745d.C108746a aVar = C108745d.f325632h;
        C108745d.f325634j.f310340e = 1;
        aVar.mo159769a();
        mo151362g();
        EditText editText = this.f315496n;
        if (editText != null) {
            editText.clearFocus();
        }
        C105997a aVar2 = this.f315484C;
        if (aVar2 != null) {
            aVar2.mo151376d();
        }
        C105997a aVar3 = this.f315484C;
        if (aVar3 != null) {
            aVar3.mo151373a();
        }
    }

    /* renamed from: c */
    public final void mo151358c(boolean z) {
        String str = this.f315489d;
        Log.m105918d(str, "doSearch " + this.f315507y);
        if (!Util.isNullOrNil(this.f315507y)) {
            if (!z) {
                LinearLayout linearLayout = this.f315500r;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                RecyclerView recyclerView = this.f315498p;
                if (recyclerView != null) {
                    recyclerView.setVisibility(8);
                }
                TextView textView = this.f315499q;
                if (textView != null) {
                    textView.setVisibility(8);
                }
            }
            C60861g gVar = this.f315486E;
            if (gVar != null) {
                gVar.mo85581g();
            }
            long j = this.f315504v;
            String str2 = this.f315507y;
            C87412m.m108591d(str2);
            C60861g gVar2 = new C60861g(j, str2, this.f315505w, this.f315483B, 0, this.f315485D, 16, (C8480h) null);
            this.f315486E = gVar2;
            C89059e i = gVar2.mo9225i();
            if (i != null) {
                i.mo123062e(new C105998b(this, z));
            }
        }
    }

    /* renamed from: d */
    public final void mo151359d() {
        View.inflate(getContext(), C0966R.C0971layout.c6i, this);
        this.f315494i = (TextView) findViewById(C0966R.C0970id.k5c);
        this.f315495j = (TextView) findViewById(C0966R.C0970id.k5r);
        this.f315496n = (EditText) findViewById(C0966R.C0970id.k5d);
        this.f315497o = (Button) findViewById(C0966R.C0970id.k5h);
        this.f315498p = (RecyclerView) findViewById(C0966R.C0970id.k5n);
        this.f315499q = (TextView) findViewById(C0966R.C0970id.k5l);
        this.f315500r = (LinearLayout) findViewById(C0966R.C0970id.k5k);
        this.f315501s = (ImageView) findViewById(C0966R.C0970id.k5e);
        this.f315491f = findViewById(C0966R.C0970id.k5q);
        this.f315492g = findViewById(C0966R.C0970id.k5o);
        this.f315493h = findViewById(C0966R.C0970id.k5b);
        this.f315502t = (ImageView) findViewById(C0966R.C0970id.k5f);
        RecyclerView recyclerView = this.f315498p;
        if (recyclerView != null) {
            recyclerView.setFocusable(false);
        }
        Context context = getContext();
        C87412m.m108593f(context, "context");
        Object systemService = context.getSystemService("window");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        float f = (17.0f * displayMetrics.density) / context.getResources().getDisplayMetrics().density;
        TextView textView = this.f315494i;
        if (textView != null) {
            textView.setTextSize(1, f);
        }
        TextView textView2 = this.f315495j;
        if (textView2 != null) {
            textView2.setTextSize(1, f);
        }
        Button button = this.f315497o;
        if (button != null) {
            button.setTextSize(1, f);
        }
        ImageView imageView = this.f315502t;
        if (imageView != null) {
            imageView.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icons_filled_search, C76577a.m92153d(getContext(), C0966R.color.aeo)));
        }
        Button button2 = this.f315497o;
        if (button2 != null) {
            button2.setEnabled(false);
        }
        ImageView imageView2 = this.f315501s;
        if (imageView2 != null) {
            imageView2.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icons_filled_close2, C76577a.m92153d(getContext(), C0966R.color.f356996ai0)));
        }
        ImageView imageView3 = this.f315501s;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new C57171c(this));
        }
        RecyclerView recyclerView2 = this.f315498p;
        ViewGroup.LayoutParams layoutParams = recyclerView2 != null ? recyclerView2.getLayoutParams() : null;
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = C75044y4.m89991c(getContext()) + C76577a.m92151b(getContext(), 16);
        RecyclerView recyclerView3 = this.f315498p;
        if (recyclerView3 != null) {
            recyclerView3.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        }
        RecyclerView recyclerView4 = this.f315498p;
        if (recyclerView4 != null) {
            recyclerView4.mo17043c(this.f315487F);
        }
        C112151a aVar = new C112151a();
        this.f315503u = aVar;
        RecyclerView recyclerView5 = this.f315498p;
        if (recyclerView5 != null) {
            recyclerView5.setAdapter(aVar);
        }
        TextView textView3 = this.f315494i;
        if (textView3 != null) {
            textView3.setOnClickListener(new C57172d(this));
        }
        Button button3 = this.f315497o;
        if (button3 != null) {
            button3.setOnClickListener(new C105999e(this));
        }
        EditText editText = this.f315496n;
        if (editText != null) {
            editText.setOnFocusChangeListener(new C106000f(this));
        }
        EditText editText2 = this.f315496n;
        if (editText2 != null) {
            editText2.addTextChangedListener(new C57173g(this));
        }
        EditText editText3 = this.f315496n;
        if (editText3 != null) {
            editText3.setOnEditorActionListener(new C106001h(this));
        }
        C112151a aVar2 = this.f315503u;
        if (aVar2 != null) {
            aVar2.f335831o = new C106002i(this);
        }
        setOnClickListener(new C57174j(this));
        int i = C75044y4.m89990b(getContext()).y;
        this.f315490e = i;
        setTranslationY((float) i);
        mo151366i();
    }

    /* renamed from: e */
    public final void mo151360e() {
        C112151a aVar = this.f315503u;
        if (C87412m.m108589b(aVar != null ? aVar.f335825f : null, this.f315507y)) {
            Log.m105928w(this.f315489d, "refreshSearchList: same string, no need to update");
            return;
        }
        C110992d.m151314c(C110992d.f332425a, "KEY_SEARCH_MUSIC_COUNT_INT", 0, 2, (Object) null);
        String str = this.f315507y;
        C87412m.m108591d(str);
        String str2 = (String) C110992d.f332426b.mo129811b("KEY_SEARCH_MUSIC_LIST_STRING", "");
        if (!TextUtils.isEmpty(str2)) {
            str = str2 + '#' + str;
        }
        C110992d.f332426b.mo129812c("KEY_SEARCH_MUSIC_LIST_STRING", str);
        C112151a aVar2 = this.f315503u;
        if (aVar2 != null) {
            aVar2.mo163964O4((Integer) null);
        }
        RecyclerView recyclerView = this.f315498p;
        if (recyclerView != null) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar3.mo10233c(0);
            RecyclerView recyclerView2 = recyclerView;
            C117292a.m165358d(recyclerView2, aVar3.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView", "refreshSearchList", "()V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.mo17115r1(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView", "refreshSearchList", "()V", "Undefined", "scrollToPosition", "(I)V");
        }
        C112151a aVar4 = this.f315503u;
        if (aVar4 != null) {
            aVar4.mo163965g5(new LinkedList());
        }
        Button button = this.f315497o;
        if (button != null) {
            button.setEnabled(false);
        }
        this.f315504v = 0;
        this.f315506x = -1;
        this.f315505w = 0;
        C112151a aVar5 = this.f315503u;
        if (aVar5 != null) {
            aVar5.f335825f = this.f315507y;
        }
        this.f315508z = null;
        this.f315482A = 0;
        View view = this.f315491f;
        if (view != null) {
            C9556a aVar6 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar6.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar6.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView", "showSearchPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView", "showSearchPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view3 = this.f315492g;
        if (view3 != null) {
            C9556a aVar7 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar7.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar7.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView", "showSearchPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView", "showSearchPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        mo151358c(false);
        C105997a aVar8 = this.f315484C;
        if (aVar8 != null) {
            aVar8.mo151376d();
        }
    }

    /* renamed from: f */
    public final void mo151361f() {
        if (this.f315508z != null) {
            StringBuilder sb = new StringBuilder();
            C108745d.C108746a aVar = C108745d.f325632h;
            Integer num = null;
            if (Util.isNullOrNil(C108745d.f325634j.f310341f)) {
                AudioCacheInfo audioCacheInfo = this.f315508z;
                if (audioCacheInfo != null) {
                    num = Integer.valueOf(audioCacheInfo.f163813e);
                }
                sb.append(num);
                sb.append(XVFSFile.PATH_SEPARATOR);
                sb.append(1);
                sb.append(XVFSFile.PATH_SEPARATOR);
                sb.append(System.currentTimeMillis() - this.f315482A);
            } else {
                sb.append(";");
                AudioCacheInfo audioCacheInfo2 = this.f315508z;
                if (audioCacheInfo2 != null) {
                    num = Integer.valueOf(audioCacheInfo2.f163813e);
                }
                sb.append(num);
                sb.append(XVFSFile.PATH_SEPARATOR);
                sb.append(1);
                sb.append(XVFSFile.PATH_SEPARATOR);
                sb.append(System.currentTimeMillis() - this.f315482A);
            }
            VideoBGMSearchStruct videoBGMSearchStruct = C108745d.f325634j;
            videoBGMSearchStruct.f310341f = videoBGMSearchStruct.mo86045b("Behavior", videoBGMSearchStruct.f310341f + sb, true);
        }
    }

    /* renamed from: g */
    public final void mo151362g() {
        Log.m105924i(this.f315489d, "reset");
        this.f315505w = 0;
        this.f315506x = -1;
        this.f315504v = 0;
        Button button = this.f315497o;
        if (button != null) {
            button.setEnabled(false);
        }
        EditText editText = this.f315496n;
        if (editText != null) {
            editText.setText((CharSequence) null);
        }
        C112151a aVar = this.f315503u;
        if (aVar != null) {
            aVar.f335825f = "";
        }
        if (aVar != null) {
            aVar.mo163964O4((Integer) null);
        }
        RecyclerView recyclerView = this.f315498p;
        if (recyclerView != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            RecyclerView recyclerView2 = recyclerView;
            C117292a.m165358d(recyclerView2, aVar2.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView", "reset", "()V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.mo17115r1(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView", "reset", "()V", "Undefined", "scrollToPosition", "(I)V");
        }
        C112151a aVar3 = this.f315503u;
        if (aVar3 != null) {
            aVar3.mo163965g5(new LinkedList());
        }
        mo151366i();
        this.f315507y = null;
        this.f315508z = null;
        this.f315482A = 0;
        C60861g gVar = this.f315486E;
        if (gVar != null) {
            gVar.mo85581g();
        }
        this.f315486E = null;
    }

    public final C105997a getCallback() {
        return this.f315484C;
    }

    public final long getMRelatedRecId() {
        return this.f315483B;
    }

    /* renamed from: h */
    public final void mo151365h(int i) {
        C112151a aVar = this.f315503u;
        boolean z = false;
        if (!(aVar != null && aVar.f335824e == i)) {
            this.f315506x = i;
            AudioCacheInfo F4 = aVar != null ? aVar.mo163962F4(i) : null;
            if (F4 != null && F4.f163820o == 4) {
                C105997a aVar2 = this.f315484C;
                if (aVar2 != null) {
                    aVar2.mo151375c((AudioCacheInfo) null);
                }
            } else {
                if (F4 != null && F4.f163820o == 3) {
                    z = true;
                }
                if (z) {
                    C112151a aVar3 = this.f315503u;
                    if (aVar3 != null) {
                        aVar3.mo163964O4(Integer.valueOf(i));
                    }
                    C105997a aVar4 = this.f315484C;
                    if (aVar4 != null) {
                        aVar4.mo151375c(F4);
                    }
                    Button button = this.f315497o;
                    if (button != null) {
                        button.setEnabled(true);
                    }
                    mo151361f();
                }
            }
            this.f315508z = F4;
            this.f315482A = System.currentTimeMillis();
        }
    }

    /* renamed from: i */
    public final void mo151366i() {
        View view = this.f315491f;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView", "showTagsPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView", "showTagsPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view2 = this.f315492g;
        if (view2 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView", "showTagsPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView", "showTagsPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void setCallback(C105997a aVar) {
        this.f315484C = aVar;
    }

    public final void setMRelatedRecId(long j) {
        this.f315483B = j;
    }

    public final void setMusicPlayer(C23023u uVar) {
        C87412m.m108594g(uVar, "player");
    }

    public final void setScene(int i) {
        String str = this.f315489d;
        Log.m105924i(str, "setScene() called with: scene = " + i);
        this.f315485D = i;
    }

    public final void setSelection(Integer num) {
        C112151a aVar = this.f315503u;
        if (aVar != null) {
            aVar.mo163964O4(num);
        }
    }

    public final void setShow(boolean z) {
        if (z) {
            C108745d.C108746a aVar = C108745d.f325632h;
            C108745d.f325634j.f310344i = this.f315483B;
            setVisibility(0);
            animate().translationY(0.0f).start();
            EditText editText = this.f315496n;
            if (editText != null) {
                editText.requestFocus();
                return;
            }
            return;
        }
        animate().translationY((float) this.f315490e).withEndAction(new C106003k(this)).start();
        EditText editText2 = this.f315496n;
        if (editText2 != null) {
            editText2.clearFocus();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditorAudioSearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        mo151359d();
    }
}
