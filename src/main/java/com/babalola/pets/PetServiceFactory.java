package com.babalola.pets;



public class PetServiceFactory {
    //Used to select which service to implement depending on the case
    public PetService getPetService(String petType) {
        switch (petType){
            case "dog":
                return new DogPetService();
            case "cat":
                return new CatPetService();
            default:
                return new DogPetService();
        }
    }

}
