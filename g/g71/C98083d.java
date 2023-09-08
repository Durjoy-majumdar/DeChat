package g71;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.emojicapture.p841ui.capture.CaptureDecoration;
import com.tencent.p014mm.plugin.emojicapture.p841ui.editor.EditorItemContainer;
import com.tencent.p014mm.plugin.emojicapture.p841ui.editor.EmojiEditorItemView;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import gy3.C87412m;
import h71.C98317b;

/* renamed from: g71.d */
public final class C98083d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CaptureDecoration f287552d;

    /* renamed from: e */
    public final /* synthetic */ EmojiInfo f287553e;

    public C98083d(CaptureDecoration captureDecoration, EmojiInfo emojiInfo) {
        this.f287552d = captureDecoration;
        this.f287553e = emojiInfo;
    }

    public final void run() {
        float f;
        float f2;
        CaptureDecoration captureDecoration = this.f287552d;
        if (captureDecoration.f269266z == null) {
            RectF validRect = captureDecoration.f269262v.getValidRect();
            Context context = this.f287552d.getContext();
            C87412m.m108593f(context, "context");
            EmojiEditorItemView emojiEditorItemView = new EmojiEditorItemView(context);
            emojiEditorItemView.setEmojiInfo(this.f287553e);
            emojiEditorItemView.resume();
            CaptureDecoration captureDecoration2 = this.f287552d;
            captureDecoration2.f269266z = emojiEditorItemView;
            EditorItemContainer editorItemContainer = captureDecoration2.f269262v;
            editorItemContainer.getClass();
            editorItemContainer.mo128122c(new C98317b(editorItemContainer, emojiEditorItemView, (Matrix) null));
            Drawable drawable = emojiEditorItemView.getDrawable();
            if (drawable != null) {
                CaptureDecoration captureDecoration3 = this.f287552d;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                float width = validRect.width();
                float height = validRect.height();
                if (intrinsicWidth > intrinsicHeight) {
                    f2 = width / ((float) 3);
                    f = (((float) intrinsicHeight) * f2) / ((float) intrinsicWidth);
                } else {
                    f = height / ((float) 3);
                    f2 = (((float) intrinsicWidth) * f) / ((float) intrinsicHeight);
                }
                float f3 = validRect.right;
                float f4 = validRect.bottom;
                emojiEditorItemView.getTouchMatrix().setPolyToPoly(new float[]{0.0f, 0.0f, (float) intrinsicWidth, (float) intrinsicHeight}, 0, new float[]{f3 - f2, f4 - f, f3, f4}, 0, 2);
                float f5 = (-captureDecoration3.getContext().getResources().getDimension(C0966R.dimen.a3c)) / ((float) 2);
                emojiEditorItemView.getTouchMatrix().postTranslate(f5, f5);
            }
        }
    }
}
