package j51;

import android.text.Layout;
import android.text.TextPaint;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.downloader_app.p039ui.DownloadUpdateDescView;

/* renamed from: j51.j */
public class C46410j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ DownloadUpdateDescView f125017d;

    public C46410j(DownloadUpdateDescView downloadUpdateDescView) {
        this.f125017d = downloadUpdateDescView;
    }

    public void run() {
        int lineCount = this.f125017d.f110448d.getLineCount();
        if (lineCount <= 2) {
            Layout layout = this.f125017d.f110448d.getLayout();
            TextPaint paint = this.f125017d.f110448d.getPaint();
            if (layout != null && lineCount > 0 && layout.getEllipsisCount(lineCount - 1) > 0) {
                int lineEnd = layout.getLineEnd(0);
                String charSequence = this.f125017d.f110448d.getText().toString();
                String substring = charSequence.substring(lineEnd, lineEnd * 2);
                int measureText = (int) paint.measureText(substring);
                int measureText2 = (int) paint.measureText(".");
                int measureText3 = (int) paint.measureText(this.f125017d.getResources().getString(C0966R.string.cgi));
                while (measureText + (measureText2 * 3) + measureText3 > layout.getEllipsizedWidth() && substring.length() > 0) {
                    substring = substring.substring(0, substring.length() - 1);
                    measureText = (int) paint.measureText(substring);
                }
                this.f125017d.f110448d.setText(charSequence.substring(0, lineEnd) + substring + "...");
                this.f125017d.f110449e.setVisibility(0);
            }
        }
    }
}
