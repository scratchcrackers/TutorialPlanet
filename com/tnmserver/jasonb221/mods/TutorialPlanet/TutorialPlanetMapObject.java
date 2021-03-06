package com.tnmserver.jasonb221.mods.TutorialPlanet;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import micdoodle8.mods.galacticraft.api.world.ICelestialBodyRenderer;
import micdoodle8.mods.galacticraft.api.world.IGalaxy;
import micdoodle8.mods.galacticraft.api.world.IMapObject;
import micdoodle8.mods.galacticraft.core.GalacticraftCore;

public class TutorialPlanetMapObject implements IMapObject {

	@Override
    public float getPlanetSize()
    {
        return 1.0F;//This is how large the planet square is.
    }
 
    @Override
    public float getDistanceFromCenter()
    {
        return 2.0F;//This is how far out the planet is from the center of the sun. 1.0 is what the overworld is at, so this is twice as far out.
    }
 
    @Override
    public float getPhaseShift()
    {
        return 2160F;//Not quite sure what this does, I think it has to do with the roatation of the planet...Some help here mic please.
    }
 
    @Override
    public float getStretchValue()
    {
        return 1.0F;//Also not quite sure what this does, not well documented
    }
 
    @Override
    public ICelestialBodyRenderer getSlotRenderer()
    {
        return new TutorialPlanetSlotRenderer();//This is what pops up when you click on the planet. It really should be edited, but that is a whole new tutorial in itself. It is heavy on graphics, and graphics just aren't my strong suit. I understand the basics of it, but not well enough to make a tutorial out of it. For right now, don't select the moon or make space station buttons. I'm not sure what will happen if you do, but chances are you will crash the game.
    }
 
    @Override
    public IGalaxy getParentGalaxy()
    {
        return GalacticraftCore.galaxyMilkyWay;//This is the galaxy the planet is from. As new galaxies have not been properly implemented yet, we are forced to use the default one.
    }

}
