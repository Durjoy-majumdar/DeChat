package com.tencent.p014mm.plugin.vlog.p117ui.timelineeditor.scene;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.timelineedit.TimelineEditor;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import gy3.C87412m;
import kotlin.Metadata;
import org.json.JSONObject;
import qh2.C101198e;
import rr3.C110650z;
import sp3.C110801c;
import v23.C111348f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/vlog/ui/timelineeditor/scene/TimelineEditorNativeVideoPluginLayout;", "Lcom/tencent/mm/plugin/vlog/ui/timelineeditor/scene/TimelineEditorBaseVideoPluginLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorNativeVideoPluginLayout */
public final class TimelineEditorNativeVideoPluginLayout extends TimelineEditorBaseVideoPluginLayout {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimelineEditorNativeVideoPluginLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: o */
    public void mo152374o() {
        super.mo152374o();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C111348f fVar = (C111348f) mo151221j(C111348f.class);
        if (!(fVar == null || motionEvent == null)) {
            fVar.f333356g.mo153350u(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public void mo14585p(C101198e.C101199b bVar, Bundle bundle) {
        EmojiInfo emojiInfo;
        C111348f fVar;
        Class cls = C111348f.class;
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        Long l = null;
        if (ordinal == 37) {
            mo152384y();
            TimelineEditorBaseVideoPluginLayout.m143026x(this, (Long) null, 1, (Object) null);
            if (bundle != null) {
                CharSequence charSequence = bundle.getCharSequence("PARAM_EDIT_TEXT_CONTENT");
                int i = bundle.getInt("PARAM_EDIT_TEXT_COLOR");
                int i2 = bundle.getInt("PARAM_EDIT_TEXT_COLOR_BG_INT");
                String string = bundle.getString("PARAM_EDIT_TEXT_FONT");
                C111348f fVar2 = (C111348f) mo151221j(cls);
                if (fVar2 != null) {
                    String valueOf = String.valueOf(charSequence);
                    C110801c currentTrack = getCurrentTrack();
                    if (currentTrack != null) {
                        l = Long.valueOf(currentTrack.f331463a);
                    }
                    TimelineEditor timelineEditor = fVar2.f333356g;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("scheme", MimeTypes.BASE_TYPE_TEXT);
                        jSONObject.put(MimeTypes.BASE_TYPE_TEXT, valueOf);
                        jSONObject.put("font_color", i);
                        jSONObject.put("bg_color", i2);
                        jSONObject.put("font_style", string);
                    } catch (Exception unused) {
                    }
                    String jSONObject2 = jSONObject.toString();
                    C87412m.m108593f(jSONObject2, "value.toString()");
                    C110650z p = timelineEditor.mo153345p(jSONObject2);
                    if (p == null) {
                        return;
                    }
                    if (l != null) {
                        fVar2.f333356g.mo153342m(p, l.longValue());
                    } else {
                        fVar2.f333356g.mo153341l(p, true);
                    }
                }
            }
        } else if (ordinal != 104) {
            super.mo14585p(bVar, bundle);
        } else if (bundle != null && (emojiInfo = (EmojiInfo) bundle.getParcelable("PARAM_EDIT_EMOJI_INFO")) != null && (fVar = (C111348f) mo151221j(cls)) != null) {
            C110801c currentTrack2 = getCurrentTrack();
            if (currentTrack2 != null) {
                l = Long.valueOf(currentTrack2.f331463a);
            }
            TimelineEditor timelineEditor2 = fVar.f333356g;
            String md5 = emojiInfo.getMd5();
            C87412m.m108593f(md5, "emojiInfo.md5");
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("scheme", "emoji");
                jSONObject3.put("emoji_md5", md5);
            } catch (Exception unused2) {
            }
            String jSONObject4 = jSONObject3.toString();
            C87412m.m108593f(jSONObject4, "value.toString()");
            C110650z p2 = timelineEditor2.mo153345p(jSONObject4);
            if (p2 == null) {
                return;
            }
            if (l != null) {
                fVar.f333356g.mo153342m(p2, l.longValue());
            } else {
                fVar.f333356g.mo153341l(p2, true);
            }
        }
    }
}
