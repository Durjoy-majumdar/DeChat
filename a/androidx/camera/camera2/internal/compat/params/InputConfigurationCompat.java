package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import java.util.Objects;

public final class InputConfigurationCompat {
    private final InputConfigurationCompatImpl mImpl;

    public static final class InputConfigurationCompatApi31Impl extends InputConfigurationCompatApi23Impl {
        public InputConfigurationCompatApi31Impl(Object obj) {
            super(obj);
        }

        public boolean isMultiResolution() {
            return ((InputConfiguration) getInputConfiguration()).isMultiResolution();
        }

        public InputConfigurationCompatApi31Impl(int i, int i2, int i3) {
            super(i, i2, i3);
        }
    }

    public static final class InputConfigurationCompatBaseImpl implements InputConfigurationCompatImpl {
        private final int mFormat;
        private final int mHeight;
        private final int mWidth;

        public InputConfigurationCompatBaseImpl(int i, int i2, int i3) {
            this.mWidth = i;
            this.mHeight = i2;
            this.mFormat = i3;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof InputConfigurationCompatBaseImpl)) {
                return false;
            }
            InputConfigurationCompatBaseImpl inputConfigurationCompatBaseImpl = (InputConfigurationCompatBaseImpl) obj;
            return inputConfigurationCompatBaseImpl.getWidth() == this.mWidth && inputConfigurationCompatBaseImpl.getHeight() == this.mHeight && inputConfigurationCompatBaseImpl.getFormat() == this.mFormat;
        }

        public int getFormat() {
            return this.mFormat;
        }

        public int getHeight() {
            return this.mHeight;
        }

        public Object getInputConfiguration() {
            return null;
        }

        public int getWidth() {
            return this.mWidth;
        }

        public int hashCode() {
            int i = this.mWidth ^ 31;
            int i2 = this.mHeight ^ ((i << 5) - i);
            return this.mFormat ^ ((i2 << 5) - i2);
        }

        public boolean isMultiResolution() {
            return false;
        }

        public String toString() {
            return String.format("InputConfiguration(w:%d, h:%d, format:%d)", new Object[]{Integer.valueOf(this.mWidth), Integer.valueOf(this.mHeight), Integer.valueOf(this.mFormat)});
        }
    }

    public interface InputConfigurationCompatImpl {
        int getFormat();

        int getHeight();

        Object getInputConfiguration();

        int getWidth();

        boolean isMultiResolution();
    }

    public InputConfigurationCompat(int i, int i2, int i3) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            this.mImpl = new InputConfigurationCompatApi31Impl(i, i2, i3);
        } else if (i4 >= 23) {
            this.mImpl = new InputConfigurationCompatApi23Impl(i, i2, i3);
        } else {
            this.mImpl = new InputConfigurationCompatBaseImpl(i, i2, i3);
        }
    }

    public static InputConfigurationCompat wrap(Object obj) {
        int i;
        if (obj != null && (i = Build.VERSION.SDK_INT) >= 23) {
            return i >= 31 ? new InputConfigurationCompat(new InputConfigurationCompatApi31Impl(obj)) : new InputConfigurationCompat(new InputConfigurationCompatApi23Impl(obj));
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof InputConfigurationCompat)) {
            return false;
        }
        return this.mImpl.equals(((InputConfigurationCompat) obj).mImpl);
    }

    public int getFormat() {
        return this.mImpl.getFormat();
    }

    public int getHeight() {
        return this.mImpl.getHeight();
    }

    public int getWidth() {
        return this.mImpl.getWidth();
    }

    public int hashCode() {
        return this.mImpl.hashCode();
    }

    public boolean isMultiResolution() {
        return this.mImpl.isMultiResolution();
    }

    public String toString() {
        return this.mImpl.toString();
    }

    public Object unwrap() {
        return this.mImpl.getInputConfiguration();
    }

    public static class InputConfigurationCompatApi23Impl implements InputConfigurationCompatImpl {
        private final InputConfiguration mObject;

        public InputConfigurationCompatApi23Impl(Object obj) {
            this.mObject = (InputConfiguration) obj;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof InputConfigurationCompatImpl)) {
                return false;
            }
            return Objects.equals(this.mObject, ((InputConfigurationCompatImpl) obj).getInputConfiguration());
        }

        public int getFormat() {
            return this.mObject.getFormat();
        }

        public int getHeight() {
            return this.mObject.getHeight();
        }

        public Object getInputConfiguration() {
            return this.mObject;
        }

        public int getWidth() {
            return this.mObject.getWidth();
        }

        public int hashCode() {
            return this.mObject.hashCode();
        }

        public boolean isMultiResolution() {
            return false;
        }

        public String toString() {
            return this.mObject.toString();
        }

        public InputConfigurationCompatApi23Impl(int i, int i2, int i3) {
            this(new InputConfiguration(i, i2, i3));
        }
    }

    private InputConfigurationCompat(InputConfigurationCompatImpl inputConfigurationCompatImpl) {
        this.mImpl = inputConfigurationCompatImpl;
    }
}
