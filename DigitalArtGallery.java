// Base class
class Artwork {
    String title;
    String artist;

    Artwork(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    void displayInfo() {
        System.out.println("Artwork Title: " + title);
        System.out.println("Artist: " + artist);
    }
}

// Painting subclass
class Painting extends Artwork {
    String brushTechnique;
    String colorPalette;
    String frameSpecification;

    Painting(String title, String artist, String brushTechnique, String colorPalette, String frameSpecification) {
        super(title, artist);
        this.brushTechnique = brushTechnique;
        this.colorPalette = colorPalette;
        this.frameSpecification = frameSpecification;
    }

    void displayPaintingDetails() {
        displayInfo();
        System.out.println("Brush Technique: " + brushTechnique);
        System.out.println("Color Palette: " + colorPalette);
        System.out.println("Frame Specification: " + frameSpecification);
    }
}

// Sculpture subclass
class Sculpture extends Artwork {
    String material;
    String dimensions;
    String lightingRequirement;

    Sculpture(String title, String artist, String material, String dimensions, String lightingRequirement) {
        super(title, artist);
        this.material = material;
        this.dimensions = dimensions;
        this.lightingRequirement = lightingRequirement;
    }

    void displaySculptureDetails() {
        displayInfo();
        System.out.println("Material: " + material);
        System.out.println("Dimensions: " + dimensions);
        System.out.println("Lighting Requirement: " + lightingRequirement);
    }
}

// Digital Art subclass
class DigitalArt extends Artwork {
    String resolution;
    String fileFormat;
    String interactiveElements;

    DigitalArt(String title, String artist, String resolution, String fileFormat, String interactiveElements) {
        super(title, artist);
        this.resolution = resolution;
        this.fileFormat = fileFormat;
        this.interactiveElements = interactiveElements;
    }

    void displayDigitalArtDetails() {
        displayInfo();
        System.out.println("Resolution: " + resolution);
        System.out.println("File Format: " + fileFormat);
        System.out.println("Interactive Elements: " + interactiveElements);
    }
}

// Photography subclass
class Photography extends Artwork {
    String cameraSettings;
    String editingDetails;
    String printSpecification;

    Photography(String title, String artist, String cameraSettings, String editingDetails, String printSpecification) {
        super(title, artist);
        this.cameraSettings = cameraSettings;
        this.editingDetails = editingDetails;
        this.printSpecification = printSpecification;
    }

    void displayPhotographyDetails() {
        displayInfo();
        System.out.println("Camera Settings: " + cameraSettings);
        System.out.println("Editing Details: " + editingDetails);
        System.out.println("Print Specification: " + printSpecification);
    }
}

// Main program
public class DigitalArtGallery {
    public static void main(String[] args) {
        Artwork[] gallery = new Artwork[4];

        gallery[0] = new Painting("Sunset Bliss", "Aayati Srivastava", "Impasto", "Warm Tones", "Gold Frame");
        gallery[1] = new Sculpture("Eternal Form", "John Doe", "Marble", "2m x 1m x 1m", "Spotlight");
        gallery[2] = new DigitalArt("Virtual Dreams", "Jane Smith", "4K", "PNG", "Interactive Animation");
        gallery[3] = new Photography("City Lights", "Ravi Kumar", "ISO 100, f/2.8", "Retouched in Photoshop", "Canvas Print");

        System.out.println("🎨 Digital Art Gallery Exhibition 🎨\n");

        for (Artwork art : gallery) {
            art.displayInfo();

            // Safe downcasting to access specific details
            if (art instanceof Painting) {
                ((Painting) art).displayPaintingDetails();
            } else if (art instanceof Sculpture) {
                ((Sculpture) art).displaySculptureDetails();
            } else if (art instanceof DigitalArt) {
                ((DigitalArt) art).displayDigitalArtDetails();
            } else if (art instanceof Photography) {
                ((Photography) art).displayPhotographyDetails();
            }

            System.out.println();
        }
    }
}
