package e21;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import kg3.C76577a;
import p196ln.C76708i;
import p200lx.C76736w;
import p755xs.C102720b;

/* renamed from: e21.o */
public class C75484o {
    /* renamed from: a */
    public static Bitmap m90513a(Context context, String str, String str2, int i, String str3, boolean z, int i2, C102720b.C78973a aVar, boolean z2, int i3, float f, boolean z3) {
        Bitmap bitmap;
        int i4 = i3;
        Class cls = C102720b.class;
        float f2 = (float) i2;
        int i5 = (int) (0.26f * f2);
        int i6 = (int) (0.22f * f2);
        int i7 = (int) (f2 * 0.076f);
        try {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            Log.m105925i("MicroMsg.CollectBitmapFactory", "createCollectQrcode size avatarSize %s dpCanvas %s", Integer.valueOf(i6), Integer.valueOf(i5));
            Bitmap createBitmap = Bitmap.createBitmap(i5, i5, Bitmap.Config.ARGB_8888);
            if (i != 1 || Util.isNullOrNil(str3)) {
                bitmap = null;
            } else {
                bitmap = ((C102720b) C86312j.m106911c(cls)).mo142104N6(new C75486p(str3));
                ((C102720b) C86312j.m106911c(cls)).U70(aVar);
            }
            Log.m105925i("MicroMsg.CollectBitmapFactory", "avaterRoundSize：%s, useOwnDefault:%s", Float.valueOf(f), Boolean.valueOf(z3));
            if (bitmap == null && z3) {
                Log.m105924i("MicroMsg.CollectBitmapFactory", "avatar == null,use own avatar");
                bitmap = ((C76708i) C86312j.m106911c(C76708i.class)).mo106846sO(str2, i6, i6, (int) (((float) i6) * 0.06f));
            }
            if (bitmap == null) {
                Log.m105924i("MicroMsg.CollectBitmapFactory", "avatar == null,use default");
                Bitmap decodeStream = BackwardSupportUtil.BitmapFactory.decodeStream(MMApplicationContext.getContext().getAssets().open("avatar/default_nor_avatar.png"), C76577a.m92156g((Context) null));
                bitmap = BitmapUtil.getRoundedCornerBitmap(decodeStream, false, ((float) decodeStream.getWidth()) * 0.06f);
            }
            if (bitmap != null && z2) {
                bitmap = BitmapUtil.getRoundedCornerBitmap(bitmap, false, ((float) bitmap.getWidth()) * 0.5f);
            }
            if (bitmap != null && f > 0.0f) {
                bitmap = BitmapUtil.getRoundedCornerBitmap(bitmap, false, (float) C76577a.m92151b(MMApplicationContext.getContext(), 2));
            }
            Canvas canvas = new Canvas(createBitmap);
            int i8 = (i5 - i6) / 2;
            int i9 = i5 - i8;
            canvas.drawBitmap(bitmap, (Rect) null, new Rect(i8, i8, i9, i9), paint);
            if (z) {
                int i15 = i5 - i7;
                canvas.drawBitmap(MMBitmapFactory.m98737f(context.getResources().openRawResource(C0966R.C0969drawable.bz6)), (Rect) null, new Rect(i15, i15, i5, i5), paint);
            }
            if (Util.isEqual(i4, -1) || Util.isEqual(i4, 0)) {
                i4 = 3;
            }
            Context context2 = context;
            Bitmap xd = ((C76736w) C86312j.m106911c(C76736w.class)).mo106915xd(context, createBitmap, str, i4);
            Log.m105925i("MicroMsg.CollectBitmapFactory", "bitmap recycle %s errorLevel:%s", createBitmap, Integer.valueOf(i4));
            createBitmap.recycle();
            return xd;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.CollectBitmapFactory", e, "", new Object[0]);
            return null;
        }
    }
}
