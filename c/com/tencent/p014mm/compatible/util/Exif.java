package com.tencent.p014mm.compatible.util;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* renamed from: com.tencent.mm.compatible.util.Exif */
public class Exif {
    public static final int PARSE_EXIF_ERROR_CORRUPT = 1985;
    public static final int PARSE_EXIF_ERROR_NO_EXIF = 1983;
    public static final int PARSE_EXIF_ERROR_NO_JPEG = 1982;
    public static final int PARSE_EXIF_ERROR_UNKNOWN_BYTEALIGN = 1984;
    public static final int PARSE_EXIF_SUCCESS = 0;
    private static final String TAG = "MicroMsg.Exif";
    public double altitude = 0.0d;
    public short bitsPerSample;
    public String copyright;
    public String dateTime;
    public String dateTimeDigitized;
    public String dateTimeOriginal;
    public double exposureBiasValue;
    public double exposureTime;
    public double fNumber;
    public int fileSource;
    public byte flash;
    public double focalLength;
    public short focalLengthIn35mm;
    public String imageDescription;
    public int imageHeight;
    public int imageWidth;
    public short isoSpeedRatings;
    public double latitude = -1.0d;
    public double longitude = -1.0d;
    private ExifInterface mExif;
    public String make;
    public short meteringMode;
    public String model;
    public short orientation;
    public int sceneType;
    public double shutterSpeedValue;
    public String software;
    public String subSecTimeOriginal;
    public double subjectDistance;
    public String yCbCrSubSampling;

    /* renamed from: com.tencent.mm.compatible.util.Exif$a */
    public static class C80833a {

        /* renamed from: a */
        public double f237621a;

        /* renamed from: b */
        public double f237622b;

        public C80833a(double d, double d2, double d3) {
            this.f237621a = d;
            this.f237622b = d2;
        }
    }

    public static Exif fromFile(String str) {
        Exif exif = new Exif();
        exif.parseFromFile(str);
        return exif;
    }

    public static Exif fromStream(InputStream inputStream) {
        Exif exif = new Exif();
        exif.parseFromStream(inputStream);
        return exif;
    }

    private void readExifFromInterface() {
        ExifInterface exifInterface = this.mExif;
        if (exifInterface != null) {
            this.imageDescription = exifInterface.getAttribute(ExifInterface.TAG_IMAGE_DESCRIPTION);
            this.make = this.mExif.getAttribute(ExifInterface.TAG_MAKE);
            this.model = this.mExif.getAttribute(ExifInterface.TAG_MODEL);
            this.orientation = (short) this.mExif.getAttributeInt(ExifInterface.TAG_ORIENTATION, 0);
            this.bitsPerSample = (short) this.mExif.getAttributeInt(ExifInterface.TAG_BITS_PER_SAMPLE, 0);
            this.software = this.mExif.getAttribute(ExifInterface.TAG_SOFTWARE);
            this.dateTime = this.mExif.getAttribute(ExifInterface.TAG_DATETIME);
            this.dateTimeOriginal = this.mExif.getAttribute(ExifInterface.TAG_DATETIME_ORIGINAL);
            this.dateTimeDigitized = this.mExif.getAttribute(ExifInterface.TAG_DATETIME_DIGITIZED);
            this.subSecTimeOriginal = this.mExif.getAttribute(ExifInterface.TAG_SUBSEC_TIME_ORIGINAL);
            this.copyright = this.mExif.getAttribute(ExifInterface.TAG_COPYRIGHT);
            this.exposureTime = this.mExif.getAttributeDouble(ExifInterface.TAG_EXPOSURE_TIME, 0.0d);
            this.fNumber = this.mExif.getAttributeDouble(ExifInterface.TAG_F_NUMBER, 0.0d);
            this.isoSpeedRatings = (short) this.mExif.getAttributeInt(ExifInterface.TAG_ISO_SPEED_RATINGS, 0);
            this.flash = (byte) this.mExif.getAttributeInt(ExifInterface.TAG_FLASH, 0);
            this.imageWidth = this.mExif.getAttributeInt(ExifInterface.TAG_IMAGE_WIDTH, 0);
            this.imageHeight = this.mExif.getAttributeInt(ExifInterface.TAG_IMAGE_LENGTH, 0);
            this.fileSource = this.mExif.getAttributeInt(ExifInterface.TAG_FILE_SOURCE, 0);
            this.sceneType = this.mExif.getAttributeInt(ExifInterface.TAG_SCENE_TYPE, 0);
            double[] latLong = this.mExif.getLatLong();
            if (latLong != null) {
                this.latitude = latLong[0];
                this.longitude = latLong[1];
            }
            this.altitude = this.mExif.getAltitude(0.0d);
        }
    }

    public C80833a getLocation() {
        double d = this.latitude;
        if (d < 0.0d) {
            return null;
        }
        double d2 = this.longitude;
        if (d2 < 0.0d) {
            return null;
        }
        return new C80833a(d, d2, this.altitude);
    }

    public int getOrientationInDegree() {
        ExifInterface exifInterface = this.mExif;
        if (exifInterface != null) {
            return exifInterface.getRotationDegrees();
        }
        short s = this.orientation;
        if (s == 3) {
            return 180;
        }
        if (s != 6) {
            return s != 8 ? 0 : 270;
        }
        return 90;
    }

    public long getUxtimeDatatimeOriginal() {
        try {
            if (this.dateTimeOriginal == null) {
                return 0;
            }
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").parse(this.dateTimeOriginal).getTime() / 1000;
        } catch (ParseException e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            return 0;
        }
    }

    public int parseFrom(byte[] bArr) {
        return parseFromStream(new ByteArrayInputStream(bArr));
    }

    public int parseFromFile(String str) {
        InputStream inputStream = null;
        try {
            inputStream = C86013q1.m106423E(str);
            this.mExif = new ExifInterface(inputStream);
            readExifFromInterface();
            return 0;
        } catch (OutOfMemoryError e) {
            Log.printErrStackTrace(TAG, e, "parseFromFile", new Object[0]);
            return 0;
        } catch (Throwable th) {
            Log.m105929w(TAG, "Cannot read EXIF from file '%s': %s", str, th.getMessage());
            return -1;
        } finally {
            Util.qualityClose(inputStream);
        }
    }

    public int parseFromStream(InputStream inputStream) {
        try {
            this.mExif = new ExifInterface(inputStream);
            readExifFromInterface();
            return 0;
        } catch (Exception e) {
            Log.m105929w(TAG, "Cannot read EXIF from stream '%s': %s", inputStream, e.getMessage());
            return -1;
        }
    }

    public int parseFrom(byte[] bArr, int i, int i2) {
        return parseFromStream(new ByteArrayInputStream(bArr, i, i2));
    }
}
