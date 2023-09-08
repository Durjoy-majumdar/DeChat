package com.tencent.p014mm.plugin.downloader_app.model;

import android.content.Context;
import android.text.Layout;
import android.text.TextPaint;
import android.widget.TextView;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import f40.C86709a0;
import u10.C52415a;
import uv0.C52620g;

/* renamed from: com.tencent.mm.plugin.downloader_app.model.y */
public class C41014y extends C52620g {

    /* renamed from: a */
    public final /* synthetic */ C41009x f110394a;

    /* renamed from: com.tencent.mm.plugin.downloader_app.model.y$a */
    public class C41015a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ TextView f110395d;

        /* renamed from: e */
        public final /* synthetic */ BallInfo f110396e;

        public C41015a(TextView textView, BallInfo ballInfo) {
            this.f110395d = textView;
            this.f110396e = ballInfo;
        }

        public void run() {
            Log.m105924i("MicroMsg.GameDownloadFloatBallHelper", "onBallNameTextViewSet");
            Layout layout = this.f110395d.getLayout();
            if (layout == null) {
                Log.m105920e("MicroMsg.GameDownloadFloatBallHelper", "onBallNameTextViewSet layout null");
                return;
            }
            int lineCount = layout.getLineCount();
            if (lineCount > 0 && layout.getEllipsisCount(lineCount - 1) > 0 && C41014y.this.f110394a.f110385n.size() > 1) {
                Log.m105924i("MicroMsg.GameDownloadFloatBallHelper", "ellipsis");
                TextPaint paint = this.f110395d.getPaint();
                int lineEnd = layout.getLineEnd(0);
                String format = String.format("...等%d个游戏", new Object[]{Integer.valueOf(C41014y.this.f110394a.f110385n.size())});
                String substring = this.f110396e.f311699t.substring(lineEnd);
                int measureText = (int) paint.measureText(".");
                int measureText2 = (int) paint.measureText(substring);
                int measureText3 = (int) paint.measureText(format);
                while (measureText2 + measureText3 + (measureText * 3) > layout.getEllipsizedWidth() && substring.length() > 0) {
                    substring = substring.substring(0, substring.length() - 1);
                    measureText2 = (int) paint.measureText(substring);
                }
                C41014y.this.f110394a.mo67998q0(this.f110396e.f311699t.substring(0, lineEnd) + substring + format);
            }
        }
    }

    public C41014y(C41009x xVar) {
        this.f110394a = xVar;
    }

    /* renamed from: a */
    public boolean mo64043a(Context context, BallInfo ballInfo) {
        MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV("game_download_float_ball");
        boolean z = singleMMKV.getBoolean("game_download_first_" + C86709a0.m107523b().mo121111i(), true);
        String str = this.f110394a.f110385n.size() > 0 ? this.f110394a.f110385n.get(0) : "";
        if (z) {
            C52415a.m58668a().mo62981c(str, 7, 0, (String) null, "");
            MultiProcessMMKV singleMMKV2 = MultiProcessMMKV.getSingleMMKV("game_download_float_ball");
            singleMMKV2.putBoolean("game_download_first_" + C86709a0.m107523b().mo121111i(), false).commit();
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo64044b(TextView textView, BallInfo ballInfo) {
        textView.post(new C41015a(textView, ballInfo));
        return false;
    }
}
