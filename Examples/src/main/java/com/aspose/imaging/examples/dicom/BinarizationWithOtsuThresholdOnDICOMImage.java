package com.aspose.imaging.examples.dicom;

import com.aspose.imaging.Image;
import com.aspose.imaging.examples.Logger;
import com.aspose.imaging.examples.Utils;

public class BinarizationWithOtsuThresholdOnDICOMImage
{
    public static void main(String... args)
    {
        Logger.startExample("BinarizationWithOtsuThresholdOnDICOMImage");

        // The path to the documents directory.
        String dataDir = Utils.getSharedDataDir() + "dicom/";
        String inputFile = dataDir + "image.dcm";
        String outputFile = Utils.getOutDir() + "BinarizationWithOtsuThresholdOnDICOMImage_out.bmp";

        // Load a DICOM image in an instance of DicomImage
        try (com.aspose.imaging.fileformats.dicom.DicomImage image = (com.aspose.imaging.fileformats.dicom.DicomImage) Image.load(inputFile))
        {
            // Binarize image with Otsu Thresholding.
            image.binarizeOtsu();

            // Save the resultant image.
            image.save(outputFile, new com.aspose.imaging.imageoptions.BmpOptions());
        }

        Logger.endExample();
    }
}
